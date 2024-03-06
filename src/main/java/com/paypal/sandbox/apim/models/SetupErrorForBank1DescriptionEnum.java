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
 * SetupErrorForBank1DescriptionEnum to be used.
 */
public enum SetupErrorForBank1DescriptionEnum {
    ENUM_THE_API_CALLER_ACCOUNT_SETUP_FOR_BANK_PAYMENTS_IS_INCOMPLETE_OR_INCORRECT_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER;


    private static TreeMap<String, SetupErrorForBank1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_API_CALLER_ACCOUNT_SETUP_FOR_BANK_PAYMENTS_IS_INCOMPLETE_OR_INCORRECT_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER.value = "The API Caller account setup, for bank payments, is incomplete or incorrect. Please contact your PayPal account manager.";

        valueMap.put("The API Caller account setup, for bank payments, is incomplete or incorrect. Please contact your PayPal account manager.", ENUM_THE_API_CALLER_ACCOUNT_SETUP_FOR_BANK_PAYMENTS_IS_INCOMPLETE_OR_INCORRECT_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SetupErrorForBank1DescriptionEnum constructFromString(String toConvert) throws IOException {
        SetupErrorForBank1DescriptionEnum enumValue = fromString(toConvert);
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
    public static SetupErrorForBank1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of SetupErrorForBank1DescriptionEnum values to list of string values.
     * @param toConvert The list of SetupErrorForBank1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SetupErrorForBank1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SetupErrorForBank1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 