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
 * PayeeAccountLockedOrClosedDescriptionPaymentsEnum to be used.
 */
public enum PayeeAccountLockedOrClosedDescriptionPaymentsEnum {
    ENUM_TRANSACTION_COULD_NOT_COMPLETE_BECAUSE_PAYEE_ACCOUNT_IS_LOCKED_OR_CLOSED;


    private static TreeMap<String, PayeeAccountLockedOrClosedDescriptionPaymentsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_TRANSACTION_COULD_NOT_COMPLETE_BECAUSE_PAYEE_ACCOUNT_IS_LOCKED_OR_CLOSED.value = "Transaction could not complete because payee account is locked or closed.";

        valueMap.put("Transaction could not complete because payee account is locked or closed.", ENUM_TRANSACTION_COULD_NOT_COMPLETE_BECAUSE_PAYEE_ACCOUNT_IS_LOCKED_OR_CLOSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeAccountLockedOrClosedDescriptionPaymentsEnum constructFromString(String toConvert) throws IOException {
        PayeeAccountLockedOrClosedDescriptionPaymentsEnum enumValue = fromString(toConvert);
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
    public static PayeeAccountLockedOrClosedDescriptionPaymentsEnum fromString(String toConvert) {
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
     * Convert list of PayeeAccountLockedOrClosedDescriptionPaymentsEnum values to list of string values.
     * @param toConvert The list of PayeeAccountLockedOrClosedDescriptionPaymentsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeAccountLockedOrClosedDescriptionPaymentsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeAccountLockedOrClosedDescriptionPaymentsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 