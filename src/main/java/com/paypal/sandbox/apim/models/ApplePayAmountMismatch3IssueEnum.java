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
 * ApplePayAmountMismatch3IssueEnum to be used.
 */
public enum ApplePayAmountMismatch3IssueEnum {
    APPLE_PAY_AMOUNT_MISMATCH;


    private static TreeMap<String, ApplePayAmountMismatch3IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        APPLE_PAY_AMOUNT_MISMATCH.value = "APPLE_PAY_AMOUNT_MISMATCH";

        valueMap.put("APPLE_PAY_AMOUNT_MISMATCH", APPLE_PAY_AMOUNT_MISMATCH);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ApplePayAmountMismatch3IssueEnum constructFromString(String toConvert) throws IOException {
        ApplePayAmountMismatch3IssueEnum enumValue = fromString(toConvert);
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
    public static ApplePayAmountMismatch3IssueEnum fromString(String toConvert) {
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
     * Convert list of ApplePayAmountMismatch3IssueEnum values to list of string values.
     * @param toConvert The list of ApplePayAmountMismatch3IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ApplePayAmountMismatch3IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ApplePayAmountMismatch3IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 