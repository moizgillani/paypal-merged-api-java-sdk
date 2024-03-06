
# M404 Error Payments

Error response for 404

## Structure

`M404ErrorPayments`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`ResourceNotFoundNameEnum`](../../doc/models/resource-not-found-name-enum.md) | Optional | - | ResourceNotFoundNameEnum getName() | setName(ResourceNotFoundNameEnum name) |
| `Message` | [`ResourceNotFoundMessageEnum`](../../doc/models/resource-not-found-message-enum.md) | Optional | - | ResourceNotFoundMessageEnum getMessage() | setMessage(ResourceNotFoundMessageEnum message) |
| `Issues` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getIssues() | setIssues(List<ErrorDetails> issues) |
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
  "information_link": "information_link2"
}
```

