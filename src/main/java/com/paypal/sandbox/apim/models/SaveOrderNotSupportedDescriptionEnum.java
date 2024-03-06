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
 * SaveOrderNotSupportedDescriptionEnum to be used.
 */
public enum SaveOrderNotSupportedDescriptionEnum {
    ENUM_THE_API_CALLER_ACCOUNT_IS_SETUP_IN_A_WAY_THAT_DOES_NOT_ALLOW_IT_TO_BE_USED_FOR_SAVING_THE_ORDER_THIS_FUNCTIONALITY_IS_NOT_AVAILABLE_FOR_PAYPAL_COMMERCE_PLATFORM_FOR_PLATFORMS_MARKETPLACES;


    private static TreeMap<String, SaveOrderNotSupportedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_API_CALLER_ACCOUNT_IS_SETUP_IN_A_WAY_THAT_DOES_NOT_ALLOW_IT_TO_BE_USED_FOR_SAVING_THE_ORDER_THIS_FUNCTIONALITY_IS_NOT_AVAILABLE_FOR_PAYPAL_COMMERCE_PLATFORM_FOR_PLATFORMS_MARKETPLACES.value = "The API caller account is setup in a way that does not allow it to be used for saving the order. This functionality is not available for PayPal Commerce Platform for Platforms & Marketplaces.";

        valueMap.put("The API caller account is setup in a way that does not allow it to be used for saving the order. This functionality is not available for PayPal Commerce Platform for Platforms & Marketplaces.", ENUM_THE_API_CALLER_ACCOUNT_IS_SETUP_IN_A_WAY_THAT_DOES_NOT_ALLOW_IT_TO_BE_USED_FOR_SAVING_THE_ORDER_THIS_FUNCTIONALITY_IS_NOT_AVAILABLE_FOR_PAYPAL_COMMERCE_PLATFORM_FOR_PLATFORMS_MARKETPLACES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SaveOrderNotSupportedDescriptionEnum constructFromString(String toConvert) throws IOException {
        SaveOrderNotSupportedDescriptionEnum enumValue = fromString(toConvert);
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
    public static SaveOrderNotSupportedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of SaveOrderNotSupportedDescriptionEnum values to list of string values.
     * @param toConvert The list of SaveOrderNotSupportedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SaveOrderNotSupportedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SaveOrderNotSupportedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 