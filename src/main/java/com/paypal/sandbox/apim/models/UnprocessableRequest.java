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
 * This is a model class for UnprocessableRequest type.
 */
public class UnprocessableRequest {
    private UnprocessableRequestNameEnum name;
    private UnprocessableRequestmessageEnum message;
    private List<ErrorDetails3> issues;
    private String debugId;
    private String informationLink;

    /**
     * Default constructor.
     */
    public UnprocessableRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  UnprocessableRequestNameEnum value for name.
     * @param  message  UnprocessableRequestmessageEnum value for message.
     * @param  issues  List of ErrorDetails3 value for issues.
     * @param  debugId  String value for debugId.
     * @param  informationLink  String value for informationLink.
     */
    public UnprocessableRequest(
            UnprocessableRequestNameEnum name,
            UnprocessableRequestmessageEnum message,
            List<ErrorDetails3> issues,
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
     * @return Returns the UnprocessableRequestNameEnum
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnprocessableRequestNameEnum getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for UnprocessableRequestNameEnum
     */
    @JsonSetter("name")
    public void setName(UnprocessableRequestNameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the UnprocessableRequestmessageEnum
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnprocessableRequestmessageEnum getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for UnprocessableRequestmessageEnum
     */
    @JsonSetter("message")
    public void setMessage(UnprocessableRequestmessageEnum message) {
        this.message = message;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails3
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ErrorDetails3> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails3
     */
    @JsonSetter("issues")
    public void setIssues(List<ErrorDetails3> issues) {
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
     * Converts this UnprocessableRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnprocessableRequest [" + "name=" + name + ", message=" + message + ", issues="
                + issues + ", debugId=" + debugId + ", informationLink=" + informationLink + "]";
    }

    /**
     * Builds a new {@link UnprocessableRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnprocessableRequest.Builder} object
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
     * Class to build instances of {@link UnprocessableRequest}.
     */
    public static class Builder {
        private UnprocessableRequestNameEnum name;
        private UnprocessableRequestmessageEnum message;
        private List<ErrorDetails3> issues;
        private String debugId;
        private String informationLink;



        /**
         * Setter for name.
         * @param  name  UnprocessableRequestNameEnum value for name.
         * @return Builder
         */
        public Builder name(UnprocessableRequestNameEnum name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  UnprocessableRequestmessageEnum value for message.
         * @return Builder
         */
        public Builder message(UnprocessableRequestmessageEnum message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for issues.
         * @param  issues  List of ErrorDetails3 value for issues.
         * @return Builder
         */
        public Builder issues(List<ErrorDetails3> issues) {
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
         * Builds a new {@link UnprocessableRequest} object using the set fields.
         * @return {@link UnprocessableRequest}
         */
        public UnprocessableRequest build() {
            return new UnprocessableRequest(name, message, issues, debugId, informationLink);
        }
    }
}
