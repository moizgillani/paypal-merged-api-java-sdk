/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.BadRequestMessageEnum;
import com.paypal.sandbox.apim.models.BadRequestNameEnum;
import com.paypal.sandbox.apim.models.ErrorDetails1;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for BadRequestError1Exception type.
 */
public class BadRequestError1Exception extends ApiException {
    private static final long serialVersionUID = 7260805875936991657L;
    private BadRequestNameEnum name;
    private BadRequestMessageEnum message;
    private List<ErrorDetails1> issues;
    private String debugId;
    private String informationLink;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public BadRequestError1Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Name.
     * @return Returns the BadRequestNameEnum
     */
    @JsonGetter("name")
    public BadRequestNameEnum getName() {
        return this.name;
    }

    /**
     * Setter for Name.
     * @param name Value for BadRequestNameEnum
     */
    @JsonSetter("name")
    private void setName(BadRequestNameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the BadRequestMessageEnum
     */
    @JsonGetter("message")
    public BadRequestMessageEnum getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param messageField Value for BadRequestMessageEnum
     */
    @JsonSetter("message")
    private void setMessageField(BadRequestMessageEnum messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails1
     */
    @JsonGetter("issues")
    public List<ErrorDetails1> getIssues() {
        return this.issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails1
     */
    @JsonSetter("issues")
    private void setIssues(List<ErrorDetails1> issues) {
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
