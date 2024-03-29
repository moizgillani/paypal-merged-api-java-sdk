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
 * This is a model class for PaymentSourceDetails type.
 */
public class PaymentSourceDetails {
    private CardResponse card;
    private PayPalWalletResponse paypal;
    private BancontactPaymentObject bancontact;
    private BLIKPaymentObject blik;
    private AnEpsPaymentObject eps;
    private AGiropayPaymentObject giropay;
    private TheIDEALPaymentObject ideal;
    private MyBankPaymentObject mybank;
    private P24PaymentObject p24;
    private SofortPaymentObject sofort;
    private TrustlyPaymentObject trustly;
    private VenmoWalletResponseObject venmo;

    /**
     * Default constructor.
     */
    public PaymentSourceDetails() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardResponse value for card.
     * @param  paypal  PayPalWalletResponse value for paypal.
     * @param  bancontact  BancontactPaymentObject value for bancontact.
     * @param  blik  BLIKPaymentObject value for blik.
     * @param  eps  AnEpsPaymentObject value for eps.
     * @param  giropay  AGiropayPaymentObject value for giropay.
     * @param  ideal  TheIDEALPaymentObject value for ideal.
     * @param  mybank  MyBankPaymentObject value for mybank.
     * @param  p24  P24PaymentObject value for p24.
     * @param  sofort  SofortPaymentObject value for sofort.
     * @param  trustly  TrustlyPaymentObject value for trustly.
     * @param  venmo  VenmoWalletResponseObject value for venmo.
     */
    public PaymentSourceDetails(
            CardResponse card,
            PayPalWalletResponse paypal,
            BancontactPaymentObject bancontact,
            BLIKPaymentObject blik,
            AnEpsPaymentObject eps,
            AGiropayPaymentObject giropay,
            TheIDEALPaymentObject ideal,
            MyBankPaymentObject mybank,
            P24PaymentObject p24,
            SofortPaymentObject sofort,
            TrustlyPaymentObject trustly,
            VenmoWalletResponseObject venmo) {
        this.card = card;
        this.paypal = paypal;
        this.bancontact = bancontact;
        this.blik = blik;
        this.eps = eps;
        this.giropay = giropay;
        this.ideal = ideal;
        this.mybank = mybank;
        this.p24 = p24;
        this.sofort = sofort;
        this.trustly = trustly;
        this.venmo = venmo;
    }

    /**
     * Getter for Card.
     * The payment card to use to fund a payment. Card can be a credit or debit card.
     * @return Returns the CardResponse
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The payment card to use to fund a payment. Card can be a credit or debit card.
     * @param card Value for CardResponse
     */
    @JsonSetter("card")
    public void setCard(CardResponse card) {
        this.card = card;
    }

    /**
     * Getter for Paypal.
     * The PayPal Wallet response.
     * @return Returns the PayPalWalletResponse
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletResponse getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * The PayPal Wallet response.
     * @param paypal Value for PayPalWalletResponse
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWalletResponse paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for Bancontact.
     * Information used to pay Bancontact.
     * @return Returns the BancontactPaymentObject
     */
    @JsonGetter("bancontact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BancontactPaymentObject getBancontact() {
        return bancontact;
    }

    /**
     * Setter for Bancontact.
     * Information used to pay Bancontact.
     * @param bancontact Value for BancontactPaymentObject
     */
    @JsonSetter("bancontact")
    public void setBancontact(BancontactPaymentObject bancontact) {
        this.bancontact = bancontact;
    }

    /**
     * Getter for Blik.
     * Information used to pay using BLIK.
     * @return Returns the BLIKPaymentObject
     */
    @JsonGetter("blik")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BLIKPaymentObject getBlik() {
        return blik;
    }

    /**
     * Setter for Blik.
     * Information used to pay using BLIK.
     * @param blik Value for BLIKPaymentObject
     */
    @JsonSetter("blik")
    public void setBlik(BLIKPaymentObject blik) {
        this.blik = blik;
    }

