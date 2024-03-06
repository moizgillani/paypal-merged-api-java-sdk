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
 * This is a model class for MerchantPayableBreakdown type.
 */
public class MerchantPayableBreakdown {
    private Money grossAmount;
    private Money paypalFee;
    private Money paypalFeeInReceivableCurrency;
    private Money netAmount;
    private Money netAmountInReceivableCurrency;
    private List<PlatformFee> platformFees;
    private List<NetAmountBreakdownItem> netAmountBreakdown;
    private Money totalRefundedAmount;

    /**
     * Default constructor.
     */
    public MerchantPayableBreakdown() {
    }

    /**
     * Initialization constructor.
     * @param  grossAmount  Money value for grossAmount.
     * @param  paypalFee  Money value for paypalFee.
     * @param  paypalFeeInReceivableCurrency  Money value for paypalFeeInReceivableCurrency.
     * @param  netAmount  Money value for netAmount.
     * @param  netAmountInReceivableCurrency  Money value for netAmountInReceivableCurrency.
     * @param  platformFees  List of PlatformFee value for platformFees.
     * @param  netAmountBreakdown  List of NetAmountBreakdownItem value for netAmountBreakdown.
     * @param  totalRefundedAmount  Money value for totalRefundedAmount.
     */
    public MerchantPayableBreakdown(
            Money grossAmount,
            Money paypalFee,
            Money paypalFeeInReceivableCurrency,
            Money netAmount,
            Money netAmountInReceivableCurrency,
            List<PlatformFee> platformFees,
            List<NetAmountBreakdownItem> netAmountBreakdown,
            Money totalRefundedAmount) {
        this.grossAmount = grossAmount;
        this.paypalFee = paypalFee;
        this.paypalFeeInReceivableCurrency = paypalFeeInReceivableCurrency;
        this.netAmount = netAmount;
        this.netAmountInReceivableCurrency = netAmountInReceivableCurrency;
        this.platformFees = platformFees;
        this.netAmountBreakdown = netAmountBreakdown;
        this.totalRefundedAmount = totalRefundedAmount;
    }

    /**
     * Getter for GrossAmount.
     * The amount that the payee refunded to the payer.
     * @return Returns the Money
     */
    @JsonGetter("gross_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getGrossAmount() {
        return grossAmount;
    }

    /**
     * Setter for GrossAmount.
     * The amount that the payee refunded to the payer.
     * @param grossAmount Value for Money
     */
    @JsonSetter("gross_amount")
    public void setGrossAmount(Money grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * Getter for PaypalFee.
     * The PayPal fee that was refunded to the payer in the currency of the transaction. This fee
     * might not match the PayPal fee that the payee paid when the payment was captured.
     * @return Returns the Money
     */
    @JsonGetter("paypal_fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getPaypalFee() {
        return paypalFee;
    }

    /**
     * Setter for PaypalFee.
     * The PayPal fee that was refunded to the payer in the currency of the transaction. This fee
     * might not match the PayPal fee that the payee paid when the payment was captured.
     * @param paypalFee Value for Money
     */
    @JsonSetter("paypal_fee")
    public void setPaypalFee(Money paypalFee) {
        this.paypalFee = paypalFee;
    }

    /**
     * Getter for PaypalFeeInReceivableCurrency.
     * The PayPal fee that was refunded to the payer in the receivable currency. Returned only in
     * cases when the receivable currency is different from transaction currency. Example 'CNY'.
     * @return Returns the Money
     */
    @JsonGetter("paypal_fee_in_receivable_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getPaypalFeeInReceivableCurrency() {
        return paypalFeeInReceivableCurrency;
    }

    /**
     * Setter for PaypalFeeInReceivableCurrency.
     * The PayPal fee that was refunded to the payer in the receivable currency. Returned only in
     * cases when the receivable currency is different from transaction currency. Example 'CNY'.
     * @param paypalFeeInReceivableCurrency Value for Money
     */
    @JsonSetter("paypal_fee_in_receivable_currency")
    public void setPaypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) {
        this.paypalFeeInReceivableCurrency = paypalFeeInReceivableCurrency;
    }

