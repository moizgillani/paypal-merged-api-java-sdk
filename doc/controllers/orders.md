# Orders

Use the `/orders` resource to create, update, retrieve, authorize, capture and track orders.

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Create Order](../../doc/controllers/orders.md#create-order)
* [Get Order](../../doc/controllers/orders.md#get-order)
* [Orders Patch](../../doc/controllers/orders.md#orders-patch)
* [Orders Confirm](../../doc/controllers/orders.md#orders-confirm)
* [Orders Authorize](../../doc/controllers/orders.md#orders-authorize)
* [Capture Order](../../doc/controllers/orders.md#capture-order)
* [Orders Track Create](../../doc/controllers/orders.md#orders-track-create)
* [Orders Trackers Patch](../../doc/controllers/orders.md#orders-trackers-patch)


# Create Order

Creates an order. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see <a href="https://developer.paypal.com/docs/checkout/advanced/processing/">checkout</a> or <a href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/">multiparty checkout</a>.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#create-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> createOrderAsync(
    final String payPalRequestId,
    final OrderRequest body,
    final String payPalPartnerAttributionId,
    final String payPalClientMetadataId,
    final String prefer)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. |
| `body` | [`OrderRequest`](../../doc/models/order-request.md) | Body, Required | - |
| `payPalPartnerAttributionId` | `String` | Header, Optional | - |
| `payPalClientMetadataId` | `String` | Header, Optional | - |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/orders/client-side-integration`, `https://uri.paypal.com/services/payments/payment`

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
String payPalRequestId = "7b92603e-77ed-4896-8e78-5dea2050476a";
OrderRequest body = new OrderRequest.Builder(
    PaymentIntentCheckoutEnum.CAPTURE,
    Arrays.asList(
        new PurchaseUnitRequest.Builder(
            new AmountWithBreakdown.Builder(
                "USD",
                "100.00"
            )
            .build()
        )
        .referenceId("d9f80740-38f0-11e8-b467-0ed5f89f718b")
        .build()
    )
)
.paymentSource(new PaymentSourceDefinition.Builder()
        .paypal(new PayPalWallet.Builder()
            .experienceContext(new PayPalWalletExperienceContext.Builder()
                .brandName("EXAMPLE INC")
                .locale("en-US")
                .returnUrl("https://example.com/returnUrl")
                .cancelUrl("https://example.com/cancelUrl")
                .landingPage(LandingPageTypeEnum.LOGIN)
                .userAction(UserActionEnum.PAY_NOW)
                .paymentMethodPreference(MerchantPreferredPaymentMethodsEnum.IMMEDIATE_PAYMENT_REQUIRED)
                .build())
            .build())
        .build())
.build();


ordersController.createOrderAsync(payPalRequestId, body, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "71P66832U2286831S",
  "status": "PAYER_ACTION_REQUIRED",
  "payment_source": {
    "paypal": {}
  },
  "links": [
    {
      "href": "https://api.sandbox.paypal.com/v2/checkout/orders/71P66832U2286831S",
      "rel": "self",
      "method": "GET"
    },
    {
      "href": "https://www.sandbox.paypal.com/checkoutnow?token=71P66832U2286831S",
      "rel": "payer-action",
      "method": "GET"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`UnauthorizedRequestError1Exception`](../../doc/models/unauthorized-request-error-1-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`UnprocessableRequestError1Exception`](../../doc/models/unprocessable-request-error-1-exception.md) |
| Default | The default response. | `ApiException` |


# Get Order

Shows details for an order, by ID.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#get-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> getOrderAsync(
    final String id,
    final String fields)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `fields` | `String` | Query, Optional | A comma-separated list of fields that should be returned for the order. Valid filter field is `payment_source`. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/orders/client-side-integration`, `https://uri.paypal.com/services/payments/payment`

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
String id = "id0";

ordersController.getOrderAsync(id, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "5O190127TN364715T",
  "status": "APPROVED",
  "intent": "CAPTURE",
  "payment_source": {
    "paypal": {
      "name": {
        "given_name": "John",
        "surname": "Doe"
      },
      "email_address": "customer@example.com",
      "account_id": "QYR5Z8XDVJNXQ"
    }
  },
  "purchase_units": [
    {
      "reference_id": "d9f80740-38f0-11e8-b467-0ed5f89f718b",
      "amount": {
        "currency_code": "USD",
        "value": "100.00"
      }
    }
  ],
  "payer": {
    "name": {
      "given_name": "John",
      "surname": "Doe"
    },
    "email_address": "customer@example.com",
    "payer_id": "QYR5Z8XDVJNXQ"
  },
  "create_time": "2018-04-01T21:18:49Z",
  "links": [
    {
      "href": "https://api-m.paypal.com/v2/checkout/orders/5O190127TN364715T",
      "rel": "self",
      "method": "GET"
    },
    {
      "href": "https://www.paypal.com/checkoutnow?token=5O190127TN364715T",
      "rel": "approve",
      "method": "GET"
    },
    {
      "href": "https://api-m.paypal.com/v2/checkout/orders/5O190127TN364715T",
      "rel": "update",
      "method": "PATCH"
    },
    {
      "href": "https://api-m.paypal.com/v2/checkout/orders/5O190127TN364715T/capture",
      "rel": "capture",
      "method": "POST"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`UnauthorizedRequestError1Exception`](../../doc/models/unauthorized-request-error-1-exception.md) |
| 404 | The specified resource does not exist. | [`ResourceNotFoundException`](../../doc/models/resource-not-found-exception.md) |
| Default | The default response. | `ApiException` |


# Orders Patch

Updates an order with a `CREATED` or `APPROVED` status. You cannot update an order with the `COMPLETED` status.<br/><br/>To make an update, you must provide a `reference_id`. If you omit this value with an order that contains only one purchase unit, PayPal sets the value to `default` which enables you to use the path: <code>"/purchase_units/@reference_id=='default'/{attribute-or-object}"</code>. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see <a href="https://developer.paypal.com/docs/checkout/advanced/processing/">checkout</a> or <a href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/">multiparty checkout</a>.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#patch-order">Orders v2 errors</a>.</blockquote>Patchable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody><tr><td><code>intent</code></td><td>replace</td><td></td></tr><tr><td><code>payer</code></td><td>replace, add</td><td>Using replace op for <code>payer</code> will replace the whole <code>payer</code> object with the value sent in request.</td></tr><tr><td><code>purchase_units</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].custom_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].description</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payee.email</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].shipping.name</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.address</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.type</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].soft_descriptor</code></td><td>replace, remove</td><td></td></tr><tr><td><code>purchase_units[].amount</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].items</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].invoice_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction.disbursement_mode</code></td><td>replace</td><td>By default, <code>disbursement_mode</code> is <code>INSTANT</code>.</td></tr><tr><td><code>purchase_units[].payment_instruction.platform_fees</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.airline</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.card</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>application_context.client_configuration</code></td><td>replace, add</td><td></td></tr></tbody></table>

```java
CompletableFuture<Void> ordersPatchAsync(
    final String id,
    final List<Patch> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/orders/client-side-integration`, `https://uri.paypal.com/services/payments/payment`

## Response Type

`void`

## Example Usage

```java
String id = "id0";
List<Patch> body = Arrays.asList(
    new Patch.Builder(
        PatchOpEnum.REPLACE
    )
    .path("/purchase_units/@reference_id=='PUHF'/shipping/address")
    .value(ApiHelper.deserialize("{\"address_line_1\":\"2211 N First Street\",\"address_line_2\":\"Building 17\",\"admin_area_2\":\"San Jose\",\"admin_area_1\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\"}"))
    .build()
);

ordersController.ordersPatchAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`UnauthorizedRequestError1Exception`](../../doc/models/unauthorized-request-error-1-exception.md) |
| 404 | The specified resource does not exist. | [`OrdersPatchResponse404JsonException`](../../doc/models/orders-patch-response-404-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersPatchResponse422JsonException`](../../doc/models/orders-patch-response-422-json-exception.md) |
| Default | The default response. | `ApiException` |


# Orders Confirm

Payer confirms their intent to pay for the the Order with the given payment source.

```java
CompletableFuture<Order> ordersConfirmAsync(
    final String id,
    final String payPalClientMetadataId,
    final String prefer,
    final ConfirmOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `payPalClientMetadataId` | `String` | Header, Optional | - |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource. |
| `body` | [`ConfirmOrderRequest`](../../doc/models/confirm-order-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/initiatepayment`, `https://uri.paypal.com/services/payments/payment`

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
String id = "id0";
ConfirmOrderRequest body = new ConfirmOrderRequest.Builder(
    new PaymentSourceDefinition.Builder()
        .paypal(new PayPalWallet.Builder()
            .emailAddress("customer@example.com")
            .name(new PartyName.Builder()
                .givenName("John")
                .surname("Doe")
                .build())
            .experienceContext(new PayPalWalletExperienceContext.Builder()
                .brandName("EXAMPLE INC")
                .locale("en-US")
                .shippingPreference(ShippingPreferenceEnum.SET_PROVIDED_ADDRESS)
                .returnUrl("https://example.com/returnUrl")
                .cancelUrl("https://example.com/cancelUrl")
                .landingPage(LandingPageTypeEnum.LOGIN)
                .userAction(UserActionEnum.PAY_NOW)
                .paymentMethodPreference(MerchantPreferredPaymentMethodsEnum.IMMEDIATE_PAYMENT_REQUIRED)
                .build())
            .build())
        .build()
)
.build();

ordersController.ordersConfirmAsync(id, null, null, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`OrdersConfirmResponse403JsonException`](../../doc/models/orders-confirm-response-403-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersConfirmResponse422JsonException`](../../doc/models/orders-confirm-response-422-json-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |


# Orders Authorize

Authorizes payment for an order. To successfully authorize payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#authorize-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<OrderAuthorizeResponse> ordersAuthorizeAsync(
    final String id,
    final String payPalRequestId,
    final String prefer,
    final String payPalClientMetadataId,
    final String payPalAuthAssertion,
    final AuthorizeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource. |
| `payPalClientMetadataId` | `String` | Header, Optional | - |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |
| `body` | [`AuthorizeRequest`](../../doc/models/authorize-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/orders/client-side-integration`, `https://uri.paypal.com/services/payments/payment`

## Response Type

[`OrderAuthorizeResponse`](../../doc/models/order-authorize-response.md)

## Example Usage

```java
String id = "id0";
String payPalRequestId = "7b92603e-77ed-4896-8e78-5dea2050476a";
String prefer = "return=minimal";
ordersController.ordersAuthorizeAsync(id, payPalRequestId, prefer, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`UnauthorizedRequestError1Exception`](../../doc/models/unauthorized-request-error-1-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`OrdersAuthorizeResponse403JsonException`](../../doc/models/orders-authorize-response-403-json-exception.md) |
| 404 | The specified resource does not exist. | [`OrdersAuthorizeResponse404JsonException`](../../doc/models/orders-authorize-response-404-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersAuthorizeResponse422JsonException`](../../doc/models/orders-authorize-response-422-json-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |


# Capture Order

Captures payment for an order. To successfully capture payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#capture-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> captureOrderAsync(
    final String id,
    final String payPalRequestId,
    final String prefer,
    final String payPalClientMetadataId,
    final String payPalAuthAssertion,
    final OrderCaptureRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource. |
| `payPalClientMetadataId` | `String` | Header, Optional | - |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |
| `body` | [`OrderCaptureRequest`](../../doc/models/order-capture-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/orders/client-side-integration`, `https://uri.paypal.com/services/payments/payment`

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
String id = "id0";
String payPalRequestId = "7b92603e-77ed-4896-8e78-5dea2050476a";
String prefer = "return=minimal";
ordersController.captureOrderAsync(id, payPalRequestId, prefer, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`UnauthorizedRequestError1Exception`](../../doc/models/unauthorized-request-error-1-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`ForbiddenError1Exception`](../../doc/models/forbidden-error-1-exception.md) |
| 404 | The specified resource does not exist. | [`ResourceNotFoundException`](../../doc/models/resource-not-found-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`CaptureOrdersUnprocessableRequestException`](../../doc/models/capture-orders-unprocessable-request-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |


# Orders Track Create

Adds tracking information for an Order.

```java
CompletableFuture<Order> ordersTrackCreateAsync(
    final String id,
    final OrderTrackerRequest body,
    final String payPalAuthAssertion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `body` | [`OrderTrackerRequest`](../../doc/models/order-tracker-request.md) | Body, Required | - |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment`

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
String id = "id0";
OrderTrackerRequest body = new OrderTrackerRequest.Builder(
    "transaction_id4",
    ShipmentTrackingStatusEnum.SHIPPED,
    "capture_id8"
)
.notifyBuyer(false)
.notifyPayer(false)
.build();


ordersController.ordersTrackCreateAsync(id, body, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`OrdersTrackCreateResponse403JsonException`](../../doc/models/orders-track-create-response-403-json-exception.md) |
| 404 | The specified resource does not exist. | [`OrdersTrackCreateResponse404JsonException`](../../doc/models/orders-track-create-response-404-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersTrackCreateResponse422JsonException`](../../doc/models/orders-track-create-response-422-json-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |


# Orders Trackers Patch

Updates or cancels the tracking information for a PayPal order, by ID. Updatable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody></tr><tr><td><code>items</code></td><td>replace</td><td>Using replace op for <code>items</code> will replace the entire <code>items</code> object with the value sent in request.</td></tr><tr><td><code>notify_payer</code></td><td>replace, add</td><td></td></tr><tr><td><code>status</code></td><td>replace</td><td>Only patching status to CANCELLED is currently supported.</td></tr></tbody></table>

```java
CompletableFuture<Void> ordersTrackersPatchAsync(
    final String id,
    final String trackerId,
    final List<Patch> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `trackerId` | `String` | Template, Required | The order tracking ID. |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment`

## Response Type

`void`

## Example Usage

```java
String id = "id0";
String trackerId = "tracker_id2";
List<Patch> body = Arrays.asList(
    new Patch.Builder(
        PatchOpEnum.REPLACE
    )
    .path("/purchase_units/@reference_id=='PUHF'/shipping/address")
    .value(ApiHelper.deserialize("{\"address_line_1\":\"2211 N First Street\",\"address_line_2\":\"Building 17\",\"admin_area_2\":\"San Jose\",\"admin_area_1\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\"}"))
    .build()
);

ordersController.ordersTrackersPatchAsync(id, trackerId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`BadRequestError1Exception`](../../doc/models/bad-request-error-1-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`OrdersTrackersPatchResponse403JsonException`](../../doc/models/orders-trackers-patch-response-403-json-exception.md) |
| 404 | The specified resource does not exist. | [`OrdersTrackersPatchResponse404JsonException`](../../doc/models/orders-trackers-patch-response-404-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersTrackersPatchResponse422JsonException`](../../doc/models/orders-trackers-patch-response-422-json-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |

