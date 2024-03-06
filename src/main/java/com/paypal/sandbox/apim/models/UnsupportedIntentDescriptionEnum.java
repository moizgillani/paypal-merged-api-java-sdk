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
 * UnsupportedIntentDescriptionEnum to be used.
 */
public enum UnsupportedIntentDescriptionEnum {
    ENUM_INTENTAUTHORIZE_IS_NOT_SUPPORTED_FOR_MULTIPLE_PURCHASE_UNITS_ONLY_INTENTCAPTURE_IS_SUPPORTED;


    private static TreeMap<String, UnsupportedIntentDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_INTENTAUTHORIZE_IS_NOT_SUPPORTED_FOR_MULTIPLE_PURCHASE_UNITS_ONLY_INTENTCAPTURE_IS_SUPPORTED.value = "`intent=AUTHORIZE` is not supported for multiple purchase units. Only `intent=CAPTURE` is supported.";

        valueMap.put("`intent=AUTHORIZE` is not supported for multiple purchase units. Only `intent=CAPTURE` is supported.", ENUM_INTENTAUTHORIZE_IS_NOT_SUPPORTED_FOR_MULTIPLE_PURCHASE_UNITS_ONLY_INTENTCAPTURE_IS_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UnsupportedIntentDescriptionEnum constructFromString(String toConvert) throws IOException {
        UnsupportedIntentDescriptionEnum enumValue = fromString(toConvert);
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
    public static UnsupportedIntentDescriptionEnum fromString(String toConvert) {
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
     * Convert list of UnsupportedIntentDescriptionEnum values to list of string values.
     * @param toConvert The list of UnsupportedIntentDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UnsupportedIntentDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UnsupportedIntentDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 