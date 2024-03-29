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
 * This is a model class for PaymentTokenResponsePaymentSource type.
 */
public class PaymentTokenResponsePaymentSource {
    private CardResponsePaymentMethodTokens card;
    private PayPalWalletResponsePaymentMethodTokens paypal;
    private VenmoResponse venmo;
    private ApplePayResponse applePay;
    private BankResponse bank;

    /**
     * Default constructor.
     */
    public PaymentTokenResponsePaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardResponsePaymentMethodTokens value for card.
     * @param  paypal  PayPalWalletResponsePaymentMethodTokens value for paypal.
     * @param  venmo  VenmoResponse value for venmo.
     * @param  applePay  ApplePayResponse value for applePay.
     * @param  bank  BankResponse value for bank.
     */
    public PaymentTokenResponsePaymentSource(
            CardResponsePaymentMethodTokens card,
            PayPalWalletResponsePaymentMethodTokens paypal,
            VenmoResponse venmo,
            ApplePayResponse applePay,
            BankResponse bank) {
        this.card = card;
        this.paypal = paypal;
        this.venmo = venmo;
        this.applePay = applePay;
        this.bank = bank;
    }

    /**
     * Getter for Card.
     * Full representation of a Card Payment Token.
     * @return Returns the CardResponsePaymentMethodTokens
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardResponsePaymentMethodTokens getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Full representation of a Card Payment Token.
     * @param card Value for CardResponsePaymentMethodTokens
     */
    @JsonSetter("card")
    public void setCard(CardResponsePaymentMethodTokens card) {
        this.card = card;
    }

    /**
     * Getter for Paypal.
     * Full representation of a PayPal Payment Token.
     * @return Returns the PayPalWalletResponsePaymentMethodTokens
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletResponsePaymentMethodTokens getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * Full representation of a PayPal Payment Token.
     * @param paypal Value for PayPalWalletResponsePaymentMethodTokens
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWalletResponsePaymentMethodTokens paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for Venmo.
     * Full representation of a Venmo Payment Token.
     * @return Returns the VenmoResponse
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoResponse getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * Full representation of a Venmo Payment Token.
     * @param venmo Value for VenmoResponse
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoResponse venmo) {
        this.venmo = venmo;
    }

    /**
     * Getter for ApplePay.
     * A resource representing a response for Apple Pay.
     * @return Returns the ApplePayResponse
     */
    @JsonGetter("apple_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayResponse getApplePay() {
        return applePay;
    }

    /**
     * Setter for ApplePay.
     * A resource representing a response for Apple Pay.
     * @param applePay Value for ApplePayResponse
     */
    @JsonSetter("apple_pay")
    public void setApplePay(ApplePayResponse applePay) {
        this.applePay = applePay;
    }

    /**
     * Getter for Bank.
     * Full representation of a Bank Payment Token.
     * @return Returns the BankResponse
     */
    @JsonGetter("bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankResponse getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Full representation of a Bank Payment Token.
     * @param bank Value for BankResponse
     */
    @JsonSetter("bank")
    public void setBank(BankResponse bank) {
        this.bank = bank;
    }

    /**
     * Converts this PaymentTokenResponsePaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokenResponsePaymentSource [" + "card=" + card + ", paypal=" + paypal
                + ", venmo=" + venmo + ", applePay=" + applePay + ", bank=" + bank + "]";
    }

    /**
     * Builds a new {@link PaymentTokenResponsePaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokenResponsePaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .venmo(getVenmo())
                .applePay(getApplePay())
                .bank(getBank());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokenResponsePaymentSource}.
     */
    public static class Builder {
        private CardResponsePaymentMethodTokens card;
        private PayPalWalletResponsePaymentMethodTokens paypal;
        private VenmoResponse venmo;
        private ApplePayResponse applePay;
        private BankResponse bank;



        /**
         * Setter for card.
         * @param  card  CardResponsePaymentMethodTokens value for card.
         * @return Builder
         */
        public Builder card(CardResponsePaymentMethodTokens card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWalletResponsePaymentMethodTokens value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWalletResponsePaymentMethodTokens paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoResponse value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoResponse venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Setter for applePay.
         * @param  applePay  ApplePayResponse value for applePay.
         * @return Builder
         */
        public Builder applePay(ApplePayResponse applePay) {
            this.applePay = applePay;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  BankResponse value for bank.
         * @return Builder
         */
        public Builder bank(BankResponse bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokenResponsePaymentSource} object using the set fields.
         * @return {@link PaymentTokenResponsePaymentSource}
         */
        public PaymentTokenResponsePaymentSource build() {
            return new PaymentTokenResponsePaymentSource(card, paypal, venmo, applePay, bank);
        }
    }
}
