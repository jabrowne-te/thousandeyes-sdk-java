

# PathVisDetailTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**startTime** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**endTime** | **Integer** | Epoch time (seconds) indicating the end time of the round |  [optional] [readonly] |
|**agent** | [**Agent**](Agent.md) |  |  [optional] |
|**server** | **String** | Target server, including port (if method used is TCP) |  [optional] [readonly] |
|**serverIp** | **String** | IP of target server |  [optional] [readonly] |
|**sourceIp** | **String** | IP address of source agent |  [optional] [readonly] |
|**sourcePrefix** | **String** | IP prefix of source agent |  [optional] [readonly] |
|**targetIsProxy** | **Boolean** |  |  [optional] [readonly] |
|**direction** | **TestDirection** |  |  [optional] |
|**routes** | [**List&lt;PathVisRoute&gt;**](PathVisRoute.md) | Shows 3 iterations of path trace, with each iteration specified by a pathId |  [optional] |


