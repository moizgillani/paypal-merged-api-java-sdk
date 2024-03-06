
# Authorization Status

The status fields for an authorized payment.

## Structure

`AuthorizationStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizedPaymentStatusEnum`](../../doc/models/authorized-payment-status-enum.md) | Optional | The status for the authorized payment. | AuthorizedPaymentStatusEnum getStatus() | setStatus(AuthorizedPaymentStatusEnum status) |
| `StatusDetails` | [`AuhorizationStatusDetails`](../../doc/models/auhorization-status-details.md) | Optional | The details of the authorized order pending status. | AuhorizationStatusDetails getStatusDetails() | setStatusDetails(AuhorizationStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "VOIDED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  }
}
```

