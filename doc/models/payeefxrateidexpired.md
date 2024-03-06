
# PAYEEFXRATEIDEXPIRED

## Structure

`PAYEEFXRATEIDEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeFXRateIdExpiredIssueEnum`](../../doc/models/payee-fx-rate-id-expired-issue-enum.md) | Optional | - | PayeeFXRateIdExpiredIssueEnum getIssue() | setIssue(PayeeFXRateIdExpiredIssueEnum issue) |
| `Description` | [`PayeeFXRateIdExpiredDescriptionEnum`](../../doc/models/payee-fx-rate-id-expired-description-enum.md) | Optional | - | PayeeFXRateIdExpiredDescriptionEnum getDescription() | setDescription(PayeeFXRateIdExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_FX_RATE_ID_EXPIRED",
  "description": "The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate."
}
```

