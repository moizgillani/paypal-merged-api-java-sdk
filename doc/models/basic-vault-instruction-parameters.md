
# Basic Vault Instruction Parameters

Basic vault instruction specification that can be extended by specific payment sources that supports vaulting.

## Structure

`BasicVaultInstructionParameters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StoreInVault` | [`VaultingInstructionEnum`](../../doc/models/vaulting-instruction-enum.md) | Optional | Defines how and when the payment source gets vaulted.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultingInstructionEnum getStoreInVault() | setStoreInVault(VaultingInstructionEnum storeInVault) |

## Example (as JSON)

```json
{
  "store_in_vault": "ON_SUCCESS"
}
```

