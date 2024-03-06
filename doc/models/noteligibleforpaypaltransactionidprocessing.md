
# NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING

## Structure

`NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPaypalTransactionIdProcessingIssueEnum`](../../doc/models/not-eligible-for-paypal-transaction-id-processing-issue-enum.md) | Optional | - | NotEligibleForPaypalTransactionIdProcessingIssueEnum getIssue() | setIssue(NotEligibleForPaypalTransactionIdProcessingIssueEnum issue) |
| `Description` | [`NotEligiblePaypalTransIdProcessingDescEnum`](../../doc/models/not-eligible-paypal-trans-id-processing-desc-enum.md) | Optional | - | NotEligiblePaypalTransIdProcessingDescEnum getDescription() | setDescription(NotEligiblePaypalTransIdProcessingDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PAYPAL_TRANSACTION_ID_PROCESSING",
  "description": "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID."
}
```

