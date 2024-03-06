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
 * This is a model class for OrderTrackerRequest type.
 */
public class OrderTrackerRequest {
    private String transactionId;
    private String trackingNumber;
    private ShipmentTrackingNumberTypeEnum trackingNumberType;
    private ShipmentTrackingStatusEnum status;
    private String shipmentDate;
    private CarrierEnum carrier;
    private String carrierNameOther;
    private String postagePaymentId;
    private Boolean notifyBuyer;
    private Integer quantity;
    private Boolean trackingNumberValidated;
    private String lastUpdatedTime;
    private ShipmentTrackerShipmentDirectionEnum shipmentDirection;
    private ShipmentTrackerShipmentUploaderEnum shipmentUploader;
    private String captureId;
    private Boolean notifyPayer;
    private List<TrackerItem> items;

    /**
     * Default constructor.
     */
    public OrderTrackerRequest() {
        notifyBuyer = false;
        notifyPayer = false;
    }

    /**
     * Initialization constructor.
     * @param  transactionId  String value for transactionId.
     * @param  status  ShipmentTrackingStatusEnum value for status.
     * @param  captureId  String value for captureId.
     * @param  trackingNumber  String value for trackingNumber.
     * @param  trackingNumberType  ShipmentTrackingNumberTypeEnum value for trackingNumberType.
     * @param  shipmentDate  String value for shipmentDate.
     * @param  carrier  CarrierEnum value for carrier.
     * @param  carrierNameOther  String value for carrierNameOther.
     * @param  postagePaymentId  String value for postagePaymentId.
     * @param  notifyBuyer  Boolean value for notifyBuyer.
     * @param  quantity  Integer value for quantity.
     * @param  trackingNumberValidated  Boolean value for trackingNumberValidated.
     * @param  lastUpdatedTime  String value for lastUpdatedTime.
     * @param  shipmentDirection  ShipmentTrackerShipmentDirectionEnum value for shipmentDirection.
     * @param  shipmentUploader  ShipmentTrackerShipmentUploaderEnum value for shipmentUploader.
     * @param  notifyPayer  Boolean value for notifyPayer.
     * @param  items  List of TrackerItem value for items.
     */
    public OrderTrackerRequest(
            String transactionId,
            ShipmentTrackingStatusEnum status,
            String captureId,
            String trackingNumber,
            ShipmentTrackingNumberTypeEnum trackingNumberType,
            String shipmentDate,
            CarrierEnum carrier,
            String carrierNameOther,
            String postagePaymentId,
            Boolean notifyBuyer,
            Integer quantity,
            Boolean trackingNumberValidated,
            String lastUpdatedTime,
            ShipmentTrackerShipmentDirectionEnum shipmentDirection,
            ShipmentTrackerShipmentUploaderEnum shipmentUploader,
            Boolean notifyPayer,
            List<TrackerItem> items) {
        this.transactionId = transactionId;
        this.trackingNumber = trackingNumber;
        this.trackingNumberType = trackingNumberType;
        this.status = status;
        this.shipmentDate = shipmentDate;
        this.carrier = carrier;
        this.carrierNameOther = carrierNameOther;
        this.postagePaymentId = postagePaymentId;
        this.notifyBuyer = notifyBuyer;
        this.quantity = quantity;
        this.trackingNumberValidated = trackingNumberValidated;
        this.lastUpdatedTime = lastUpdatedTime;
        this.shipmentDirection = shipmentDirection;
        this.shipmentUploader = shipmentUploader;
        this.captureId = captureId;
        this.notifyPayer = notifyPayer;
        this.items = items;
    }

