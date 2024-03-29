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
 * ShippingOptionNotSupportedDescriptionEnum to be used.
 */
public enum ShippingOptionNotSupportedDescriptionEnum {
    ENUM_SHIPPING_OPTIONS_ARE_NOT_SUPPORTED_WHEN_SHIPPINGTYPE_IS_SPECIFIED_OR_WHEN_APPLICATION_CONTEXTSHIPPING_PREFERENCE_IS_SET_AS_NO_SHIPPING_OR_SET_PROVIDED_ADDRESS;


    private static TreeMap<String, ShippingOptionNotSupportedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SHIPPING_OPTIONS_ARE_NOT_SUPPORTED_WHEN_SHIPPINGTYPE_IS_SPECIFIED_OR_WHEN_APPLICATION_CONTEXTSHIPPING_PREFERENCE_IS_SET_AS_NO_SHIPPING_OR_SET_PROVIDED_ADDRESS.value = "Shipping options are not supported when `shipping.type` is specified or when 'application_context.shipping_preference' is set as 'NO_SHIPPING' or 'SET_PROVIDED_ADDRESS'.";

        valueMap.put("Shipping options are not supported when `shipping.type` is specified or when 'application_context.shipping_preference' is set as 'NO_SHIPPING' or 'SET_PROVIDED_ADDRESS'.", ENUM_SHIPPING_OPTIONS_ARE_NOT_SUPPORTED_WHEN_SHIPPINGTYPE_IS_SPECIFIED_OR_WHEN_APPLICATION_CONTEXTSHIPPING_PREFERENCE_IS_SET_AS_NO_SHIPPING_OR_SET_PROVIDED_ADDRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingOptionNotSupportedDescriptionEnum constructFromString(String toConvert) throws IOException {
        ShippingOptionNotSupportedDescriptionEnum enumValue = fromString(toConvert);
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
    public static ShippingOptionNotSupportedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of ShippingOptionNotSupportedDescriptionEnum values to list of string values.
     * @param toConvert The list of ShippingOptionNotSupportedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingOptionNotSupportedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingOptionNotSupportedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 