package com.sap.cloud.lm.sl.persistence.processors;

import java.io.InputStream;

import com.sap.cloud.lm.sl.persistence.model.FileEntry;
import com.sap.cloud.lm.sl.persistence.services.FileContentProcessor;

public class DefaultFileDownloadProcessor implements FileDownloadProcessor {

    private FileContentProcessor fileContentProcessor = null;
    private FileEntry fileEntry = null;

    public DefaultFileDownloadProcessor(String space, String fileId, FileContentProcessor fileContentProcessor) {
        this(createFileEntry(space, fileId), fileContentProcessor);
    }

    public DefaultFileDownloadProcessor(FileEntry fileEntry, FileContentProcessor fileContentProcessor) {
        this.fileContentProcessor = fileContentProcessor;
        this.fileEntry = fileEntry;
    }

    @Override
    public void processContent(InputStream is) throws Exception {
        this.fileContentProcessor.processFileContent(is);
    }

    @Override
    public FileEntry getFileEntry() {
        return this.fileEntry;
    }

    private static FileEntry createFileEntry(String space, String fileId) {
        FileEntry fileEntry = new FileEntry();
        fileEntry.setSpace(space);
        fileEntry.setId(fileId);
        return fileEntry;
    }

}
