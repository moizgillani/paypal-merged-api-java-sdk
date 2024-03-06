
# Card Attributes Response

Additional attributes associated with the use of this card.

## Structure

`CardAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`VaultStatusEnum`](../../doc/models/vault-status-enum.md) | Optional | The vault status.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultStatusEnum getVault() | setVault(VaultStatusEnum vault) |

## Example (as JSON)

```json
{
  "vault": "VAULTED"
}
```

