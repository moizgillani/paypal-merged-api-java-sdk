/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TrackingDetails type.
 */
public class TrackingDetails {
    private List<OrderTrackerResponse> trackers;

    /**
     * Default constructor.
     */
    public TrackingDetails() {
    }

    /**
     * Initialization constructor.
     * @param  trackers  List of OrderTrackerResponse value for trackers.
     */
    public TrackingDetails(
            List<OrderTrackerResponse> trackers) {
        this.trackers = trackers;
    }

    /**
     * Getter for Trackers.
     * An array of trackers for a transaction.
     * @return Returns the List of OrderTrackerResponse
     */
    @JsonGetter("trackers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderTrackerResponse> getTrackers() {
        return trackers;
    }

    /**
     * Setter for Trackers.
     * An array of trackers for a transaction.
     * @param trackers Value for List of OrderTrackerResponse
     */
    @JsonSetter("trackers")
    public void setTrackers(List<OrderTrackerResponse> trackers) {
        this.trackers = trackers;
    }

    /**
     * Converts this TrackingDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TrackingDetails [" + "trackers=" + trackers + "]";
    }

    /**
     * Builds a new {@link TrackingDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TrackingDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .trackers(getTrackers());
        return builder;
    }

    /**
     * Class to build instances of {@link TrackingDetails}.
     */
    public static class Builder {
        private List<OrderTrackerResponse> trackers;



        /**
         * Setter for trackers.
         * @param  trackers  List of OrderTrackerResponse value for trackers.
         * @return Builder
         */
        public Builder trackers(List<OrderTrackerResponse> trackers) {
            this.trackers = trackers;
            return this;
        }

        /**
         * Builds a new {@link TrackingDetails} object using the set fields.
         * @return {@link TrackingDetails}
         */
        public TrackingDetails build() {
            return new TrackingDetails(trackers);
        }
    }
}
