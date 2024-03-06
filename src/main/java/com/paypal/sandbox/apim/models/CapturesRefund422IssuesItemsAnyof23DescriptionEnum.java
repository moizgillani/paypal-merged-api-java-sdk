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
 * CapturesRefund422IssuesItemsAnyof23DescriptionEnum to be used.
 */
public enum CapturesRefund422IssuesItemsAnyof23DescriptionEnum {
    ENUM_THIS_REFUND_CAN_ONLY_BE_PROCESSED_BY_THE_API_CALLER_THAT_HAD_CAPTURED_THE_TRANSACTION_IF_YOU_FACILITATE_YOUR_TRANSACTIONS_VIA_A_PLATFORMPARTNER_PLEASE_INITIATE_A_REFUND_THROUGH_THEM;


    private static TreeMap<String, CapturesRefund422IssuesItemsAnyof23DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THIS_REFUND_CAN_ONLY_BE_PROCESSED_BY_THE_API_CALLER_THAT_HAD_CAPTURED_THE_TRANSACTION_IF_YOU_FACILITATE_YOUR_TRANSACTIONS_VIA_A_PLATFORMPARTNER_PLEASE_INITIATE_A_REFUND_THROUGH_THEM.value = "This refund can only be processed by the API caller that had 'captured' the transaction. If you facilitate your transactions via a platform/partner, please initiate a refund through them.";

        valueMap.put("This refund can only be processed by the API caller that had 'captured' the transaction. If you facilitate your transactions via a platform/partner, please initiate a refund through them.", ENUM_THIS_REFUND_CAN_ONLY_BE_PROCESSED_BY_THE_API_CALLER_THAT_HAD_CAPTURED_THE_TRANSACTION_IF_YOU_FACILITATE_YOUR_TRANSACTIONS_VIA_A_PLATFORMPARTNER_PLEASE_INITIATE_A_REFUND_THROUGH_THEM);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CapturesRefund422IssuesItemsAnyof23DescriptionEnum constructFromString(String toConvert) throws IOException {
        CapturesRefund422IssuesItemsAnyof23DescriptionEnum enumValue = fromString(toConvert);
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
    public static CapturesRefund422IssuesItemsAnyof23DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CapturesRefund422IssuesItemsAnyof23DescriptionEnum values to list of string values.
     * @param toConvert The list of CapturesRefund422IssuesItemsAnyof23DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CapturesRefund422IssuesItemsAnyof23DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CapturesRefund422IssuesItemsAnyof23DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 