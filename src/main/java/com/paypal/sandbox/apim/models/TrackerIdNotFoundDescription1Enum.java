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
 * TrackerIdNotFoundDescription1Enum to be used.
 */
public enum TrackerIdNotFoundDescription1Enum {
    ENUM_SPECIFIED_TRACKER_ID_DOES_NOT_EXIST_CHECK_THE_TRACKER_ID_AND_TRY_AGAIN;


    private static TreeMap<String, TrackerIdNotFoundDescription1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SPECIFIED_TRACKER_ID_DOES_NOT_EXIST_CHECK_THE_TRACKER_ID_AND_TRY_AGAIN.value = "Specified tracker ID does not exist. Check the tracker ID and try again.";

        valueMap.put("Specified tracker ID does not exist. Check the tracker ID and try again.", ENUM_SPECIFIED_TRACKER_ID_DOES_NOT_EXIST_CHECK_THE_TRACKER_ID_AND_TRY_AGAIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TrackerIdNotFoundDescription1Enum constructFromString(String toConvert) throws IOException {
        TrackerIdNotFoundDescription1Enum enumValue = fromString(toConvert);
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
    public static TrackerIdNotFoundDescription1Enum fromString(String toConvert) {
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
     * Convert list of TrackerIdNotFoundDescription1Enum values to list of string values.
     * @param toConvert The list of TrackerIdNotFoundDescription1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TrackerIdNotFoundDescription1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TrackerIdNotFoundDescription1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 