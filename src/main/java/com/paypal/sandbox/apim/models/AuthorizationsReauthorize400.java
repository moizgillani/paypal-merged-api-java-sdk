/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.Authorizationsreauthorize400issuesItems;
import java.util.List;

/**
 * This is a model class for AuthorizationsReauthorize400 type.
 */
public class AuthorizationsReauthorize400 {
    private List<Authorizationsreauthorize400issuesItems> issues;

    /**
     * Default constructor.
     */
    public AuthorizationsReauthorize400() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of Authorizationsreauthorize400issuesItems value for issues.
     */
    public AuthorizationsReauthorize400(
            List<Authorizationsreauthorize400issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of Authorizationsreauthorize400issuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Authorizationsreauthorize400issuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of Authorizationsreauthorize400issuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<Authorizationsreauthorize400issuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this AuthorizationsReauthorize400 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationsReauthorize400 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link AuthorizationsReauthorize400.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationsReauthorize400.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationsReauthorize400}.
     */
    public static class Builder {
        private List<Authorizationsreauthorize400issuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of Authorizationsreauthorize400issuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<Authorizationsreauthorize400issuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationsReauthorize400} object using the set fields.
         * @return {@link AuthorizationsReauthorize400}
         */
        public AuthorizationsReauthorize400 build() {
            return new AuthorizationsReauthorize400(issues);
        }
    }
}
