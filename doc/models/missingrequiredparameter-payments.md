
# MISSINGREQUIREDPARAMETER Payments

## Structure

`MISSINGREQUIREDPARAMETERPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingRequiredParameterIssueEnum`](../../doc/models/missing-required-parameter-issue-enum.md) | Optional | - | MissingRequiredParameterIssueEnum getIssue() | setIssue(MissingRequiredParameterIssueEnum issue) |
| `Description` | [`MissingRequiredParameterDescriptionPaymentsEnum`](../../doc/models/missing-required-parameter-description-payments-enum.md) | Optional | - | MissingRequiredParameterDescriptionPaymentsEnum getDescription() | setDescription(MissingRequiredParameterDescriptionPaymentsEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_REQUIRED_PARAMETER",
  "description": "A required field / parameter is missing."
}
```

