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
 * This is a model class for Forbidden type.
 */
public class Forbidden {
    private ForbiddenRequestNameEnum name;
    private ForbiddenRequestMessageEnum message;
    private List<ErrorDetails12> issues;
    private String debugId;
    private String informationLink;

    /**
     * Default constructor.
     */
    public Forbidden() {
    }

    /**
     * Initialization constructor.
     * @param  name  ForbiddenRequestNameEnum value for name.
     * @param  message  ForbiddenRequestMessageEnum value for message.
     * @param  issues  List of ErrorDetails12 value for issues.
     * @param  debugId  String value for debugId.
     * @param  informationLink  String value for informationLink.
     */
    public Forbidden(
            ForbiddenRequestNameEnum name,
            ForbiddenRequestMessageEnum message,
            List<ErrorDetails12> issues,
            String debugId,
            String informationLink) {
        this.name = name;
        this.message = message;
        this.issues = issues;
        this.debugId = debugId;
        this.informationLink = informationLink;
    }

    /**
     * Getter for Name.
     * @return Returns the ForbiddenRequestNameEnum
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ForbiddenRequestNameEnum getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for ForbiddenRequestNameEnum
     */
    @JsonSetter("name")
    public void setName(ForbiddenRequestNameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the ForbiddenRequestMessageEnum
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ForbiddenRequestMessageEnum getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for ForbiddenRequestMessageEnum
     */
    @JsonSetter("message")
    public void setMessage(ForbiddenRequestMessageEnum message) {
        this.message = message;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails12
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ErrorDetails12> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails12
     */
    @JsonSetter("issues")
    public void setIssues(List<ErrorDetails12> issues) {
        this.issues = issues;
    }

    /**
     * Getter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @return Returns the String
     */
    @JsonGetter("debug_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebugId() {
        return debugId;
    }

    /**
     * Setter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @param debugId Value for String
     */
    @JsonSetter("debug_id")
    public void setDebugId(String debugId) {
        this.debugId = debugId;
    }

    /**
     * Getter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @return Returns the String
     */
    @JsonGetter("information_link")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationLink() {
        return informationLink;
    }

    /**
     * Setter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @param informationLink Value for String
     */
    @JsonSetter("information_link")
    public void setInformationLink(String informationLink) {
        this.informationLink = informationLink;
    }

    /**
     * Converts this Forbidden into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Forbidden [" + "name=" + name + ", message=" + message + ", issues=" + issues
                + ", debugId=" + debugId + ", informationLink=" + informationLink + "]";
    }

    /**
     * Builds a new {@link Forbidden.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Forbidden.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .message(getMessage())
                .issues(getIssues())
                .debugId(getDebugId())
                .informationLink(getInformationLink());
        return builder;
    }

    /**
     * Class to build instances of {@link Forbidden}.
     */
    public static class Builder {
        private ForbiddenRequestNameEnum name;
        private ForbiddenRequestMessageEnum message;
        private List<ErrorDetails12> issues;
        private String debugId;
        private String informationLink;



        /**
         * Setter for name.
         * @param  name  ForbiddenRequestNameEnum value for name.
         * @return Builder
         */
        public Builder name(ForbiddenRequestNameEnum name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  ForbiddenRequestMessageEnum value for message.
         * @return Builder
         */
        public Builder message(ForbiddenRequestMessageEnum message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for issues.
         * @param  issues  List of ErrorDetails12 value for issues.
         * @return Builder
         */
        public Builder issues(List<ErrorDetails12> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Setter for debugId.
         * @param  debugId  String value for debugId.
         * @return Builder
         */
        public Builder debugId(String debugId) {
            this.debugId = debugId;
            return this;
        }

        /**
         * Setter for informationLink.
         * @param  informationLink  String value for informationLink.
         * @return Builder
         */
        public Builder informationLink(String informationLink) {
            this.informationLink = informationLink;
            return this;
        }

        /**
         * Builds a new {@link Forbidden} object using the set fields.
         * @return {@link Forbidden}
         */
        public Forbidden build() {
            return new Forbidden(name, message, issues, debugId, informationLink);
        }
    }
}
