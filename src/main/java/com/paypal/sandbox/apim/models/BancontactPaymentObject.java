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
 * This is a model class for BancontactPaymentObject type.
 */
public class BancontactPaymentObject {
    private String name;
    private String countryCode;
    private String bic;
    private String ibanLastChars;
    private String cardLastDigits;
    private Object attributes;

    /**
     * Default constructor.
     */
    public BancontactPaymentObject() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  bic  String value for bic.
     * @param  ibanLastChars  String value for ibanLastChars.
     * @param  cardLastDigits  String value for cardLastDigits.
     * @param  attributes  Object value for attributes.
     */
    public BancontactPaymentObject(
            String name,
            String countryCode,
            String bic,
            String ibanLastChars,
            String cardLastDigits,
            Object attributes) {
        this.name = name;
        this.countryCode = countryCode;
        this.bic = bic;
        this.ibanLastChars = ibanLastChars;
        this.cardLastDigits = cardLastDigits;
        this.attributes = attributes;
    }

    /**
     * Getter for Name.
     * The name of the account holder associated with this payment method.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @return Returns the String
     */
    @JsonGetter("iban_last_chars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIbanLastChars() {
        return ibanLastChars;
    }

    /**
     * Setter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @param ibanLastChars Value for String
     */
    @JsonSetter("iban_last_chars")
    public void setIbanLastChars(String ibanLastChars) {
        this.ibanLastChars = ibanLastChars;
    }

    /**
     * Getter for CardLastDigits.
     * The last digits of the card used to fund the Bancontact payment.
     * @return Returns the String
     */
    @JsonGetter("card_last_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardLastDigits() {
        return cardLastDigits;
    }

    /**
     * Setter for CardLastDigits.
     * The last digits of the card used to fund the Bancontact payment.
     * @param cardLastDigits Value for String
     */
    @JsonSetter("card_last_digits")
    public void setCardLastDigits(String cardLastDigits) {
        this.cardLastDigits = cardLastDigits;
    }

    /**
     * Getter for Attributes.
     * Attributes for SEPA direct debit object.
     * @return Returns the Object
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Attributes for SEPA direct debit object.
     * @param attributes Value for Object
     */
    @JsonSetter("attributes")
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * Converts this BancontactPaymentObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BancontactPaymentObject [" + "name=" + name + ", countryCode=" + countryCode
                + ", bic=" + bic + ", ibanLastChars=" + ibanLastChars + ", cardLastDigits="
                + cardLastDigits + ", attributes=" + attributes + "]";
    }

    /**
     * Builds a new {@link BancontactPaymentObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BancontactPaymentObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .countryCode(getCountryCode())
                .bic(getBic())
                .ibanLastChars(getIbanLastChars())
                .cardLastDigits(getCardLastDigits())
                .attributes(getAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link BancontactPaymentObject}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String bic;
        private String ibanLastChars;
        private String cardLastDigits;
        private Object attributes;



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
         * Setter for ibanLastChars.
         * @param  ibanLastChars  String value for ibanLastChars.
         * @return Builder
         */
        public Builder ibanLastChars(String ibanLastChars) {
            this.ibanLastChars = ibanLastChars;
            return this;
        }

        /**
         * Setter for cardLastDigits.
         * @param  cardLastDigits  String value for cardLastDigits.
         * @return Builder
         */
        public Builder cardLastDigits(String cardLastDigits) {
            this.cardLastDigits = cardLastDigits;
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
         * Builds a new {@link BancontactPaymentObject} object using the set fields.
         * @return {@link BancontactPaymentObject}
         */
        public BancontactPaymentObject build() {
            return new BancontactPaymentObject(name, countryCode, bic, ibanLastChars,
                    cardLastDigits, attributes);
        }
    }
}
