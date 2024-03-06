
# Capture Status Payments

The status of a captured payment.

## Structure

`CaptureStatusPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatus1Enum`](../../doc/models/capture-status-1-enum.md) | Optional | The status of the captured payment. | CaptureStatus1Enum getStatus() | setStatus(CaptureStatus1Enum status) |
| `StatusDetails` | [`CaptureStatusDetailsPayments`](../../doc/models/capture-status-details-payments.md) | Optional | The details of the captured payment status. | CaptureStatusDetailsPayments getStatusDetails() | setStatusDetails(CaptureStatusDetailsPayments statusDetails) |

## Example (as JSON)

```json
{
  "status": "PARTIALLY_REFUNDED",
  "status_details": {
    "reason": "CHARGEBACK"
  }
}
```

