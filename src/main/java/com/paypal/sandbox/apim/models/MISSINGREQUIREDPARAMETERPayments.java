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
 * This is a model class for MISSINGREQUIREDPARAMETERPayments type.
 */
public class MISSINGREQUIREDPARAMETERPayments {
    private MissingRequiredParameterIssueEnum issue;
    private MissingRequiredParameterDescriptionPaymentsEnum description;

    /**
     * Default constructor.
     */
    public MISSINGREQUIREDPARAMETERPayments() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingRequiredParameterIssueEnum value for issue.
     * @param  description  MissingRequiredParameterDescriptionPaymentsEnum value for description.
     */
    public MISSINGREQUIREDPARAMETERPayments(
            MissingRequiredParameterIssueEnum issue,
            MissingRequiredParameterDescriptionPaymentsEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingRequiredParameterIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameterIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingRequiredParameterIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingRequiredParameterIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingRequiredParameterDescriptionPaymentsEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameterDescriptionPaymentsEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingRequiredParameterDescriptionPaymentsEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingRequiredParameterDescriptionPaymentsEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGREQUIREDPARAMETERPayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGREQUIREDPARAMETERPayments [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MISSINGREQUIREDPARAMETERPayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGREQUIREDPARAMETERPayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGREQUIREDPARAMETERPayments}.
     */
    public static class Builder {
        private MissingRequiredParameterIssueEnum issue;
        private MissingRequiredParameterDescriptionPaymentsEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingRequiredParameterIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingRequiredParameterIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingRequiredParameterDescriptionPaymentsEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(MissingRequiredParameterDescriptionPaymentsEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGREQUIREDPARAMETERPayments} object using the set fields.
         * @return {@link MISSINGREQUIREDPARAMETERPayments}
         */
        public MISSINGREQUIREDPARAMETERPayments build() {
            return new MISSINGREQUIREDPARAMETERPayments(issue, description);
        }
    }
}
