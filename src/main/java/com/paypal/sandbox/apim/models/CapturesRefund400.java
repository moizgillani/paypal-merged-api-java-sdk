/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.Capturesrefund400issuesItems;
import java.util.List;

/**
 * This is a model class for CapturesRefund400 type.
 */
public class CapturesRefund400 {
    private List<Capturesrefund400issuesItems> issues;

    /**
     * Default constructor.
     */
    public CapturesRefund400() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of Capturesrefund400issuesItems value for issues.
     */
    public CapturesRefund400(
            List<Capturesrefund400issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of Capturesrefund400issuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Capturesrefund400issuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of Capturesrefund400issuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<Capturesrefund400issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this CapturesRefund400 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CapturesRefund400 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link CapturesRefund400.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CapturesRefund400.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link CapturesRefund400}.
     */
    public static class Builder {
        private List<Capturesrefund400issuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of Capturesrefund400issuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<Capturesrefund400issuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link CapturesRefund400} object using the set fields.
         * @return {@link CapturesRefund400}
         */
        public CapturesRefund400 build() {
            return new CapturesRefund400(issues);
        }
    }
}
