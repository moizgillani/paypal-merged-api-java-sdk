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
 * UnsupportedProcessingInstruction1DescriptionEnum to be used.
 */
public enum UnsupportedProcessingInstruction1DescriptionEnum {
    ENUM_THE_SPECIFIED_PROCESSING_INSTRUCTION_IS_NOT_SUPPORTED_FOR_THE_GIVEN_PAYMENT_SOURCE_PLEASE_REFER_TO_HTTPSDEVELOPERPAYPALCOMAPIORDERSV2DEFINITIONPROCESSING_INSTRUCTION_FOR_THE_LIST_OF_PAYMENT_SOURCE_THAT_CAN_BE_SPECIFIED_WITH_THIS_VALUE;


    private static TreeMap<String, UnsupportedProcessingInstruction1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_SPECIFIED_PROCESSING_INSTRUCTION_IS_NOT_SUPPORTED_FOR_THE_GIVEN_PAYMENT_SOURCE_PLEASE_REFER_TO_HTTPSDEVELOPERPAYPALCOMAPIORDERSV2DEFINITIONPROCESSING_INSTRUCTION_FOR_THE_LIST_OF_PAYMENT_SOURCE_THAT_CAN_BE_SPECIFIED_WITH_THIS_VALUE.value = "The specified processing_instruction is not supported for the given payment_source. Please refer to https://developer.paypal.com/api/orders/v2/#definition-processing_instruction for the list of payment_source that can be specified with this value.";

        valueMap.put("The specified processing_instruction is not supported for the given payment_source. Please refer to https://developer.paypal.com/api/orders/v2/#definition-processing_instruction for the list of payment_source that can be specified with this value.", ENUM_THE_SPECIFIED_PROCESSING_INSTRUCTION_IS_NOT_SUPPORTED_FOR_THE_GIVEN_PAYMENT_SOURCE_PLEASE_REFER_TO_HTTPSDEVELOPERPAYPALCOMAPIORDERSV2DEFINITIONPROCESSING_INSTRUCTION_FOR_THE_LIST_OF_PAYMENT_SOURCE_THAT_CAN_BE_SPECIFIED_WITH_THIS_VALUE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UnsupportedProcessingInstruction1DescriptionEnum constructFromString(String toConvert) throws IOException {
        UnsupportedProcessingInstruction1DescriptionEnum enumValue = fromString(toConvert);
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
    public static UnsupportedProcessingInstruction1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of UnsupportedProcessingInstruction1DescriptionEnum values to list of string values.
     * @param toConvert The list of UnsupportedProcessingInstruction1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UnsupportedProcessingInstruction1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UnsupportedProcessingInstruction1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 