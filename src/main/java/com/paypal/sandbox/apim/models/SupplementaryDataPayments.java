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
 * This is a model class for SupplementaryDataPayments type.
 */
public class SupplementaryDataPayments {
    private RelatedIdentifiers relatedIds;

    /**
     * Default constructor.
     */
    public SupplementaryDataPayments() {
    }

    /**
     * Initialization constructor.
     * @param  relatedIds  RelatedIdentifiers value for relatedIds.
     */
    public SupplementaryDataPayments(
            RelatedIdentifiers relatedIds) {
        this.relatedIds = relatedIds;
    }

    /**
     * Getter for RelatedIds.
     * Identifiers related to a specific resource.
     * @return Returns the RelatedIdentifiers
     */
    @JsonGetter("related_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RelatedIdentifiers getRelatedIds() {
        return relatedIds;
    }

    /**
     * Setter for RelatedIds.
     * Identifiers related to a specific resource.
     * @param relatedIds Value for RelatedIdentifiers
     */
    @JsonSetter("related_ids")
    public void setRelatedIds(RelatedIdentifiers relatedIds) {
        this.relatedIds = relatedIds;
    }

    /**
     * Converts this SupplementaryDataPayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplementaryDataPayments [" + "relatedIds=" + relatedIds + "]";
    }

    /**
     * Builds a new {@link SupplementaryDataPayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplementaryDataPayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .relatedIds(getRelatedIds());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplementaryDataPayments}.
     */
    public static class Builder {
        private RelatedIdentifiers relatedIds;



        /**
         * Setter for relatedIds.
         * @param  relatedIds  RelatedIdentifiers value for relatedIds.
         * @return Builder
         */
        public Builder relatedIds(RelatedIdentifiers relatedIds) {
            this.relatedIds = relatedIds;
            return this;
        }

        /**
         * Builds a new {@link SupplementaryDataPayments} object using the set fields.
         * @return {@link SupplementaryDataPayments}
         */
        public SupplementaryDataPayments build() {
            return new SupplementaryDataPayments(relatedIds);
        }
    }
}