    /**
     * Getter for Eps.
     * Information used to pay using eps.
     * @return Returns the AnEpsPaymentObject
     */
    @JsonGetter("eps")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AnEpsPaymentObject getEps() {
        return eps;
    }

    /**
     * Setter for Eps.
     * Information used to pay using eps.
     * @param eps Value for AnEpsPaymentObject
     */
    @JsonSetter("eps")
    public void setEps(AnEpsPaymentObject eps) {
        this.eps = eps;
    }

    /**
     * Getter for Giropay.
     * Information needed to pay using giropay.
     * @return Returns the AGiropayPaymentObject
     */
    @JsonGetter("giropay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AGiropayPaymentObject getGiropay() {
        return giropay;
    }

    /**
     * Setter for Giropay.
     * Information needed to pay using giropay.
     * @param giropay Value for AGiropayPaymentObject
     */
    @JsonSetter("giropay")
    public void setGiropay(AGiropayPaymentObject giropay) {
        this.giropay = giropay;
    }

    /**
     * Getter for Ideal.
     * Information used to pay using iDEAL.
     * @return Returns the TheIDEALPaymentObject
     */
    @JsonGetter("ideal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TheIDEALPaymentObject getIdeal() {
        return ideal;
    }

    /**
     * Setter for Ideal.
     * Information used to pay using iDEAL.
     * @param ideal Value for TheIDEALPaymentObject
     */
    @JsonSetter("ideal")
    public void setIdeal(TheIDEALPaymentObject ideal) {
        this.ideal = ideal;
    }

    /**
     * Getter for Mybank.
     * Information used to pay using MyBank.
     * @return Returns the MyBankPaymentObject
     */
    @JsonGetter("mybank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MyBankPaymentObject getMybank() {
        return mybank;
    }

    /**
     * Setter for Mybank.
     * Information used to pay using MyBank.
     * @param mybank Value for MyBankPaymentObject
     */
    @JsonSetter("mybank")
    public void setMybank(MyBankPaymentObject mybank) {
        this.mybank = mybank;
    }

    /**
     * Getter for P24.
     * Information used to pay using P24(Przelewy24).
     * @return Returns the P24PaymentObject
     */
    @JsonGetter("p24")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public P24PaymentObject getP24() {
        return p24;
    }

    /**
     * Setter for P24.
     * Information used to pay using P24(Przelewy24).
     * @param p24 Value for P24PaymentObject
     */
    @JsonSetter("p24")
    public void setP24(P24PaymentObject p24) {
        this.p24 = p24;
    }

    /**
     * Getter for Sofort.
     * Information used to pay using Sofort.
     * @return Returns the SofortPaymentObject
     */
    @JsonGetter("sofort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SofortPaymentObject getSofort() {
        return sofort;
    }

    /**
     * Setter for Sofort.
     * Information used to pay using Sofort.
     * @param sofort Value for SofortPaymentObject
     */
    @JsonSetter("sofort")
    public void setSofort(SofortPaymentObject sofort) {
        this.sofort = sofort;
    }

    /**
     * Getter for Trustly.
     * Information needed to pay using Trustly.
     * @return Returns the TrustlyPaymentObject
     */
    @JsonGetter("trustly")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TrustlyPaymentObject getTrustly() {
        return trustly;
    }

    /**
     * Setter for Trustly.
     * Information needed to pay using Trustly.
     * @param trustly Value for TrustlyPaymentObject
     */
    @JsonSetter("trustly")
    public void setTrustly(TrustlyPaymentObject trustly) {
        this.trustly = trustly;
    }

