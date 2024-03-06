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
 * ApplePayAmountMismatch3DescriptionEnum to be used.
 */
public enum ApplePayAmountMismatch3DescriptionEnum {
    ENUM_THE_AMOUNT_SPECIFIED_IN_THE_ORDER_SHOULD_MATCH_THE_AMOUNT_THAT_WAS_VIEWED_AND_AUTHORIZED_BY_THE_PAYERBUYER_ON_APPLE_PAY_IF_THE_AMOUNT_HAS_CHANGED_PLEASE_REDIRECT_THE_BUYER_TO_AUTHORIZE_THE_ORDER_AGAIN_VIA_APPLE_PAY;


    private static TreeMap<String, ApplePayAmountMismatch3DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_AMOUNT_SPECIFIED_IN_THE_ORDER_SHOULD_MATCH_THE_AMOUNT_THAT_WAS_VIEWED_AND_AUTHORIZED_BY_THE_PAYERBUYER_ON_APPLE_PAY_IF_THE_AMOUNT_HAS_CHANGED_PLEASE_REDIRECT_THE_BUYER_TO_AUTHORIZE_THE_ORDER_AGAIN_VIA_APPLE_PAY.value = "The 'amount' specified in the Order should match the amount that was viewed and authorized by the payer/buyer on Apple Pay. If the amount has changed, please redirect the buyer to authorize the order again via Apple Pay.";

        valueMap.put("The 'amount' specified in the Order should match the amount that was viewed and authorized by the payer/buyer on Apple Pay. If the amount has changed, please redirect the buyer to authorize the order again via Apple Pay.", ENUM_THE_AMOUNT_SPECIFIED_IN_THE_ORDER_SHOULD_MATCH_THE_AMOUNT_THAT_WAS_VIEWED_AND_AUTHORIZED_BY_THE_PAYERBUYER_ON_APPLE_PAY_IF_THE_AMOUNT_HAS_CHANGED_PLEASE_REDIRECT_THE_BUYER_TO_AUTHORIZE_THE_ORDER_AGAIN_VIA_APPLE_PAY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ApplePayAmountMismatch3DescriptionEnum constructFromString(String toConvert) throws IOException {
        ApplePayAmountMismatch3DescriptionEnum enumValue = fromString(toConvert);
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
    public static ApplePayAmountMismatch3DescriptionEnum fromString(String toConvert) {
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
     * Convert list of ApplePayAmountMismatch3DescriptionEnum values to list of string values.
     * @param toConvert The list of ApplePayAmountMismatch3DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ApplePayAmountMismatch3DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ApplePayAmountMismatch3DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 