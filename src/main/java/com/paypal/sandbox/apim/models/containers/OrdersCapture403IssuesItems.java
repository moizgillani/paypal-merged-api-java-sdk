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
import com.paypal.sandbox.apim.models.CONSENTNEEDED;
import com.paypal.sandbox.apim.models.NOTELIGIBLEFORTOKENPROCESSINGERROR;
import com.paypal.sandbox.apim.models.PERMISSIONDENIEDFORDONATIONITEMSERROR;
import com.paypal.sandbox.apim.models.PERMISSIONDENIEDRESULT;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = OrdersCapture403IssuesItems.OrdersCapture403IssuesItemsDeserializer.class)
public abstract class OrdersCapture403IssuesItems {
    
    /**
     * This is CONSENT_NEEDED case.
     * @param cONSENTNEEDED CONSENTNEEDED value for cONSENTNEEDED.
     * @return The CONSENTNEEDEDCase object.
     */
    public static OrdersCapture403IssuesItems fromCONSENTNEEDED(CONSENTNEEDED cONSENTNEEDED) {
        return cONSENTNEEDED == null ? null : new CONSENTNEEDEDCase(cONSENTNEEDED);
    }

    /**
     * This is NOT_ELIGIBLE_FOR_TOKEN_PROCESSING_ERROR case.
     * @param nOTELIGIBLEFORTOKENPROCESSINGERROR NOTELIGIBLEFORTOKENPROCESSINGERROR value for nOTELIGIBLEFORTOKENPROCESSINGERROR.
     * @return The NOTELIGIBLEFORTOKENPROCESSINGERRORCase object.
     */
    public static OrdersCapture403IssuesItems fromNOTELIGIBLEFORTOKENPROCESSINGERROR(
            NOTELIGIBLEFORTOKENPROCESSINGERROR nOTELIGIBLEFORTOKENPROCESSINGERROR) {
        return nOTELIGIBLEFORTOKENPROCESSINGERROR == null ? null : new NOTELIGIBLEFORTOKENPROCESSINGERRORCase(nOTELIGIBLEFORTOKENPROCESSINGERROR);
    }

    /**
     * This is PERMISSION_DENIED_RESULT case.
     * @param pERMISSIONDENIEDRESULT PERMISSIONDENIEDRESULT value for pERMISSIONDENIEDRESULT.
     * @return The PERMISSIONDENIEDRESULTCase object.
     */
    public static OrdersCapture403IssuesItems fromPERMISSIONDENIEDRESULT(
            PERMISSIONDENIEDRESULT pERMISSIONDENIEDRESULT) {
        return pERMISSIONDENIEDRESULT == null ? null : new PERMISSIONDENIEDRESULTCase(pERMISSIONDENIEDRESULT);
    }

    /**
     * This is PERMISSION_DENIED_FOR_DONATION_ITEMS_ERROR case.
     * @param pERMISSIONDENIEDFORDONATIONITEMSERROR PERMISSIONDENIEDFORDONATIONITEMSERROR value for pERMISSIONDENIEDFORDONATIONITEMSERROR.
     * @return The PERMISSIONDENIEDFORDONATIONITEMSERRORCase object.
     */
    public static OrdersCapture403IssuesItems fromPERMISSIONDENIEDFORDONATIONITEMSERROR(
            PERMISSIONDENIEDFORDONATIONITEMSERROR pERMISSIONDENIEDFORDONATIONITEMSERROR) {
        return pERMISSIONDENIEDFORDONATIONITEMSERROR == null ? null : new PERMISSIONDENIEDFORDONATIONITEMSERRORCase(pERMISSIONDENIEDFORDONATIONITEMSERROR);
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
        R cONSENTNEEDED(CONSENTNEEDED cONSENTNEEDED);

        R nOTELIGIBLEFORTOKENPROCESSINGERROR(NOTELIGIBLEFORTOKENPROCESSINGERROR nOTELIGIBLEFORTOKENPROCESSINGERROR);

        R pERMISSIONDENIEDRESULT(PERMISSIONDENIEDRESULT pERMISSIONDENIEDRESULT);

        R pERMISSIONDENIEDFORDONATIONITEMSERROR(PERMISSIONDENIEDFORDONATIONITEMSERROR pERMISSIONDENIEDFORDONATIONITEMSERROR);
    }

