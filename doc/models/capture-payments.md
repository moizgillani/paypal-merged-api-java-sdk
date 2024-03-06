
# Capture Payments

A captured payment.

## Structure

`CapturePayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatus1Enum`](../../doc/models/capture-status-1-enum.md) | Optional | The status of the captured payment. | CaptureStatus1Enum getStatus() | setStatus(CaptureStatus1Enum status) |
| `StatusDetails` | [`CaptureStatusDetailsPayments`](../../doc/models/capture-status-details-payments.md) | Optional | The details of the captured payment status. | CaptureStatusDetailsPayments getStatusDetails() | setStatusDetails(CaptureStatusDetailsPayments statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the captured payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount for this captured payment. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReferencePayments`](../../doc/models/network-transaction-reference-payments.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReferencePayments getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReferencePayments networkTransactionReference) |
| `SellerProtection` | [`SellerProtectionPayments`](../../doc/models/seller-protection-payments.md) | Optional | - | SellerProtectionPayments getSellerProtection() | setSellerProtection(SellerProtectionPayments sellerProtection) |
| `FinalCapture` | `Boolean` | Optional | Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.<br>**Default**: `false` | Boolean getFinalCapture() | setFinalCapture(Boolean finalCapture) |
| `SellerReceivableBreakdown` | [`SellerReceivableBreakdown`](../../doc/models/seller-receivable-breakdown.md) | Optional | - | SellerReceivableBreakdown getSellerReceivableBreakdown() | setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) |
| `DisbursementMode` | [`DisbursementModeEnum`](../../doc/models/disbursement-mode-enum.md) | Optional | The funds that are held on behalf of the merchant.<br>**Default**: `DisbursementModeEnum.INSTANT`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^[A-Z_]+$` | DisbursementModeEnum getDisbursementMode() | setDisbursementMode(DisbursementModeEnum disbursementMode) |
| `Links` | [`List<LinkDescriptionPayments>`](../../doc/models/link-description-payments.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescriptionPayments> getLinks() | setLinks(List<LinkDescriptionPayments> links) |
| `ProcessorResponse` | [`ProcessorResponsePayments`](../../doc/models/processor-response-payments.md) | Optional | An object that provides additional processor information for a direct credit card transaction. | ProcessorResponsePayments getProcessorResponse() | setProcessorResponse(ProcessorResponsePayments processorResponse) |
| `CreateTime` | `String` | Optional | The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time when the transaction was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |

## Example (as JSON)

```json
{
  "final_capture": false,
  "disbursement_mode": "INSTANT",
  "status": "REFUNDED",
  "status_details": {
    "reason": "CHARGEBACK"
  },
  "id": "id4",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id4"
}
```

