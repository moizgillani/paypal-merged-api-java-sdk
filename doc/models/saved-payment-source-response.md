
# Saved Payment Source Response

The details about a saved payment source.

## Structure

`SavedPaymentSourceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the saved payment source.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getId() | setId(String id) |
| `Status` | [`VaultStatusEnum`](../../doc/models/vault-status-enum.md) | Optional | The vault status.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultStatusEnum getStatus() | setStatus(VaultStatusEnum status) |
| `Customer` | [`PayPalSCustomerDataRecords`](../../doc/models/pay-pal-s-customer-data-records.md) | Optional | The details about a customer in PayPal's system of record. | PayPalSCustomerDataRecords getCustomer() | setCustomer(PayPalSCustomerDataRecords customer) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "id": "id6",
  "status": "APPROVED",
  "customer": {
    "id": "id0",
    "email_address": "email_address2",
    "phone": {
      "phone_type": "OTHER",
      "phone_number": {
        "country_code": "country_code2",
        "national_number": "national_number6",
        "extension_number": "extension_number8"
      }
    }
  },
  "links": [
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    }
  ]
}
```

