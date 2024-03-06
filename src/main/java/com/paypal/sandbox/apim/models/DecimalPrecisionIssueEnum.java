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
 * DecimalPrecisionIssueEnum to be used.
 */
public enum DecimalPrecisionIssueEnum {
    DECIMAL_PRECISION;


    private static TreeMap<String, DecimalPrecisionIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DECIMAL_PRECISION.value = "DECIMAL_PRECISION";

        valueMap.put("DECIMAL_PRECISION", DECIMAL_PRECISION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DecimalPrecisionIssueEnum constructFromString(String toConvert) throws IOException {
        DecimalPrecisionIssueEnum enumValue = fromString(toConvert);
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
    public static DecimalPrecisionIssueEnum fromString(String toConvert) {
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
     * Convert list of DecimalPrecisionIssueEnum values to list of string values.
     * @param toConvert The list of DecimalPrecisionIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DecimalPrecisionIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DecimalPrecisionIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 