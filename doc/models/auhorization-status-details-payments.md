
# Auhorization Status Details Payments

The details of the authorized payment status.

## Structure

`AuhorizationStatusDetailsPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`AuthorizationStatusReasonEnum`](../../doc/models/authorization-status-reason-enum.md) | Optional | The reason why the authorized status is `PENDING`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | AuthorizationStatusReasonEnum getReason() | setReason(AuthorizationStatusReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "PENDING_REVIEW"
}
```

