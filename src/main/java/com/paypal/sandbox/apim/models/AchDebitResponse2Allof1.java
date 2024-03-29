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
 * This is a model class for AchDebitResponse2Allof1 type.
 */
public class AchDebitResponse2Allof1 {
    private String verificationStatus;

    /**
     * Default constructor.
     */
    public AchDebitResponse2Allof1() {
    }

    /**
     * Initialization constructor.
     * @param  verificationStatus  String value for verificationStatus.
     */
    public AchDebitResponse2Allof1(
            String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * Getter for VerificationStatus.
     * ACH Debit Verification Status
     * @return Returns the String
     */
    @JsonGetter("verification_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Setter for VerificationStatus.
     * ACH Debit Verification Status
     * @param verificationStatus Value for String
     */
    @JsonSetter("verification_status")
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * Converts this AchDebitResponse2Allof1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AchDebitResponse2Allof1 [" + "verificationStatus=" + verificationStatus + "]";
    }

    /**
     * Builds a new {@link AchDebitResponse2Allof1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AchDebitResponse2Allof1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .verificationStatus(getVerificationStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link AchDebitResponse2Allof1}.
     */
    public static class Builder {
        private String verificationStatus;



        /**
         * Setter for verificationStatus.
         * @param  verificationStatus  String value for verificationStatus.
         * @return Builder
         */
        public Builder verificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * Builds a new {@link AchDebitResponse2Allof1} object using the set fields.
         * @return {@link AchDebitResponse2Allof1}
         */
        public AchDebitResponse2Allof1 build() {
            return new AchDebitResponse2Allof1(verificationStatus);
        }
    }
}
