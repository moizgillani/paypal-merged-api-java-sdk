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
 * AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum to be used.
 */
public enum AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum {
    ENUM_AUTHORIZATION_HAS_BEEN_PREVIOUSLY_CAPTURED_AND_HENCE_CANNOT_BE_VOIDED;


    private static TreeMap<String, AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_AUTHORIZATION_HAS_BEEN_PREVIOUSLY_CAPTURED_AND_HENCE_CANNOT_BE_VOIDED.value = "Authorization has been previously captured and hence cannot be voided.";

        valueMap.put("Authorization has been previously captured and hence cannot be voided.", ENUM_AUTHORIZATION_HAS_BEEN_PREVIOUSLY_CAPTURED_AND_HENCE_CANNOT_BE_VOIDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum constructFromString(String toConvert) throws IOException {
        AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum enumValue = fromString(toConvert);
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
    public static AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum fromString(String toConvert) {
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
     * Convert list of AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum values to list of string values.
     * @param toConvert The list of AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 