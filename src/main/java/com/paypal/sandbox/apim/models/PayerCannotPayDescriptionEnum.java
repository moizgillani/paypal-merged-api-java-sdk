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
 * PayerCannotPayDescriptionEnum to be used.
 */
public enum PayerCannotPayDescriptionEnum {
    ENUM_COMBINATION_OF_PAYER_AND_PAYEE_SETTINGS_MEAN_THAT_THIS_BUYER_CANNOT_PAY_THIS_SELLER;


    private static TreeMap<String, PayerCannotPayDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_COMBINATION_OF_PAYER_AND_PAYEE_SETTINGS_MEAN_THAT_THIS_BUYER_CANNOT_PAY_THIS_SELLER.value = "Combination of payer and payee settings mean that this buyer cannot pay this seller.";

        valueMap.put("Combination of payer and payee settings mean that this buyer cannot pay this seller.", ENUM_COMBINATION_OF_PAYER_AND_PAYEE_SETTINGS_MEAN_THAT_THIS_BUYER_CANNOT_PAY_THIS_SELLER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayerCannotPayDescriptionEnum constructFromString(String toConvert) throws IOException {
        PayerCannotPayDescriptionEnum enumValue = fromString(toConvert);
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
    public static PayerCannotPayDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayerCannotPayDescriptionEnum values to list of string values.
     * @param toConvert The list of PayerCannotPayDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayerCannotPayDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayerCannotPayDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 