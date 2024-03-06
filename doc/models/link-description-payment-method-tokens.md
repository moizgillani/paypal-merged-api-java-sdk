
# Link Description Payment Method Tokens

The request-related [HATEOAS link](/api/rest/responses/#hateoas-links) information.

## Structure

`LinkDescriptionPaymentMethodTokens`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Required | The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the `$`, `(`, and `)` characters. The `href` is the key HATEOAS component that links a completed call with a subsequent call. | String getHref() | setHref(String href) |
| `Rel` | `String` | Required | The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml). | String getRel() | setRel(String rel) |
| `Method` | [`HttpMethodEnum`](../../doc/models/http-method-enum.md) | Optional | The HTTP method required to make the related call. | HttpMethodEnum getMethod() | setMethod(HttpMethodEnum method) |

## Example (as JSON)

```json
{
  "href": "href6",
  "rel": "rel0",
  "method": "PUT"
}
```

