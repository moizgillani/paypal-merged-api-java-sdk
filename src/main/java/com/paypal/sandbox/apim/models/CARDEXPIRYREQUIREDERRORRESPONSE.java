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
 * This is a model class for CARDEXPIRYREQUIREDERRORRESPONSE type.
 */
public class CARDEXPIRYREQUIREDERRORRESPONSE {
    private CardExpiryRequired2IssueEnum issue;
    private CardExpiryRequired2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public CARDEXPIRYREQUIREDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CardExpiryRequired2IssueEnum value for issue.
     * @param  description  CardExpiryRequired2DescriptionEnum value for description.
     */
    public CARDEXPIRYREQUIREDERRORRESPONSE(
            CardExpiryRequired2IssueEnum issue,
            CardExpiryRequired2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CardExpiryRequired2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardExpiryRequired2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CardExpiryRequired2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CardExpiryRequired2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CardExpiryRequired2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardExpiryRequired2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CardExpiryRequired2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CardExpiryRequired2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CARDEXPIRYREQUIREDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CARDEXPIRYREQUIREDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link CARDEXPIRYREQUIREDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CARDEXPIRYREQUIREDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CARDEXPIRYREQUIREDERRORRESPONSE}.
     */
    public static class Builder {
        private CardExpiryRequired2IssueEnum issue;
        private CardExpiryRequired2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CardExpiryRequired2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CardExpiryRequired2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CardExpiryRequired2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CardExpiryRequired2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CARDEXPIRYREQUIREDERRORRESPONSE} object using the set fields.
         * @return {@link CARDEXPIRYREQUIREDERRORRESPONSE}
         */
        public CARDEXPIRYREQUIREDERRORRESPONSE build() {
            return new CARDEXPIRYREQUIREDERRORRESPONSE(issue, description);
        }
    }
}
