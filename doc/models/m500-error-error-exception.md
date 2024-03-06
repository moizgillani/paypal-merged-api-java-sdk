
# M500 Error Error Exception

Error response for 500

## Structure

`M500ErrorErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`InternalServerErrorNameEnum`](../../doc/models/internal-server-error-name-enum.md) | Optional | - | InternalServerErrorNameEnum getName() | setName(InternalServerErrorNameEnum name) |
| `Message` | [`InternalServerErrorMessageEnum`](../../doc/models/internal-server-error-message-enum.md) | Optional | - | InternalServerErrorMessageEnum getMessageField() | setMessageField(InternalServerErrorMessageEnum messageField) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | [`InternalServerErrorInformationLinkEnum`](../../doc/models/internal-server-error-information-link-enum.md) | Optional | The information link, or URI, that shows detailed information about this error for the developer. | InternalServerErrorInformationLinkEnum getInformationLink() | setInformationLink(InternalServerErrorInformationLinkEnum informationLink) |

## Example (as JSON)

```json
{
  "name": "INTERNAL_SERVER_ERROR",
  "message": "An internal server error occurred.",
  "debug_id": "90957fca61718",
  "information_link": "https://developer.paypal.com/api/orders/v2/#error-INTERNAL_SERVER_ERROR"
}
```

