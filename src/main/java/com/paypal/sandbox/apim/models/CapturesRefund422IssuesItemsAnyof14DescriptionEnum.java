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
 * CapturesRefund422IssuesItemsAnyof14DescriptionEnum to be used.
 */
public enum CapturesRefund422IssuesItemsAnyof14DescriptionEnum {
    ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_REFUND_ATTEMPTS_FOR_THIS_CAPTURE;


    private static TreeMap<String, CapturesRefund422IssuesItemsAnyof14DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_REFUND_ATTEMPTS_FOR_THIS_CAPTURE.value = "You have exceeded the maximum number of refund attempts for this capture.";

        valueMap.put("You have exceeded the maximum number of refund attempts for this capture.", ENUM_YOU_HAVE_EXCEEDED_THE_MAXIMUM_NUMBER_OF_REFUND_ATTEMPTS_FOR_THIS_CAPTURE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CapturesRefund422IssuesItemsAnyof14DescriptionEnum constructFromString(String toConvert) throws IOException {
        CapturesRefund422IssuesItemsAnyof14DescriptionEnum enumValue = fromString(toConvert);
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
    public static CapturesRefund422IssuesItemsAnyof14DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CapturesRefund422IssuesItemsAnyof14DescriptionEnum values to list of string values.
     * @param toConvert The list of CapturesRefund422IssuesItemsAnyof14DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CapturesRefund422IssuesItemsAnyof14DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CapturesRefund422IssuesItemsAnyof14DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 