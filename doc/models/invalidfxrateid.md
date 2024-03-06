
# INVALIDFXRATEID

## Structure

`INVALIDFXRATEID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidFXRateIdIssueEnum`](../../doc/models/invalid-fx-rate-id-issue-enum.md) | Optional | - | InvalidFXRateIdIssueEnum getIssue() | setIssue(InvalidFXRateIdIssueEnum issue) |
| `Description` | [`InvalidFXRateIdDescriptionEnum`](../../doc/models/invalid-fx-rate-id-description-enum.md) | Optional | - | InvalidFXRateIdDescriptionEnum getDescription() | setDescription(InvalidFXRateIdDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_FX_RATE_ID",
  "description": "The specific FX Rate ID is not valid. This could be either because we are not able to look up the FX Rate based on this ID or it could be because the ID belongs to another API Caller."
}
```

