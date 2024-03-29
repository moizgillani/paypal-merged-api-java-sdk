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
 * OrderCannotBeSavedDescriptionEnum to be used.
 */
public enum OrderCannotBeSavedDescriptionEnum {
    ENUM_THE_OPTION_TO_SAVE_AN_ORDER_IS_ONLY_AVAILABLE_IF_THE_INTENT_IS_AUTHORIZE_AND_PROCESSING_INSTRUCTION_USES_ONE_OF_THE_ORDER_SAVED_OPTIONS_FOR_EXAMPLE_INTENTAUTHORIZE_PROCESSING_INSTRUCTIONORDER_SAVED_EXPLICITLY_PLEASE_CHANGE_THE_INTENT_ANDOR_PROCESSING_INSTRUCTION_AND_TRY_AGAIN;


    private static TreeMap<String, OrderCannotBeSavedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_OPTION_TO_SAVE_AN_ORDER_IS_ONLY_AVAILABLE_IF_THE_INTENT_IS_AUTHORIZE_AND_PROCESSING_INSTRUCTION_USES_ONE_OF_THE_ORDER_SAVED_OPTIONS_FOR_EXAMPLE_INTENTAUTHORIZE_PROCESSING_INSTRUCTIONORDER_SAVED_EXPLICITLY_PLEASE_CHANGE_THE_INTENT_ANDOR_PROCESSING_INSTRUCTION_AND_TRY_AGAIN.value = "The option to save an order is only available if the `intent` is AUTHORIZE and `processing_instruction` uses one of the `ORDER_SAVED` options. For example, `intent`=AUTHORIZE, `processing_instruction`=ORDER_SAVED_EXPLICITLY. Please change the intent and/or processing_instruction` and try again.";

        valueMap.put("The option to save an order is only available if the `intent` is AUTHORIZE and `processing_instruction` uses one of the `ORDER_SAVED` options. For example, `intent`=AUTHORIZE, `processing_instruction`=ORDER_SAVED_EXPLICITLY. Please change the intent and/or processing_instruction` and try again.", ENUM_THE_OPTION_TO_SAVE_AN_ORDER_IS_ONLY_AVAILABLE_IF_THE_INTENT_IS_AUTHORIZE_AND_PROCESSING_INSTRUCTION_USES_ONE_OF_THE_ORDER_SAVED_OPTIONS_FOR_EXAMPLE_INTENTAUTHORIZE_PROCESSING_INSTRUCTIONORDER_SAVED_EXPLICITLY_PLEASE_CHANGE_THE_INTENT_ANDOR_PROCESSING_INSTRUCTION_AND_TRY_AGAIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderCannotBeSavedDescriptionEnum constructFromString(String toConvert) throws IOException {
        OrderCannotBeSavedDescriptionEnum enumValue = fromString(toConvert);
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
    public static OrderCannotBeSavedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of OrderCannotBeSavedDescriptionEnum values to list of string values.
     * @param toConvert The list of OrderCannotBeSavedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderCannotBeSavedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderCannotBeSavedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 