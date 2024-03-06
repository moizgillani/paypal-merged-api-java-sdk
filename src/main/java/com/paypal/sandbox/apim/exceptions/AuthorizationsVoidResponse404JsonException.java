/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.ErrorDetails2Payments;
import com.paypal.sandbox.apim.models.ResourceNotFoundMessageEnum;
import com.paypal.sandbox.apim.models.ResourceNotFoundNameEnum;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for AuthorizationsVoidResponse404JsonException type.
 */
public class AuthorizationsVoidResponse404JsonException extends ApiException {
    private static final long serialVersionUID = 501236929286040218L;
    private ResourceNotFoundNameEnum name;
    private ResourceNotFoundMessageEnum message;
    private List<ErrorDetails2Payments> issues;
    private String debugId;
    private String informationLink;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AuthorizationsVoidResponse404JsonException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Name.
     * @return Returns the ResourceNotFoundNameEnum
     */
    @JsonGetter("name")
    public ResourceNotFoundNameEnum getName() {
        return this.name;
    }

    /**
     * Setter for Name.
     * @param name Value for ResourceNotFoundNameEnum
     */
    @JsonSetter("name")
    private void setName(ResourceNotFoundNameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the ResourceNotFoundMessageEnum
     */
    @JsonGetter("message")
    public ResourceNotFoundMessageEnum getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param messageField Value for ResourceNotFoundMessageEnum
     */
    @JsonSetter("message")
    private void setMessageField(ResourceNotFoundMessageEnum messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails2Payments
     */
    @JsonGetter("issues")
    public List<ErrorDetails2Payments> getIssues() {
        return this.issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails2Payments
     */
    @JsonSetter("issues")
    private void setIssues(List<ErrorDetails2Payments> issues) {
        this.issues = issues;
    }

    /**
     * Getter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @return Returns the String
     */
    @JsonGetter("debug_id")
    public String getDebugId() {
        return this.debugId;
    }

    /**
     * Setter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @param debugId Value for String
     */
    @JsonSetter("debug_id")
    private void setDebugId(String debugId) {
        this.debugId = debugId;
    }

    /**
     * Getter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @return Returns the String
     */
    @JsonGetter("information_link")
    public String getInformationLink() {
        return this.informationLink;
    }

    /**
     * Setter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @param informationLink Value for String
     */
    @JsonSetter("information_link")
    private void setInformationLink(String informationLink) {
        this.informationLink = informationLink;
    }
}
