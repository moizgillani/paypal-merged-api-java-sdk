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
 * InvalidGooglePayMerchantIdMismatchEnum to be used.
 */
public enum InvalidGooglePayMerchantIdMismatchEnum {
    ENUM_THE_GATEWAY_MERCHANT_ID_IN_GOOGLE_PAY_TOKEN_IS_NOT_VALID_THIS_COULD_BE_BECAUSE_THE_GATEWAY_MERCHANT_ID_THAT_WAS_AUTHORIZED_BY_PAYERBUYER_ON_GOOGLE_PAY_DOES_NOT_MATCH_WITH_THE_API_CALLER_OF_THE_ORDER;


    private static TreeMap<String, InvalidGooglePayMerchantIdMismatchEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_GATEWAY_MERCHANT_ID_IN_GOOGLE_PAY_TOKEN_IS_NOT_VALID_THIS_COULD_BE_BECAUSE_THE_GATEWAY_MERCHANT_ID_THAT_WAS_AUTHORIZED_BY_PAYERBUYER_ON_GOOGLE_PAY_DOES_NOT_MATCH_WITH_THE_API_CALLER_OF_THE_ORDER.value = "The gateway merchant ID in Google Pay token is not valid. This could be because the gateway merchant Id that was authorized by payer/buyer on Google Pay does not match with the API caller of the order.";

        valueMap.put("The gateway merchant ID in Google Pay token is not valid. This could be because the gateway merchant Id that was authorized by payer/buyer on Google Pay does not match with the API caller of the order.", ENUM_THE_GATEWAY_MERCHANT_ID_IN_GOOGLE_PAY_TOKEN_IS_NOT_VALID_THIS_COULD_BE_BECAUSE_THE_GATEWAY_MERCHANT_ID_THAT_WAS_AUTHORIZED_BY_PAYERBUYER_ON_GOOGLE_PAY_DOES_NOT_MATCH_WITH_THE_API_CALLER_OF_THE_ORDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidGooglePayMerchantIdMismatchEnum constructFromString(String toConvert) throws IOException {
        InvalidGooglePayMerchantIdMismatchEnum enumValue = fromString(toConvert);
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
    public static InvalidGooglePayMerchantIdMismatchEnum fromString(String toConvert) {
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
     * Convert list of InvalidGooglePayMerchantIdMismatchEnum values to list of string values.
     * @param toConvert The list of InvalidGooglePayMerchantIdMismatchEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidGooglePayMerchantIdMismatchEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidGooglePayMerchantIdMismatchEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 