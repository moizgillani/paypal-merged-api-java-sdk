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
 * This is a model class for PERMISSIONDENIEDFORDONATIONITEMS type.
 */
public class PERMISSIONDENIEDFORDONATIONITEMS {
    private PermissionDeniedForDonationItemsIssueEnum issue;
    private PermissionDeniedForDonationItemsDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PERMISSIONDENIEDFORDONATIONITEMS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PermissionDeniedForDonationItemsIssueEnum value for issue.
     * @param  description  PermissionDeniedForDonationItemsDescriptionEnum value for description.
     */
    public PERMISSIONDENIEDFORDONATIONITEMS(
            PermissionDeniedForDonationItemsIssueEnum issue,
            PermissionDeniedForDonationItemsDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PermissionDeniedForDonationItemsIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedForDonationItemsIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PermissionDeniedForDonationItemsIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PermissionDeniedForDonationItemsIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PermissionDeniedForDonationItemsDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedForDonationItemsDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PermissionDeniedForDonationItemsDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PermissionDeniedForDonationItemsDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PERMISSIONDENIEDFORDONATIONITEMS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PERMISSIONDENIEDFORDONATIONITEMS [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PERMISSIONDENIEDFORDONATIONITEMS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PERMISSIONDENIEDFORDONATIONITEMS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PERMISSIONDENIEDFORDONATIONITEMS}.
     */
    public static class Builder {
        private PermissionDeniedForDonationItemsIssueEnum issue;
        private PermissionDeniedForDonationItemsDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PermissionDeniedForDonationItemsIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PermissionDeniedForDonationItemsIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PermissionDeniedForDonationItemsDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(PermissionDeniedForDonationItemsDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PERMISSIONDENIEDFORDONATIONITEMS} object using the set fields.
         * @return {@link PERMISSIONDENIEDFORDONATIONITEMS}
         */
        public PERMISSIONDENIEDFORDONATIONITEMS build() {
            return new PERMISSIONDENIEDFORDONATIONITEMS(issue, description);
        }
    }
}
