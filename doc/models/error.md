
# Error

## Structure

`Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `Integer` | Optional | The detailed error code returned.<br><br>- `7000-7999` Technical error codes<br>- `8000-8999` Functional error codes<br>- `9000-9999` API provider-specific error codes<br><br>[Error codes as specified by DCSA](https://dcsa.atlassian.net/wiki/spaces/DTG/pages/197132308/Standard+Error+Codes).<br>**Constraints**: `>= 7000`, `<= 9999` | Integer getErrorCode() | setErrorCode(Integer errorCode) |
| `Property` | `String` | Optional | The name of the property causing the error.<br>**Constraints**: *Maximum Length*: `100` | String getProperty() | setProperty(String property) |
| `Value` | `String` | Optional | The value of the property causing the error serialised as a string exactly as in the original request.<br>**Constraints**: *Maximum Length*: `500` | String getValue() | setValue(String value) |
| `JsonPath` | `String` | Optional | A path to the property causing the error, formatted according to [JSONpath](https://github.com/json-path/JsonPath).<br>**Constraints**: *Maximum Length*: `500` | String getJsonPath() | setJsonPath(String jsonPath) |
| `ErrorCodeText` | `String` | Required | A standard short description corresponding to the `errorCode`.<br>**Constraints**: *Maximum Length*: `100` | String getErrorCodeText() | setErrorCodeText(String errorCodeText) |
| `ErorCodeMessage` | `String` | Optional | A long description corresponding to the `errorCode` with additional information.<br>**Constraints**: *Maximum Length*: `200` | String getErorCodeMessage() | setErorCodeMessage(String erorCodeMessage) |

## Example (as JSON)

```json
{
  "errorCode": 7003,
  "property": "facilityCode",
  "value": "SG SIN WHS",
  "jsonPath": "$.location.facilityCode",
  "errorCodeText": "invalidData",
  "erorCodeMessage": "Spaces not allowed in facility code"
}
```

