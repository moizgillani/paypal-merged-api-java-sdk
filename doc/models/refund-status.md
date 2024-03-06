
# Refund Status

The refund status.

## Structure

`RefundStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatus1Enum`](../../doc/models/refund-status-1-enum.md) | Optional | The status of the refund. | RefundStatus1Enum getStatus() | setStatus(RefundStatus1Enum status) |
| `StatusDetails` | [`RefundStatusDetails`](../../doc/models/refund-status-details.md) | Optional | The details of the refund status. | RefundStatusDetails getStatusDetails() | setStatusDetails(RefundStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "CANCELLED",
  "status_details": {
    "reason": "ECHECK"
  }
}
```

