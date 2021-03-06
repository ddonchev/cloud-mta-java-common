package com.sap.cloud.lm.sl.persistence.message;

/**
 * A collection of string constants used for exception and logging messages.
 */
public final class Messages {

    // Exception messages:
    public static final String NO_VIRUS_SCANNER_CONFIGURED = "Virus scanner not configured";
    public static final String FILE_UPLOAD_FAILED = "Upload of file \"{0}\" to \"{1}\" failed";
    public static final String FILE_NOT_FOUND = "File \"{0}\" not found";
    public static final String ERROR_SAVING_MESSAGE = "Error saving message with process ID \"{0}\", task ID \"{1}\" and task execution ID \"{2}\"";
    public static final String ERROR_UPDATING_MESSAGE = "Error updating message with ID \"{0}\"";
    public static final String ERROR_DELETING_MESSAGES_WITH_PROCESS_ID = "Error deleting messages with process ID \"{0}\"";
    public static final String ERROR_DELETING_MESSAGES_WITH_PROCESS_ID_TASK_ID_AND_TASK_EXECUTION_ID = "Error deleting messages with process ID \"{0}\", task ID \"{1}\" and task execution ID \"{2}\"";
    public static final String ERROR_GETTING_ALL_MESSAGES = "Error getting all messages";
    public static final String ERROR_GETTING_MESSAGES_WITH_PROCESS_ID = "Error getting messages with process ID \"{0}\"";
    public static final String ERROR_GETTING_MESSAGES_WITH_PROCESS_ID_TASK_ID_AND_TASK_EXECUTION_ID = "Error getting messages with process ID \"{0}\", task ID \"{1}\" and task execution ID \"{2}\"";
    public static final String ERROR_GETTING_LAST_MESSAGE_WITH_PROCESS_ID_AND_TASK_ID = "Error getting last message with process ID \"{0}\" and task ID \"{1}\"";
    public static final String ERROR_GETTING_MESSAGES_WITH_PROCESS_ID_TASK_ID_TASK_EXECUTION_ID_AND_TYPE = "Error getting messages with process ID \"{0}\", task ID \"{1}\", task execution ID \"{2}\" and type \"{3}\"";
    public static final String ERROR_GETTING_MESSAGES_WITH_PROCESS_ID_AND_TYPE = "Error getting messages with process ID \"{0}\" and type \"{1}\"";
    public static final String ERROR_CALCULATING_FILE_DIGEST = "Error calculating digest for file {0}: {1}";
    public static final String ERROR_FINDING_FILE_TO_UPLOAD = "Error finding file to upload with name {0}: {1}";
    public static final String ERROR_READING_FILE_CONTENT = "Error reading content of file {0}: {1}";
    public static final String FILE_WITH_ID_AND_SPACE_DOES_NOT_EXIST = "File with ID \"{0}\" and space \"{1}\" does not exist.";
    public static final String ERROR_DELETING_FILE_WITH_ID = "Error deleting file with ID \"{0}\"";
    public static final String ERROR_DELETING_FILES_ATTRIBUTES = "Error deleting files attributes";
    public static final String ERROR_GETTING_FILES_WITH_SPACE_AND_NAMESPACE = "Error getting files with space {0} and namespace {1}";
    public static final String ERROR_GETTING_FILES_MODIFIED_BEFORE = "Error getting files modified before {0}";
    public static final String ERROR_DELETING_PROCESS_LOGS_WITH_NAMESPACES = "Error deleting process logs with namespaces \"{0}\"";

    // Audit log messages:

    // ERROR log messages:
    public static final String UPLOAD_STREAM_FAILED_TO_CLOSE = "Cannot close file upload stream";
    public static final String DELETING_LOCAL_FILE_BECAUSE_OF_INFECTION = "File \"{0}\" is infected and will be removed";

    // WARN log messages:
    public static final String COULD_NOT_CLOSE_RESULT_SET = "Could not close result set.";
    public static final String COULD_NOT_CLOSE_STATEMENT = "Could not close statement.";
    public static final String COULD_NOT_CLOSE_CONNECTION = "Could not close connection.";
    public static final String COULD_NOT_ROLLBACK_TRANSACTION = "Could not rollback transaction!";

    // INFO log messages:
    public static final String SCANNING_FILE = "Scanning file \"{0}\"...";
    public static final String SCANNING_FILE_SUCCESS = "File \"{0}\" is not infected";
    public static final String FAILED_TO_DELETE_FILE = "Failed to delete file {0}";
    public static final String DELETING_FILE_IN_TABLE = "File \"{0}\" in space \"{1}\" will be deleted from \"{2}\".";
    public static final String CREATING_INDEX_CONCURRENTLY = "Creating index {0} concurrently";
    public static final String INDEX_CREATED = "Index created.";

    // DEBUG log messages:
    public static final String DELETING_FILE_WITH_PATH = "Deleting file with path {0}...";
    public static final String CREATING_LOGGER = "Creating logger \"{0}\"...";
    public static final String CREATING_APPENDER = "Creating appender for logger \"{0}\"...";
    public static final String REMOVING_ALL_LOGGERS_FOR_PROCESS = "Removing loggers {1} for process \"{0}\"...";
    public static final String REMOVING_ALL_APPENDERS_FROM_LOGGER = "Removing all appenders from logger \"{0}\"...";
    public static final String DELETED_FILE_ATTRIBUTES_COUNT = "Deleted file attributes: {0}";

    // TRACE log messages:

}
