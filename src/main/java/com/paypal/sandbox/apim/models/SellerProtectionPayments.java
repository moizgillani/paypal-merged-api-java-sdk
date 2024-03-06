/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SellerProtectionPayments type.
 */
public class SellerProtectionPayments {
    private SellerProtectionStatusEnum status;
    private List<DisputeCategoryEnum> disputeCategories;

    /**
     * Default constructor.
     */
    public SellerProtectionPayments() {
    }

    /**
     * Initialization constructor.
     * @param  status  SellerProtectionStatusEnum value for status.
     * @param  disputeCategories  List of DisputeCategoryEnum value for disputeCategories.
     */
    public SellerProtectionPayments(
            SellerProtectionStatusEnum status,
            List<DisputeCategoryEnum> disputeCategories) {
        this.status = status;
        this.disputeCategories = disputeCategories;
    }

    /**
     * Getter for Status.
     * Indicates whether the transaction is eligible for seller protection. For information, see
     * [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @return Returns the SellerProtectionStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerProtectionStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates whether the transaction is eligible for seller protection. For information, see
     * [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @param status Value for SellerProtectionStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(SellerProtectionStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for DisputeCategories.
     * An array of conditions that are covered for the transaction.
     * @return Returns the List of DisputeCategoryEnum
     */
    @JsonGetter("dispute_categories")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DisputeCategoryEnum> getDisputeCategories() {
        return disputeCategories;
    }

    /**
     * Setter for DisputeCategories.
     * An array of conditions that are covered for the transaction.
     * @param disputeCategories Value for List of DisputeCategoryEnum
     */
    @JsonSetter("dispute_categories")
    public void setDisputeCategories(List<DisputeCategoryEnum> disputeCategories) {
        this.disputeCategories = disputeCategories;
    }

    /**
     * Converts this SellerProtectionPayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SellerProtectionPayments [" + "status=" + status + ", disputeCategories="
                + disputeCategories + "]";
    }

    /**
     * Builds a new {@link SellerProtectionPayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SellerProtectionPayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .disputeCategories(getDisputeCategories());
        return builder;
    }

    /**
     * Class to build instances of {@link SellerProtectionPayments}.
     */
    public static class Builder {
        private SellerProtectionStatusEnum status;
        private List<DisputeCategoryEnum> disputeCategories;



        /**
         * Setter for status.
         * @param  status  SellerProtectionStatusEnum value for status.
         * @return Builder
         */
        public Builder status(SellerProtectionStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for disputeCategories.
         * @param  disputeCategories  List of DisputeCategoryEnum value for disputeCategories.
         * @return Builder
         */
        public Builder disputeCategories(List<DisputeCategoryEnum> disputeCategories) {
            this.disputeCategories = disputeCategories;
            return this;
        }

        /**
         * Builds a new {@link SellerProtectionPayments} object using the set fields.
         * @return {@link SellerProtectionPayments}
         */
        public SellerProtectionPayments build() {
            return new SellerProtectionPayments(status, disputeCategories);
        }
    }
}
