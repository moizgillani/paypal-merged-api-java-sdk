
# Orders Authorize Response 404 Json Exception

## Structure

`OrdersAuthorizeResponse404JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`ResourceNotFoundNameEnum`](../../doc/models/resource-not-found-name-enum.md) | Optional | - | ResourceNotFoundNameEnum getName() | setName(ResourceNotFoundNameEnum name) |
| `Message` | [`ResourceNotFoundMessageEnum`](../../doc/models/resource-not-found-message-enum.md) | Optional | - | ResourceNotFoundMessageEnum getMessageField() | setMessageField(ResourceNotFoundMessageEnum messageField) |
| `Issues` | [`List<ErrorDetails4>`](../../doc/models/error-details-4.md) | Optional | - | List<ErrorDetails4> getIssues() | setIssues(List<ErrorDetails4> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "RESOURCE_NOT_FOUND",
  "message": "The specified resource does not exist.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link6"
}
```

