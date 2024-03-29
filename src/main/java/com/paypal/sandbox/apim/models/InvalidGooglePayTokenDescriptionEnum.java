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
 * InvalidGooglePayTokenDescriptionEnum to be used.
 */
public enum InvalidGooglePayTokenDescriptionEnum {
    ENUM_THE_GOOGLE_PAY_TOKEN_IS_INVALID_PAYPAL_WAS_NOT_ABLE_TO_DECRYPT_THE_GOOGLEPAY_TOKEN_OR_PAYPAL_WAS_NOT_ABLE_TO_FIND_THE_NECESSARY_DATA_IN_THE_TOKEN_AFTER_DECRYPTION;


    private static TreeMap<String, InvalidGooglePayTokenDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_GOOGLE_PAY_TOKEN_IS_INVALID_PAYPAL_WAS_NOT_ABLE_TO_DECRYPT_THE_GOOGLEPAY_TOKEN_OR_PAYPAL_WAS_NOT_ABLE_TO_FIND_THE_NECESSARY_DATA_IN_THE_TOKEN_AFTER_DECRYPTION.value = "The google pay token is invalid. PayPal was not able to decrypt the googlepay token or PayPal was not able to find the necessary data in the token after decryption.";

        valueMap.put("The google pay token is invalid. PayPal was not able to decrypt the googlepay token or PayPal was not able to find the necessary data in the token after decryption.", ENUM_THE_GOOGLE_PAY_TOKEN_IS_INVALID_PAYPAL_WAS_NOT_ABLE_TO_DECRYPT_THE_GOOGLEPAY_TOKEN_OR_PAYPAL_WAS_NOT_ABLE_TO_FIND_THE_NECESSARY_DATA_IN_THE_TOKEN_AFTER_DECRYPTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidGooglePayTokenDescriptionEnum constructFromString(String toConvert) throws IOException {
        InvalidGooglePayTokenDescriptionEnum enumValue = fromString(toConvert);
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
    public static InvalidGooglePayTokenDescriptionEnum fromString(String toConvert) {
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
     * Convert list of InvalidGooglePayTokenDescriptionEnum values to list of string values.
     * @param toConvert The list of InvalidGooglePayTokenDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidGooglePayTokenDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidGooglePayTokenDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 