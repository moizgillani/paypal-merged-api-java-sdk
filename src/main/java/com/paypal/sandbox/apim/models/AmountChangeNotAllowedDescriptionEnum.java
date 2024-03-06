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
 * AmountChangeNotAllowedDescriptionEnum to be used.
 */
public enum AmountChangeNotAllowedDescriptionEnum {
    ENUM_THE_AMOUNT_SPECIFIED_IS_DIFFERENT_FROM_THE_AMOUNT_AUTHORIZED_BY_PAYER;


    private static TreeMap<String, AmountChangeNotAllowedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_AMOUNT_SPECIFIED_IS_DIFFERENT_FROM_THE_AMOUNT_AUTHORIZED_BY_PAYER.value = "The amount specified is different from the amount authorized by payer.";

        valueMap.put("The amount specified is different from the amount authorized by payer.", ENUM_THE_AMOUNT_SPECIFIED_IS_DIFFERENT_FROM_THE_AMOUNT_AUTHORIZED_BY_PAYER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AmountChangeNotAllowedDescriptionEnum constructFromString(String toConvert) throws IOException {
        AmountChangeNotAllowedDescriptionEnum enumValue = fromString(toConvert);
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
    public static AmountChangeNotAllowedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of AmountChangeNotAllowedDescriptionEnum values to list of string values.
     * @param toConvert The list of AmountChangeNotAllowedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AmountChangeNotAllowedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AmountChangeNotAllowedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 