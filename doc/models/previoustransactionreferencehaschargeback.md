
# PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK

## Structure

`PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreviousTransactionReferenceChargebackIssueEnum`](../../doc/models/previous-transaction-reference-chargeback-issue-enum.md) | Optional | - | PreviousTransactionReferenceChargebackIssueEnum getIssue() | setIssue(PreviousTransactionReferenceChargebackIssueEnum issue) |
| `Description` | [`PrevTransRefChargebackDescEnum`](../../doc/models/prev-trans-ref-chargeback-desc-enum.md) | Optional | - | PrevTransRefChargebackDescEnum getDescription() | setDescription(PrevTransRefChargebackDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK",
  "description": "The capture referenced by `previous_transaction_reference` has a chargeback and hence cannot be used for this order. Please use a `previous_transaction_reference` which does not have a chargeback."
}
```

