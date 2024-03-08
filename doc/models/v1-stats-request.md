
# V1 Stats Request

## Structure

`V1StatsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Domain` | [`DomainEnum`](../../doc/models/domain-enum.md) | Required | The DCSA standard being referred.<br><br>- `TNT` (Track and Trace)<br>- `TNT_NTF` (Track and Trace Notifications)<br>- `OVS` (Operational Vessel Schedules)<br>- `EBL` (Electronic Bill of Lading)<br>- `EBL_NTF` (Electronic Bill of Lading Notifications)<br>- `EBL_SUR` (Electronic Bill of Lading Surrender)<br>- `EBL_SUR_RSP` (Electronic Bill of Lading Surrender Response)<br>- `EBL_ISS` (Electronic Bill of Lading Issuance)<br>- `EBL_ISS_RSP` (Electronic Bill of Lading Issuance Response)<br>- `BKG` (Booking)<br>- `BKG_NTF` (Booking Notifications)<br>- `CBF` (Consolidated Booking Forecast)<br>- `JIT` (Just In Time Portcall)<br>- `CS` (Commercial Schedules)<br>- `AN` (Arrival Notice)<br>- `AN_NTF` (Arrival Notice Notifications)<br>- `DI` (Delivery Instruction)<br>- `DI_NTF` (Delivery Instruction Notifications)<br>- `RMC` (Reefer Monitoring Commercial)<br>- `RMC_NTF` (Reefer Monitoring Commercial Notifications)<br>- `RMO` (Operational Reefer Monitoring)<br>- `RMO_NTF` (Operational Reefer Monitoring Notifications)<br>- `IC` (IoT Commercial)<br>- `IC_NTF` (IoT Commercial Notifications)<br>- `IO` (IoT Operations)<br>- `IO_NTF` (IoT Operations Notifications)<br>- `DO` (Delivery Order)<br>- `DO_NTF` (Delivery Order Notifications)<br>- `TO` (Transport Order)<br>- `TO_NTF` (Transport Order Notifications)<br>- `CRO` (Container Release Order)<br>- `CRO_NTF` (Container Release Order Notifications) | DomainEnum getDomain() | setDomain(DomainEnum domain) |
| `Method` | [`MethodEnum`](../../doc/models/method-enum.md) | Required | The HTTP Method used in the referenced API call. | MethodEnum getMethod() | setMethod(MethodEnum method) |
| `Path` | `String` | Required | The context path of the reference API call. | String getPath() | setPath(String path) |
| `Version` | `String` | Required | DCSA version of the API being used. | String getVersion() | setVersion(String version) |
| `Params` | `List<String>` | Optional | The request parameters being used.<br>**Constraints**: *Unique Items Required* | List<String> getParams() | setParams(List<String> params) |
| `UniqueAdopterHash` | `String` | Optional | SHA-256 of the adopter.<br><br>> *Rules to be defined.* | String getUniqueAdopterHash() | setUniqueAdopterHash(String uniqueAdopterHash) |

## Example (as JSON)

```json
{
  "domain": "TNT",
  "method": "GET",
  "path": "/v2/events",
  "version": "2.2.0",
  "params": [
    "eventTypes",
    "equipmentReference"
  ],
  "uniqueAdopterHash": "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad"
}
```

