
# Orders Confirm Response 403 Json Exception

## Structure

`OrdersConfirmResponse403JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`ForbiddenRequestNameEnum`](../../doc/models/forbidden-request-name-enum.md) | Optional | - | ForbiddenRequestNameEnum getName() | setName(ForbiddenRequestNameEnum name) |
| `Message` | [`ForbiddenRequestMessageEnum`](../../doc/models/forbidden-request-message-enum.md) | Optional | - | ForbiddenRequestMessageEnum getMessageField() | setMessageField(ForbiddenRequestMessageEnum messageField) |
| `Issues` | [`List<ErrorDetails7>`](../../doc/models/error-details-7.md) | Optional | - | List<ErrorDetails7> getIssues() | setIssues(List<ErrorDetails7> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "NOT_AUTHORIZED",
  "message": "Authorization failed due to insufficient permissions.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "You do not have permission to access or perform operations on this resource."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "You do not have permission to access or perform operations on this resource."
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link6"
}
```

