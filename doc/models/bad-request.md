
# Bad Request

## Structure

`BadRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`BadRequestNameEnum`](../../doc/models/bad-request-name-enum.md) | Optional | - | BadRequestNameEnum getName() | setName(BadRequestNameEnum name) |
| `Message` | [`BadRequestMessageEnum`](../../doc/models/bad-request-message-enum.md) | Optional | - | BadRequestMessageEnum getMessage() | setMessage(BadRequestMessageEnum message) |
| `Issues` | [`List<ErrorDetails1>`](../../doc/models/error-details-1.md) | Optional | - | List<ErrorDetails1> getIssues() | setIssues(List<ErrorDetails1> issues) |
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
      "description": "The number of items in an array parameter is too large."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The number of items in an array parameter is too large."
    }
  ],
  "debug_id": "debug_id4",
  "information_link": "information_link8"
}
```

