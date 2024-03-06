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
 * This is a model class for ExperienceContextPaymentMethodTokens type.
 */
public class ExperienceContextPaymentMethodTokens {
    private String brandName;
    private String locale;
    private String returnUrl;
    private String cancelUrl;
    private String shippingPreference;
    private String vaultInstruction;

    /**
     * Default constructor.
     */
    public ExperienceContextPaymentMethodTokens() {
        shippingPreference = "GET_FROM_FILE";
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     * @param  shippingPreference  String value for shippingPreference.
     * @param  vaultInstruction  String value for vaultInstruction.
     */
    public ExperienceContextPaymentMethodTokens(
            String brandName,
            String locale,
            String returnUrl,
            String cancelUrl,
            String shippingPreference,
            String vaultInstruction) {
        this.brandName = brandName;
        this.locale = locale;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.shippingPreference = shippingPreference;
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Getter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for Locale.
     * The BCP 47-formatted locale of pages that the PayPal vaulting experience shows. PayPal
     * supports a five-character code. For example, `DA-DK`, `HE-IL`, `ID-ID`, `JA-JP`, `NO-NO`,
     * `PT-BR`, `RU-RU`, `SV-SE`, `TH-TH`, `ZH-CN`, `ZH-HK`, or `ZH-TW`.
     * @return Returns the String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * The BCP 47-formatted locale of pages that the PayPal vaulting experience shows. PayPal
     * supports a five-character code. For example, `DA-DK`, `HE-IL`, `ID-ID`, `JA-JP`, `NO-NO`,
     * `PT-BR`, `RU-RU`, `SV-SE`, `TH-TH`, `ZH-CN`, `ZH-HK`, or `ZH-TW`.
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for ReturnUrl.
     * The URL where the customer is redirected after customer approves leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * The URL where the customer is redirected after customer approves leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * The URL where the customer is redirected after customer cancels or leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * The URL where the customer is redirected after customer cancels or leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @return Returns the String
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @param shippingPreference Value for String
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(String shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @return Returns the String
     */
    @JsonGetter("vault_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultInstruction() {
        return vaultInstruction;
    }

    /**
     * Setter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @param vaultInstruction Value for String
     */
    @JsonSetter("vault_instruction")
    public void setVaultInstruction(String vaultInstruction) {
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Converts this ExperienceContextPaymentMethodTokens into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExperienceContextPaymentMethodTokens [" + "brandName=" + brandName + ", locale="
                + locale + ", returnUrl=" + returnUrl + ", cancelUrl=" + cancelUrl
                + ", shippingPreference=" + shippingPreference + ", vaultInstruction="
                + vaultInstruction + "]";
    }

    /**
     * Builds a new {@link ExperienceContextPaymentMethodTokens.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExperienceContextPaymentMethodTokens.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl())
                .shippingPreference(getShippingPreference())
                .vaultInstruction(getVaultInstruction());
        return builder;
    }

    /**
     * Class to build instances of {@link ExperienceContextPaymentMethodTokens}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private String returnUrl;
        private String cancelUrl;
        private String shippingPreference = "GET_FROM_FILE";
        private String vaultInstruction;



        /**
         * Setter for brandName.
         * @param  brandName  String value for brandName.
         * @return Builder
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Setter for cancelUrl.
         * @param  cancelUrl  String value for cancelUrl.
         * @return Builder
         */
        public Builder cancelUrl(String cancelUrl) {
            this.cancelUrl = cancelUrl;
            return this;
        }

        /**
         * Setter for shippingPreference.
         * @param  shippingPreference  String value for shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(String shippingPreference) {
            this.shippingPreference = shippingPreference;
            return this;
        }

        /**
         * Setter for vaultInstruction.
         * @param  vaultInstruction  String value for vaultInstruction.
         * @return Builder
         */
        public Builder vaultInstruction(String vaultInstruction) {
            this.vaultInstruction = vaultInstruction;
            return this;
        }

        /**
         * Builds a new {@link ExperienceContextPaymentMethodTokens} object using the set fields.
         * @return {@link ExperienceContextPaymentMethodTokens}
         */
        public ExperienceContextPaymentMethodTokens build() {
            return new ExperienceContextPaymentMethodTokens(brandName, locale, returnUrl, cancelUrl,
                    shippingPreference, vaultInstruction);
        }
    }
}
