
# EMVDATAREQUIRED

## Structure

`EMVDATAREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`EMVDataRequiredIssueEnum`](../../doc/models/emv-data-required-issue-enum.md) | Optional | - | EMVDataRequiredIssueEnum getIssue() | setIssue(EMVDataRequiredIssueEnum issue) |
| `Description` | [`EMVDataRequiredDescriptionEnum`](../../doc/models/emv-data-required-description-enum.md) | Optional | - | EMVDataRequiredDescriptionEnum getDescription() | setDescription(EMVDataRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "EMV_DATA_REQUIRED",
  "description": "EMV Data is required if authentication method is EMV."
}
```

