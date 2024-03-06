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
 * This is a model class for NetworkToken type.
 */
public class NetworkToken {
    private String number;
    private String expiry;
    private String cryptogram;
    private ECIFlagEnum eciFlag;
    private String tokenRequestorId;

    /**
     * Default constructor.
     */
    public NetworkToken() {
    }

    /**
     * Initialization constructor.
     * @param  number  String value for number.
     * @param  expiry  String value for expiry.
     * @param  cryptogram  String value for cryptogram.
     * @param  eciFlag  ECIFlagEnum value for eciFlag.
     * @param  tokenRequestorId  String value for tokenRequestorId.
     */
    public NetworkToken(
            String number,
            String expiry,
            String cryptogram,
            ECIFlagEnum eciFlag,
            String tokenRequestorId) {
        this.number = number;
        this.expiry = expiry;
        this.cryptogram = cryptogram;
        this.eciFlag = eciFlag;
        this.tokenRequestorId = tokenRequestorId;
    }

    /**
     * Getter for Number.
     * Third party network token number.
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * Third party network token number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for Expiry.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("expiry")
    public String getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param expiry Value for String
     */
    @JsonSetter("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * Getter for Cryptogram.
     * An Encrypted one-time use value that's sent along with Network Token. This field is not
     * required to be present for recurring transactions.
     * @return Returns the String
     */
    @JsonGetter("cryptogram")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCryptogram() {
        return cryptogram;
    }

    /**
     * Setter for Cryptogram.
     * An Encrypted one-time use value that's sent along with Network Token. This field is not
     * required to be present for recurring transactions.
     * @param cryptogram Value for String
     */
    @JsonSetter("cryptogram")
    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    /**
     * Getter for EciFlag.
     * Electronic Commerce Indicator (ECI). The ECI value is part of the 2 data elements that
     * indicate the transaction was processed electronically. This should be passed on the
     * authorization transaction to the Gateway/Processor.
     * @return Returns the ECIFlagEnum
     */
    @JsonGetter("eci_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ECIFlagEnum getEciFlag() {
        return eciFlag;
    }

    /**
     * Setter for EciFlag.
     * Electronic Commerce Indicator (ECI). The ECI value is part of the 2 data elements that
     * indicate the transaction was processed electronically. This should be passed on the
     * authorization transaction to the Gateway/Processor.
     * @param eciFlag Value for ECIFlagEnum
     */
    @JsonSetter("eci_flag")
    public void setEciFlag(ECIFlagEnum eciFlag) {
        this.eciFlag = eciFlag;
    }

    /**
     * Getter for TokenRequestorId.
     * A TRID, or a Token Requestor ID, is an identifier used by merchants to request network tokens
     * from card networks. A TRID is a precursor to obtaining a network token for a credit card
     * primary account number (PAN), and will aid in enabling secure card on file (COF) payments and
     * reducing fraud.
     * @return Returns the String
     */
    @JsonGetter("token_requestor_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTokenRequestorId() {
        return tokenRequestorId;
    }

    /**
     * Setter for TokenRequestorId.
     * A TRID, or a Token Requestor ID, is an identifier used by merchants to request network tokens
     * from card networks. A TRID is a precursor to obtaining a network token for a credit card
     * primary account number (PAN), and will aid in enabling secure card on file (COF) payments and
     * reducing fraud.
     * @param tokenRequestorId Value for String
     */
    @JsonSetter("token_requestor_id")
    public void setTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId;
    }

    /**
     * Converts this NetworkToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetworkToken [" + "number=" + number + ", expiry=" + expiry + ", cryptogram="
                + cryptogram + ", eciFlag=" + eciFlag + ", tokenRequestorId=" + tokenRequestorId
                + "]";
    }

    /**
     * Builds a new {@link NetworkToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetworkToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(number, expiry)
                .cryptogram(getCryptogram())
                .eciFlag(getEciFlag())
                .tokenRequestorId(getTokenRequestorId());
        return builder;
    }

    /**
     * Class to build instances of {@link NetworkToken}.
     */
    public static class Builder {
        private String number;
        private String expiry;
        private String cryptogram;
        private ECIFlagEnum eciFlag;
        private String tokenRequestorId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  number  String value for number.
         * @param  expiry  String value for expiry.
         */
        public Builder(String number, String expiry) {
            this.number = number;
            this.expiry = expiry;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for expiry.
         * @param  expiry  String value for expiry.
         * @return Builder
         */
        public Builder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for cryptogram.
         * @param  cryptogram  String value for cryptogram.
         * @return Builder
         */
        public Builder cryptogram(String cryptogram) {
            this.cryptogram = cryptogram;
            return this;
        }

        /**
         * Setter for eciFlag.
         * @param  eciFlag  ECIFlagEnum value for eciFlag.
         * @return Builder
         */
        public Builder eciFlag(ECIFlagEnum eciFlag) {
            this.eciFlag = eciFlag;
            return this;
        }

        /**
         * Setter for tokenRequestorId.
         * @param  tokenRequestorId  String value for tokenRequestorId.
         * @return Builder
         */
        public Builder tokenRequestorId(String tokenRequestorId) {
            this.tokenRequestorId = tokenRequestorId;
            return this;
        }

        /**
         * Builds a new {@link NetworkToken} object using the set fields.
         * @return {@link NetworkToken}
         */
        public NetworkToken build() {
            return new NetworkToken(number, expiry, cryptogram, eciFlag, tokenRequestorId);
        }
    }
}