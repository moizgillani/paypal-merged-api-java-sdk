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
 * This is a model class for AdditionalCapture type.
 */
public class AdditionalCapture {
    private CaptureStatus1Enum status;
    private CaptureStatusDetailsPayments statusDetails;
    private String id;
    private Money amount;
    private String invoiceId;
    private String customId;
    private NetworkTransactionReferencePayments networkTransactionReference;
    private SellerProtectionPayments sellerProtection;
    private Boolean finalCapture;
    private SellerReceivableBreakdown sellerReceivableBreakdown;
    private DisbursementModeEnum disbursementMode;
    private List<LinkDescriptionPayments> links;
    private ProcessorResponsePayments processorResponse;
    private String createTime;
    private String updateTime;
    private SupplementaryDataPayments supplementaryData;
    private SupplementaryDataPayments payee;

    /**
     * Default constructor.
     */
    public AdditionalCapture() {
        finalCapture = false;
        disbursementMode = DisbursementModeEnum.INSTANT;
    }

    /**
     * Initialization constructor.
     * @param  status  CaptureStatus1Enum value for status.
     * @param  statusDetails  CaptureStatusDetailsPayments value for statusDetails.
     * @param  id  String value for id.
     * @param  amount  Money value for amount.
     * @param  invoiceId  String value for invoiceId.
     * @param  customId  String value for customId.
     * @param  networkTransactionReference  NetworkTransactionReferencePayments value for
     *         networkTransactionReference.
     * @param  sellerProtection  SellerProtectionPayments value for sellerProtection.
     * @param  finalCapture  Boolean value for finalCapture.
     * @param  sellerReceivableBreakdown  SellerReceivableBreakdown value for
     *         sellerReceivableBreakdown.
     * @param  disbursementMode  DisbursementModeEnum value for disbursementMode.
     * @param  links  List of LinkDescriptionPayments value for links.
     * @param  processorResponse  ProcessorResponsePayments value for processorResponse.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     * @param  supplementaryData  SupplementaryDataPayments value for supplementaryData.
     * @param  payee  SupplementaryDataPayments value for payee.
     */
    public AdditionalCapture(
            CaptureStatus1Enum status,
            CaptureStatusDetailsPayments statusDetails,
            String id,
            Money amount,
            String invoiceId,
            String customId,
            NetworkTransactionReferencePayments networkTransactionReference,
            SellerProtectionPayments sellerProtection,
            Boolean finalCapture,
            SellerReceivableBreakdown sellerReceivableBreakdown,
            DisbursementModeEnum disbursementMode,
            List<LinkDescriptionPayments> links,
            ProcessorResponsePayments processorResponse,
            String createTime,
            String updateTime,
            SupplementaryDataPayments supplementaryData,
            SupplementaryDataPayments payee) {
        this.status = status;
        this.statusDetails = statusDetails;
        this.id = id;
        this.amount = amount;
        this.invoiceId = invoiceId;
        this.customId = customId;
        this.networkTransactionReference = networkTransactionReference;
        this.sellerProtection = sellerProtection;
        this.finalCapture = finalCapture;
        this.sellerReceivableBreakdown = sellerReceivableBreakdown;
        this.disbursementMode = disbursementMode;
        this.links = links;
        this.processorResponse = processorResponse;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.supplementaryData = supplementaryData;
        this.payee = payee;
    }

