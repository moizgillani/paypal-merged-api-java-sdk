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
 * AmountCannotBeSpecifiedDescriptionEnum to be used.
 */
public enum AmountCannotBeSpecifiedDescriptionEnum {
    ENUM_AN_AUTHORIZATION_AMOUNT_CAN_ONLY_BE_SPECIFIED_IF_AN_ORDER_HAS_BEEN_SAVED_BY_CALLING_V2CHECKOUTORDERSORDER_IDSAVE_PLEASE_SAVE_THE_ORDER_AND_TRY_AGAIN;


    private static TreeMap<String, AmountCannotBeSpecifiedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_AN_AUTHORIZATION_AMOUNT_CAN_ONLY_BE_SPECIFIED_IF_AN_ORDER_HAS_BEEN_SAVED_BY_CALLING_V2CHECKOUTORDERSORDER_IDSAVE_PLEASE_SAVE_THE_ORDER_AND_TRY_AGAIN.value = "An authorization amount can only be specified if an Order has been saved by calling /v2/checkout/orders/{order_id}/save.  Please save the order and try again.";

        valueMap.put("An authorization amount can only be specified if an Order has been saved by calling /v2/checkout/orders/{order_id}/save.  Please save the order and try again.", ENUM_AN_AUTHORIZATION_AMOUNT_CAN_ONLY_BE_SPECIFIED_IF_AN_ORDER_HAS_BEEN_SAVED_BY_CALLING_V2CHECKOUTORDERSORDER_IDSAVE_PLEASE_SAVE_THE_ORDER_AND_TRY_AGAIN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AmountCannotBeSpecifiedDescriptionEnum constructFromString(String toConvert) throws IOException {
        AmountCannotBeSpecifiedDescriptionEnum enumValue = fromString(toConvert);
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
    public static AmountCannotBeSpecifiedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of AmountCannotBeSpecifiedDescriptionEnum values to list of string values.
     * @param toConvert The list of AmountCannotBeSpecifiedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AmountCannotBeSpecifiedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AmountCannotBeSpecifiedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 