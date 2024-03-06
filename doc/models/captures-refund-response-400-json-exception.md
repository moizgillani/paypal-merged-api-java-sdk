
# Captures Refund Response 400 Json Exception

## Structure

`CapturesRefundResponse400JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`BadRequestNameEnum`](../../doc/models/bad-request-name-enum.md) | Optional | - | BadRequestNameEnum getName() | setName(BadRequestNameEnum name) |
| `Message` | [`BadRequestMessageEnum`](../../doc/models/bad-request-message-enum.md) | Optional | - | BadRequestMessageEnum getMessageField() | setMessageField(BadRequestMessageEnum messageField) |
| `Issues` | [`List<ErrorDetails7Payments>`](../../doc/models/error-details-7-payments.md) | Optional | - | List<ErrorDetails7Payments> getIssues() | setIssues(List<ErrorDetails7Payments> issues) |
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
      "description": "A required field / parameter is missing."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "A required field / parameter is missing."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "A required field / parameter is missing."
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link2"
}
```

