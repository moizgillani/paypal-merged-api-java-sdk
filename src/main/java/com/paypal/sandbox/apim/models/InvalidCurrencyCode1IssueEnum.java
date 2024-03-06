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
 * InvalidCurrencyCode1IssueEnum to be used.
 */
public enum InvalidCurrencyCode1IssueEnum {
    INVALID_CURRENCY_CODE;


    private static TreeMap<String, InvalidCurrencyCode1IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        INVALID_CURRENCY_CODE.value = "INVALID_CURRENCY_CODE";

        valueMap.put("INVALID_CURRENCY_CODE", INVALID_CURRENCY_CODE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidCurrencyCode1IssueEnum constructFromString(String toConvert) throws IOException {
        InvalidCurrencyCode1IssueEnum enumValue = fromString(toConvert);
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
    public static InvalidCurrencyCode1IssueEnum fromString(String toConvert) {
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
     * Convert list of InvalidCurrencyCode1IssueEnum values to list of string values.
     * @param toConvert The list of InvalidCurrencyCode1IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidCurrencyCode1IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidCurrencyCode1IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 