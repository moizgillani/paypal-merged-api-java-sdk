
# UNSUPPORTEDINTENT

## Structure

`UNSUPPORTEDINTENT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedIntentIssueEnum`](../../doc/models/unsupported-intent-issue-enum.md) | Optional | - | UnsupportedIntentIssueEnum getIssue() | setIssue(UnsupportedIntentIssueEnum issue) |
| `Description` | [`UnsupportedIntentDescriptionEnum`](../../doc/models/unsupported-intent-description-enum.md) | Optional | - | UnsupportedIntentDescriptionEnum getDescription() | setDescription(UnsupportedIntentDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_INTENT",
  "description": "`intent=AUTHORIZE` is not supported for multiple purchase units. Only `intent=CAPTURE` is supported."
}
```

