
# Error Details 6

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"AMOUNT_MISMATCH"` | String getIssue() | setIssue(String issue) |
| `Description` | [`AmountMismatch1Description2Enum`](../../doc/models/amount-mismatch-1-description-2-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | AmountMismatch1Description2Enum getDescription() | setDescription(AmountMismatch1Description2Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "AMOUNT_MISMATCH",
  "field": "field6",
  "value": "value4",
  "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
}
```

