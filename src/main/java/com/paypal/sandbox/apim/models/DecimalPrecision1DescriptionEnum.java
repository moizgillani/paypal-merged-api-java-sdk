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
 * DecimalPrecision1DescriptionEnum to be used.
 */
public enum DecimalPrecision1DescriptionEnum {
    ENUM_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED;


    private static TreeMap<String, DecimalPrecision1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED.value = "If the currency supports decimals, only two decimal place precision is supported.";

        valueMap.put("If the currency supports decimals, only two decimal place precision is supported.", ENUM_IF_THE_CURRENCY_SUPPORTS_DECIMALS_ONLY_TWO_DECIMAL_PLACE_PRECISION_IS_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DecimalPrecision1DescriptionEnum constructFromString(String toConvert) throws IOException {
        DecimalPrecision1DescriptionEnum enumValue = fromString(toConvert);
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
    public static DecimalPrecision1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of DecimalPrecision1DescriptionEnum values to list of string values.
     * @param toConvert The list of DecimalPrecision1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DecimalPrecision1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DecimalPrecision1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 