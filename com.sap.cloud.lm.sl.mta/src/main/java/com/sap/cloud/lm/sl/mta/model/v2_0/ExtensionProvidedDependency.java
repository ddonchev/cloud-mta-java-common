package com.sap.cloud.lm.sl.mta.model.v2_0;

import static com.sap.cloud.lm.sl.common.util.CommonUtil.getOrDefault;

import java.util.Collections;

public class ExtensionProvidedDependency extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionProvidedDependency {

    protected ExtensionProvidedDependency() {

    }

    public static class ExtensionProvidedDependencyBuilder
        extends com.sap.cloud.lm.sl.mta.model.v1_0.ExtensionProvidedDependency.ExtensionProvidedDependencyBuilder {

        @Override
        public ExtensionProvidedDependency build() {
            ExtensionProvidedDependency result = new ExtensionProvidedDependency();
            result.setName(name);
            result.setProperties(getOrDefault(properties, Collections.<String, Object> emptyMap()));
            return result;
        }

    }

}
