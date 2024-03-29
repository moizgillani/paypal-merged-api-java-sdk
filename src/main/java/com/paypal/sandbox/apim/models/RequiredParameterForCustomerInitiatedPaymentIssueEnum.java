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
 * RequiredParameterForCustomerInitiatedPaymentIssueEnum to be used.
 */
public enum RequiredParameterForCustomerInitiatedPaymentIssueEnum {
    REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT;


    private static TreeMap<String, RequiredParameterForCustomerInitiatedPaymentIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT.value = "REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT";

        valueMap.put("REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT", REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RequiredParameterForCustomerInitiatedPaymentIssueEnum constructFromString(String toConvert) throws IOException {
        RequiredParameterForCustomerInitiatedPaymentIssueEnum enumValue = fromString(toConvert);
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
    public static RequiredParameterForCustomerInitiatedPaymentIssueEnum fromString(String toConvert) {
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
     * Convert list of RequiredParameterForCustomerInitiatedPaymentIssueEnum values to list of string values.
     * @param toConvert The list of RequiredParameterForCustomerInitiatedPaymentIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RequiredParameterForCustomerInitiatedPaymentIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RequiredParameterForCustomerInitiatedPaymentIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 