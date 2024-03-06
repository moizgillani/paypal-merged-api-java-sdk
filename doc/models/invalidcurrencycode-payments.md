
# INVALIDCURRENCYCODE Payments

## Structure

`INVALIDCURRENCYCODEPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCurrencyCodeIssueEnum`](../../doc/models/invalid-currency-code-issue-enum.md) | Optional | - | InvalidCurrencyCodeIssueEnum getIssue() | setIssue(InvalidCurrencyCodeIssueEnum issue) |
| `Description` | [`InvalidCurrencyCodeDescriptionPaymentsEnum`](../../doc/models/invalid-currency-code-description-payments-enum.md) | Optional | - | InvalidCurrencyCodeDescriptionPaymentsEnum getDescription() | setDescription(InvalidCurrencyCodeDescriptionPaymentsEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_CURRENCY_CODE",
  "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes."
}
```

