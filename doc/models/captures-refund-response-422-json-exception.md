
# Captures Refund Response 422 Json Exception

## Structure

`CapturesRefundResponse422JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`UnprocessableRequestNameEnum`](../../doc/models/unprocessable-request-name-enum.md) | Optional | - | UnprocessableRequestNameEnum getName() | setName(UnprocessableRequestNameEnum name) |
| `Message` | [`UnprocessableRequestmessageEnum`](../../doc/models/unprocessable-requestmessage-enum.md) | Optional | - | UnprocessableRequestmessageEnum getMessageField() | setMessageField(UnprocessableRequestmessageEnum messageField) |
| `Issues` | [`List<ErrorDetails23>`](../../doc/models/error-details-23.md) | Optional | - | List<ErrorDetails23> getIssues() | setIssues(List<ErrorDetails23> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "UNPROCESSABLE_ENTITY",
  "message": "The requested action could not be performed, semantically incorrect, or failed business validation.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Must be greater than zero. If the currency supports decimals, only two decimal place precision is supported."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Must be greater than zero. If the currency supports decimals, only two decimal place precision is supported."
    }
  ],
  "debug_id": "debug_id8",
  "information_link": "information_link2"
}
```

