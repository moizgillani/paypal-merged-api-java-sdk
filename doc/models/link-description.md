
# Link Description

The request-related [HATEOAS link](/api/rest/responses/#hateoas-links) information.

## Structure

`LinkDescription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Href` | `String` | Required | The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the `$`, `(`, and `)` characters. The `href` is the key HATEOAS component that links a completed call with a subsequent call. | String getHref() | setHref(String href) |
| `Rel` | `String` | Required | The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml). | String getRel() | setRel(String rel) |
| `Method` | [`HttpMethodEnum`](../../doc/models/http-method-enum.md) | Optional | The HTTP method required to make the related call. | HttpMethodEnum getMethod() | setMethod(HttpMethodEnum method) |

## Example (as JSON)

```json
{
  "href": "https://api-m.paypal.com/v2/checkout/orders/5O190127TN364715T",
  "rel": "self",
  "method": "GET"
}
```