    /**
     * This is a implementation class for CONSENTNEEDEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CONSENTNEEDED")
    private static class CONSENTNEEDEDCase extends OrdersCapture403IssuesItems {

        @JsonValue
        private CONSENTNEEDED cONSENTNEEDED;

        CONSENTNEEDEDCase(CONSENTNEEDED cONSENTNEEDED) {
            this.cONSENTNEEDED = cONSENTNEEDED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.cONSENTNEEDED(this.cONSENTNEEDED);
        }

        @JsonCreator
        private CONSENTNEEDEDCase(JsonNode jsonNode) throws IOException {
            this.cONSENTNEEDED = ApiHelper.deserialize(jsonNode,
                CONSENTNEEDED.class);
        }

        @Override
        public String toString() {
            return cONSENTNEEDED.toString();
        }
    }

    /**
     * This is a implementation class for NOTELIGIBLEFORTOKENPROCESSINGERRORCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "NOTELIGIBLEFORTOKENPROCESSINGERROR")
    private static class NOTELIGIBLEFORTOKENPROCESSINGERRORCase extends OrdersCapture403IssuesItems {

        @JsonValue
        private NOTELIGIBLEFORTOKENPROCESSINGERROR nOTELIGIBLEFORTOKENPROCESSINGERROR;

        NOTELIGIBLEFORTOKENPROCESSINGERRORCase(NOTELIGIBLEFORTOKENPROCESSINGERROR nOTELIGIBLEFORTOKENPROCESSINGERROR) {
            this.nOTELIGIBLEFORTOKENPROCESSINGERROR = nOTELIGIBLEFORTOKENPROCESSINGERROR;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.nOTELIGIBLEFORTOKENPROCESSINGERROR(this.nOTELIGIBLEFORTOKENPROCESSINGERROR);
        }

        @JsonCreator
        private NOTELIGIBLEFORTOKENPROCESSINGERRORCase(JsonNode jsonNode) throws IOException {
            this.nOTELIGIBLEFORTOKENPROCESSINGERROR = ApiHelper.deserialize(jsonNode,
                NOTELIGIBLEFORTOKENPROCESSINGERROR.class);
        }

        @Override
        public String toString() {
            return nOTELIGIBLEFORTOKENPROCESSINGERROR.toString();
        }
    }

    /**
     * This is a implementation class for PERMISSIONDENIEDRESULTCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PERMISSIONDENIEDRESULT")
    private static class PERMISSIONDENIEDRESULTCase extends OrdersCapture403IssuesItems {

        @JsonValue
        private PERMISSIONDENIEDRESULT pERMISSIONDENIEDRESULT;

        PERMISSIONDENIEDRESULTCase(PERMISSIONDENIEDRESULT pERMISSIONDENIEDRESULT) {
            this.pERMISSIONDENIEDRESULT = pERMISSIONDENIEDRESULT;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pERMISSIONDENIEDRESULT(this.pERMISSIONDENIEDRESULT);
        }

        @JsonCreator
        private PERMISSIONDENIEDRESULTCase(JsonNode jsonNode) throws IOException {
            this.pERMISSIONDENIEDRESULT = ApiHelper.deserialize(jsonNode,
                PERMISSIONDENIEDRESULT.class);
        }

        @Override
        public String toString() {
            return pERMISSIONDENIEDRESULT.toString();
        }
    }

    /**
     * This is a implementation class for PERMISSIONDENIEDFORDONATIONITEMSERRORCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PERMISSIONDENIEDFORDONATIONITEMSERROR")
    private static class PERMISSIONDENIEDFORDONATIONITEMSERRORCase extends OrdersCapture403IssuesItems {

        @JsonValue
        private PERMISSIONDENIEDFORDONATIONITEMSERROR pERMISSIONDENIEDFORDONATIONITEMSERROR;

        PERMISSIONDENIEDFORDONATIONITEMSERRORCase(PERMISSIONDENIEDFORDONATIONITEMSERROR pERMISSIONDENIEDFORDONATIONITEMSERROR) {
            this.pERMISSIONDENIEDFORDONATIONITEMSERROR = pERMISSIONDENIEDFORDONATIONITEMSERROR;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pERMISSIONDENIEDFORDONATIONITEMSERROR(this.pERMISSIONDENIEDFORDONATIONITEMSERROR);
        }

        @JsonCreator
        private PERMISSIONDENIEDFORDONATIONITEMSERRORCase(JsonNode jsonNode) throws IOException {
            this.pERMISSIONDENIEDFORDONATIONITEMSERROR = ApiHelper.deserialize(jsonNode,
                PERMISSIONDENIEDFORDONATIONITEMSERROR.class);
        }

        @Override
        public String toString() {
            return pERMISSIONDENIEDFORDONATIONITEMSERROR.toString();
        }
    }

    /**
     * This is a custom deserializer class for OrdersCapture403IssuesItems.
     */
    protected static class OrdersCapture403IssuesItemsDeserializer
            extends JsonDeserializer<OrdersCapture403IssuesItems> {

        @Override
        public OrdersCapture403IssuesItems deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CONSENTNEEDEDCase.class,
                    NOTELIGIBLEFORTOKENPROCESSINGERRORCase.class, PERMISSIONDENIEDRESULTCase.class,
                    PERMISSIONDENIEDFORDONATIONITEMSERRORCase.class), false);
        }
    }

}
