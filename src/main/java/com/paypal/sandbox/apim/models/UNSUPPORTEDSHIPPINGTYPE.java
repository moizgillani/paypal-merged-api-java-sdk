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
 * This is a model class for UNSUPPORTEDSHIPPINGTYPE type.
 */
public class UNSUPPORTEDSHIPPINGTYPE {
    private UnsupportedShippingTypeIssueEnum issue;
    private UnsupportedShippingTypeDescriptionEnum description;

    /**
     * Default constructor.
     */
    public UNSUPPORTEDSHIPPINGTYPE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  UnsupportedShippingTypeIssueEnum value for issue.
     * @param  description  UnsupportedShippingTypeDescriptionEnum value for description.
     */
    public UNSUPPORTEDSHIPPINGTYPE(
            UnsupportedShippingTypeIssueEnum issue,
            UnsupportedShippingTypeDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the UnsupportedShippingTypeIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnsupportedShippingTypeIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for UnsupportedShippingTypeIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(UnsupportedShippingTypeIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the UnsupportedShippingTypeDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnsupportedShippingTypeDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for UnsupportedShippingTypeDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(UnsupportedShippingTypeDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this UNSUPPORTEDSHIPPINGTYPE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UNSUPPORTEDSHIPPINGTYPE [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link UNSUPPORTEDSHIPPINGTYPE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UNSUPPORTEDSHIPPINGTYPE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link UNSUPPORTEDSHIPPINGTYPE}.
     */
    public static class Builder {
        private UnsupportedShippingTypeIssueEnum issue;
        private UnsupportedShippingTypeDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  UnsupportedShippingTypeIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(UnsupportedShippingTypeIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  UnsupportedShippingTypeDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(UnsupportedShippingTypeDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link UNSUPPORTEDSHIPPINGTYPE} object using the set fields.
         * @return {@link UNSUPPORTEDSHIPPINGTYPE}
         */
        public UNSUPPORTEDSHIPPINGTYPE build() {
            return new UNSUPPORTEDSHIPPINGTYPE(issue, description);
        }
    }
}
