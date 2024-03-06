
# Authorization Status Payments

The status fields for an authorized payment.

## Structure

`AuthorizationStatusPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizedPaymentStatusEnum`](../../doc/models/authorized-payment-status-enum.md) | Optional | The status for the authorized payment. | AuthorizedPaymentStatusEnum getStatus() | setStatus(AuthorizedPaymentStatusEnum status) |
| `StatusDetails` | [`AuhorizationStatusDetailsPayments`](../../doc/models/auhorization-status-details-payments.md) | Optional | The details of the authorized order pending status. | AuhorizationStatusDetailsPayments getStatusDetails() | setStatusDetails(AuhorizationStatusDetailsPayments statusDetails) |

## Example (as JSON)

```json
{
  "status": "DENIED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  }
}
```

