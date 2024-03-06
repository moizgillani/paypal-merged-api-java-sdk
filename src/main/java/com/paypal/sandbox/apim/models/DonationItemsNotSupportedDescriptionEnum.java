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
 * DonationItemsNotSupportedDescriptionEnum to be used.
 */
public enum DonationItemsNotSupportedDescriptionEnum {
    ENUM_IF_PURCHASE_UNIT_HAS_DONATION_AS_THE_ITEMSCATEGORY_THEN_THE_ORDER_CAN_AT_MOST_HAVE_ONE_PURCHASE_UNIT_MULTIPLE_PURCHASE_UNITS_ARE_NOT_SUPPORTED_IF_EITHER_OF_THEM_HAVE_AT_LEAST_ONE_ITEMS_WITH_CATEGORY_AS_DONATION;


    private static TreeMap<String, DonationItemsNotSupportedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_IF_PURCHASE_UNIT_HAS_DONATION_AS_THE_ITEMSCATEGORY_THEN_THE_ORDER_CAN_AT_MOST_HAVE_ONE_PURCHASE_UNIT_MULTIPLE_PURCHASE_UNITS_ARE_NOT_SUPPORTED_IF_EITHER_OF_THEM_HAVE_AT_LEAST_ONE_ITEMS_WITH_CATEGORY_AS_DONATION.value = "If 'purchase_unit' has \"DONATION\" as the 'items.category' then the Order can at most have one purchase_unit. Multiple purchase_units are not supported if either of them have at least one items with category as \"DONATION\".";

        valueMap.put("If 'purchase_unit' has \"DONATION\" as the 'items.category' then the Order can at most have one purchase_unit. Multiple purchase_units are not supported if either of them have at least one items with category as \"DONATION\".", ENUM_IF_PURCHASE_UNIT_HAS_DONATION_AS_THE_ITEMSCATEGORY_THEN_THE_ORDER_CAN_AT_MOST_HAVE_ONE_PURCHASE_UNIT_MULTIPLE_PURCHASE_UNITS_ARE_NOT_SUPPORTED_IF_EITHER_OF_THEM_HAVE_AT_LEAST_ONE_ITEMS_WITH_CATEGORY_AS_DONATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DonationItemsNotSupportedDescriptionEnum constructFromString(String toConvert) throws IOException {
        DonationItemsNotSupportedDescriptionEnum enumValue = fromString(toConvert);
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
    public static DonationItemsNotSupportedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of DonationItemsNotSupportedDescriptionEnum values to list of string values.
     * @param toConvert The list of DonationItemsNotSupportedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DonationItemsNotSupportedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DonationItemsNotSupportedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 