    /**
     * Getter for TransactionId.
     * The PayPal transaction ID.
     * @return Returns the String
     */
    @JsonGetter("transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The PayPal transaction ID.
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for TrackingNumber.
     * The tracking number for the shipment. This property supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("tracking_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Setter for TrackingNumber.
     * The tracking number for the shipment. This property supports Unicode.
     * @param trackingNumber Value for String
     */
    @JsonSetter("tracking_number")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * Getter for TrackingNumberType.
     * The type of tracking number.
     * @return Returns the ShipmentTrackingNumberTypeEnum
     */
    @JsonGetter("tracking_number_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShipmentTrackingNumberTypeEnum getTrackingNumberType() {
        return trackingNumberType;
    }

    /**
     * Setter for TrackingNumberType.
     * The type of tracking number.
     * @param trackingNumberType Value for ShipmentTrackingNumberTypeEnum
     */
    @JsonSetter("tracking_number_type")
    public void setTrackingNumberType(ShipmentTrackingNumberTypeEnum trackingNumberType) {
        this.trackingNumberType = trackingNumberType;
    }

    /**
     * Getter for Status.
     * The status of the item shipment. For allowed values, see &lt;a
     * href="/docs/tracking/reference/shipping-status/"&gt;Shipping Statuses&lt;/a&gt;.
     * @return Returns the ShipmentTrackingStatusEnum
     */
    @JsonGetter("status")
    public ShipmentTrackingStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the item shipment. For allowed values, see &lt;a
     * href="/docs/tracking/reference/shipping-status/"&gt;Shipping Statuses&lt;/a&gt;.
     * @param status Value for ShipmentTrackingStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(ShipmentTrackingStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for ShipmentDate.
     * The date when the shipment occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("shipment_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Setter for ShipmentDate.
     * The date when the shipment occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param shipmentDate Value for String
     */
    @JsonSetter("shipment_date")
    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    /**
     * Getter for Carrier.
     * The carrier for the shipment. Some carriers have a global version as well as local
     * subsidiaries. The subsidiaries are repeated over many countries and might also have an entry
     * in the global list. Choose the carrier for your country. If the carrier is not available for
     * your country, choose the global version of the carrier. If your carrier name is not in the
     * list, set `carrier` to `OTHER` and set carrier name in `carrier_name_other`. For allowed
     * values, see &lt;a href="/docs/tracking/reference/carriers/"&gt;Carriers&lt;/a&gt;.
     * @return Returns the CarrierEnum
     */
    @JsonGetter("carrier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CarrierEnum getCarrier() {
        return carrier;
    }

    /**
     * Setter for Carrier.
     * The carrier for the shipment. Some carriers have a global version as well as local
     * subsidiaries. The subsidiaries are repeated over many countries and might also have an entry
     * in the global list. Choose the carrier for your country. If the carrier is not available for
     * your country, choose the global version of the carrier. If your carrier name is not in the
     * list, set `carrier` to `OTHER` and set carrier name in `carrier_name_other`. For allowed
     * values, see &lt;a href="/docs/tracking/reference/carriers/"&gt;Carriers&lt;/a&gt;.
     * @param carrier Value for CarrierEnum
     */
    @JsonSetter("carrier")
    public void setCarrier(CarrierEnum carrier) {
        this.carrier = carrier;
    }

    /**
     * Getter for CarrierNameOther.
     * The name of the carrier for the shipment. Provide this value only if the carrier parameter is
     * OTHER. This property supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("carrier_name_other")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierNameOther() {
        return carrierNameOther;
    }

    /**
     * Setter for CarrierNameOther.
     * The name of the carrier for the shipment. Provide this value only if the carrier parameter is
     * OTHER. This property supports Unicode.
     * @param carrierNameOther Value for String
     */
    @JsonSetter("carrier_name_other")
    public void setCarrierNameOther(String carrierNameOther) {
        this.carrierNameOther = carrierNameOther;
    }

    /**
     * Getter for PostagePaymentId.
     * The postage payment ID. This property supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("postage_payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostagePaymentId() {
        return postagePaymentId;
    }

    /**
     * Setter for PostagePaymentId.
     * The postage payment ID. This property supports Unicode.
     * @param postagePaymentId Value for String
     */
    @JsonSetter("postage_payment_id")
    public void setPostagePaymentId(String postagePaymentId) {
        this.postagePaymentId = postagePaymentId;
    }

    /**
     * Getter for NotifyBuyer.
     * If true, sends an email notification to the buyer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @return Returns the Boolean
     */
    @JsonGetter("notify_buyer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyBuyer() {
        return notifyBuyer;
    }

    /**
     * Setter for NotifyBuyer.
     * If true, sends an email notification to the buyer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @param notifyBuyer Value for Boolean
     */
    @JsonSetter("notify_buyer")
    public void setNotifyBuyer(Boolean notifyBuyer) {
        this.notifyBuyer = notifyBuyer;
    }

    /**
     * Getter for Quantity.
     * The quantity of items shipped.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The quantity of items shipped.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for TrackingNumberValidated.
     * Indicates whether the carrier validated the tracking number.
     * @return Returns the Boolean
     */
    @JsonGetter("tracking_number_validated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTrackingNumberValidated() {
        return trackingNumberValidated;
    }

    /**
     * Setter for TrackingNumberValidated.
     * Indicates whether the carrier validated the tracking number.
     * @param trackingNumberValidated Value for Boolean
     */
    @JsonSetter("tracking_number_validated")
    public void setTrackingNumberValidated(Boolean trackingNumberValidated) {
        this.trackingNumberValidated = trackingNumberValidated;
    }

    /**
     * Getter for LastUpdatedTime.
     * The date and time when the tracking information was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("last_updated_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Setter for LastUpdatedTime.
     * The date and time when the tracking information was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param lastUpdatedTime Value for String
     */
    @JsonSetter("last_updated_time")
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * Getter for ShipmentDirection.
     * To denote whether the shipment is sent forward to the receiver or returned back.
     * @return Returns the ShipmentTrackerShipmentDirectionEnum
     */
    @JsonGetter("shipment_direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShipmentTrackerShipmentDirectionEnum getShipmentDirection() {
        return shipmentDirection;
    }

    /**
     * Setter for ShipmentDirection.
     * To denote whether the shipment is sent forward to the receiver or returned back.
     * @param shipmentDirection Value for ShipmentTrackerShipmentDirectionEnum
     */
    @JsonSetter("shipment_direction")
    public void setShipmentDirection(ShipmentTrackerShipmentDirectionEnum shipmentDirection) {
        this.shipmentDirection = shipmentDirection;
    }

    /**
     * Getter for ShipmentUploader.
     * To denote which party uploaded the shipment tracking info.
     * @return Returns the ShipmentTrackerShipmentUploaderEnum
     */
    @JsonGetter("shipment_uploader")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShipmentTrackerShipmentUploaderEnum getShipmentUploader() {
        return shipmentUploader;
    }

    /**
     * Setter for ShipmentUploader.
     * To denote which party uploaded the shipment tracking info.
     * @param shipmentUploader Value for ShipmentTrackerShipmentUploaderEnum
     */
    @JsonSetter("shipment_uploader")
    public void setShipmentUploader(ShipmentTrackerShipmentUploaderEnum shipmentUploader) {
        this.shipmentUploader = shipmentUploader;
    }

    /**
     * Getter for CaptureId.
     * The PayPal capture ID.
     * @return Returns the String
     */
    @JsonGetter("capture_id")
    public String getCaptureId() {
        return captureId;
    }

    /**
     * Setter for CaptureId.
     * The PayPal capture ID.
     * @param captureId Value for String
     */
    @JsonSetter("capture_id")
    public void setCaptureId(String captureId) {
        this.captureId = captureId;
    }

    /**
     * Getter for NotifyPayer.
     * If true, sends an email notification to the payer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @return Returns the Boolean
     */
    @JsonGetter("notify_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyPayer() {
        return notifyPayer;
    }

    /**
     * Setter for NotifyPayer.
     * If true, sends an email notification to the payer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @param notifyPayer Value for Boolean
     */
    @JsonSetter("notify_payer")
    public void setNotifyPayer(Boolean notifyPayer) {
        this.notifyPayer = notifyPayer;
    }

    /**
     * Getter for Items.
     * An array of details of items in the shipment.
     * @return Returns the List of TrackerItem
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TrackerItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * An array of details of items in the shipment.
     * @param items Value for List of TrackerItem
     */
    @JsonSetter("items")
    public void setItems(List<TrackerItem> items) {
        this.items = items;
    }

    /**
     * Converts this OrderTrackerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderTrackerRequest [" + "transactionId=" + transactionId + ", status=" + status
                + ", captureId=" + captureId + ", trackingNumber=" + trackingNumber
                + ", trackingNumberType=" + trackingNumberType + ", shipmentDate=" + shipmentDate
                + ", carrier=" + carrier + ", carrierNameOther=" + carrierNameOther
                + ", postagePaymentId=" + postagePaymentId + ", notifyBuyer=" + notifyBuyer
                + ", quantity=" + quantity + ", trackingNumberValidated=" + trackingNumberValidated
                + ", lastUpdatedTime=" + lastUpdatedTime + ", shipmentDirection="
                + shipmentDirection + ", shipmentUploader=" + shipmentUploader + ", notifyPayer="
                + notifyPayer + ", items=" + items + "]";
    }

    /**
     * Builds a new {@link OrderTrackerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderTrackerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transactionId, status, captureId)
                .trackingNumber(getTrackingNumber())
                .trackingNumberType(getTrackingNumberType())
                .shipmentDate(getShipmentDate())
                .carrier(getCarrier())
                .carrierNameOther(getCarrierNameOther())
                .postagePaymentId(getPostagePaymentId())
                .notifyBuyer(getNotifyBuyer())
                .quantity(getQuantity())
                .trackingNumberValidated(getTrackingNumberValidated())
                .lastUpdatedTime(getLastUpdatedTime())
                .shipmentDirection(getShipmentDirection())
                .shipmentUploader(getShipmentUploader())
                .notifyPayer(getNotifyPayer())
                .items(getItems());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderTrackerRequest}.
     */
    public static class Builder {
        private String transactionId;
        private ShipmentTrackingStatusEnum status;
        private String captureId;
        private String trackingNumber;
        private ShipmentTrackingNumberTypeEnum trackingNumberType;
        private String shipmentDate;
        private CarrierEnum carrier;
        private String carrierNameOther;
        private String postagePaymentId;
        private Boolean notifyBuyer = false;
        private Integer quantity;
        private Boolean trackingNumberValidated;
        private String lastUpdatedTime;
        private ShipmentTrackerShipmentDirectionEnum shipmentDirection;
        private ShipmentTrackerShipmentUploaderEnum shipmentUploader;
        private Boolean notifyPayer = false;
        private List<TrackerItem> items;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transactionId  String value for transactionId.
         * @param  status  ShipmentTrackingStatusEnum value for status.
         * @param  captureId  String value for captureId.
         */
        public Builder(String transactionId, ShipmentTrackingStatusEnum status, String captureId) {
            this.transactionId = transactionId;
            this.status = status;
            this.captureId = captureId;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  ShipmentTrackingStatusEnum value for status.
         * @return Builder
         */
        public Builder status(ShipmentTrackingStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for captureId.
         * @param  captureId  String value for captureId.
         * @return Builder
         */
        public Builder captureId(String captureId) {
            this.captureId = captureId;
            return this;
        }

        /**
         * Setter for trackingNumber.
         * @param  trackingNumber  String value for trackingNumber.
         * @return Builder
         */
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
            return this;
        }

        /**
         * Setter for trackingNumberType.
         * @param  trackingNumberType  ShipmentTrackingNumberTypeEnum value for trackingNumberType.
         * @return Builder
         */
        public Builder trackingNumberType(ShipmentTrackingNumberTypeEnum trackingNumberType) {
            this.trackingNumberType = trackingNumberType;
            return this;
        }

        /**
         * Setter for shipmentDate.
         * @param  shipmentDate  String value for shipmentDate.
         * @return Builder
         */
        public Builder shipmentDate(String shipmentDate) {
            this.shipmentDate = shipmentDate;
            return this;
        }

        /**
         * Setter for carrier.
         * @param  carrier  CarrierEnum value for carrier.
         * @return Builder
         */
        public Builder carrier(CarrierEnum carrier) {
            this.carrier = carrier;
            return this;
        }

        /**
         * Setter for carrierNameOther.
         * @param  carrierNameOther  String value for carrierNameOther.
         * @return Builder
         */
        public Builder carrierNameOther(String carrierNameOther) {
            this.carrierNameOther = carrierNameOther;
            return this;
        }

        /**
         * Setter for postagePaymentId.
         * @param  postagePaymentId  String value for postagePaymentId.
         * @return Builder
         */
        public Builder postagePaymentId(String postagePaymentId) {
            this.postagePaymentId = postagePaymentId;
            return this;
        }

        /**
         * Setter for notifyBuyer.
         * @param  notifyBuyer  Boolean value for notifyBuyer.
         * @return Builder
         */
        public Builder notifyBuyer(Boolean notifyBuyer) {
            this.notifyBuyer = notifyBuyer;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for trackingNumberValidated.
         * @param  trackingNumberValidated  Boolean value for trackingNumberValidated.
         * @return Builder
         */
        public Builder trackingNumberValidated(Boolean trackingNumberValidated) {
            this.trackingNumberValidated = trackingNumberValidated;
            return this;
        }

        /**
         * Setter for lastUpdatedTime.
         * @param  lastUpdatedTime  String value for lastUpdatedTime.
         * @return Builder
         */
        public Builder lastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        /**
         * Setter for shipmentDirection.
         * @param  shipmentDirection  ShipmentTrackerShipmentDirectionEnum value for
         *         shipmentDirection.
         * @return Builder
         */
        public Builder shipmentDirection(ShipmentTrackerShipmentDirectionEnum shipmentDirection) {
            this.shipmentDirection = shipmentDirection;
            return this;
        }

        /**
         * Setter for shipmentUploader.
         * @param  shipmentUploader  ShipmentTrackerShipmentUploaderEnum value for shipmentUploader.
         * @return Builder
         */
        public Builder shipmentUploader(ShipmentTrackerShipmentUploaderEnum shipmentUploader) {
            this.shipmentUploader = shipmentUploader;
            return this;
        }

        /**
         * Setter for notifyPayer.
         * @param  notifyPayer  Boolean value for notifyPayer.
         * @return Builder
         */
        public Builder notifyPayer(Boolean notifyPayer) {
            this.notifyPayer = notifyPayer;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of TrackerItem value for items.
         * @return Builder
         */
        public Builder items(List<TrackerItem> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link OrderTrackerRequest} object using the set fields.
         * @return {@link OrderTrackerRequest}
         */
        public OrderTrackerRequest build() {
            return new OrderTrackerRequest(transactionId, status, captureId, trackingNumber,
                    trackingNumberType, shipmentDate, carrier, carrierNameOther, postagePaymentId,
                    notifyBuyer, quantity, trackingNumberValidated, lastUpdatedTime,
                    shipmentDirection, shipmentUploader, notifyPayer, items);
        }
    }
}
