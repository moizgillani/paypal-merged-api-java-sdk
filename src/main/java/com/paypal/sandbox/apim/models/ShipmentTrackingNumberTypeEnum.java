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
 * ShipmentTrackingNumberTypeEnum to be used.
 */
public enum ShipmentTrackingNumberTypeEnum {
    CARRIER_PROVIDED,

    E2E_PARTNER_PROVIDED;


    private static TreeMap<String, ShipmentTrackingNumberTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CARRIER_PROVIDED.value = "CARRIER_PROVIDED";
        E2E_PARTNER_PROVIDED.value = "E2E_PARTNER_PROVIDED";

        valueMap.put("CARRIER_PROVIDED", CARRIER_PROVIDED);
        valueMap.put("E2E_PARTNER_PROVIDED", E2E_PARTNER_PROVIDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShipmentTrackingNumberTypeEnum constructFromString(String toConvert) throws IOException {
        ShipmentTrackingNumberTypeEnum enumValue = fromString(toConvert);
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
    public static ShipmentTrackingNumberTypeEnum fromString(String toConvert) {
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
     * Convert list of ShipmentTrackingNumberTypeEnum values to list of string values.
     * @param toConvert The list of ShipmentTrackingNumberTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShipmentTrackingNumberTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShipmentTrackingNumberTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 