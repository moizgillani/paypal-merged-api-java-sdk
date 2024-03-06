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
 * PayeeNotEnabledForBankProcessingDescriptionEnum to be used.
 */
public enum PayeeNotEnabledForBankProcessingDescriptionEnum {
    ENUM_PAYEE_ACCOUNT_IS_NOT_SETUP_TO_BE_ABLE_TO_PROCESS_BANK_PAYMENTS_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER;


    private static TreeMap<String, PayeeNotEnabledForBankProcessingDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PAYEE_ACCOUNT_IS_NOT_SETUP_TO_BE_ABLE_TO_PROCESS_BANK_PAYMENTS_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER.value = "Payee account is not setup to be able to process bank payments. Please contact your PayPal account manager.";

        valueMap.put("Payee account is not setup to be able to process bank payments. Please contact your PayPal account manager.", ENUM_PAYEE_ACCOUNT_IS_NOT_SETUP_TO_BE_ABLE_TO_PROCESS_BANK_PAYMENTS_PLEASE_CONTACT_YOUR_PAYPAL_ACCOUNT_MANAGER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeNotEnabledForBankProcessingDescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeNotEnabledForBankProcessingDescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeNotEnabledForBankProcessingDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeNotEnabledForBankProcessingDescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeNotEnabledForBankProcessingDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeNotEnabledForBankProcessingDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeNotEnabledForBankProcessingDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 