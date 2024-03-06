
# Unauthorized Request Error

## Structure

`UnauthorizedRequestError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<UnauthorizedErrorIssue>`](../../doc/models/containers/unauthorized-error-issue.md) | Optional | - | List<UnauthorizedErrorIssue> getIssues() | setIssues(List<UnauthorizedErrorIssue> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_ACCOUNT_STATUS",
      "description": "Account validations failed for the user."
    },
    {
      "issue": "INVALID_ACCOUNT_STATUS",
      "description": "Account validations failed for the user."
    },
    {
      "issue": "INVALID_ACCOUNT_STATUS",
      "description": "Account validations failed for the user."
    }
  ]
}
```

