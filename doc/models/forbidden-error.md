
# Forbidden Error

## Structure

`ForbiddenError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<ForbiddenErrorIssuesItems>`](../../doc/models/containers/forbidden-error-issues-items.md) | Optional | - | List<ForbiddenErrorIssuesItems> getIssues() | setIssues(List<ForbiddenErrorIssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "PERMISSION_DENIED",
      "description": "You do not have permission to access or perform operations on this resource."
    },
    {
      "issue": "PERMISSION_DENIED",
      "description": "You do not have permission to access or perform operations on this resource."
    }
  ]
}
```

