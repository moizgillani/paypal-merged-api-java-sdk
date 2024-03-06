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
 * This is a model class for ApplePayPaymentRequestObject type.
 */
public class ApplePayPaymentRequestObject {
    private String id;
    private String name;
    private String emailAddress;
    private Phone phoneNumber;
    private DecryptedApplePayTokenData decryptedToken;
    private String storedCredential;
    private String vaultId;
    private Object attributes;

    /**
     * Default constructor.
     */
    public ApplePayPaymentRequestObject() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  emailAddress  String value for emailAddress.
     * @param  phoneNumber  Phone value for phoneNumber.
     * @param  decryptedToken  DecryptedApplePayTokenData value for decryptedToken.
     * @param  storedCredential  String value for storedCredential.
     * @param  vaultId  String value for vaultId.
     * @param  attributes  Object value for attributes.
     */
    public ApplePayPaymentRequestObject(
            String id,
            String name,
            String emailAddress,
            Phone phoneNumber,
            DecryptedApplePayTokenData decryptedToken,
            String storedCredential,
            String vaultId,
            Object attributes) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.decryptedToken = decryptedToken;
        this.storedCredential = storedCredential;
        this.vaultId = vaultId;
        this.attributes = attributes;
    }

    /**
     * Getter for Id.
     * ApplePay transaction identifier, this will be the unique identifier for this transaction
     * provided by Apple. The pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ApplePay transaction identifier, this will be the unique identifier for this transaction
     * provided by Apple. The pattern is defined by an external party and supports Unicode.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for EmailAddress.
     * The email address of the account holder associated with this payment method.
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The email address of the account holder associated with this payment method.
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). Supports only the `national_number`
     * property.
     * @return Returns the Phone
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). Supports only the `national_number`
     * property.
     * @param phoneNumber Value for Phone
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for DecryptedToken.
     * The decrypted payload details for the apple pay token.
     * @return Returns the DecryptedApplePayTokenData
     */
    @JsonGetter("decrypted_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DecryptedApplePayTokenData getDecryptedToken() {
        return decryptedToken;
    }

    /**
     * Setter for DecryptedToken.
     * The decrypted payload details for the apple pay token.
     * @param decryptedToken Value for DecryptedApplePayTokenData
     */
    @JsonSetter("decrypted_token")
    public void setDecryptedToken(DecryptedApplePayTokenData decryptedToken) {
        this.decryptedToken = decryptedToken;
    }

    /**
     * Getter for StoredCredential.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("stored_credential")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStoredCredential() {
        return storedCredential;
    }

    /**
     * Setter for StoredCredential.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param storedCredential Value for String
     */
    @JsonSetter("stored_credential")
    public void setStoredCredential(String storedCredential) {
        this.storedCredential = storedCredential;
    }

    /**
     * Getter for VaultId.
     * The PayPal-generated ID for the saved apple pay payment_source. This ID should be stored on
     * the merchant's server so the saved payment source can be used for future transactions.
     * @return Returns the String
     */
    @JsonGetter("vault_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Setter for VaultId.
     * The PayPal-generated ID for the saved apple pay payment_source. This ID should be stored on
     * the merchant's server so the saved payment source can be used for future transactions.
     * @param vaultId Value for String
     */
    @JsonSetter("vault_id")
    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    /**
     * Getter for Attributes.
     * @return Returns the Object
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * @param attributes Value for Object
     */
    @JsonSetter("attributes")
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    /**
     * Converts this ApplePayPaymentRequestObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayPaymentRequestObject [" + "id=" + id + ", name=" + name + ", emailAddress="
                + emailAddress + ", phoneNumber=" + phoneNumber + ", decryptedToken="
                + decryptedToken + ", storedCredential=" + storedCredential + ", vaultId=" + vaultId
                + ", attributes=" + attributes + "]";
    }

    /**
     * Builds a new {@link ApplePayPaymentRequestObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayPaymentRequestObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .emailAddress(getEmailAddress())
                .phoneNumber(getPhoneNumber())
                .decryptedToken(getDecryptedToken())
                .storedCredential(getStoredCredential())
                .vaultId(getVaultId())
                .attributes(getAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayPaymentRequestObject}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String emailAddress;
        private Phone phoneNumber;
        private DecryptedApplePayTokenData decryptedToken;
        private String storedCredential;
        private String vaultId;
        private Object attributes;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  Phone value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(Phone phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Setter for decryptedToken.
         * @param  decryptedToken  DecryptedApplePayTokenData value for decryptedToken.
         * @return Builder
         */
        public Builder decryptedToken(DecryptedApplePayTokenData decryptedToken) {
            this.decryptedToken = decryptedToken;
            return this;
        }

        /**
         * Setter for storedCredential.
         * @param  storedCredential  String value for storedCredential.
         * @return Builder
         */
        public Builder storedCredential(String storedCredential) {
            this.storedCredential = storedCredential;
            return this;
        }

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
         * Setter for attributes.
         * @param  attributes  Object value for attributes.
         * @return Builder
         */
        public Builder attributes(Object attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Builds a new {@link ApplePayPaymentRequestObject} object using the set fields.
         * @return {@link ApplePayPaymentRequestObject}
         */
        public ApplePayPaymentRequestObject build() {
            return new ApplePayPaymentRequestObject(id, name, emailAddress, phoneNumber,
                    decryptedToken, storedCredential, vaultId, attributes);
        }
    }
}
