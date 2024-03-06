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
 * This is a model class for TheIDEALPaymentInformation type.
 */
public class TheIDEALPaymentInformation {
    private String name;
    private String countryCode;
    private String bic;
    private ExperienceContext experienceContext;
    private Object attributes;

    /**
     * Default constructor.
     */
    public TheIDEALPaymentInformation() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  bic  String value for bic.
     * @param  experienceContext  ExperienceContext value for experienceContext.
     * @param  attributes  Object value for attributes.
     */
    public TheIDEALPaymentInformation(
            String name,
            String countryCode,
            String bic,
            ExperienceContext experienceContext,
            Object attributes) {
        this.name = name;
        this.countryCode = countryCode;
        this.bic = bic;
        this.experienceContext = experienceContext;
        this.attributes = attributes;
    }

    /**
     * Getter for Name.
     * The name of the account holder associated with this payment method.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the account holder associated with this payment method.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CountryCode.
     * The [two-character ISO-3166-1 country code](/docs/integration/direct/rest/country-codes/) of
     * the bank.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO-3166-1 country code](/docs/integration/direct/rest/country-codes/) of
     * the bank.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Bic.
     * The bank identification code (BIC).
     * @return Returns the String
     */
    @JsonGetter("bic")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBic() {
        return bic;
    }

    /**
     * Setter for Bic.
     * The bank identification code (BIC).
     * @param bic Value for String
     */
    @JsonSetter("bic")
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @return Returns the ExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @param experienceContext Value for ExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Attributes.
     * Attributes for altpay recurring.
     * @return Returns the Object
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Attributes for altpay recurring.
     * @param attributes Value for Object
     */
    @JsonSetter("attributes")
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * Converts this TheIDEALPaymentInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TheIDEALPaymentInformation [" + "name=" + name + ", countryCode=" + countryCode
                + ", bic=" + bic + ", experienceContext=" + experienceContext + ", attributes="
                + attributes + "]";
    }

    /**
     * Builds a new {@link TheIDEALPaymentInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TheIDEALPaymentInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, countryCode)
                .bic(getBic())
                .experienceContext(getExperienceContext())
                .attributes(getAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link TheIDEALPaymentInformation}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String bic;
        private ExperienceContext experienceContext;
        private Object attributes;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for bic.
         * @param  bic  String value for bic.
         * @return Builder
         */
        public Builder bic(String bic) {
            this.bic = bic;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  ExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(ExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  Object value for attributes.
         * @return Builder
         */
        public Builder attributes(Object attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Builds a new {@link TheIDEALPaymentInformation} object using the set fields.
         * @return {@link TheIDEALPaymentInformation}
         */
        public TheIDEALPaymentInformation build() {
            return new TheIDEALPaymentInformation(name, countryCode, bic, experienceContext,
                    attributes);
        }
    }
}
