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
 * This is a model class for SHIPPINGADDRESSINVALIDERROR type.
 */
public class SHIPPINGADDRESSINVALIDERROR {
    private ShippingAddressInvalid1IssueEnum issue;
    private ShippingAddressInvalid1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public SHIPPINGADDRESSINVALIDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ShippingAddressInvalid1IssueEnum value for issue.
     * @param  description  ShippingAddressInvalid1DescriptionEnum value for description.
     */
    public SHIPPINGADDRESSINVALIDERROR(
            ShippingAddressInvalid1IssueEnum issue,
            ShippingAddressInvalid1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ShippingAddressInvalid1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddressInvalid1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ShippingAddressInvalid1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ShippingAddressInvalid1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ShippingAddressInvalid1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddressInvalid1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ShippingAddressInvalid1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ShippingAddressInvalid1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this SHIPPINGADDRESSINVALIDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SHIPPINGADDRESSINVALIDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link SHIPPINGADDRESSINVALIDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SHIPPINGADDRESSINVALIDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link SHIPPINGADDRESSINVALIDERROR}.
     */
    public static class Builder {
        private ShippingAddressInvalid1IssueEnum issue;
        private ShippingAddressInvalid1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ShippingAddressInvalid1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ShippingAddressInvalid1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ShippingAddressInvalid1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ShippingAddressInvalid1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link SHIPPINGADDRESSINVALIDERROR} object using the set fields.
         * @return {@link SHIPPINGADDRESSINVALIDERROR}
         */
        public SHIPPINGADDRESSINVALIDERROR build() {
            return new SHIPPINGADDRESSINVALIDERROR(issue, description);
        }
    }
}
