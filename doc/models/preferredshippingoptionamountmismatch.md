
# PREFERREDSHIPPINGOPTIONAMOUNTMISMATCH

## Structure

`PREFERREDSHIPPINGOPTIONAMOUNTMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreferredShippingOptionAmountMismatchIssueEnum`](../../doc/models/preferred-shipping-option-amount-mismatch-issue-enum.md) | Optional | - | PreferredShippingOptionAmountMismatchIssueEnum getIssue() | setIssue(PreferredShippingOptionAmountMismatchIssueEnum issue) |
| `Description` | [`PreferredShippingOptionAmountMismatchDescriptionEnum`](../../doc/models/preferred-shipping-option-amount-mismatch-description-enum.md) | Optional | - | PreferredShippingOptionAmountMismatchDescriptionEnum getDescription() | setDescription(PreferredShippingOptionAmountMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREFERRED_SHIPPING_OPTION_AMOUNT_MISMATCH",
  "description": "The amount provided in the preferred shipping option should match the amount provided in amount breakdown"
}
```

