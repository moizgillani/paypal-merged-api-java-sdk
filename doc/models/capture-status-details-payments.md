
# Capture Status Details Payments

The details of the captured payment status.

## Structure

`CaptureStatusDetailsPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`CaptureStatusReasonEnum`](../../doc/models/capture-status-reason-enum.md) | Optional | The reason why the captured payment status is `PENDING` or `DENIED`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[A-Z_]+$` | CaptureStatusReasonEnum getReason() | setReason(CaptureStatusReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "CHARGEBACK"
}
```

