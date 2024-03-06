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
 * CardBrandNotSupported1DescriptionEnum to be used.
 */
public enum CardBrandNotSupported1DescriptionEnum {
    ENUM_PROCESSING_OF_THIS_CARD_BRAND_IS_NOT_SUPPORTED_PLEASE_USE_ANOTHER_CARD_TO_CONTINUE_WITH_THIS_TRANSACTION;


    private static TreeMap<String, CardBrandNotSupported1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PROCESSING_OF_THIS_CARD_BRAND_IS_NOT_SUPPORTED_PLEASE_USE_ANOTHER_CARD_TO_CONTINUE_WITH_THIS_TRANSACTION.value = "Processing of this card brand is not supported. Please use another card to continue with this transaction.";

        valueMap.put("Processing of this card brand is not supported. Please use another card to continue with this transaction.", ENUM_PROCESSING_OF_THIS_CARD_BRAND_IS_NOT_SUPPORTED_PLEASE_USE_ANOTHER_CARD_TO_CONTINUE_WITH_THIS_TRANSACTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardBrandNotSupported1DescriptionEnum constructFromString(String toConvert) throws IOException {
        CardBrandNotSupported1DescriptionEnum enumValue = fromString(toConvert);
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
    public static CardBrandNotSupported1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CardBrandNotSupported1DescriptionEnum values to list of string values.
     * @param toConvert The list of CardBrandNotSupported1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CardBrandNotSupported1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CardBrandNotSupported1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 