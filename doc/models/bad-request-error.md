
# Bad Request Error

## Structure

`BadRequestError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<BadRequestIssue>`](../../doc/models/containers/bad-request-issue.md) | Optional | - | List<BadRequestIssue> getIssues() | setIssues(List<BadRequestIssue> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_ARRAY_MAX_ITEMS",
      "description": "The number of items in an array parameter is too large."
    }
  ]
}
```