    /**
     * Getter for Status.
     * The status of the captured payment.
     * @return Returns the CaptureStatus1Enum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatus1Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the captured payment.
     * @param status Value for CaptureStatus1Enum
     */
    @JsonSetter("status")
    public void setStatus(CaptureStatus1Enum status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the captured payment status.
     * @return Returns the CaptureStatusDetailsPayments
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatusDetailsPayments getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the captured payment status.
     * @param statusDetails Value for CaptureStatusDetailsPayments
     */
    @JsonSetter("status_details")
    public void setStatusDetails(CaptureStatusDetailsPayments statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the captured payment.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the captured payment.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * The amount for this captured payment.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount for this captured payment.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Getter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @return Returns the String
     */
    @JsonGetter("custom_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomId() {
        return customId;
    }

    /**
     * Setter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @param customId Value for String
     */
    @JsonSetter("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * Getter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @return Returns the NetworkTransactionReferencePayments
     */
    @JsonGetter("network_transaction_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkTransactionReferencePayments getNetworkTransactionReference() {
        return networkTransactionReference;
    }

    /**
     * Setter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @param networkTransactionReference Value for NetworkTransactionReferencePayments
     */
    @JsonSetter("network_transaction_reference")
    public void setNetworkTransactionReference(NetworkTransactionReferencePayments networkTransactionReference) {
        this.networkTransactionReference = networkTransactionReference;
    }

    /**
     * Getter for SellerProtection.
     * @return Returns the SellerProtectionPayments
     */
    @JsonGetter("seller_protection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerProtectionPayments getSellerProtection() {
        return sellerProtection;
    }

    /**
     * Setter for SellerProtection.
     * @param sellerProtection Value for SellerProtectionPayments
     */
    @JsonSetter("seller_protection")
    public void setSellerProtection(SellerProtectionPayments sellerProtection) {
        this.sellerProtection = sellerProtection;
    }

    /**
     * Getter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @return Returns the Boolean
     */
    @JsonGetter("final_capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFinalCapture() {
        return finalCapture;
    }

    /**
     * Setter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @param finalCapture Value for Boolean
     */
    @JsonSetter("final_capture")
    public void setFinalCapture(Boolean finalCapture) {
        this.finalCapture = finalCapture;
    }

    /**
     * Getter for SellerReceivableBreakdown.
     * @return Returns the SellerReceivableBreakdown
     */
    @JsonGetter("seller_receivable_breakdown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerReceivableBreakdown getSellerReceivableBreakdown() {
        return sellerReceivableBreakdown;
    }

    /**
     * Setter for SellerReceivableBreakdown.
     * @param sellerReceivableBreakdown Value for SellerReceivableBreakdown
     */
    @JsonSetter("seller_receivable_breakdown")
    public void setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) {
        this.sellerReceivableBreakdown = sellerReceivableBreakdown;
    }

    /**
     * Getter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @return Returns the DisbursementModeEnum
     */
    @JsonGetter("disbursement_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DisbursementModeEnum getDisbursementMode() {
        return disbursementMode;
    }

    /**
     * Setter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @param disbursementMode Value for DisbursementModeEnum
     */
    @JsonSetter("disbursement_mode")
    public void setDisbursementMode(DisbursementModeEnum disbursementMode) {
        this.disbursementMode = disbursementMode;
    }

    /**
     * Getter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @return Returns the List of LinkDescriptionPayments
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescriptionPayments> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @param links Value for List of LinkDescriptionPayments
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescriptionPayments> links) {
        this.links = links;
    }

    /**
     * Getter for ProcessorResponse.
     * An object that provides additional processor information for a direct credit card
     * transaction.
     * @return Returns the ProcessorResponsePayments
     */
    @JsonGetter("processor_response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessorResponsePayments getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Setter for ProcessorResponse.
     * An object that provides additional processor information for a direct credit card
     * transaction.
     * @param processorResponse Value for ProcessorResponsePayments
     */
    @JsonSetter("processor_response")
    public void setProcessorResponse(ProcessorResponsePayments processorResponse) {
        this.processorResponse = processorResponse;
    }

    /**
     * Getter for CreateTime.
     * The date and time when the transaction occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("create_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * The date and time when the transaction occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param createTime Value for String
     */
    @JsonSetter("create_time")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for UpdateTime.
     * The date and time when the transaction was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time when the transaction was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param updateTime Value for String
     */
    @JsonSetter("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Getter for SupplementaryData.
     * An object that provides supplementary/additional data related to a payment transaction.
     * @return Returns the SupplementaryDataPayments
     */
    @JsonGetter("supplementary_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplementaryDataPayments getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * Setter for SupplementaryData.
     * An object that provides supplementary/additional data related to a payment transaction.
     * @param supplementaryData Value for SupplementaryDataPayments
     */
    @JsonSetter("supplementary_data")
    public void setSupplementaryData(SupplementaryDataPayments supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    /**
     * Getter for Payee.
     * The details associated with the merchant for this transaction.
     * @return Returns the SupplementaryDataPayments
     */
    @JsonGetter("payee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplementaryDataPayments getPayee() {
        return payee;
    }

    /**
     * Setter for Payee.
     * The details associated with the merchant for this transaction.
     * @param payee Value for SupplementaryDataPayments
     */
    @JsonSetter("payee")
    public void setPayee(SupplementaryDataPayments payee) {
        this.payee = payee;
    }

    /**
     * Converts this AdditionalCapture into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdditionalCapture [" + "status=" + status + ", statusDetails=" + statusDetails
                + ", id=" + id + ", amount=" + amount + ", invoiceId=" + invoiceId + ", customId="
                + customId + ", networkTransactionReference=" + networkTransactionReference
                + ", sellerProtection=" + sellerProtection + ", finalCapture=" + finalCapture
                + ", sellerReceivableBreakdown=" + sellerReceivableBreakdown + ", disbursementMode="
                + disbursementMode + ", links=" + links + ", processorResponse=" + processorResponse
                + ", createTime=" + createTime + ", updateTime=" + updateTime
                + ", supplementaryData=" + supplementaryData + ", payee=" + payee + "]";
    }

    /**
     * Builds a new {@link AdditionalCapture.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AdditionalCapture.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails())
                .id(getId())
                .amount(getAmount())
                .invoiceId(getInvoiceId())
                .customId(getCustomId())
                .networkTransactionReference(getNetworkTransactionReference())
                .sellerProtection(getSellerProtection())
                .finalCapture(getFinalCapture())
                .sellerReceivableBreakdown(getSellerReceivableBreakdown())
                .disbursementMode(getDisbursementMode())
                .links(getLinks())
                .processorResponse(getProcessorResponse())
                .createTime(getCreateTime())
                .updateTime(getUpdateTime())
                .supplementaryData(getSupplementaryData())
                .payee(getPayee());
        return builder;
    }

    /**
     * Class to build instances of {@link AdditionalCapture}.
     */
    public static class Builder {
        private CaptureStatus1Enum status;
        private CaptureStatusDetailsPayments statusDetails;
        private String id;
        private Money amount;
        private String invoiceId;
        private String customId;
        private NetworkTransactionReferencePayments networkTransactionReference;
        private SellerProtectionPayments sellerProtection;
        private Boolean finalCapture = false;
        private SellerReceivableBreakdown sellerReceivableBreakdown;
        private DisbursementModeEnum disbursementMode = DisbursementModeEnum.INSTANT;
        private List<LinkDescriptionPayments> links;
        private ProcessorResponsePayments processorResponse;
        private String createTime;
        private String updateTime;
        private SupplementaryDataPayments supplementaryData;
        private SupplementaryDataPayments payee;



        /**
         * Setter for status.
         * @param  status  CaptureStatus1Enum value for status.
         * @return Builder
         */
        public Builder status(CaptureStatus1Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  CaptureStatusDetailsPayments value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(CaptureStatusDetailsPayments statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for customId.
         * @param  customId  String value for customId.
         * @return Builder
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * Setter for networkTransactionReference.
         * @param  networkTransactionReference  NetworkTransactionReferencePayments value for
         *         networkTransactionReference.
         * @return Builder
         */
        public Builder networkTransactionReference(
                NetworkTransactionReferencePayments networkTransactionReference) {
            this.networkTransactionReference = networkTransactionReference;
            return this;
        }

        /**
         * Setter for sellerProtection.
         * @param  sellerProtection  SellerProtectionPayments value for sellerProtection.
         * @return Builder
         */
        public Builder sellerProtection(SellerProtectionPayments sellerProtection) {
            this.sellerProtection = sellerProtection;
            return this;
        }

        /**
         * Setter for finalCapture.
         * @param  finalCapture  Boolean value for finalCapture.
         * @return Builder
         */
        public Builder finalCapture(Boolean finalCapture) {
            this.finalCapture = finalCapture;
            return this;
        }

        /**
         * Setter for sellerReceivableBreakdown.
         * @param  sellerReceivableBreakdown  SellerReceivableBreakdown value for
         *         sellerReceivableBreakdown.
         * @return Builder
         */
        public Builder sellerReceivableBreakdown(
                SellerReceivableBreakdown sellerReceivableBreakdown) {
            this.sellerReceivableBreakdown = sellerReceivableBreakdown;
            return this;
        }

        /**
         * Setter for disbursementMode.
         * @param  disbursementMode  DisbursementModeEnum value for disbursementMode.
         * @return Builder
         */
        public Builder disbursementMode(DisbursementModeEnum disbursementMode) {
            this.disbursementMode = disbursementMode;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of LinkDescriptionPayments value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescriptionPayments> links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for processorResponse.
         * @param  processorResponse  ProcessorResponsePayments value for processorResponse.
         * @return Builder
         */
        public Builder processorResponse(ProcessorResponsePayments processorResponse) {
            this.processorResponse = processorResponse;
            return this;
        }

        /**
         * Setter for createTime.
         * @param  createTime  String value for createTime.
         * @return Builder
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Setter for supplementaryData.
         * @param  supplementaryData  SupplementaryDataPayments value for supplementaryData.
         * @return Builder
         */
        public Builder supplementaryData(SupplementaryDataPayments supplementaryData) {
            this.supplementaryData = supplementaryData;
            return this;
        }

        /**
         * Setter for payee.
         * @param  payee  SupplementaryDataPayments value for payee.
         * @return Builder
         */
        public Builder payee(SupplementaryDataPayments payee) {
            this.payee = payee;
            return this;
        }

        /**
         * Builds a new {@link AdditionalCapture} object using the set fields.
         * @return {@link AdditionalCapture}
         */
        public AdditionalCapture build() {
            return new AdditionalCapture(status, statusDetails, id, amount, invoiceId, customId,
                    networkTransactionReference, sellerProtection, finalCapture,
                    sellerReceivableBreakdown, disbursementMode, links, processorResponse,
                    createTime, updateTime, supplementaryData, payee);
        }
    }
}
