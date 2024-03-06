
# Forbidden Error 1 Exception

## Structure

`ForbiddenError1Exception`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`ForbiddenRequestNameEnum`](../../doc/models/forbidden-request-name-enum.md) | Optional | - | ForbiddenRequestNameEnum getName() | setName(ForbiddenRequestNameEnum name) |
| `Message` | [`ForbiddenRequestMessageEnum`](../../doc/models/forbidden-request-message-enum.md) | Optional | - | ForbiddenRequestMessageEnum getMessageField() | setMessageField(ForbiddenRequestMessageEnum messageField) |
| `Issues` | [`List<ErrorDetails12>`](../../doc/models/error-details-12.md) | Optional | - | List<ErrorDetails12> getIssues() | setIssues(List<ErrorDetails12> issues) |
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
      "description": "CONSENT_NEEDED"
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "CONSENT_NEEDED"
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "CONSENT_NEEDED"
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link2"
}
```

