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
 * This is a model class for NetworkTransactionReferencePayments type.
 */
public class NetworkTransactionReferencePayments {
    private String id;
    private String date;
    private CardBrandEnum network;
    private String acquirerReferenceNumber;

    /**
     * Default constructor.
     */
    public NetworkTransactionReferencePayments() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  date  String value for date.
     * @param  network  CardBrandEnum value for network.
     * @param  acquirerReferenceNumber  String value for acquirerReferenceNumber.
     */
    public NetworkTransactionReferencePayments(
            String id,
            String date,
            CardBrandEnum network,
            String acquirerReferenceNumber) {
        this.id = id;
        this.date = date;
        this.network = network;
        this.acquirerReferenceNumber = acquirerReferenceNumber;
    }

    /**
     * Getter for Id.
     * Transaction reference id returned by the scheme. For Visa and Amex, this is the "Tran id"
     * field in response. For MasterCard, this is the "BankNet reference id" field in response. For
     * Discover, this is the "NRID" field in response. The pattern we expect for this field from
     * Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is
     * alphanumeric with special character -.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Transaction reference id returned by the scheme. For Visa and Amex, this is the "Tran id"
     * field in response. For MasterCard, this is the "BankNet reference id" field in response. For
     * Discover, this is the "NRID" field in response. The pattern we expect for this field from
     * Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is
     * alphanumeric with special character -.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Date.
     * The date that the transaction was authorized by the scheme. This field may not be returned
     * for all networks. MasterCard refers to this field as "BankNet reference date.
     * @return Returns the String
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * The date that the transaction was authorized by the scheme. This field may not be returned
     * for all networks. MasterCard refers to this field as "BankNet reference date.
     * @param date Value for String
     */
    @JsonSetter("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter for Network.
     * Name of the card network through which the transaction was routed.
     * @return Returns the CardBrandEnum
     */
    @JsonGetter("network")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrandEnum getNetwork() {
        return network;
    }

    /**
     * Setter for Network.
     * Name of the card network through which the transaction was routed.
     * @param network Value for CardBrandEnum
     */
    @JsonSetter("network")
    public void setNetwork(CardBrandEnum network) {
        this.network = network;
    }

    /**
     * Getter for AcquirerReferenceNumber.
     * Reference ID issued for the card transaction. This ID can be used to track the transaction
     * across processors, card brands and issuing banks.
     * @return Returns the String
     */
    @JsonGetter("acquirer_reference_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    /**
     * Setter for AcquirerReferenceNumber.
     * Reference ID issued for the card transaction. This ID can be used to track the transaction
     * across processors, card brands and issuing banks.
     * @param acquirerReferenceNumber Value for String
     */
    @JsonSetter("acquirer_reference_number")
    public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
        this.acquirerReferenceNumber = acquirerReferenceNumber;
    }

    /**
     * Converts this NetworkTransactionReferencePayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetworkTransactionReferencePayments [" + "id=" + id + ", date=" + date
                + ", network=" + network + ", acquirerReferenceNumber=" + acquirerReferenceNumber
                + "]";
    }

    /**
     * Builds a new {@link NetworkTransactionReferencePayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetworkTransactionReferencePayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .date(getDate())
                .network(getNetwork())
                .acquirerReferenceNumber(getAcquirerReferenceNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link NetworkTransactionReferencePayments}.
     */
    public static class Builder {
        private String id;
        private String date;
        private CardBrandEnum network;
        private String acquirerReferenceNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Setter for network.
         * @param  network  CardBrandEnum value for network.
         * @return Builder
         */
        public Builder network(CardBrandEnum network) {
            this.network = network;
            return this;
        }

        /**
         * Setter for acquirerReferenceNumber.
         * @param  acquirerReferenceNumber  String value for acquirerReferenceNumber.
         * @return Builder
         */
        public Builder acquirerReferenceNumber(String acquirerReferenceNumber) {
            this.acquirerReferenceNumber = acquirerReferenceNumber;
            return this;
        }

        /**
         * Builds a new {@link NetworkTransactionReferencePayments} object using the set fields.
         * @return {@link NetworkTransactionReferencePayments}
         */
        public NetworkTransactionReferencePayments build() {
            return new NetworkTransactionReferencePayments(id, date, network,
                    acquirerReferenceNumber);
        }
    }
}
