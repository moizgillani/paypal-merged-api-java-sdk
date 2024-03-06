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
 * PaymentSourceInfoCannotBeVerifiedDescriptionEnum to be used.
 */
public enum PaymentSourceInfoCannotBeVerifiedDescriptionEnum {
    ENUM_THE_COMBINATION_OF_THE_PAYMENT_SOURCE_NAME_BILLING_ADDRESS_SHIPPING_NAME_AND_SHIPPING_ADDRESS_COULD_NOT_BE_VERIFIED_PLEASE_CORRECT_THIS_INFORMATION_AND_TRY_AGAIN_BY_CREATING_A_NEW_ORDER;


    private static TreeMap<String, PaymentSourceInfoCannotBeVerifiedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_COMBINATION_OF_THE_PAYMENT_SOURCE_NAME_BILLING_ADDRESS_SHIPPING_NAME_AND_SHIPPING_ADDRESS_COULD_NOT_BE_VERIFIED_PLEASE_CORRECT_THIS_INFORMATION_AND_TRY_AGAIN_BY_CREATING_A_NEW_ORDER.value = "The combination of the payment_source name, billing address, shipping name and shipping address could not be verified. Please correct this information and try again by creating a new order.";

        valueMap.put("The combination of the payment_source name, billing address, shipping name and shipping address could not be verified. Please correct this information and try again by creating a new order.", ENUM_THE_COMBINATION_OF_THE_PAYMENT_SOURCE_NAME_BILLING_ADDRESS_SHIPPING_NAME_AND_SHIPPING_ADDRESS_COULD_NOT_BE_VERIFIED_PLEASE_CORRECT_THIS_INFORMATION_AND_TRY_AGAIN_BY_CREATING_A_NEW_ORDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentSourceInfoCannotBeVerifiedDescriptionEnum constructFromString(String toConvert) throws IOException {
        PaymentSourceInfoCannotBeVerifiedDescriptionEnum enumValue = fromString(toConvert);
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
    public static PaymentSourceInfoCannotBeVerifiedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PaymentSourceInfoCannotBeVerifiedDescriptionEnum values to list of string values.
     * @param toConvert The list of PaymentSourceInfoCannotBeVerifiedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentSourceInfoCannotBeVerifiedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentSourceInfoCannotBeVerifiedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 