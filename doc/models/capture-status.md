
# Capture Status

The status of a captured payment.

## Structure

`CaptureStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatus1Enum`](../../doc/models/capture-status-1-enum.md) | Optional | The status of the captured payment. | CaptureStatus1Enum getStatus() | setStatus(CaptureStatus1Enum status) |
| `StatusDetails` | [`CaptureStatusDetails`](../../doc/models/capture-status-details.md) | Optional | The details of the captured payment status. | CaptureStatusDetails getStatusDetails() | setStatusDetails(CaptureStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "COMPLETED",
  "status_details": {
    "reason": "CHARGEBACK"
  }
}
```

