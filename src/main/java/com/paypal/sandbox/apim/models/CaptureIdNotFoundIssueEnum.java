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
 * CaptureIdNotFoundIssueEnum to be used.
 */
public enum CaptureIdNotFoundIssueEnum {
    CAPTURE_ID_NOT_FOUND;


    private static TreeMap<String, CaptureIdNotFoundIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CAPTURE_ID_NOT_FOUND.value = "CAPTURE_ID_NOT_FOUND";

        valueMap.put("CAPTURE_ID_NOT_FOUND", CAPTURE_ID_NOT_FOUND);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CaptureIdNotFoundIssueEnum constructFromString(String toConvert) throws IOException {
        CaptureIdNotFoundIssueEnum enumValue = fromString(toConvert);
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
    public static CaptureIdNotFoundIssueEnum fromString(String toConvert) {
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
     * Convert list of CaptureIdNotFoundIssueEnum values to list of string values.
     * @param toConvert The list of CaptureIdNotFoundIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CaptureIdNotFoundIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CaptureIdNotFoundIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 