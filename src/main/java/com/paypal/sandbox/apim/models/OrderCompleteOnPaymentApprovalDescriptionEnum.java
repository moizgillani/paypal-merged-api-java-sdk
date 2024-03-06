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
 * OrderCompleteOnPaymentApprovalDescriptionEnum to be used.
 */
public enum OrderCompleteOnPaymentApprovalDescriptionEnum {
    ENUM_A_PROCESSING_INSTRUCTION_OF_ORDER_COMPLETE_ON_PAYMENT_APPROVAL_IS_REQUIRED_FOR_THE_SPECIFIED_PAYMENT_SOURCE_PLEASE_REFER_TO_THE_INTEGRATION_GUIDE_HTTPSDEVELOPERPAYPALCOMDOCSLIMITEDRELEASEALTERNATIVEPAYMENTMETHODSWITHORDERS_FOR_MORE_DETAILS;


    private static TreeMap<String, OrderCompleteOnPaymentApprovalDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_A_PROCESSING_INSTRUCTION_OF_ORDER_COMPLETE_ON_PAYMENT_APPROVAL_IS_REQUIRED_FOR_THE_SPECIFIED_PAYMENT_SOURCE_PLEASE_REFER_TO_THE_INTEGRATION_GUIDE_HTTPSDEVELOPERPAYPALCOMDOCSLIMITEDRELEASEALTERNATIVEPAYMENTMETHODSWITHORDERS_FOR_MORE_DETAILS.value = "A processing_instruction of `ORDER_COMPLETE_ON_PAYMENT_APPROVAL` is required for the specified payment_source. Please refer to the integration guide https://developer.paypal.com/docs/limited-release/alternative-payment-methods-with-orders/ for more details";

        valueMap.put("A processing_instruction of `ORDER_COMPLETE_ON_PAYMENT_APPROVAL` is required for the specified payment_source. Please refer to the integration guide https://developer.paypal.com/docs/limited-release/alternative-payment-methods-with-orders/ for more details", ENUM_A_PROCESSING_INSTRUCTION_OF_ORDER_COMPLETE_ON_PAYMENT_APPROVAL_IS_REQUIRED_FOR_THE_SPECIFIED_PAYMENT_SOURCE_PLEASE_REFER_TO_THE_INTEGRATION_GUIDE_HTTPSDEVELOPERPAYPALCOMDOCSLIMITEDRELEASEALTERNATIVEPAYMENTMETHODSWITHORDERS_FOR_MORE_DETAILS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderCompleteOnPaymentApprovalDescriptionEnum constructFromString(String toConvert) throws IOException {
        OrderCompleteOnPaymentApprovalDescriptionEnum enumValue = fromString(toConvert);
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
    public static OrderCompleteOnPaymentApprovalDescriptionEnum fromString(String toConvert) {
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
     * Convert list of OrderCompleteOnPaymentApprovalDescriptionEnum values to list of string values.
     * @param toConvert The list of OrderCompleteOnPaymentApprovalDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderCompleteOnPaymentApprovalDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderCompleteOnPaymentApprovalDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 