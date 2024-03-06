
# M422 Error

Error response for 422

## Structure

`M422Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`UnprocessableRequestNameEnum`](../../doc/models/unprocessable-request-name-enum.md) | Optional | - | UnprocessableRequestNameEnum getName() | setName(UnprocessableRequestNameEnum name) |
| `Message` | [`UnprocessableRequestmessageEnum`](../../doc/models/unprocessable-requestmessage-enum.md) | Optional | - | UnprocessableRequestmessageEnum getMessage() | setMessage(UnprocessableRequestmessageEnum message) |
| `Issues` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getIssues() | setIssues(List<ErrorDetails> issues) |
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
      "description": "description8"
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "description8"
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "description8"
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link0"
}
```

