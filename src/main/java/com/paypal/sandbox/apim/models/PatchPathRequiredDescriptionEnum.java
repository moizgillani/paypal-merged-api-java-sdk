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
 * PatchPathRequiredDescriptionEnum to be used.
 */
public enum PatchPathRequiredDescriptionEnum {
    ENUM_PLEASE_SPECIFY_A_PATH_FOR_THE_FIELD_FOR_WHICH_THE_OPERATION_NEEDS_TO_BE_PERFORMED;


    private static TreeMap<String, PatchPathRequiredDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PLEASE_SPECIFY_A_PATH_FOR_THE_FIELD_FOR_WHICH_THE_OPERATION_NEEDS_TO_BE_PERFORMED.value = "Please specify a 'path' for the field for which the operation needs to be performed.";

        valueMap.put("Please specify a 'path' for the field for which the operation needs to be performed.", ENUM_PLEASE_SPECIFY_A_PATH_FOR_THE_FIELD_FOR_WHICH_THE_OPERATION_NEEDS_TO_BE_PERFORMED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PatchPathRequiredDescriptionEnum constructFromString(String toConvert) throws IOException {
        PatchPathRequiredDescriptionEnum enumValue = fromString(toConvert);
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
    public static PatchPathRequiredDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PatchPathRequiredDescriptionEnum values to list of string values.
     * @param toConvert The list of PatchPathRequiredDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PatchPathRequiredDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PatchPathRequiredDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 