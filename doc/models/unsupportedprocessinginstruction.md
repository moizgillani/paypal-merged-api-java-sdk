
# UNSUPPORTEDPROCESSINGINSTRUCTION

## Structure

`UNSUPPORTEDPROCESSINGINSTRUCTION`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedProcessingInstructionIssueEnum`](../../doc/models/unsupported-processing-instruction-issue-enum.md) | Optional | - | UnsupportedProcessingInstructionIssueEnum getIssue() | setIssue(UnsupportedProcessingInstructionIssueEnum issue) |
| `Description` | [`UnsupportedProcessingInstructionDescriptionEnum`](../../doc/models/unsupported-processing-instruction-description-enum.md) | Optional | - | UnsupportedProcessingInstructionDescriptionEnum getDescription() | setDescription(UnsupportedProcessingInstructionDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_PROCESSING_INSTRUCTION",
  "description": "The specified processing_instruction is not supported for the given payment_source. Please refer to https://developer.paypal.com/api/orders/v2/#definition-processing_instruction for the list of payment_source that can be specified with this value."
}
```

