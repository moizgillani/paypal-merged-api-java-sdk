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
 * This is a model class for TrackerDetails type.
 */
public class TrackerDetails {
    private String id;
    private Object status;
    private List<TrackerItem> items;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public TrackerDetails() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  status  Object value for status.
     * @param  items  List of TrackerItem value for items.
     * @param  links  List of LinkDescription value for links.
     */
    public TrackerDetails(
            String id,
            Object status,
            List<TrackerItem> items,
            List<LinkDescription> links) {
        this.id = id;
        this.status = status;
        this.items = items;
        this.links = links;
    }

    /**
     * Getter for Id.
     * The tracker id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The tracker id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Status.
     * @return Returns the Object
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Object
     */
    @JsonSetter("status")
    public void setStatus(Object status) {
        this.status = status;
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
     * Getter for Links.
     * An array of request-related HATEOAS links.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related HATEOAS links.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Converts this TrackerDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TrackerDetails [" + "id=" + id + ", status=" + status + ", items=" + items
                + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link TrackerDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TrackerDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .status(getStatus())
                .items(getItems())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link TrackerDetails}.
     */
    public static class Builder {
        private String id;
        private Object status;
        private List<TrackerItem> items;
        private List<LinkDescription> links;



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
         * Setter for status.
         * @param  status  Object value for status.
         * @return Builder
         */
        public Builder status(Object status) {
            this.status = status;
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
         * Setter for links.
         * @param  links  List of LinkDescription value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescription> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link TrackerDetails} object using the set fields.
         * @return {@link TrackerDetails}
         */
        public TrackerDetails build() {
            return new TrackerDetails(id, status, items, links);
        }
    }
}
