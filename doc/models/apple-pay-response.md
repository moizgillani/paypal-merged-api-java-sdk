
# Apple Pay Response

A resource representing a response for Apple Pay.

## Structure

`ApplePayResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardPaymentMethodTokens`](../../doc/models/card-payment-method-tokens.md) | Optional | Card data for the card linked to the apple pay token. | CardPaymentMethodTokens getCard() | setCard(CardPaymentMethodTokens card) |

## Example (as JSON)

```json
{
  "card": {
    "id": "id6",
    "name": "name6",
    "number": "number6",
    "expiry": "expiry4",
    "security_code": "security_code8"
  }
}
```

