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
 * This is a model class for CardDetails type.
 */
public class CardDetails {
    private String vaultId;
    private StoredPaymentSource storedCredential;
    private NetworkToken networkToken;
    private CardExperienceContext experienceContext;

    /**
     * Default constructor.
     */
    public CardDetails() {
    }

    /**
     * Initialization constructor.
     * @param  vaultId  String value for vaultId.
     * @param  storedCredential  StoredPaymentSource value for storedCredential.
     * @param  networkToken  NetworkToken value for networkToken.
     * @param  experienceContext  CardExperienceContext value for experienceContext.
     */
    public CardDetails(
            String vaultId,
            StoredPaymentSource storedCredential,
            NetworkToken networkToken,
            CardExperienceContext experienceContext) {
        this.vaultId = vaultId;
        this.storedCredential = storedCredential;
        this.networkToken = networkToken;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for VaultId.
     * The PayPal-generated ID for the saved card payment source. Typically stored on the merchant's
     * server.
     * @return Returns the String
     */
    @JsonGetter("vault_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Setter for VaultId.
     * The PayPal-generated ID for the saved card payment source. Typically stored on the merchant's
     * server.
     * @param vaultId Value for String
     */
    @JsonSetter("vault_id")
    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    /**
     * Getter for StoredCredential.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;`payment_type=ONE_TIME` is compatible only
     * with `payment_initiator=CUSTOMER`. `usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`. `previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`. Only one of the parameters - `previous_transaction_reference`
     * and `previous_network_transaction_reference` - can be present in the request.
     * @return Returns the StoredPaymentSource
     */
    @JsonGetter("stored_credential")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoredPaymentSource getStoredCredential() {
        return storedCredential;
    }

    /**
     * Setter for StoredCredential.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;`payment_type=ONE_TIME` is compatible only
     * with `payment_initiator=CUSTOMER`. `usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`. `previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`. Only one of the parameters - `previous_transaction_reference`
     * and `previous_network_transaction_reference` - can be present in the request.
     * @param storedCredential Value for StoredPaymentSource
     */
    @JsonSetter("stored_credential")
    public void setStoredCredential(StoredPaymentSource storedCredential) {
        this.storedCredential = storedCredential;
    }

    /**
     * Getter for NetworkToken.
     * A 3rd party network token refers to a network token that the merchant provisions from and
     * vaults with an external TSP (Token Service Provider) other than PayPal.
     * @return Returns the NetworkToken
     */
    @JsonGetter("network_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkToken getNetworkToken() {
        return networkToken;
    }

    /**
     * Setter for NetworkToken.
     * A 3rd party network token refers to a network token that the merchant provisions from and
     * vaults with an external TSP (Token Service Provider) other than PayPal.
     * @param networkToken Value for NetworkToken
     */
    @JsonSetter("network_token")
    public void setNetworkToken(NetworkToken networkToken) {
        this.networkToken = networkToken;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the 3DS Approval for payment.
     * @return Returns the CardExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the 3DS Approval for payment.
     * @param experienceContext Value for CardExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(CardExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Converts this CardDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardDetails [" + "vaultId=" + vaultId + ", storedCredential=" + storedCredential
                + ", networkToken=" + networkToken + ", experienceContext=" + experienceContext
                + "]";
    }

    /**
     * Builds a new {@link CardDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vaultId(getVaultId())
                .storedCredential(getStoredCredential())
                .networkToken(getNetworkToken())
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link CardDetails}.
     */
    public static class Builder {
        private String vaultId;
        private StoredPaymentSource storedCredential;
        private NetworkToken networkToken;
        private CardExperienceContext experienceContext;



        /**
         * Setter for vaultId.
         * @param  vaultId  String value for vaultId.
         * @return Builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        /**
         * Setter for storedCredential.
         * @param  storedCredential  StoredPaymentSource value for storedCredential.
         * @return Builder
         */
        public Builder storedCredential(StoredPaymentSource storedCredential) {
            this.storedCredential = storedCredential;
            return this;
        }

        /**
         * Setter for networkToken.
         * @param  networkToken  NetworkToken value for networkToken.
         * @return Builder
         */
        public Builder networkToken(NetworkToken networkToken) {
            this.networkToken = networkToken;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  CardExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(CardExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Builds a new {@link CardDetails} object using the set fields.
         * @return {@link CardDetails}
         */
        public CardDetails build() {
            return new CardDetails(vaultId, storedCredential, networkToken, experienceContext);
        }
    }
}