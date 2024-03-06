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
 * PreviousTransactionReferenceChargebackIssue1Enum to be used.
 */
public enum PreviousTransactionReferenceChargebackIssue1Enum {
    PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK;


    private static TreeMap<String, PreviousTransactionReferenceChargebackIssue1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK.value = "PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK";

        valueMap.put("PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK", PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PreviousTransactionReferenceChargebackIssue1Enum constructFromString(String toConvert) throws IOException {
        PreviousTransactionReferenceChargebackIssue1Enum enumValue = fromString(toConvert);
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
    public static PreviousTransactionReferenceChargebackIssue1Enum fromString(String toConvert) {
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
     * Convert list of PreviousTransactionReferenceChargebackIssue1Enum values to list of string values.
     * @param toConvert The list of PreviousTransactionReferenceChargebackIssue1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PreviousTransactionReferenceChargebackIssue1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PreviousTransactionReferenceChargebackIssue1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 