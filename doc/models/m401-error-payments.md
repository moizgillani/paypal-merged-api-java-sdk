
# M401 Error Payments

Error response for 401

## Structure

`M401ErrorPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`UnauthorizedRequestNameEnum`](../../doc/models/unauthorized-request-name-enum.md) | Optional | - | UnauthorizedRequestNameEnum getName() | setName(UnauthorizedRequestNameEnum name) |
| `Message` | [`UnauthorizedRequestMessageEnum`](../../doc/models/unauthorized-request-message-enum.md) | Optional | - | UnauthorizedRequestMessageEnum getMessage() | setMessage(UnauthorizedRequestMessageEnum message) |
| `Issues` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getIssues() | setIssues(List<ErrorDetails> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "AUTHENTICATION_FAILURE",
  "message": "Authentication failed due to missing authorization header, or invalid authentication credentials.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "description8"
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link6"
}
```

