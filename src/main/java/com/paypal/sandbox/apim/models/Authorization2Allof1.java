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
 * This is a model class for Authorization2Allof1 type.
 */
public class Authorization2Allof1 {
    private SupplementaryDataPayments supplementaryData;
    private MerchantBase payee;

    /**
     * Default constructor.
     */
    public Authorization2Allof1() {
    }

    /**
     * Initialization constructor.
     * @param  supplementaryData  SupplementaryDataPayments value for supplementaryData.
     * @param  payee  MerchantBase value for payee.
     */
    public Authorization2Allof1(
            SupplementaryDataPayments supplementaryData,
            MerchantBase payee) {
        this.supplementaryData = supplementaryData;
        this.payee = payee;
    }

    /**
     * Getter for SupplementaryData.
     * An object that provides supplementary/additional data related to a payment transaction.
     * @return Returns the SupplementaryDataPayments
     */
    @JsonGetter("supplementary_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplementaryDataPayments getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * Setter for SupplementaryData.
     * An object that provides supplementary/additional data related to a payment transaction.
     * @param supplementaryData Value for SupplementaryDataPayments
     */
    @JsonSetter("supplementary_data")
    public void setSupplementaryData(SupplementaryDataPayments supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    /**
     * Getter for Payee.
     * The details associated with the merchant for this transaction.
     * @return Returns the MerchantBase
     */
    @JsonGetter("payee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantBase getPayee() {
        return payee;
    }

    /**
     * Setter for Payee.
     * The details associated with the merchant for this transaction.
     * @param payee Value for MerchantBase
     */
    @JsonSetter("payee")
    public void setPayee(MerchantBase payee) {
        this.payee = payee;
    }

    /**
     * Converts this Authorization2Allof1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Authorization2Allof1 [" + "supplementaryData=" + supplementaryData + ", payee="
                + payee + "]";
    }

    /**
     * Builds a new {@link Authorization2Allof1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Authorization2Allof1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .supplementaryData(getSupplementaryData())
                .payee(getPayee());
        return builder;
    }

    /**
     * Class to build instances of {@link Authorization2Allof1}.
     */
    public static class Builder {
        private SupplementaryDataPayments supplementaryData;
        private MerchantBase payee;



        /**
         * Setter for supplementaryData.
         * @param  supplementaryData  SupplementaryDataPayments value for supplementaryData.
         * @return Builder
         */
        public Builder supplementaryData(SupplementaryDataPayments supplementaryData) {
            this.supplementaryData = supplementaryData;
            return this;
        }

        /**
         * Setter for payee.
         * @param  payee  MerchantBase value for payee.
         * @return Builder
         */
        public Builder payee(MerchantBase payee) {
            this.payee = payee;
            return this;
        }

        /**
         * Builds a new {@link Authorization2Allof1} object using the set fields.
         * @return {@link Authorization2Allof1}
         */
        public Authorization2Allof1 build() {
            return new Authorization2Allof1(supplementaryData, payee);
        }
    }
}
