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
 * InvalidArrayMinItemsDescriptionEnum to be used.
 */
public enum InvalidArrayMinItemsDescriptionEnum {
    ENUM_THE_NUMBER_OF_ITEMS_IN_AN_ARRAY_PARAMETER_IS_TOO_SMALL;


    private static TreeMap<String, InvalidArrayMinItemsDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_NUMBER_OF_ITEMS_IN_AN_ARRAY_PARAMETER_IS_TOO_SMALL.value = "The number of items in an array parameter is too small.";

        valueMap.put("The number of items in an array parameter is too small.", ENUM_THE_NUMBER_OF_ITEMS_IN_AN_ARRAY_PARAMETER_IS_TOO_SMALL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidArrayMinItemsDescriptionEnum constructFromString(String toConvert) throws IOException {
        InvalidArrayMinItemsDescriptionEnum enumValue = fromString(toConvert);
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
    public static InvalidArrayMinItemsDescriptionEnum fromString(String toConvert) {
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
     * Convert list of InvalidArrayMinItemsDescriptionEnum values to list of string values.
     * @param toConvert The list of InvalidArrayMinItemsDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidArrayMinItemsDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidArrayMinItemsDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 