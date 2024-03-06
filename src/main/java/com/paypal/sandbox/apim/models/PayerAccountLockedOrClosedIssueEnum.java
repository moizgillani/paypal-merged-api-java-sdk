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
 * PayerAccountLockedOrClosedIssueEnum to be used.
 */
public enum PayerAccountLockedOrClosedIssueEnum {
    PAYER_ACCOUNT_LOCKED_OR_CLOSED;


    private static TreeMap<String, PayerAccountLockedOrClosedIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PAYER_ACCOUNT_LOCKED_OR_CLOSED.value = "PAYER_ACCOUNT_LOCKED_OR_CLOSED";

        valueMap.put("PAYER_ACCOUNT_LOCKED_OR_CLOSED", PAYER_ACCOUNT_LOCKED_OR_CLOSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayerAccountLockedOrClosedIssueEnum constructFromString(String toConvert) throws IOException {
        PayerAccountLockedOrClosedIssueEnum enumValue = fromString(toConvert);
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
    public static PayerAccountLockedOrClosedIssueEnum fromString(String toConvert) {
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
     * Convert list of PayerAccountLockedOrClosedIssueEnum values to list of string values.
     * @param toConvert The list of PayerAccountLockedOrClosedIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayerAccountLockedOrClosedIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayerAccountLockedOrClosedIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 