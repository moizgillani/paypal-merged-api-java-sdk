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
 * TransactionRefusedDescriptionPaymentsEnum to be used.
 */
public enum TransactionRefusedDescriptionPaymentsEnum {
    ENUM_PAYPALS_INTERNAL_CONTROLS_PREVENT_AUTHORIZATION_FROM_BEING_CAPTURED;


    private static TreeMap<String, TransactionRefusedDescriptionPaymentsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PAYPALS_INTERNAL_CONTROLS_PREVENT_AUTHORIZATION_FROM_BEING_CAPTURED.value = "PayPal's internal controls prevent authorization from being captured.";

        valueMap.put("PayPal's internal controls prevent authorization from being captured.", ENUM_PAYPALS_INTERNAL_CONTROLS_PREVENT_AUTHORIZATION_FROM_BEING_CAPTURED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionRefusedDescriptionPaymentsEnum constructFromString(String toConvert) throws IOException {
        TransactionRefusedDescriptionPaymentsEnum enumValue = fromString(toConvert);
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
    public static TransactionRefusedDescriptionPaymentsEnum fromString(String toConvert) {
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
     * Convert list of TransactionRefusedDescriptionPaymentsEnum values to list of string values.
     * @param toConvert The list of TransactionRefusedDescriptionPaymentsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionRefusedDescriptionPaymentsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionRefusedDescriptionPaymentsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 