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
 * NotSupportedIssueEnum to be used.
 */
public enum NotSupportedIssueEnum {
    NOT_SUPPORTED;


    private static TreeMap<String, NotSupportedIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_SUPPORTED.value = "NOT_SUPPORTED";

        valueMap.put("NOT_SUPPORTED", NOT_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NotSupportedIssueEnum constructFromString(String toConvert) throws IOException {
        NotSupportedIssueEnum enumValue = fromString(toConvert);
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
    public static NotSupportedIssueEnum fromString(String toConvert) {
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
     * Convert list of NotSupportedIssueEnum values to list of string values.
     * @param toConvert The list of NotSupportedIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotSupportedIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotSupportedIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 