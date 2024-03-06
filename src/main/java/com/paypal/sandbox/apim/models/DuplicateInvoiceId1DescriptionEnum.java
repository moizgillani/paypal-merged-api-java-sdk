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
 * DuplicateInvoiceId1DescriptionEnum to be used.
 */
public enum DuplicateInvoiceId1DescriptionEnum {
    ENUM_DUPLICATE_INVOICE_ID_DETECTED_TO_AVOID_A_POTENTIAL_DUPLICATE_TRANSACTION_YOUR_ACCOUNT_SETTING_REQUIRES_THAT_INVOICE_ID_BE_UNIQUE_FOR_EACH_TRANSACTION;


    private static TreeMap<String, DuplicateInvoiceId1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_DUPLICATE_INVOICE_ID_DETECTED_TO_AVOID_A_POTENTIAL_DUPLICATE_TRANSACTION_YOUR_ACCOUNT_SETTING_REQUIRES_THAT_INVOICE_ID_BE_UNIQUE_FOR_EACH_TRANSACTION.value = "Duplicate Invoice ID detected. To avoid a potential duplicate transaction your account setting requires that Invoice Id be unique for each transaction.";

        valueMap.put("Duplicate Invoice ID detected. To avoid a potential duplicate transaction your account setting requires that Invoice Id be unique for each transaction.", ENUM_DUPLICATE_INVOICE_ID_DETECTED_TO_AVOID_A_POTENTIAL_DUPLICATE_TRANSACTION_YOUR_ACCOUNT_SETTING_REQUIRES_THAT_INVOICE_ID_BE_UNIQUE_FOR_EACH_TRANSACTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DuplicateInvoiceId1DescriptionEnum constructFromString(String toConvert) throws IOException {
        DuplicateInvoiceId1DescriptionEnum enumValue = fromString(toConvert);
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
    public static DuplicateInvoiceId1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of DuplicateInvoiceId1DescriptionEnum values to list of string values.
     * @param toConvert The list of DuplicateInvoiceId1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DuplicateInvoiceId1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DuplicateInvoiceId1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 