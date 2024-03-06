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
 * VaultInstructionDuplicatedIssueEnum to be used.
 */
public enum VaultInstructionDuplicatedIssueEnum {
    VAULT_INSTRUCTION_DUPLICATED;


    private static TreeMap<String, VaultInstructionDuplicatedIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        VAULT_INSTRUCTION_DUPLICATED.value = "VAULT_INSTRUCTION_DUPLICATED";

        valueMap.put("VAULT_INSTRUCTION_DUPLICATED", VAULT_INSTRUCTION_DUPLICATED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static VaultInstructionDuplicatedIssueEnum constructFromString(String toConvert) throws IOException {
        VaultInstructionDuplicatedIssueEnum enumValue = fromString(toConvert);
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
    public static VaultInstructionDuplicatedIssueEnum fromString(String toConvert) {
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
     * Convert list of VaultInstructionDuplicatedIssueEnum values to list of string values.
     * @param toConvert The list of VaultInstructionDuplicatedIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<VaultInstructionDuplicatedIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (VaultInstructionDuplicatedIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 