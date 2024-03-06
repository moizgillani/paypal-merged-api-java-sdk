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
 * This is a model class for CaptureStatusDetailsPayments type.
 */
public class CaptureStatusDetailsPayments {
    private CaptureStatusReasonEnum reason;

    /**
     * Default constructor.
     */
    public CaptureStatusDetailsPayments() {
    }

    /**
     * Initialization constructor.
     * @param  reason  CaptureStatusReasonEnum value for reason.
     */
    public CaptureStatusDetailsPayments(
            CaptureStatusReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * Getter for Reason.
     * The reason why the captured payment status is `PENDING` or `DENIED`.
     * @return Returns the CaptureStatusReasonEnum
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatusReasonEnum getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason why the captured payment status is `PENDING` or `DENIED`.
     * @param reason Value for CaptureStatusReasonEnum
     */
    @JsonSetter("reason")
    public void setReason(CaptureStatusReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * Converts this CaptureStatusDetailsPayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CaptureStatusDetailsPayments [" + "reason=" + reason + "]";
    }

    /**
     * Builds a new {@link CaptureStatusDetailsPayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CaptureStatusDetailsPayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .reason(getReason());
        return builder;
    }

    /**
     * Class to build instances of {@link CaptureStatusDetailsPayments}.
     */
    public static class Builder {
        private CaptureStatusReasonEnum reason;



        /**
         * Setter for reason.
         * @param  reason  CaptureStatusReasonEnum value for reason.
         * @return Builder
         */
        public Builder reason(CaptureStatusReasonEnum reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link CaptureStatusDetailsPayments} object using the set fields.
         * @return {@link CaptureStatusDetailsPayments}
         */
        public CaptureStatusDetailsPayments build() {
            return new CaptureStatusDetailsPayments(reason);
        }
    }
}
