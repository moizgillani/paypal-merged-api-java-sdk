
# Refund Status Details Payments

The details of the refund status.

## Structure

`RefundStatusDetailsPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`RefundReasonEnum`](../../doc/models/refund-reason-enum.md) | Optional | The reason why the refund has the `PENDING` or `FAILED` status. | RefundReasonEnum getReason() | setReason(RefundReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "ECHECK"
}
```

