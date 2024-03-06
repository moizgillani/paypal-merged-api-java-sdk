
# Authorizations Capture Response 400 Json Exception

## Structure

`AuthorizationsCaptureResponse400JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`BadRequestNameEnum`](../../doc/models/bad-request-name-enum.md) | Optional | - | BadRequestNameEnum getName() | setName(BadRequestNameEnum name) |
| `Message` | [`BadRequestMessageEnum`](../../doc/models/bad-request-message-enum.md) | Optional | - | BadRequestMessageEnum getMessageField() | setMessageField(BadRequestMessageEnum messageField) |
| `Issues` | [`List<ErrorDetails3Payments>`](../../doc/models/error-details-3-payments.md) | Optional | - | List<ErrorDetails3Payments> getIssues() | setIssues(List<ErrorDetails3Payments> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "INVALID_REQUEST",
  "message": "Request is not well-formed, syntactically incorrect, or violates schema.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The value of a field is invalid."
    }
  ],
  "debug_id": "debug_id4",
  "information_link": "information_link8"
}
```

