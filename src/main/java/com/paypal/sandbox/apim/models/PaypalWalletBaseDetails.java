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
 * This is a model class for PaypalWalletBaseDetails type.
 */
public class PaypalWalletBaseDetails {
    private String description;
    private BillingAgreementPatternEnum usagePattern;
    private ShippingDetails shipping;
    private UsageTypeEnum usageType;
    private CustomerTypeEnum customerType;
    private Boolean permitMultiplePaymentTokens;

    /**
     * Default constructor.
     */
    public PaypalWalletBaseDetails() {
        customerType = CustomerTypeEnum.CONSUMER;
        permitMultiplePaymentTokens = false;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  usagePattern  BillingAgreementPatternEnum value for usagePattern.
     * @param  shipping  ShippingDetails value for shipping.
     * @param  usageType  UsageTypeEnum value for usageType.
     * @param  customerType  CustomerTypeEnum value for customerType.
     * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
     */
    public PaypalWalletBaseDetails(
            String description,
            BillingAgreementPatternEnum usagePattern,
            ShippingDetails shipping,
            UsageTypeEnum usageType,
            CustomerTypeEnum customerType,
            Boolean permitMultiplePaymentTokens) {
        this.description = description;
        this.usagePattern = usagePattern;
        this.shipping = shipping;
        this.usageType = usageType;
        this.customerType = customerType;
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Getter for Description.
     * The description displayed to PayPal consumer on the approval flow for PayPal, as well as on
     * the PayPal payment token management experience on PayPal.com.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description displayed to PayPal consumer on the approval flow for PayPal, as well as on
     * the PayPal payment token management experience on PayPal.com.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @return Returns the BillingAgreementPatternEnum
     */
    @JsonGetter("usage_pattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAgreementPatternEnum getUsagePattern() {
        return usagePattern;
    }

    /**
     * Setter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @param usagePattern Value for BillingAgreementPatternEnum
     */
    @JsonSetter("usage_pattern")
    public void setUsagePattern(BillingAgreementPatternEnum usagePattern) {
        this.usagePattern = usagePattern;
    }

    /**
     * Getter for Shipping.
     * The shipping address for the Payer.
     * @return Returns the ShippingDetails
     */
    @JsonGetter("shipping")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingDetails getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * The shipping address for the Payer.
     * @param shipping Value for ShippingDetails
     */
    @JsonSetter("shipping")
    public void setShipping(ShippingDetails shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for UsageType.
     * The usage type associated with the PayPal payment token.
     * @return Returns the UsageTypeEnum
     */
    @JsonGetter("usage_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UsageTypeEnum getUsageType() {
        return usageType;
    }

    /**
     * Setter for UsageType.
     * The usage type associated with the PayPal payment token.
     * @param usageType Value for UsageTypeEnum
     */
    @JsonSetter("usage_type")
    public void setUsageType(UsageTypeEnum usageType) {
        this.usageType = usageType;
    }

    /**
     * Getter for CustomerType.
     * The customer type associated with the PayPal payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @return Returns the CustomerTypeEnum
     */
    @JsonGetter("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * Setter for CustomerType.
     * The customer type associated with the PayPal payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @param customerType Value for CustomerTypeEnum
     */
    @JsonSetter("customer_type")
    public void setCustomerType(CustomerTypeEnum customerType) {
        this.customerType = customerType;
    }

    /**
     * Getter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @return Returns the Boolean
     */
    @JsonGetter("permit_multiple_payment_tokens")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPermitMultiplePaymentTokens() {
        return permitMultiplePaymentTokens;
    }

    /**
     * Setter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @param permitMultiplePaymentTokens Value for Boolean
     */
    @JsonSetter("permit_multiple_payment_tokens")
    public void setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Converts this PaypalWalletBaseDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWalletBaseDetails [" + "description=" + description + ", usagePattern="
                + usagePattern + ", shipping=" + shipping + ", usageType=" + usageType
                + ", customerType=" + customerType + ", permitMultiplePaymentTokens="
                + permitMultiplePaymentTokens + "]";
    }

    /**
     * Builds a new {@link PaypalWalletBaseDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWalletBaseDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .usagePattern(getUsagePattern())
                .shipping(getShipping())
                .usageType(getUsageType())
                .customerType(getCustomerType())
                .permitMultiplePaymentTokens(getPermitMultiplePaymentTokens());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWalletBaseDetails}.
     */
    public static class Builder {
        private String description;
        private BillingAgreementPatternEnum usagePattern;
        private ShippingDetails shipping;
        private UsageTypeEnum usageType;
        private CustomerTypeEnum customerType = CustomerTypeEnum.CONSUMER;
        private Boolean permitMultiplePaymentTokens = false;



        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for usagePattern.
         * @param  usagePattern  BillingAgreementPatternEnum value for usagePattern.
         * @return Builder
         */
        public Builder usagePattern(BillingAgreementPatternEnum usagePattern) {
            this.usagePattern = usagePattern;
            return this;
        }

        /**
         * Setter for shipping.
         * @param  shipping  ShippingDetails value for shipping.
         * @return Builder
         */
        public Builder shipping(ShippingDetails shipping) {
            this.shipping = shipping;
            return this;
        }

        /**
         * Setter for usageType.
         * @param  usageType  UsageTypeEnum value for usageType.
         * @return Builder
         */
        public Builder usageType(UsageTypeEnum usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * Setter for customerType.
         * @param  customerType  CustomerTypeEnum value for customerType.
         * @return Builder
         */
        public Builder customerType(CustomerTypeEnum customerType) {
            this.customerType = customerType;
            return this;
        }

        /**
         * Setter for permitMultiplePaymentTokens.
         * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
         * @return Builder
         */
        public Builder permitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
            this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
            return this;
        }

        /**
         * Builds a new {@link PaypalWalletBaseDetails} object using the set fields.
         * @return {@link PaypalWalletBaseDetails}
         */
        public PaypalWalletBaseDetails build() {
            return new PaypalWalletBaseDetails(description, usagePattern, shipping, usageType,
                    customerType, permitMultiplePaymentTokens);
        }
    }
}
