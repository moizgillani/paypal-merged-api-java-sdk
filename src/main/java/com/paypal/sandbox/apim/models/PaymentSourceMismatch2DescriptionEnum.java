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
 * PaymentSourceMismatch2DescriptionEnum to be used.
 */
public enum PaymentSourceMismatch2DescriptionEnum {
    ENUM_THE_PAYMENT_SOURCE_IN_THE_REQUEST_MUST_MATCH_THE_PAYMENT_SOURCE_USED_FOR_THE_AUTHORIZATION_OR_CAPTURE_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_PLEASE_USE_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_PAYMENT_SOURCE_MATCHES_WITH_THE_PAYMENT_SOURCE_SPECIFIED_IN_THE_ORDER;


    private static TreeMap<String, PaymentSourceMismatch2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PAYMENT_SOURCE_IN_THE_REQUEST_MUST_MATCH_THE_PAYMENT_SOURCE_USED_FOR_THE_AUTHORIZATION_OR_CAPTURE_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_PLEASE_USE_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_PAYMENT_SOURCE_MATCHES_WITH_THE_PAYMENT_SOURCE_SPECIFIED_IN_THE_ORDER.value = "The `payment_source` in the request must match the `payment_source` used for the authorization or capture referenced by `previous_transaction_reference`. Please use `previous_transaction_reference` whose `payment_source` matches with the `payment_source` specified in the order.";

        valueMap.put("The `payment_source` in the request must match the `payment_source` used for the authorization or capture referenced by `previous_transaction_reference`. Please use `previous_transaction_reference` whose `payment_source` matches with the `payment_source` specified in the order.", ENUM_THE_PAYMENT_SOURCE_IN_THE_REQUEST_MUST_MATCH_THE_PAYMENT_SOURCE_USED_FOR_THE_AUTHORIZATION_OR_CAPTURE_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_PLEASE_USE_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_PAYMENT_SOURCE_MATCHES_WITH_THE_PAYMENT_SOURCE_SPECIFIED_IN_THE_ORDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentSourceMismatch2DescriptionEnum constructFromString(String toConvert) throws IOException {
        PaymentSourceMismatch2DescriptionEnum enumValue = fromString(toConvert);
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
    public static PaymentSourceMismatch2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PaymentSourceMismatch2DescriptionEnum values to list of string values.
     * @param toConvert The list of PaymentSourceMismatch2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentSourceMismatch2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentSourceMismatch2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 