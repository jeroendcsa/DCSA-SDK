# Real Time

The real time stats

```java
RealTimeController realTimeController = client.getRealTimeController();
```

## Class Name

`RealTimeController`


# Post-V 1 -stats

This endpoint allows you to report the usage statistics of a reference API call.

```java
CompletableFuture<Void> postV1StatsAsync(
    final UUID dCSAAPIKEY,
    final V1StatsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dCSAAPIKEY` | `UUID` | Header, Required | An API key for authorizing requests. |
| `body` | [`V1StatsRequest`](../../doc/models/v1-stats-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
UUID dCSAAPIKEY = UUID.fromString("055409d4-c69a-403f-8cca-d950fc11b12b");
V1StatsRequest body = new V1StatsRequest.Builder(
    DomainEnum.TNT,
    MethodEnum.GET,
    "/v2/events",
    "2.2.0"
)
.params(Arrays.asList(
        "eventTypes",
        "equipmentReference"
    ))
.uniqueAdopterHash("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad")
.build();

realTimeController.postV1StatsAsync(dCSAAPIKEY, body).thenAccept(result -> {
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
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 401 | Unauthorized | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

