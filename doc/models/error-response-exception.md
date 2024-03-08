
# Error Response Exception

Unexpected error

## Structure

`ErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HttpMethod` | [`HttpMethodEnum`](../../doc/models/http-method-enum.md) | Required | The HTTP method used to make the request e.g. `GET`, `POST`, etc | HttpMethodEnum getHttpMethod() | setHttpMethod(HttpMethodEnum httpMethod) |
| `RequestUri` | `String` | Required | The URI that was requested. | String getRequestUri() | setRequestUri(String requestUri) |
| `StatusCode` | `int` | Required | The HTTP status code returned. | int getStatusCode() | setStatusCode(int statusCode) |
| `StatusCodeText` | `String` | Required | A standard short description corresponding to the HTTP status code.<br>**Constraints**: *Maximum Length*: `50` | String getStatusCodeText() | setStatusCodeText(String statusCodeText) |
| `StatusCodeMessage` | `String` | Optional | A long description corresponding to the HTTP status code with additional information.<br>**Constraints**: *Maximum Length*: `200` | String getStatusCodeMessage() | setStatusCodeMessage(String statusCodeMessage) |
| `ProviderCorrelationReference` | `String` | Optional | A unique identifier to the HTTP request within the scope of the API provider.<br>**Constraints**: *Maximum Length*: `100` | String getProviderCorrelationReference() | setProviderCorrelationReference(String providerCorrelationReference) |
| `ErrorDateTime` | `LocalDateTime` | Required | The DateTime corresponding to the error occuring. Must be formatted using [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format. | LocalDateTime getErrorDateTime() | setErrorDateTime(LocalDateTime errorDateTime) |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | List of detailed errors, e.g. fields that could not pass validation | List<Error> getErrors() | setErrors(List<Error> errors) |

## Example (as JSON)

```json
{
  "httpMethod": "POST",
  "requestUri": "/v1/stats",
  "statusCode": 400,
  "statusCodeText": "Bad Request",
  "statusCodeMessage": "The supplied data could not be accepted",
  "providerCorrelationReference": "4426d965-0dd8-4005-8c63-dc68b01c4962",
  "errorDateTime": "11/11/2019 23:11:00",
  "errors": [
    {
      "errorCode": 18,
      "property": "property8",
      "value": "value2",
      "jsonPath": "jsonPath2",
      "errorCodeText": "errorCodeText6",
      "erorCodeMessage": "erorCodeMessage4"
    },
    {
      "errorCode": 18,
      "property": "property8",
      "value": "value2",
      "jsonPath": "jsonPath2",
      "errorCodeText": "errorCodeText6",
      "erorCodeMessage": "erorCodeMessage4"
    }
  ]
}
```

