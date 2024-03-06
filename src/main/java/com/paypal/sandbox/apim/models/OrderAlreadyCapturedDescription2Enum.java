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
 * OrderAlreadyCapturedDescription2Enum to be used.
 */
public enum OrderAlreadyCapturedDescription2Enum {
    ENUM_ORDER_ALREADY_CAPTURED_IF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED;


    private static TreeMap<String, OrderAlreadyCapturedDescription2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_ORDER_ALREADY_CAPTURED_IF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED.value = "Order already captured. If 'intent=CAPTURE' only one capture per order is allowed.";

        valueMap.put("Order already captured. If 'intent=CAPTURE' only one capture per order is allowed.", ENUM_ORDER_ALREADY_CAPTURED_IF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderAlreadyCapturedDescription2Enum constructFromString(String toConvert) throws IOException {
        OrderAlreadyCapturedDescription2Enum enumValue = fromString(toConvert);
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
    public static OrderAlreadyCapturedDescription2Enum fromString(String toConvert) {
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
     * Convert list of OrderAlreadyCapturedDescription2Enum values to list of string values.
     * @param toConvert The list of OrderAlreadyCapturedDescription2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderAlreadyCapturedDescription2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderAlreadyCapturedDescription2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 