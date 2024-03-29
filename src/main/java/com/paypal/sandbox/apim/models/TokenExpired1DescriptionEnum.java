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
 * TokenExpired1DescriptionEnum to be used.
 */
public enum TokenExpired1DescriptionEnum {
    ENUM_THE_TOKEN_IS_EXPIRED_AND_CANNOT_BE_USED_FOR_PAYMENT;


    private static TreeMap<String, TokenExpired1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_TOKEN_IS_EXPIRED_AND_CANNOT_BE_USED_FOR_PAYMENT.value = "The token is expired and cannot be used for payment.";

        valueMap.put("The token is expired and cannot be used for payment.", ENUM_THE_TOKEN_IS_EXPIRED_AND_CANNOT_BE_USED_FOR_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TokenExpired1DescriptionEnum constructFromString(String toConvert) throws IOException {
        TokenExpired1DescriptionEnum enumValue = fromString(toConvert);
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
    public static TokenExpired1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of TokenExpired1DescriptionEnum values to list of string values.
     * @param toConvert The list of TokenExpired1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TokenExpired1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TokenExpired1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 