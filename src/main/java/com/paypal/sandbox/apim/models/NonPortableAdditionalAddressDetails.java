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
 * This is a model class for NonPortableAdditionalAddressDetails type.
 */
public class NonPortableAdditionalAddressDetails {
    private String streetNumber;
    private String streetName;
    private String streetType;
    private String deliveryService;
    private String buildingName;
    private String subBuilding;

    /**
     * Default constructor.
     */
    public NonPortableAdditionalAddressDetails() {
    }

    /**
     * Initialization constructor.
     * @param  streetNumber  String value for streetNumber.
     * @param  streetName  String value for streetName.
     * @param  streetType  String value for streetType.
     * @param  deliveryService  String value for deliveryService.
     * @param  buildingName  String value for buildingName.
     * @param  subBuilding  String value for subBuilding.
     */
    public NonPortableAdditionalAddressDetails(
            String streetNumber,
            String streetName,
            String streetType,
            String deliveryService,
            String buildingName,
            String subBuilding) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.streetType = streetType;
        this.deliveryService = deliveryService;
        this.buildingName = buildingName;
        this.subBuilding = subBuilding;
    }

    /**
     * Getter for StreetNumber.
     * The street number.
     * @return Returns the String
     */
    @JsonGetter("street_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Setter for StreetNumber.
     * The street number.
     * @param streetNumber Value for String
     */
    @JsonSetter("street_number")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * Getter for StreetName.
     * The street name. Just `Drury` in `Drury Lane`.
     * @return Returns the String
     */
    @JsonGetter("street_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreetName() {
        return streetName;
    }

    /**
     * Setter for StreetName.
     * The street name. Just `Drury` in `Drury Lane`.
     * @param streetName Value for String
     */
    @JsonSetter("street_name")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Getter for StreetType.
     * The street type. For example, avenue, boulevard, road, or expressway.
     * @return Returns the String
     */
    @JsonGetter("street_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreetType() {
        return streetType;
    }

    /**
     * Setter for StreetType.
     * The street type. For example, avenue, boulevard, road, or expressway.
     * @param streetType Value for String
     */
    @JsonSetter("street_type")
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    /**
     * Getter for DeliveryService.
     * The delivery service. Post office box, bag number, or post office name.
     * @return Returns the String
     */
    @JsonGetter("delivery_service")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryService() {
        return deliveryService;
    }

    /**
     * Setter for DeliveryService.
     * The delivery service. Post office box, bag number, or post office name.
     * @param deliveryService Value for String
     */
    @JsonSetter("delivery_service")
    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    /**
     * Getter for BuildingName.
     * A named locations that represents the premise. Usually a building name or number or
     * collection of buildings with a common name or number. For example, &lt;code&gt;Craven House&lt;/code&gt;.
     * @return Returns the String
     */
    @JsonGetter("building_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Setter for BuildingName.
     * A named locations that represents the premise. Usually a building name or number or
     * collection of buildings with a common name or number. For example, &lt;code&gt;Craven House&lt;/code&gt;.
     * @param buildingName Value for String
     */
    @JsonSetter("building_name")
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Getter for SubBuilding.
     * The first-order entity below a named building or location that represents the sub-premises.
     * Usually a single building within a collection of buildings with a common name. Can be a flat,
     * story, floor, room, or apartment.
     * @return Returns the String
     */
    @JsonGetter("sub_building")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubBuilding() {
        return subBuilding;
    }

    /**
     * Setter for SubBuilding.
     * The first-order entity below a named building or location that represents the sub-premises.
     * Usually a single building within a collection of buildings with a common name. Can be a flat,
     * story, floor, room, or apartment.
     * @param subBuilding Value for String
     */
    @JsonSetter("sub_building")
    public void setSubBuilding(String subBuilding) {
        this.subBuilding = subBuilding;
    }

    /**
     * Converts this NonPortableAdditionalAddressDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NonPortableAdditionalAddressDetails [" + "streetNumber=" + streetNumber
                + ", streetName=" + streetName + ", streetType=" + streetType + ", deliveryService="
                + deliveryService + ", buildingName=" + buildingName + ", subBuilding="
                + subBuilding + "]";
    }

    /**
     * Builds a new {@link NonPortableAdditionalAddressDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NonPortableAdditionalAddressDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .streetNumber(getStreetNumber())
                .streetName(getStreetName())
                .streetType(getStreetType())
                .deliveryService(getDeliveryService())
                .buildingName(getBuildingName())
                .subBuilding(getSubBuilding());
        return builder;
    }

    /**
     * Class to build instances of {@link NonPortableAdditionalAddressDetails}.
     */
    public static class Builder {
        private String streetNumber;
        private String streetName;
        private String streetType;
        private String deliveryService;
        private String buildingName;
        private String subBuilding;



        /**
         * Setter for streetNumber.
         * @param  streetNumber  String value for streetNumber.
         * @return Builder
         */
        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        /**
         * Setter for streetName.
         * @param  streetName  String value for streetName.
         * @return Builder
         */
        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        /**
         * Setter for streetType.
         * @param  streetType  String value for streetType.
         * @return Builder
         */
        public Builder streetType(String streetType) {
            this.streetType = streetType;
            return this;
        }

        /**
         * Setter for deliveryService.
         * @param  deliveryService  String value for deliveryService.
         * @return Builder
         */
        public Builder deliveryService(String deliveryService) {
            this.deliveryService = deliveryService;
            return this;
        }

        /**
         * Setter for buildingName.
         * @param  buildingName  String value for buildingName.
         * @return Builder
         */
        public Builder buildingName(String buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        /**
         * Setter for subBuilding.
         * @param  subBuilding  String value for subBuilding.
         * @return Builder
         */
        public Builder subBuilding(String subBuilding) {
            this.subBuilding = subBuilding;
            return this;
        }

        /**
         * Builds a new {@link NonPortableAdditionalAddressDetails} object using the set fields.
         * @return {@link NonPortableAdditionalAddressDetails}
         */
        public NonPortableAdditionalAddressDetails build() {
            return new NonPortableAdditionalAddressDetails(streetNumber, streetName, streetType,
                    deliveryService, buildingName, subBuilding);
        }
    }
}