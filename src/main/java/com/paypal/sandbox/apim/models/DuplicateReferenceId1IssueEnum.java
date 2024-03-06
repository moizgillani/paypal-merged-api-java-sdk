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
 * DuplicateReferenceId1IssueEnum to be used.
 */
public enum DuplicateReferenceId1IssueEnum {
    DUPLICATE_REFERENCE_ID;


    private static TreeMap<String, DuplicateReferenceId1IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DUPLICATE_REFERENCE_ID.value = "DUPLICATE_REFERENCE_ID";

        valueMap.put("DUPLICATE_REFERENCE_ID", DUPLICATE_REFERENCE_ID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DuplicateReferenceId1IssueEnum constructFromString(String toConvert) throws IOException {
        DuplicateReferenceId1IssueEnum enumValue = fromString(toConvert);
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
    public static DuplicateReferenceId1IssueEnum fromString(String toConvert) {
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
     * Convert list of DuplicateReferenceId1IssueEnum values to list of string values.
     * @param toConvert The list of DuplicateReferenceId1IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DuplicateReferenceId1IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DuplicateReferenceId1IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 