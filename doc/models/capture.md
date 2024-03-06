
# Capture

A captured payment.

## Structure

`Capture`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatus1Enum`](../../doc/models/capture-status-1-enum.md) | Optional | The status of the captured payment. | CaptureStatus1Enum getStatus() | setStatus(CaptureStatus1Enum status) |
| `StatusDetails` | [`CaptureStatusDetails`](../../doc/models/capture-status-details.md) | Optional | The details of the captured payment status. | CaptureStatusDetails getStatusDetails() | setStatusDetails(CaptureStatusDetails statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the captured payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount for this captured payment. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReference`](../../doc/models/network-transaction-reference.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReference getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) |
| `SellerProtection` | [`SellerProtection`](../../doc/models/seller-protection.md) | Optional | - | SellerProtection getSellerProtection() | setSellerProtection(SellerProtection sellerProtection) |
| `FinalCapture` | `Boolean` | Optional | Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.<br>**Default**: `false` | Boolean getFinalCapture() | setFinalCapture(Boolean finalCapture) |
| `SellerReceivableBreakdown` | [`SellerReceivableBreakdown`](../../doc/models/seller-receivable-breakdown.md) | Optional | - | SellerReceivableBreakdown getSellerReceivableBreakdown() | setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) |
| `DisbursementMode` | [`DisbursementModeEnum`](../../doc/models/disbursement-mode-enum.md) | Optional | The funds that are held payee by the marketplace/platform. This field is only applicable to merchants that been enabled for PayPal Commerce Platform for Marketplaces and Platforms capability.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^[A-Z_]+$` | DisbursementModeEnum getDisbursementMode() | setDisbursementMode(DisbursementModeEnum disbursementMode) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `ProcessorResponse` | [`ProcessorResponse`](../../doc/models/processor-response.md) | Optional | An object that provides additional processor information for a direct credit card transaction. | ProcessorResponse getProcessorResponse() | setProcessorResponse(ProcessorResponse processorResponse) |
| `CreateTime` | `String` | Optional | The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time when the transaction was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |

## Example (as JSON)

```json
{
  "status": "COMPLETED",
  "id": "3C679366HH908993F",
  "final_capture": true,
  "status_details": {
    "reason": "CHARGEBACK"
  },
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id6"
}
```

