
# Capture Orders Unprocessable Request Exception

## Structure

`CaptureOrdersUnprocessableRequestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`UnprocessableRequestNameEnum`](../../doc/models/unprocessable-request-name-enum.md) | Optional | - | UnprocessableRequestNameEnum getName() | setName(UnprocessableRequestNameEnum name) |
| `Message` | [`UnprocessableRequestmessageEnum`](../../doc/models/unprocessable-requestmessage-enum.md) | Optional | - | UnprocessableRequestmessageEnum getMessageField() | setMessageField(UnprocessableRequestmessageEnum messageField) |
| `Issues` | [`List<ErrorDetails13>`](../../doc/models/error-details-13.md) | Optional | - | List<ErrorDetails13> getIssues() | setIssues(List<ErrorDetails13> issues) |
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
      "description": "The requested agreement is already canceled."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The requested agreement is already canceled."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The requested agreement is already canceled."
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link6"
}
```

