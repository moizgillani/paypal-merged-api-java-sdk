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
 * CryptogramRequired3DescriptionEnum to be used.
 */
public enum CryptogramRequired3DescriptionEnum {
    ENUM_CRYPTOGRAM_IS_REQUIRED_IF_AUTHENTICATION_METHOD_IS_CRYPTOGRAM_3DS;


    private static TreeMap<String, CryptogramRequired3DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_CRYPTOGRAM_IS_REQUIRED_IF_AUTHENTICATION_METHOD_IS_CRYPTOGRAM_3DS.value = "Cryptogram is required if authentication method is CRYPTOGRAM 3DS.";

        valueMap.put("Cryptogram is required if authentication method is CRYPTOGRAM 3DS.", ENUM_CRYPTOGRAM_IS_REQUIRED_IF_AUTHENTICATION_METHOD_IS_CRYPTOGRAM_3DS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CryptogramRequired3DescriptionEnum constructFromString(String toConvert) throws IOException {
        CryptogramRequired3DescriptionEnum enumValue = fromString(toConvert);
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
    public static CryptogramRequired3DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CryptogramRequired3DescriptionEnum values to list of string values.
     * @param toConvert The list of CryptogramRequired3DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CryptogramRequired3DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CryptogramRequired3DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 