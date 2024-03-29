
# Customer

The customer who approves and pays for the order. The customer is also known as the payer.

## Structure

`Customer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EmailAddress` | `String` | Optional | The email address of the payer.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PayerId` | `String` | Optional | The PayPal-assigned ID for the payer.<br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13`, *Pattern*: `^[2-9A-HJ-NP-Z]{13}$` | String getPayerId() | setPayerId(String payerId) |
| `Name` | [`PartyName`](../../doc/models/party-name.md) | Optional | The name of the payer. Supports only the `given_name` and `surname` properties. | PartyName getName() | setName(PartyName name) |
| `Phone` | [`PhoneWithType`](../../doc/models/phone-with-type.md) | Optional | The phone number of the customer. Available only when you enable the **Contact Telephone Number** option in the <a href="https://www.paypal.com/cgi-bin/customerprofileweb?cmd=_profile-website-payments">**Profile & Settings**</a> for the merchant's PayPal account. The `phone.phone_number` supports only `national_number`. | PhoneWithType getPhone() | setPhone(PhoneWithType phone) |
| `BirthDate` | `String` | Optional | The birth date of the payer in `YYYY-MM-DD` format.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])$` | String getBirthDate() | setBirthDate(String birthDate) |
| `TaxInfo` | [`TaxInformationPaymentMethodTokens`](../../doc/models/tax-information-payment-method-tokens.md) | Optional | The tax information of the payer. Required only for Brazilian payer's. Both `tax_id` and `tax_id_type` are required. | TaxInformationPaymentMethodTokens getTaxInfo() | setTaxInfo(TaxInformationPaymentMethodTokens taxInfo) |
| `Address` | [`PortablePostalAddressMediumGrained`](../../doc/models/portable-postal-address-medium-grained.md) | Optional | The address of the payer. Supports only the `address_line_1`, `address_line_2`, `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred to as the billing address of the customer. | PortablePostalAddressMediumGrained getAddress() | setAddress(PortablePostalAddressMediumGrained address) |

## Example (as JSON)

```json
{
  "email_address": "email_address6",
  "payer_id": "payer_id6",
  "name": {
    "prefix": "prefix8",
    "given_name": "given_name2",
    "surname": "surname8",
    "middle_name": "middle_name0",
    "suffix": "suffix0"
  },
  "phone": {
    "phone_type": "OTHER",
    "phone_number": {
      "country_code": "country_code2",
      "national_number": "national_number6",
      "extension_number": "extension_number8"
    }
  },
  "birth_date": "birth_date6"
}
```

