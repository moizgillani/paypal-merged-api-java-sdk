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
 * AuthCurrencyMismatchDescriptionEnum to be used.
 */
public enum AuthCurrencyMismatchDescriptionEnum {
    ENUM_THE_CURRENCY_SPECIFIED_DURING_REAUTHORIZATION_SHOULD_BE_THE_SAME_AS_THE_CURRENCY_SPECIFIED_IN_THE_ORIGINAL_AUTHORIZATION_PLEASE_CHECK_THE_CURRENCY_OF_THE_AUTHORIZATION_FOR_WHICH_YOU_ARE_TRYING_TO_REAUTHORIZE_AND_TRY_AGAIN;


    private static TreeMap<String, AuthCurrencyMismatchDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_CURRENCY_SPECIFIED_DURING_REAUTHORIZATION_SHOULD_BE_THE_SAME_AS_THE_CURRENCY_SPECIFIED_IN_THE_ORIGINAL_AUTHORIZATION_PLEASE_CHECK_THE_CURRENCY_OF_THE_AUTHORIZATION_FOR_WHICH_YOU_ARE_TRYING_TO_REAUTHORIZE_AND_TRY_AGAIN.value = "The currency specified during reauthorization should be the same as the currency specified in the original authorization. Please check the currency of the authorization for which you are trying to reauthorize and try again.";

        valueMap.put("The currency specified during reauthorization should be the same as the currency specified in the original authorization. Please check the currency of the authorization for which you are trying to reauthorize and try again.", ENUM_THE_CURRENCY_SPECIFIED_DURING_REAUTHORIZATION_SHOULD_BE_THE_SAME_AS_THE_CURRENCY_SPECIFIED_IN_THE_ORIGINAL_AUTHORIZATION_PLEASE_CHECK_THE_CURRENCY_OF_THE_AUTHORIZATION_FOR_WHICH_YOU_ARE_TRYING_TO_REAUTHORIZE_AND_TRY_AGAIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AuthCurrencyMismatchDescriptionEnum constructFromString(String toConvert) throws IOException {
        AuthCurrencyMismatchDescriptionEnum enumValue = fromString(toConvert);
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
    public static AuthCurrencyMismatchDescriptionEnum fromString(String toConvert) {
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
     * Convert list of AuthCurrencyMismatchDescriptionEnum values to list of string values.
     * @param toConvert The list of AuthCurrencyMismatchDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AuthCurrencyMismatchDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AuthCurrencyMismatchDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 