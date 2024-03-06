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
 * TransactionLimitExceededDescriptionEnum to be used.
 */
public enum TransactionLimitExceededDescriptionEnum {
    ENUM_TOTAL_PAYMENT_AMOUNT_EXCEEDED_TRANSACTION_LIMIT;


    private static TreeMap<String, TransactionLimitExceededDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_TOTAL_PAYMENT_AMOUNT_EXCEEDED_TRANSACTION_LIMIT.value = "Total payment amount exceeded transaction limit.";

        valueMap.put("Total payment amount exceeded transaction limit.", ENUM_TOTAL_PAYMENT_AMOUNT_EXCEEDED_TRANSACTION_LIMIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionLimitExceededDescriptionEnum constructFromString(String toConvert) throws IOException {
        TransactionLimitExceededDescriptionEnum enumValue = fromString(toConvert);
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
    public static TransactionLimitExceededDescriptionEnum fromString(String toConvert) {
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
     * Convert list of TransactionLimitExceededDescriptionEnum values to list of string values.
     * @param toConvert The list of TransactionLimitExceededDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionLimitExceededDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionLimitExceededDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 