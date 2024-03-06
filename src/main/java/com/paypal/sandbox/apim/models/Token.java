/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Token type.
 */
public class Token {
    private String id;
    private String type;

    /**
     * Default constructor.
     */
    public Token() {
        type = "BILLING_AGREEMENT";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  type  String value for type.
     */
    public Token(
            String id,
            String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the token.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the token.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Type.
     * The tokenization method that generated the ID.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The tokenization method that generated the ID.
     * @param type Value for String
     */
    @JsonSetter("type")
    private void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this Token into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Token [" + "id=" + id + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link Token.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Token.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, type);
        return builder;
    }

    /**
     * Class to build instances of {@link Token}.
     */
    public static class Builder {
        private String id;
        private String type = "BILLING_AGREEMENT";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  type  String value for type.
         */
        public Builder(String id, String type) {
            this.id = id;
            this.type = type;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link Token} object using the set fields.
         * @return {@link Token}
         */
        public Token build() {
            return new Token(id, type);
        }
    }
}
