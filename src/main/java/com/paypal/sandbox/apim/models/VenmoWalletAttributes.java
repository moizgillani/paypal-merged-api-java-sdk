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
 * This is a model class for VenmoWalletAttributes type.
 */
public class VenmoWalletAttributes {
    private PayPalSCustomerDataRecords customer;
    private VaultedVenmoWalletCommonAttributes vault;

    /**
     * Default constructor.
     */
    public VenmoWalletAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  PayPalSCustomerDataRecords value for customer.
     * @param  vault  VaultedVenmoWalletCommonAttributes value for vault.
     */
    public VenmoWalletAttributes(
            PayPalSCustomerDataRecords customer,
            VaultedVenmoWalletCommonAttributes vault) {
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
     * Attributes used to provide the instructions during vaulting of the Venmo Wallet.
     * @return Returns the VaultedVenmoWalletCommonAttributes
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultedVenmoWalletCommonAttributes getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Attributes used to provide the instructions during vaulting of the Venmo Wallet.
     * @param vault Value for VaultedVenmoWalletCommonAttributes
     */
    @JsonSetter("vault")
    public void setVault(VaultedVenmoWalletCommonAttributes vault) {
        this.vault = vault;
    }

    /**
     * Converts this VenmoWalletAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VenmoWalletAttributes [" + "customer=" + customer + ", vault=" + vault + "]";
    }

    /**
     * Builds a new {@link VenmoWalletAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VenmoWalletAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link VenmoWalletAttributes}.
     */
    public static class Builder {
        private PayPalSCustomerDataRecords customer;
        private VaultedVenmoWalletCommonAttributes vault;



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
         * @param  vault  VaultedVenmoWalletCommonAttributes value for vault.
         * @return Builder
         */
        public Builder vault(VaultedVenmoWalletCommonAttributes vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link VenmoWalletAttributes} object using the set fields.
         * @return {@link VenmoWalletAttributes}
         */
        public VenmoWalletAttributes build() {
            return new VenmoWalletAttributes(customer, vault);
        }
    }
}
