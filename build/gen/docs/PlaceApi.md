# PlaceApi

All URIs are relative to *https://api-dev.hei.school*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewPlace**](PlaceApi.md#addNewPlace) | **POST** /place | Add new place
[**addNewPlaceWithHttpInfo**](PlaceApi.md#addNewPlaceWithHttpInfo) | **POST** /place | Add new place
[**createEventParticipant**](PlaceApi.md#createEventParticipant) | **POST** /events/{event_id}/participants | Create eventParticipant
[**createEventParticipantWithHttpInfo**](PlaceApi.md#createEventParticipantWithHttpInfo) | **POST** /events/{event_id}/participants | Create eventParticipant
[**createOrupdateEvents**](PlaceApi.md#createOrupdateEvents) | **PUT** /events | Create new or update existing events
[**createOrupdateEventsWithHttpInfo**](PlaceApi.md#createOrupdateEventsWithHttpInfo) | **PUT** /events | Create new or update existing events
[**deleteEvent**](PlaceApi.md#deleteEvent) | **DELETE** /events/{id} | Delete event by identifier
[**deleteEventWithHttpInfo**](PlaceApi.md#deleteEventWithHttpInfo) | **DELETE** /events/{id} | Delete event by identifier
[**getEventById**](PlaceApi.md#getEventById) | **GET** /events/{id} | Get event by identifier
[**getEventByIdWithHttpInfo**](PlaceApi.md#getEventByIdWithHttpInfo) | **GET** /events/{id} | Get event by identifier
[**getEvents**](PlaceApi.md#getEvents) | **GET** /events | Get all events
[**getEventsWithHttpInfo**](PlaceApi.md#getEventsWithHttpInfo) | **GET** /events | Get all events
[**getParticipants**](PlaceApi.md#getParticipants) | **GET** /events/{event_id}/participants | Get all participants of a specific event
[**getParticipantsWithHttpInfo**](PlaceApi.md#getParticipantsWithHttpInfo) | **GET** /events/{event_id}/participants | Get all participants of a specific event
[**getPlaces**](PlaceApi.md#getPlaces) | **GET** /place | Get all places
[**getPlacesWithHttpInfo**](PlaceApi.md#getPlacesWithHttpInfo) | **GET** /place | Get all places



## addNewPlace

> List<Place> addNewPlace(createPlace)

Add new place

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        List<CreatePlace> createPlace = Arrays.asList(); // List<CreatePlace> | Place to create
        try {
            List<Place> result = apiInstance.addNewPlace(createPlace);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#addNewPlace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPlace** | [**List&lt;CreatePlace&gt;**](CreatePlace.md)| Place to create |

### Return type

[**List&lt;Place&gt;**](Place.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created place |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## addNewPlaceWithHttpInfo

> ApiResponse<List<Place>> addNewPlace addNewPlaceWithHttpInfo(createPlace)

Add new place

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        List<CreatePlace> createPlace = Arrays.asList(); // List<CreatePlace> | Place to create
        try {
            ApiResponse<List<Place>> response = apiInstance.addNewPlaceWithHttpInfo(createPlace);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#addNewPlace");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPlace** | [**List&lt;CreatePlace&gt;**](CreatePlace.md)| Place to create |

### Return type

ApiResponse<[**List&lt;Place&gt;**](Place.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created place |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## createEventParticipant

> List<EventParticipant> createEventParticipant(eventId, createEventParticipant)

Create eventParticipant

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<CreateEventParticipant> createEventParticipant = Arrays.asList(); // List<CreateEventParticipant> | 
        try {
            List<EventParticipant> result = apiInstance.createEventParticipant(eventId, createEventParticipant);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#createEventParticipant");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **createEventParticipant** | [**List&lt;CreateEventParticipant&gt;**](CreateEventParticipant.md)|  | [optional]

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## createEventParticipantWithHttpInfo

> ApiResponse<List<EventParticipant>> createEventParticipant createEventParticipantWithHttpInfo(eventId, createEventParticipant)

Create eventParticipant

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        List<CreateEventParticipant> createEventParticipant = Arrays.asList(); // List<CreateEventParticipant> | 
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.createEventParticipantWithHttpInfo(eventId, createEventParticipant);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#createEventParticipant");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **createEventParticipant** | [**List&lt;CreateEventParticipant&gt;**](CreateEventParticipant.md)|  | [optional]

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## createOrupdateEvents

> List<Event> createOrupdateEvents(createEvent)

Create new or update existing events

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        List<CreateEvent> createEvent = Arrays.asList(); // List<CreateEvent> | 
        try {
            List<Event> result = apiInstance.createOrupdateEvents(createEvent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#createOrupdateEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEvent** | [**List&lt;CreateEvent&gt;**](CreateEvent.md)|  |

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Events successfully updated |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## createOrupdateEventsWithHttpInfo

> ApiResponse<List<Event>> createOrupdateEvents createOrupdateEventsWithHttpInfo(createEvent)

Create new or update existing events

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        List<CreateEvent> createEvent = Arrays.asList(); // List<CreateEvent> | 
        try {
            ApiResponse<List<Event>> response = apiInstance.createOrupdateEventsWithHttpInfo(createEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#createOrupdateEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEvent** | [**List&lt;CreateEvent&gt;**](CreateEvent.md)|  |

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Events successfully updated |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## deleteEvent

> void deleteEvent(id)

Delete event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.deleteEvent(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#deleteEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event successfully deleted |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## deleteEventWithHttpInfo

> ApiResponse<Void> deleteEvent deleteEventWithHttpInfo(id)

Delete event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.deleteEventWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#deleteEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event successfully deleted |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEventById

> List<Event> getEventById(id)

Get event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            List<Event> result = apiInstance.getEventById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getEventById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specific event |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventByIdWithHttpInfo

> ApiResponse<List<Event>> getEventById getEventByIdWithHttpInfo(id)

Get event by identifier

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<List<Event>> response = apiInstance.getEventByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getEventById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specific event |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getEvents

> List<Event> getEvents()

Get all events

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        try {
            List<Event> result = apiInstance.getEvents();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getEventsWithHttpInfo

> ApiResponse<List<Event>> getEvents getEventsWithHttpInfo()

Get all events

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        try {
            ApiResponse<List<Event>> response = apiInstance.getEventsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of events |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getParticipants

> List<EventParticipant> getParticipants(eventId, page, pageSize)

Get all participants of a specific event

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<EventParticipant> result = apiInstance.getParticipants(eventId, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;EventParticipant&gt;**](EventParticipant.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getParticipantsWithHttpInfo

> ApiResponse<List<EventParticipant>> getParticipants getParticipantsWithHttpInfo(eventId, page, pageSize)

Get all participants of a specific event

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            ApiResponse<List<EventParticipant>> response = apiInstance.getParticipantsWithHttpInfo(eventId, page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getParticipants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

ApiResponse<[**List&lt;EventParticipant&gt;**](EventParticipant.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of participants |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPlaces

> List<Place> getPlaces()

Get all places

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        try {
            List<Place> result = apiInstance.getPlaces();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getPlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Place&gt;**](Place.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPlacesWithHttpInfo

> ApiResponse<List<Place>> getPlaces getPlacesWithHttpInfo()

Get all places

### Example

```java
// Import classes:
import school.hei.haapi.endpoint.rest.client.ApiClient;
import school.hei.haapi.endpoint.rest.client.ApiException;
import school.hei.haapi.endpoint.rest.client.ApiResponse;
import school.hei.haapi.endpoint.rest.client.Configuration;
import school.hei.haapi.endpoint.rest.client.auth.*;
import school.hei.haapi.endpoint.rest.client.models.*;
import school.hei.haapi.endpoint.rest.api.PlaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.hei.school");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PlaceApi apiInstance = new PlaceApi(defaultClient);
        try {
            ApiResponse<List<Place>> response = apiInstance.getPlacesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlaceApi#getPlaces");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;Place&gt;**](Place.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of places |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

