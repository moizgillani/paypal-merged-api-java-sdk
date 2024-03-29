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
 * ShippingOptionNotSelectedDescriptionEnum to be used.
 */
public enum ShippingOptionNotSelectedDescriptionEnum {
    ENUM_AT_LEAST_ONE_OF_THE_SHIPPINGOPTION_SHOULD_BE_SET_TO_SELECTED_TRUE;


    private static TreeMap<String, ShippingOptionNotSelectedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_AT_LEAST_ONE_OF_THE_SHIPPINGOPTION_SHOULD_BE_SET_TO_SELECTED_TRUE.value = "At least one of the shipping.option should be set to 'selected = true'.";

        valueMap.put("At least one of the shipping.option should be set to 'selected = true'.", ENUM_AT_LEAST_ONE_OF_THE_SHIPPINGOPTION_SHOULD_BE_SET_TO_SELECTED_TRUE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingOptionNotSelectedDescriptionEnum constructFromString(String toConvert) throws IOException {
        ShippingOptionNotSelectedDescriptionEnum enumValue = fromString(toConvert);
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
    public static ShippingOptionNotSelectedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of ShippingOptionNotSelectedDescriptionEnum values to list of string values.
     * @param toConvert The list of ShippingOptionNotSelectedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingOptionNotSelectedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingOptionNotSelectedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 