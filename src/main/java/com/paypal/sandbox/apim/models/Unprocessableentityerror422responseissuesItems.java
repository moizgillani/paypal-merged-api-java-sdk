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
 * This is a model class for Unprocessableentityerror422responseissuesItems type.
 */
public class Unprocessableentityerror422responseissuesItems {
    private InvalidCurrencyCodeIssueEnum issue;
    private InvalidCurrencyCodeDescriptionPaymentsEnum description;

    /**
     * Default constructor.
     */
    public Unprocessableentityerror422responseissuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidCurrencyCodeIssueEnum value for issue.
     * @param  description  InvalidCurrencyCodeDescriptionPaymentsEnum value for description.
     */
    public Unprocessableentityerror422responseissuesItems(
            InvalidCurrencyCodeIssueEnum issue,
            InvalidCurrencyCodeDescriptionPaymentsEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidCurrencyCodeIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCodeIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidCurrencyCodeIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidCurrencyCodeIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidCurrencyCodeDescriptionPaymentsEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCodeDescriptionPaymentsEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidCurrencyCodeDescriptionPaymentsEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidCurrencyCodeDescriptionPaymentsEnum description) {
        this.description = description;
    }

    /**
     * Converts this Unprocessableentityerror422responseissuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Unprocessableentityerror422responseissuesItems [" + "issue=" + issue
                + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link Unprocessableentityerror422responseissuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Unprocessableentityerror422responseissuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link Unprocessableentityerror422responseissuesItems}.
     */
    public static class Builder {
        private InvalidCurrencyCodeIssueEnum issue;
        private InvalidCurrencyCodeDescriptionPaymentsEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidCurrencyCodeIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidCurrencyCodeIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidCurrencyCodeDescriptionPaymentsEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidCurrencyCodeDescriptionPaymentsEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link Unprocessableentityerror422responseissuesItems} object using the set
         * fields.
         * @return {@link Unprocessableentityerror422responseissuesItems}
         */
        public Unprocessableentityerror422responseissuesItems build() {
            return new Unprocessableentityerror422responseissuesItems(issue, description);
        }
    }
}
