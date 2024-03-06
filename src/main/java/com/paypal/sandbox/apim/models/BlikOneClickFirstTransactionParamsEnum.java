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
 * BlikOneClickFirstTransactionParamsEnum to be used.
 */
public enum BlikOneClickFirstTransactionParamsEnum {
    ENUM_BLIKS_ONE_CLICK_FLOW_REQUIRES_ONE_CLICKAUTH_CODE_AND_ONE_CLICKALIAS_LABEL_PARAMETERS_FOR_THE_BUYERS_FIRST_TRANSACTION_FOR_ALL_SUBSEQUENT_TRANSACTIONSONLY_THE_ONE_CLICKALIAS_KEY_PARAMETER_IS_REQUIRED;


    private static TreeMap<String, BlikOneClickFirstTransactionParamsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_BLIKS_ONE_CLICK_FLOW_REQUIRES_ONE_CLICKAUTH_CODE_AND_ONE_CLICKALIAS_LABEL_PARAMETERS_FOR_THE_BUYERS_FIRST_TRANSACTION_FOR_ALL_SUBSEQUENT_TRANSACTIONSONLY_THE_ONE_CLICKALIAS_KEY_PARAMETER_IS_REQUIRED.value = "Blik's one_click flow requires one_click.auth_code and one_click.alias_label parameters for the buyer's first transaction. For all subsequent transactions,only the one_click.alias_key parameter is required.";

        valueMap.put("Blik's one_click flow requires one_click.auth_code and one_click.alias_label parameters for the buyer's first transaction. For all subsequent transactions,only the one_click.alias_key parameter is required.", ENUM_BLIKS_ONE_CLICK_FLOW_REQUIRES_ONE_CLICKAUTH_CODE_AND_ONE_CLICKALIAS_LABEL_PARAMETERS_FOR_THE_BUYERS_FIRST_TRANSACTION_FOR_ALL_SUBSEQUENT_TRANSACTIONSONLY_THE_ONE_CLICKALIAS_KEY_PARAMETER_IS_REQUIRED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BlikOneClickFirstTransactionParamsEnum constructFromString(String toConvert) throws IOException {
        BlikOneClickFirstTransactionParamsEnum enumValue = fromString(toConvert);
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
    public static BlikOneClickFirstTransactionParamsEnum fromString(String toConvert) {
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
     * Convert list of BlikOneClickFirstTransactionParamsEnum values to list of string values.
     * @param toConvert The list of BlikOneClickFirstTransactionParamsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BlikOneClickFirstTransactionParamsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BlikOneClickFirstTransactionParamsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 