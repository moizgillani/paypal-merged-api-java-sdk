/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * Error415NameEnum to be used.
 */
public enum Error415NameEnum {
    UNSUPPORTED_MEDIA_TYPE;


    private static TreeMap<String, Error415NameEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UNSUPPORTED_MEDIA_TYPE.value = "UNSUPPORTED_MEDIA_TYPE";

        valueMap.put("UNSUPPORTED_MEDIA_TYPE", UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Error415NameEnum constructFromString(String toConvert) throws IOException {
        Error415NameEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static Error415NameEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Error415NameEnum values to list of string values.
     * @param toConvert The list of Error415NameEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Error415NameEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Error415NameEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 