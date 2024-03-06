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
 * MaxValueExceededDescriptionEnum to be used.
 */
public enum MaxValueExceededDescriptionEnum {
    ENUM_SHOULD_BE_LESS_THAN_OR_EQUAL_TO_99999999999999999;


    private static TreeMap<String, MaxValueExceededDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SHOULD_BE_LESS_THAN_OR_EQUAL_TO_99999999999999999.value = "Should be less than or equal to 999999999999999.99.";

        valueMap.put("Should be less than or equal to 999999999999999.99.", ENUM_SHOULD_BE_LESS_THAN_OR_EQUAL_TO_99999999999999999);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MaxValueExceededDescriptionEnum constructFromString(String toConvert) throws IOException {
        MaxValueExceededDescriptionEnum enumValue = fromString(toConvert);
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
    public static MaxValueExceededDescriptionEnum fromString(String toConvert) {
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
     * Convert list of MaxValueExceededDescriptionEnum values to list of string values.
     * @param toConvert The list of MaxValueExceededDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MaxValueExceededDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MaxValueExceededDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 