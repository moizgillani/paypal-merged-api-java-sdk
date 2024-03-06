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
 * This is a model class for CardRequest type.
 */
public class CardRequest {
    private String id;
    private String name;
    private String number;
    private String expiry;
    private String securityCode;
    private String lastDigits;
    private CardBrandEnum cardType;
    private CardTypeEnum type;
    private CardBrandEnum brand;
    private PortableInternationalPostalAddress billingAddress;
    private CardAttributes attributes;
    private String vaultId;
    private StoredPaymentSource storedCredential;
    private NetworkToken networkToken;
    private CardExperienceContext experienceContext;

    /**
     * Default constructor.
     */
    public CardRequest() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  number  String value for number.
     * @param  expiry  String value for expiry.
     * @param  securityCode  String value for securityCode.
     * @param  lastDigits  String value for lastDigits.
     * @param  cardType  CardBrandEnum value for cardType.
     * @param  type  CardTypeEnum value for type.
     * @param  brand  CardBrandEnum value for brand.
     * @param  billingAddress  PortableInternationalPostalAddress value for billingAddress.
     * @param  attributes  CardAttributes value for attributes.
     * @param  vaultId  String value for vaultId.
     * @param  storedCredential  StoredPaymentSource value for storedCredential.
     * @param  networkToken  NetworkToken value for networkToken.
     * @param  experienceContext  CardExperienceContext value for experienceContext.
     */
    public CardRequest(
            String id,
            String name,
            String number,
            String expiry,
            String securityCode,
            String lastDigits,
            CardBrandEnum cardType,
            CardTypeEnum type,
            CardBrandEnum brand,
            PortableInternationalPostalAddress billingAddress,
            CardAttributes attributes,
            String vaultId,
            StoredPaymentSource storedCredential,
            NetworkToken networkToken,
            CardExperienceContext experienceContext) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.expiry = expiry;
        this.securityCode = securityCode;
        this.lastDigits = lastDigits;
        this.cardType = cardType;
        this.type = type;
        this.brand = brand;
        this.billingAddress = billingAddress;
        this.attributes = attributes;
        this.vaultId = vaultId;
        this.storedCredential = storedCredential;
        this.networkToken = networkToken;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the card.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the card.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The card holder's name as it appears on the card.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The card holder's name as it appears on the card.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Number.
     * The primary account number (PAN) for the payment card.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The primary account number (PAN) for the payment card.
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @return Returns the String
     */
    @JsonGetter("security_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Setter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @param securityCode Value for String
     */
    @JsonSetter("security_code")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * Getter for LastDigits.
     * The last digits of the payment card.
     * @return Returns the String
     */
    @JsonGetter("last_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Setter for LastDigits.
     * The last digits of the payment card.
     * @param lastDigits Value for String
     */
    @JsonSetter("last_digits")
    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    /**
     * Getter for CardType.
     * The card brand or network. Typically used in the response.
     * @return Returns the CardBrandEnum
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrandEnum getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * The card brand or network. Typically used in the response.
     * @param cardType Value for CardBrandEnum
     */
    @JsonSetter("card_type")
    public void setCardType(CardBrandEnum cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for Type.
     * The payment card type.
     * @return Returns the CardTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The payment card type.
     * @param type Value for CardTypeEnum
     */
    @JsonSetter("type")
    public void setType(CardTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Brand.
     * The card brand or network. Typically used in the response.
     * @return Returns the CardBrandEnum
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrandEnum getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The card brand or network. Typically used in the response.
     * @param brand Value for CardBrandEnum
     */
    @JsonSetter("brand")
    public void setBrand(CardBrandEnum brand) {
        this.brand = brand;
    }

    /**
     * Getter for BillingAddress.
     * The address of the payer. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred
     * to as the billing address of the customer.
     * @return Returns the PortableInternationalPostalAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PortableInternationalPostalAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The address of the payer. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred
     * to as the billing address of the customer.
     * @param billingAddress Value for PortableInternationalPostalAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(PortableInternationalPostalAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for Attributes.
     * Additional attributes associated with the use of this card.
     * @return Returns the CardAttributes
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardAttributes getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Additional attributes associated with the use of this card.
     * @param attributes Value for CardAttributes
     */
    @JsonSetter("attributes")
    public void setAttributes(CardAttributes attributes) {
        this.attributes = attributes;
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
     * Converts this CardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardRequest [" + "id=" + id + ", name=" + name + ", number=" + number + ", expiry="
                + expiry + ", securityCode=" + securityCode + ", lastDigits=" + lastDigits
                + ", cardType=" + cardType + ", type=" + type + ", brand=" + brand
                + ", billingAddress=" + billingAddress + ", attributes=" + attributes + ", vaultId="
                + vaultId + ", storedCredential=" + storedCredential + ", networkToken="
                + networkToken + ", experienceContext=" + experienceContext + "]";
    }

    /**
     * Builds a new {@link CardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .number(getNumber())
                .expiry(getExpiry())
                .securityCode(getSecurityCode())
                .lastDigits(getLastDigits())
                .cardType(getCardType())
                .type(getType())
                .brand(getBrand())
                .billingAddress(getBillingAddress())
                .attributes(getAttributes())
                .vaultId(getVaultId())
                .storedCredential(getStoredCredential())
                .networkToken(getNetworkToken())
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link CardRequest}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String number;
        private String expiry;
        private String securityCode;
        private String lastDigits;
        private CardBrandEnum cardType;
        private CardTypeEnum type;
        private CardBrandEnum brand;
        private PortableInternationalPostalAddress billingAddress;
        private CardAttributes attributes;
        private String vaultId;
        private StoredPaymentSource storedCredential;
        private NetworkToken networkToken;
        private CardExperienceContext experienceContext;



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
         * Setter for securityCode.
         * @param  securityCode  String value for securityCode.
         * @return Builder
         */
        public Builder securityCode(String securityCode) {
            this.securityCode = securityCode;
            return this;
        }

        /**
         * Setter for lastDigits.
         * @param  lastDigits  String value for lastDigits.
         * @return Builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  CardBrandEnum value for cardType.
         * @return Builder
         */
        public Builder cardType(CardBrandEnum cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CardTypeEnum value for type.
         * @return Builder
         */
        public Builder type(CardTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  CardBrandEnum value for brand.
         * @return Builder
         */
        public Builder brand(CardBrandEnum brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  PortableInternationalPostalAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(PortableInternationalPostalAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  CardAttributes value for attributes.
         * @return Builder
         */
        public Builder attributes(CardAttributes attributes) {
            this.attributes = attributes;
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
         * Builds a new {@link CardRequest} object using the set fields.
         * @return {@link CardRequest}
         */
        public CardRequest build() {
            return new CardRequest(id, name, number, expiry, securityCode, lastDigits, cardType,
                    type, brand, billingAddress, attributes, vaultId, storedCredential,
                    networkToken, experienceContext);
        }
    }
}
