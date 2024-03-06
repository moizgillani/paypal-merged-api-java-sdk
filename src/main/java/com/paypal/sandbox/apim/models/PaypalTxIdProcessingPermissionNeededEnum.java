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
 * PaypalTxIdProcessingPermissionNeededEnum to be used.
 */
public enum PaypalTxIdProcessingPermissionNeededEnum {
    ENUM_API_CALLER_IS_NOT_ENABLE_TO_PROCESS_PAYMENTS_USING_PAYPAL_TRANSACTION_ID_PLEASE_CONTACT_CUSTOMER_SUPPORT_TO_REQUEST_PERMISSIONS_TO_PROCESS_TRANSACTIONS_WITH_PAYPAL_TRANSACTION_ID;


    private static TreeMap<String, PaypalTxIdProcessingPermissionNeededEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_API_CALLER_IS_NOT_ENABLE_TO_PROCESS_PAYMENTS_USING_PAYPAL_TRANSACTION_ID_PLEASE_CONTACT_CUSTOMER_SUPPORT_TO_REQUEST_PERMISSIONS_TO_PROCESS_TRANSACTIONS_WITH_PAYPAL_TRANSACTION_ID.value = "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID.";

        valueMap.put("API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID.", ENUM_API_CALLER_IS_NOT_ENABLE_TO_PROCESS_PAYMENTS_USING_PAYPAL_TRANSACTION_ID_PLEASE_CONTACT_CUSTOMER_SUPPORT_TO_REQUEST_PERMISSIONS_TO_PROCESS_TRANSACTIONS_WITH_PAYPAL_TRANSACTION_ID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaypalTxIdProcessingPermissionNeededEnum constructFromString(String toConvert) throws IOException {
        PaypalTxIdProcessingPermissionNeededEnum enumValue = fromString(toConvert);
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
    public static PaypalTxIdProcessingPermissionNeededEnum fromString(String toConvert) {
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
     * Convert list of PaypalTxIdProcessingPermissionNeededEnum values to list of string values.
     * @param toConvert The list of PaypalTxIdProcessingPermissionNeededEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaypalTxIdProcessingPermissionNeededEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaypalTxIdProcessingPermissionNeededEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 