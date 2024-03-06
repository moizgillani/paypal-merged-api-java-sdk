
# Unprocessable Request Error

## Structure

`UnprocessableRequestError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<UnprocessableErrorIssue>`](../../doc/models/containers/unprocessable-error-issue.md) | Optional | - | List<UnprocessableErrorIssue> getIssues() | setIssues(List<UnprocessableErrorIssue> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "AMOUNT_MISMATCH",
      "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
    },
    {
      "issue": "AMOUNT_MISMATCH",
      "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
    }
  ]
}
```

