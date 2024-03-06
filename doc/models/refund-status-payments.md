
# Refund Status Payments

The refund status.

## Structure

`RefundStatusPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatus1Enum`](../../doc/models/refund-status-1-enum.md) | Optional | The status of the refund. | RefundStatus1Enum getStatus() | setStatus(RefundStatus1Enum status) |
| `StatusDetails` | [`RefundStatusDetailsPayments`](../../doc/models/refund-status-details-payments.md) | Optional | The details of the refund status. | RefundStatusDetailsPayments getStatusDetails() | setStatusDetails(RefundStatusDetailsPayments statusDetails) |

## Example (as JSON)

```json
{
  "status": "PENDING",
  "status_details": {
    "reason": "ECHECK"
  }
}
```

