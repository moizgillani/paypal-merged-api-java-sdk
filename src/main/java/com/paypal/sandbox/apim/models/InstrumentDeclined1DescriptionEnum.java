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
 * InstrumentDeclined1DescriptionEnum to be used.
 */
public enum InstrumentDeclined1DescriptionEnum {
    ENUM_THE_INSTRUMENT_PRESENTED_WAS_EITHER_DECLINED_BY_THE_PROCESSOR_OR_BANK_OR_IT_CANT_BE_USED_FOR_THIS_PAYMENT;


    private static TreeMap<String, InstrumentDeclined1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_INSTRUMENT_PRESENTED_WAS_EITHER_DECLINED_BY_THE_PROCESSOR_OR_BANK_OR_IT_CANT_BE_USED_FOR_THIS_PAYMENT.value = "The instrument presented  was either declined by the processor or bank, or it can't be used for this payment.";

        valueMap.put("The instrument presented  was either declined by the processor or bank, or it can't be used for this payment.", ENUM_THE_INSTRUMENT_PRESENTED_WAS_EITHER_DECLINED_BY_THE_PROCESSOR_OR_BANK_OR_IT_CANT_BE_USED_FOR_THIS_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InstrumentDeclined1DescriptionEnum constructFromString(String toConvert) throws IOException {
        InstrumentDeclined1DescriptionEnum enumValue = fromString(toConvert);
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
    public static InstrumentDeclined1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of InstrumentDeclined1DescriptionEnum values to list of string values.
     * @param toConvert The list of InstrumentDeclined1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InstrumentDeclined1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InstrumentDeclined1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 