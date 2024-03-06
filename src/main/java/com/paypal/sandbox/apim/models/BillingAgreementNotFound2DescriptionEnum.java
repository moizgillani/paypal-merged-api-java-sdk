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
 * BillingAgreementNotFound2DescriptionEnum to be used.
 */
public enum BillingAgreementNotFound2DescriptionEnum {
    ENUM_THE_REQUESTED_BILLING_AGREEMENT_TOKEN_WAS_NOT_FOUND;


    private static TreeMap<String, BillingAgreementNotFound2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_REQUESTED_BILLING_AGREEMENT_TOKEN_WAS_NOT_FOUND.value = "The requested Billing Agreement token was not found.";

        valueMap.put("The requested Billing Agreement token was not found.", ENUM_THE_REQUESTED_BILLING_AGREEMENT_TOKEN_WAS_NOT_FOUND);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BillingAgreementNotFound2DescriptionEnum constructFromString(String toConvert) throws IOException {
        BillingAgreementNotFound2DescriptionEnum enumValue = fromString(toConvert);
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
    public static BillingAgreementNotFound2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of BillingAgreementNotFound2DescriptionEnum values to list of string values.
     * @param toConvert The list of BillingAgreementNotFound2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BillingAgreementNotFound2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BillingAgreementNotFound2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 