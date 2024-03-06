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
 * CaptureStatus1Enum to be used.
 */
public enum CaptureStatus1Enum {
    COMPLETED,

    DECLINED,

    PARTIALLY_REFUNDED,

    PENDING,

    REFUNDED,

    FAILED;


    private static TreeMap<String, CaptureStatus1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPLETED.value = "COMPLETED";
        DECLINED.value = "DECLINED";
        PARTIALLY_REFUNDED.value = "PARTIALLY_REFUNDED";
        PENDING.value = "PENDING";
        REFUNDED.value = "REFUNDED";
        FAILED.value = "FAILED";

        valueMap.put("COMPLETED", COMPLETED);
        valueMap.put("DECLINED", DECLINED);
        valueMap.put("PARTIALLY_REFUNDED", PARTIALLY_REFUNDED);
        valueMap.put("PENDING", PENDING);
        valueMap.put("REFUNDED", REFUNDED);
        valueMap.put("FAILED", FAILED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CaptureStatus1Enum constructFromString(String toConvert) throws IOException {
        CaptureStatus1Enum enumValue = fromString(toConvert);
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
    public static CaptureStatus1Enum fromString(String toConvert) {
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
     * Convert list of CaptureStatus1Enum values to list of string values.
     * @param toConvert The list of CaptureStatus1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CaptureStatus1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CaptureStatus1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 