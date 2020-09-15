package ru.lanit.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;

public class SwaggerCoverage2ModelJackson {
    private SwaggerCoverage2ModelJackson() {
        throw new IllegalStateException("Do not instance SwaggerCoverage2ModelJackson");
    }

    public static ObjectMapper createMapper() {
        return new ObjectMapper()
                .configure(USE_WRAPPER_NAME_AS_PROPERTY_NAME, true)
                .setSerializationInclusion(NON_NULL);
    }
}
