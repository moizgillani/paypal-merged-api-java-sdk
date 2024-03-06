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
 * PatchOpEnum to be used.
 */
public enum PatchOpEnum {
    ADD,

    REMOVE,

    REPLACE,

    MOVE,

    COPY,

    TEST;


    private static TreeMap<String, PatchOpEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ADD.value = "add";
        REMOVE.value = "remove";
        REPLACE.value = "replace";
        MOVE.value = "move";
        COPY.value = "copy";
        TEST.value = "test";

        valueMap.put("add", ADD);
        valueMap.put("remove", REMOVE);
        valueMap.put("replace", REPLACE);
        valueMap.put("move", MOVE);
        valueMap.put("copy", COPY);
        valueMap.put("test", TEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PatchOpEnum constructFromString(String toConvert) throws IOException {
        PatchOpEnum enumValue = fromString(toConvert);
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
    public static PatchOpEnum fromString(String toConvert) {
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
     * Convert list of PatchOpEnum values to list of string values.
     * @param toConvert The list of PatchOpEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PatchOpEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PatchOpEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 