/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.paypal.sandbox.apim.ApiHelper;
import com.paypal.sandbox.apim.models.TRACKERIDNOTFOUND;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = OrdersTrackersPatch404IssuesItems.OrdersTrackersPatch404IssuesItemsDeserializer.class)
public abstract class OrdersTrackersPatch404IssuesItems {
    
    /**
     * This is TRACKER_ID_NOT_FOUND case.
     * @param tRACKERIDNOTFOUND TRACKERIDNOTFOUND value for tRACKERIDNOTFOUND.
     * @return The TRACKERIDNOTFOUNDCase object.
     */
    public static OrdersTrackersPatch404IssuesItems fromTRACKERIDNOTFOUND(
            TRACKERIDNOTFOUND tRACKERIDNOTFOUND) {
        return tRACKERIDNOTFOUND == null ? null : new TRACKERIDNOTFOUNDCase(tRACKERIDNOTFOUND);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R tRACKERIDNOTFOUND(TRACKERIDNOTFOUND tRACKERIDNOTFOUND);
    }

    /**
     * This is a implementation class for TRACKERIDNOTFOUNDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TRACKERIDNOTFOUND")
    private static class TRACKERIDNOTFOUNDCase extends OrdersTrackersPatch404IssuesItems {

        @JsonValue
        private TRACKERIDNOTFOUND tRACKERIDNOTFOUND;

        TRACKERIDNOTFOUNDCase(TRACKERIDNOTFOUND tRACKERIDNOTFOUND) {
            this.tRACKERIDNOTFOUND = tRACKERIDNOTFOUND;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tRACKERIDNOTFOUND(this.tRACKERIDNOTFOUND);
        }

        @JsonCreator
        private TRACKERIDNOTFOUNDCase(JsonNode jsonNode) throws IOException {
            this.tRACKERIDNOTFOUND = ApiHelper.deserialize(jsonNode,
                TRACKERIDNOTFOUND.class);
        }

        @Override
        public String toString() {
            return tRACKERIDNOTFOUND.toString();
        }
    }

    /**
     * This is a custom deserializer class for OrdersTrackersPatch404IssuesItems.
     */
    protected static class OrdersTrackersPatch404IssuesItemsDeserializer
            extends JsonDeserializer<OrdersTrackersPatch404IssuesItems> {

        @Override
        public OrdersTrackersPatch404IssuesItems deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(TRACKERIDNOTFOUNDCase.class), false);
        }
    }

}