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
 * AliasDeclinedByProcessorDescriptionEnum to be used.
 */
public enum AliasDeclinedByProcessorDescriptionEnum {
    ENUM_THE_PROVIDED_ALIAS_WAS_DECLINED_BY_THE_PROCESSOR_PLEASE_CREATE_A_NEW_ORDER_WITH_A_DIFFERENT_ALIAS_KEY_ANDOR_ALIAS_LABEL_AND_TRY_AGAIN;


    private static TreeMap<String, AliasDeclinedByProcessorDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PROVIDED_ALIAS_WAS_DECLINED_BY_THE_PROCESSOR_PLEASE_CREATE_A_NEW_ORDER_WITH_A_DIFFERENT_ALIAS_KEY_ANDOR_ALIAS_LABEL_AND_TRY_AGAIN.value = "The provided alias was declined by the processor. Please create a new order with a different alias_key and/or alias_label and try again.";

        valueMap.put("The provided alias was declined by the processor. Please create a new order with a different alias_key and/or alias_label and try again.", ENUM_THE_PROVIDED_ALIAS_WAS_DECLINED_BY_THE_PROCESSOR_PLEASE_CREATE_A_NEW_ORDER_WITH_A_DIFFERENT_ALIAS_KEY_ANDOR_ALIAS_LABEL_AND_TRY_AGAIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AliasDeclinedByProcessorDescriptionEnum constructFromString(String toConvert) throws IOException {
        AliasDeclinedByProcessorDescriptionEnum enumValue = fromString(toConvert);
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
    public static AliasDeclinedByProcessorDescriptionEnum fromString(String toConvert) {
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
     * Convert list of AliasDeclinedByProcessorDescriptionEnum values to list of string values.
     * @param toConvert The list of AliasDeclinedByProcessorDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AliasDeclinedByProcessorDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AliasDeclinedByProcessorDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 