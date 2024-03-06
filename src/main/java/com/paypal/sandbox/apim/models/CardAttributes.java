/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CardAttributes type.
 */
public class CardAttributes {
    private PayPalSCustomerDataRecords customer;
    private BasicVaultInstructionParameters vault;

    /**
     * Default constructor.
     */
    public CardAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  PayPalSCustomerDataRecords value for customer.
     * @param  vault  BasicVaultInstructionParameters value for vault.
     */
    public CardAttributes(
            PayPalSCustomerDataRecords customer,
            BasicVaultInstructionParameters vault) {
        this.customer = customer;
        this.vault = vault;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the PayPalSCustomerDataRecords
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalSCustomerDataRecords getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for PayPalSCustomerDataRecords
     */
    @JsonSetter("customer")
    public void setCustomer(PayPalSCustomerDataRecords customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * Instruction to vault the card based on the specified strategy.
     * @return Returns the BasicVaultInstructionParameters
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicVaultInstructionParameters getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Instruction to vault the card based on the specified strategy.
     * @param vault Value for BasicVaultInstructionParameters
     */
    @JsonSetter("vault")
    public void setVault(BasicVaultInstructionParameters vault) {
        this.vault = vault;
    }

    /**
     * Converts this CardAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardAttributes [" + "customer=" + customer + ", vault=" + vault + "]";
    }

    /**
     * Builds a new {@link CardAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link CardAttributes}.
     */
    public static class Builder {
        private PayPalSCustomerDataRecords customer;
        private BasicVaultInstructionParameters vault;



        /**
         * Setter for customer.
         * @param  customer  PayPalSCustomerDataRecords value for customer.
         * @return Builder
         */
        public Builder customer(PayPalSCustomerDataRecords customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  BasicVaultInstructionParameters value for vault.
         * @return Builder
         */
        public Builder vault(BasicVaultInstructionParameters vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link CardAttributes} object using the set fields.
         * @return {@link CardAttributes}
         */
        public CardAttributes build() {
            return new CardAttributes(customer, vault);
        }
    }
}