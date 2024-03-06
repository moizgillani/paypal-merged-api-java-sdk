
# Net Amount Breakdown Item Payments

The net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.

## Structure

`NetAmountBreakdownItemPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayableAmount` | [`RefundStatusDetailsPayments`](../../doc/models/refund-status-details-payments.md) | Optional | The net amount debited from the merchant's PayPal account. | RefundStatusDetailsPayments getPayableAmount() | setPayableAmount(RefundStatusDetailsPayments payableAmount) |
| `ConvertedAmount` | [`Money`](../../doc/models/money.md) | Optional | The converted payable amount. | Money getConvertedAmount() | setConvertedAmount(Money convertedAmount) |
| `ExchangeRate` | [`ExchangeRate`](../../doc/models/exchange-rate.md) | Optional | The exchange rate that determines the amount that was debited from the merchant's PayPal account. | ExchangeRate getExchangeRate() | setExchangeRate(ExchangeRate exchangeRate) |

## Example (as JSON)

```json
{
  "payable_amount": {
    "reason": "ECHECK"
  },
  "converted_amount": {
    "currency_code": "currency_code0",
    "value": "value6"
  },
  "exchange_rate": {
    "source_currency": "source_currency4",
    "target_currency": "target_currency6",
    "value": "value6"
  }
}
```