    /**
     * Getter for NetAmount.
     * The net amount that the payee's account is debited in the transaction currency. The net
     * amount is calculated as &lt;code&gt;gross_amount&lt;/code&gt; minus &lt;code&gt;paypal_fee&lt;/code&gt; minus
     * &lt;code&gt;platform_fees&lt;/code&gt;.
     * @return Returns the Money
     */
    @JsonGetter("net_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getNetAmount() {
        return netAmount;
    }

    /**
     * Setter for NetAmount.
     * The net amount that the payee's account is debited in the transaction currency. The net
     * amount is calculated as &lt;code&gt;gross_amount&lt;/code&gt; minus &lt;code&gt;paypal_fee&lt;/code&gt; minus
     * &lt;code&gt;platform_fees&lt;/code&gt;.
     * @param netAmount Value for Money
     */
    @JsonSetter("net_amount")
    public void setNetAmount(Money netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Getter for NetAmountInReceivableCurrency.
     * The net amount that the payee's account is debited in the receivable currency. Returned only
     * in cases when the receivable currency is different from transaction currency. Example 'CNY'.
     * @return Returns the Money
     */
    @JsonGetter("net_amount_in_receivable_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getNetAmountInReceivableCurrency() {
        return netAmountInReceivableCurrency;
    }

    /**
     * Setter for NetAmountInReceivableCurrency.
     * The net amount that the payee's account is debited in the receivable currency. Returned only
     * in cases when the receivable currency is different from transaction currency. Example 'CNY'.
     * @param netAmountInReceivableCurrency Value for Money
     */
    @JsonSetter("net_amount_in_receivable_currency")
    public void setNetAmountInReceivableCurrency(Money netAmountInReceivableCurrency) {
        this.netAmountInReceivableCurrency = netAmountInReceivableCurrency;
    }

    /**
     * Getter for PlatformFees.
     * An array of platform or partner fees, commissions, or brokerage fees for the refund.
     * @return Returns the List of PlatformFee
     */
    @JsonGetter("platform_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PlatformFee> getPlatformFees() {
        return platformFees;
    }

    /**
     * Setter for PlatformFees.
     * An array of platform or partner fees, commissions, or brokerage fees for the refund.
     * @param platformFees Value for List of PlatformFee
     */
    @JsonSetter("platform_fees")
    public void setPlatformFees(List<PlatformFee> platformFees) {
        this.platformFees = platformFees;
    }

    /**
     * Getter for NetAmountBreakdown.
     * An array of breakdown values for the net amount. Returned when the currency of the refund is
     * different from the currency of the PayPal account where the payee holds their funds.
     * @return Returns the List of NetAmountBreakdownItem
     */
    @JsonGetter("net_amount_breakdown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<NetAmountBreakdownItem> getNetAmountBreakdown() {
        return netAmountBreakdown;
    }

    /**
     * Setter for NetAmountBreakdown.
     * An array of breakdown values for the net amount. Returned when the currency of the refund is
     * different from the currency of the PayPal account where the payee holds their funds.
     * @param netAmountBreakdown Value for List of NetAmountBreakdownItem
     */
    @JsonSetter("net_amount_breakdown")
    public void setNetAmountBreakdown(List<NetAmountBreakdownItem> netAmountBreakdown) {
        this.netAmountBreakdown = netAmountBreakdown;
    }

    /**
     * Getter for TotalRefundedAmount.
     * The total amount refunded from the original capture to date. For example, if a payer makes a
     * $100 purchase and was refunded $20 a week ago and was refunded $30 in this refund, the
     * `gross_amount` is $30 for this refund and the `total_refunded_amount` is $50.
     * @return Returns the Money
     */
    @JsonGetter("total_refunded_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTotalRefundedAmount() {
        return totalRefundedAmount;
    }

    /**
     * Setter for TotalRefundedAmount.
     * The total amount refunded from the original capture to date. For example, if a payer makes a
     * $100 purchase and was refunded $20 a week ago and was refunded $30 in this refund, the
     * `gross_amount` is $30 for this refund and the `total_refunded_amount` is $50.
     * @param totalRefundedAmount Value for Money
     */
    @JsonSetter("total_refunded_amount")
    public void setTotalRefundedAmount(Money totalRefundedAmount) {
        this.totalRefundedAmount = totalRefundedAmount;
    }

    /**
     * Converts this MerchantPayableBreakdown into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantPayableBreakdown [" + "grossAmount=" + grossAmount + ", paypalFee="
                + paypalFee + ", paypalFeeInReceivableCurrency=" + paypalFeeInReceivableCurrency
                + ", netAmount=" + netAmount + ", netAmountInReceivableCurrency="
                + netAmountInReceivableCurrency + ", platformFees=" + platformFees
                + ", netAmountBreakdown=" + netAmountBreakdown + ", totalRefundedAmount="
                + totalRefundedAmount + "]";
    }

    /**
     * Builds a new {@link MerchantPayableBreakdown.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantPayableBreakdown.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .grossAmount(getGrossAmount())
                .paypalFee(getPaypalFee())
                .paypalFeeInReceivableCurrency(getPaypalFeeInReceivableCurrency())
                .netAmount(getNetAmount())
                .netAmountInReceivableCurrency(getNetAmountInReceivableCurrency())
                .platformFees(getPlatformFees())
                .netAmountBreakdown(getNetAmountBreakdown())
                .totalRefundedAmount(getTotalRefundedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantPayableBreakdown}.
     */
    public static class Builder {
        private Money grossAmount;
        private Money paypalFee;
        private Money paypalFeeInReceivableCurrency;
        private Money netAmount;
        private Money netAmountInReceivableCurrency;
        private List<PlatformFee> platformFees;
        private List<NetAmountBreakdownItem> netAmountBreakdown;
        private Money totalRefundedAmount;



        /**
         * Setter for grossAmount.
         * @param  grossAmount  Money value for grossAmount.
         * @return Builder
         */
        public Builder grossAmount(Money grossAmount) {
            this.grossAmount = grossAmount;
            return this;
        }

        /**
         * Setter for paypalFee.
         * @param  paypalFee  Money value for paypalFee.
         * @return Builder
         */
        public Builder paypalFee(Money paypalFee) {
            this.paypalFee = paypalFee;
            return this;
        }

        /**
         * Setter for paypalFeeInReceivableCurrency.
         * @param  paypalFeeInReceivableCurrency  Money value for paypalFeeInReceivableCurrency.
         * @return Builder
         */
        public Builder paypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) {
            this.paypalFeeInReceivableCurrency = paypalFeeInReceivableCurrency;
            return this;
        }

        /**
         * Setter for netAmount.
         * @param  netAmount  Money value for netAmount.
         * @return Builder
         */
        public Builder netAmount(Money netAmount) {
            this.netAmount = netAmount;
            return this;
        }

        /**
         * Setter for netAmountInReceivableCurrency.
         * @param  netAmountInReceivableCurrency  Money value for netAmountInReceivableCurrency.
         * @return Builder
         */
        public Builder netAmountInReceivableCurrency(Money netAmountInReceivableCurrency) {
            this.netAmountInReceivableCurrency = netAmountInReceivableCurrency;
            return this;
        }

        /**
         * Setter for platformFees.
         * @param  platformFees  List of PlatformFee value for platformFees.
         * @return Builder
         */
        public Builder platformFees(List<PlatformFee> platformFees) {
            this.platformFees = platformFees;
            return this;
        }

        /**
         * Setter for netAmountBreakdown.
         * @param  netAmountBreakdown  List of NetAmountBreakdownItem value for netAmountBreakdown.
         * @return Builder
         */
        public Builder netAmountBreakdown(List<NetAmountBreakdownItem> netAmountBreakdown) {
            this.netAmountBreakdown = netAmountBreakdown;
            return this;
        }

        /**
         * Setter for totalRefundedAmount.
         * @param  totalRefundedAmount  Money value for totalRefundedAmount.
         * @return Builder
         */
        public Builder totalRefundedAmount(Money totalRefundedAmount) {
            this.totalRefundedAmount = totalRefundedAmount;
            return this;
        }

        /**
         * Builds a new {@link MerchantPayableBreakdown} object using the set fields.
         * @return {@link MerchantPayableBreakdown}
         */
        public MerchantPayableBreakdown build() {
            return new MerchantPayableBreakdown(grossAmount, paypalFee,
                    paypalFeeInReceivableCurrency, netAmount, netAmountInReceivableCurrency,
                    platformFees, netAmountBreakdown, totalRefundedAmount);
        }
    }
}