    /**
     * Getter for Venmo.
     * Venmo wallet response.
     * @return Returns the VenmoWalletResponseObject
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletResponseObject getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * Venmo wallet response.
     * @param venmo Value for VenmoWalletResponseObject
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoWalletResponseObject venmo) {
        this.venmo = venmo;
    }

    /**
     * Converts this PaymentSourceDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentSourceDetails [" + "card=" + card + ", paypal=" + paypal + ", bancontact="
                + bancontact + ", blik=" + blik + ", eps=" + eps + ", giropay=" + giropay
                + ", ideal=" + ideal + ", mybank=" + mybank + ", p24=" + p24 + ", sofort=" + sofort
                + ", trustly=" + trustly + ", venmo=" + venmo + "]";
    }

    /**
     * Builds a new {@link PaymentSourceDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentSourceDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .bancontact(getBancontact())
                .blik(getBlik())
                .eps(getEps())
                .giropay(getGiropay())
                .ideal(getIdeal())
                .mybank(getMybank())
                .p24(getP24())
                .sofort(getSofort())
                .trustly(getTrustly())
                .venmo(getVenmo());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentSourceDetails}.
     */
    public static class Builder {
        private CardResponse card;
        private PayPalWalletResponse paypal;
        private BancontactPaymentObject bancontact;
        private BLIKPaymentObject blik;
        private AnEpsPaymentObject eps;
        private AGiropayPaymentObject giropay;
        private TheIDEALPaymentObject ideal;
        private MyBankPaymentObject mybank;
        private P24PaymentObject p24;
        private SofortPaymentObject sofort;
        private TrustlyPaymentObject trustly;
        private VenmoWalletResponseObject venmo;



        /**
         * Setter for card.
         * @param  card  CardResponse value for card.
         * @return Builder
         */
        public Builder card(CardResponse card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWalletResponse value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWalletResponse paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for bancontact.
         * @param  bancontact  BancontactPaymentObject value for bancontact.
         * @return Builder
         */
        public Builder bancontact(BancontactPaymentObject bancontact) {
            this.bancontact = bancontact;
            return this;
        }

        /**
         * Setter for blik.
         * @param  blik  BLIKPaymentObject value for blik.
         * @return Builder
         */
        public Builder blik(BLIKPaymentObject blik) {
            this.blik = blik;
            return this;
        }

        /**
         * Setter for eps.
         * @param  eps  AnEpsPaymentObject value for eps.
         * @return Builder
         */
        public Builder eps(AnEpsPaymentObject eps) {
            this.eps = eps;
            return this;
        }

        /**
         * Setter for giropay.
         * @param  giropay  AGiropayPaymentObject value for giropay.
         * @return Builder
         */
        public Builder giropay(AGiropayPaymentObject giropay) {
            this.giropay = giropay;
            return this;
        }

        /**
         * Setter for ideal.
         * @param  ideal  TheIDEALPaymentObject value for ideal.
         * @return Builder
         */
        public Builder ideal(TheIDEALPaymentObject ideal) {
            this.ideal = ideal;
            return this;
        }

        /**
         * Setter for mybank.
         * @param  mybank  MyBankPaymentObject value for mybank.
         * @return Builder
         */
        public Builder mybank(MyBankPaymentObject mybank) {
            this.mybank = mybank;
            return this;
        }

        /**
         * Setter for p24.
         * @param  p24  P24PaymentObject value for p24.
         * @return Builder
         */
        public Builder p24(P24PaymentObject p24) {
            this.p24 = p24;
            return this;
        }

        /**
         * Setter for sofort.
         * @param  sofort  SofortPaymentObject value for sofort.
         * @return Builder
         */
        public Builder sofort(SofortPaymentObject sofort) {
            this.sofort = sofort;
            return this;
        }

        /**
         * Setter for trustly.
         * @param  trustly  TrustlyPaymentObject value for trustly.
         * @return Builder
         */
        public Builder trustly(TrustlyPaymentObject trustly) {
            this.trustly = trustly;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoWalletResponseObject value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoWalletResponseObject venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Builds a new {@link PaymentSourceDetails} object using the set fields.
         * @return {@link PaymentSourceDetails}
         */
        public PaymentSourceDetails build() {
            return new PaymentSourceDetails(card, paypal, bancontact, blik, eps, giropay, ideal,
                    mybank, p24, sofort, trustly, venmo);
        }
    }
}
