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
 * OrderAlreadyCapturedIssueEnum to be used.
 */
public enum OrderAlreadyCapturedIssueEnum {
    ORDER_ALREADY_CAPTURED;


    private static TreeMap<String, OrderAlreadyCapturedIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ORDER_ALREADY_CAPTURED.value = "ORDER_ALREADY_CAPTURED";

        valueMap.put("ORDER_ALREADY_CAPTURED", ORDER_ALREADY_CAPTURED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderAlreadyCapturedIssueEnum constructFromString(String toConvert) throws IOException {
        OrderAlreadyCapturedIssueEnum enumValue = fromString(toConvert);
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
    public static OrderAlreadyCapturedIssueEnum fromString(String toConvert) {
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
     * Convert list of OrderAlreadyCapturedIssueEnum values to list of string values.
     * @param toConvert The list of OrderAlreadyCapturedIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderAlreadyCapturedIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderAlreadyCapturedIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 