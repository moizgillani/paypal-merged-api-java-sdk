
# Seller Protection Payments

The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).

## Structure

`SellerProtectionPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`SellerProtectionStatusEnum`](../../doc/models/seller-protection-status-enum.md) | Optional | Indicates whether the transaction is eligible for seller protection. For information, see [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection). | SellerProtectionStatusEnum getStatus() | setStatus(SellerProtectionStatusEnum status) |
| `DisputeCategories` | [`List<DisputeCategoryEnum>`](../../doc/models/dispute-category-enum.md) | Optional | An array of conditions that are covered for the transaction. | List<DisputeCategoryEnum> getDisputeCategories() | setDisputeCategories(List<DisputeCategoryEnum> disputeCategories) |

## Example (as JSON)

```json
{
  "status": "NOT_ELIGIBLE",
  "dispute_categories": [
    "ITEM_NOT_RECEIVED"
  ]
}
```

