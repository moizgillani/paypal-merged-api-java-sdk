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
 * CannotBeNegativeDescriptionEnum to be used.
 */
public enum CannotBeNegativeDescriptionEnum {
    ENUM_MUST_BE_GREATER_THAN_OR_EQUAL_TO_0_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED;


    private static TreeMap<String, CannotBeNegativeDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_MUST_BE_GREATER_THAN_OR_EQUAL_TO_0_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED.value = "Must be greater than or equal to 0. If the currency supports decimals, only two decimal place precision is supported.";

        valueMap.put("Must be greater than or equal to 0. If the currency supports decimals, only two decimal place precision is supported.", ENUM_MUST_BE_GREATER_THAN_OR_EQUAL_TO_0_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CannotBeNegativeDescriptionEnum constructFromString(String toConvert) throws IOException {
        CannotBeNegativeDescriptionEnum enumValue = fromString(toConvert);
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
    public static CannotBeNegativeDescriptionEnum fromString(String toConvert) {
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
     * Convert list of CannotBeNegativeDescriptionEnum values to list of string values.
     * @param toConvert The list of CannotBeNegativeDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CannotBeNegativeDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CannotBeNegativeDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 