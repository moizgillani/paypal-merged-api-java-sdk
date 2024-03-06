
# Capture Status Details

The details of the captured payment status.

## Structure

`CaptureStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`CaptureStatusReasonEnum`](../../doc/models/capture-status-reason-enum.md) | Optional | The reason why the captured payment status is `PENDING` or `DENIED`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[A-Z_]+$` | CaptureStatusReasonEnum getReason() | setReason(CaptureStatusReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "TRANSACTION_APPROVED_AWAITING_FUNDING"
}
```

