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
 * ExceededMaxPaymentAttemptsEnum to be used.
 */
public enum ExceededMaxPaymentAttemptsEnum {
    ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_PAYMENT_ATTEMPTS;


    private static TreeMap<String, ExceededMaxPaymentAttemptsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_PAYMENT_ATTEMPTS.value = "You have exceeded the maximum number of payment attempts.";

        valueMap.put("You have exceeded the maximum number of payment attempts.", ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_PAYMENT_ATTEMPTS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ExceededMaxPaymentAttemptsEnum constructFromString(String toConvert) throws IOException {
        ExceededMaxPaymentAttemptsEnum enumValue = fromString(toConvert);
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
    public static ExceededMaxPaymentAttemptsEnum fromString(String toConvert) {
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
     * Convert list of ExceededMaxPaymentAttemptsEnum values to list of string values.
     * @param toConvert The list of ExceededMaxPaymentAttemptsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ExceededMaxPaymentAttemptsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ExceededMaxPaymentAttemptsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 