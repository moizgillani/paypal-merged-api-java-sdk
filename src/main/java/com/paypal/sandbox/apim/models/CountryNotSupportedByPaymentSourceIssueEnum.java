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
 * CountryNotSupportedByPaymentSourceIssueEnum to be used.
 */
public enum CountryNotSupportedByPaymentSourceIssueEnum {
    COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE;


    private static TreeMap<String, CountryNotSupportedByPaymentSourceIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE.value = "COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE";

        valueMap.put("COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE", COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CountryNotSupportedByPaymentSourceIssueEnum constructFromString(String toConvert) throws IOException {
        CountryNotSupportedByPaymentSourceIssueEnum enumValue = fromString(toConvert);
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
    public static CountryNotSupportedByPaymentSourceIssueEnum fromString(String toConvert) {
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
     * Convert list of CountryNotSupportedByPaymentSourceIssueEnum values to list of string values.
     * @param toConvert The list of CountryNotSupportedByPaymentSourceIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CountryNotSupportedByPaymentSourceIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CountryNotSupportedByPaymentSourceIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 