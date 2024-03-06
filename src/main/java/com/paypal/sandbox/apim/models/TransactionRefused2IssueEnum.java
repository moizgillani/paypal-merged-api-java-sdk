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
 * TransactionRefused2IssueEnum to be used.
 */
public enum TransactionRefused2IssueEnum {
    TRANSACTION_REFUSED;


    private static TreeMap<String, TransactionRefused2IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        TRANSACTION_REFUSED.value = "TRANSACTION_REFUSED";

        valueMap.put("TRANSACTION_REFUSED", TRANSACTION_REFUSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionRefused2IssueEnum constructFromString(String toConvert) throws IOException {
        TransactionRefused2IssueEnum enumValue = fromString(toConvert);
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
    public static TransactionRefused2IssueEnum fromString(String toConvert) {
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
     * Convert list of TransactionRefused2IssueEnum values to list of string values.
     * @param toConvert The list of TransactionRefused2IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionRefused2IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionRefused2IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 