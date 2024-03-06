
# Capture 2 Allof 1

## Structure

`Capture2Allof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SupplementaryData` | [`SupplementaryDataPayments`](../../doc/models/supplementary-data-payments.md) | Optional | An object that provides supplementary/additional data related to a payment transaction. | SupplementaryDataPayments getSupplementaryData() | setSupplementaryData(SupplementaryDataPayments supplementaryData) |
| `Payee` | [`SupplementaryDataPayments`](../../doc/models/supplementary-data-payments.md) | Optional | The details associated with the merchant for this transaction. | SupplementaryDataPayments getPayee() | setPayee(SupplementaryDataPayments payee) |

## Example (as JSON)

```json
{
  "supplementary_data": {
    "related_ids": {
      "order_id": "order_id2",
      "authorization_id": "authorization_id0",
      "capture_id": "capture_id0"
    }
  },
  "payee": {
    "related_ids": {
      "order_id": "order_id2",
      "authorization_id": "authorization_id0",
      "capture_id": "capture_id0"
    }
  }
}
```

