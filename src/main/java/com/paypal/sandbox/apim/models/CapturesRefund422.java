/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.Capturesrefund422issuesItems;
import java.util.List;

/**
 * This is a model class for CapturesRefund422 type.
 */
public class CapturesRefund422 {
    private List<Capturesrefund422issuesItems> issues;

    /**
     * Default constructor.
     */
    public CapturesRefund422() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of Capturesrefund422issuesItems value for issues.
     */
    public CapturesRefund422(
            List<Capturesrefund422issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of Capturesrefund422issuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Capturesrefund422issuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of Capturesrefund422issuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<Capturesrefund422issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this CapturesRefund422 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CapturesRefund422 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link CapturesRefund422.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CapturesRefund422.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link CapturesRefund422}.
     */
    public static class Builder {
        private List<Capturesrefund422issuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of Capturesrefund422issuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<Capturesrefund422issuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link CapturesRefund422} object using the set fields.
         * @return {@link CapturesRefund422}
         */
        public CapturesRefund422 build() {
            return new CapturesRefund422(issues);
        }
    }
}
