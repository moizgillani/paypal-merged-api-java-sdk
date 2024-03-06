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
 * InvalidCurrencyCodeDescription3Enum to be used.
 */
public enum InvalidCurrencyCodeDescription3Enum {
    ENUM_CURRENCY_CODE_IS_INVALID_OR_IS_NOT_CURRENTLY_SUPPORTED_PLEASE_REFER_HTTPSDEVELOPERPAYPALCOMDOCSAPIREFERENCECURRENCYCODES_FOR_LIST_OF_SUPPORTED_CURRENCY_CODES;


    private static TreeMap<String, InvalidCurrencyCodeDescription3Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_CURRENCY_CODE_IS_INVALID_OR_IS_NOT_CURRENTLY_SUPPORTED_PLEASE_REFER_HTTPSDEVELOPERPAYPALCOMDOCSAPIREFERENCECURRENCYCODES_FOR_LIST_OF_SUPPORTED_CURRENCY_CODES.value = "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes.";

        valueMap.put("Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes.", ENUM_CURRENCY_CODE_IS_INVALID_OR_IS_NOT_CURRENTLY_SUPPORTED_PLEASE_REFER_HTTPSDEVELOPERPAYPALCOMDOCSAPIREFERENCECURRENCYCODES_FOR_LIST_OF_SUPPORTED_CURRENCY_CODES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidCurrencyCodeDescription3Enum constructFromString(String toConvert) throws IOException {
        InvalidCurrencyCodeDescription3Enum enumValue = fromString(toConvert);
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
    public static InvalidCurrencyCodeDescription3Enum fromString(String toConvert) {
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
     * Convert list of InvalidCurrencyCodeDescription3Enum values to list of string values.
     * @param toConvert The list of InvalidCurrencyCodeDescription3Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidCurrencyCodeDescription3Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidCurrencyCodeDescription3Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 