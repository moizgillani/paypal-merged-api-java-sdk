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
 * PayerAccountLockedOrClosed2DescriptionEnum to be used.
 */
public enum PayerAccountLockedOrClosed2DescriptionEnum {
    ENUM_THE_PAYER_ACCOUNT_CANNOT_BE_USED_FOR_THIS_TRANSACTION;


    private static TreeMap<String, PayerAccountLockedOrClosed2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PAYER_ACCOUNT_CANNOT_BE_USED_FOR_THIS_TRANSACTION.value = "The payer account cannot be used for this transaction.";

        valueMap.put("The payer account cannot be used for this transaction.", ENUM_THE_PAYER_ACCOUNT_CANNOT_BE_USED_FOR_THIS_TRANSACTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayerAccountLockedOrClosed2DescriptionEnum constructFromString(String toConvert) throws IOException {
        PayerAccountLockedOrClosed2DescriptionEnum enumValue = fromString(toConvert);
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
    public static PayerAccountLockedOrClosed2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayerAccountLockedOrClosed2DescriptionEnum values to list of string values.
     * @param toConvert The list of PayerAccountLockedOrClosed2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayerAccountLockedOrClosed2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayerAccountLockedOrClosed2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 