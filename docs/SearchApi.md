# SearchApi

All URIs are relative to *http://localhost:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchByAPIID**](SearchApi.md#searchByAPIID) | **POST** /search/registered/id | Get transaction informations by API ID
[**searchByContent**](SearchApi.md#searchByContent) | **POST** /search/registered/content | Get transaction informations by file or string content
[**searchByHash**](SearchApi.md#searchByHash) | **POST** /search/registered/hash | Get transaction informations by file or string hash


<a name="searchByAPIID"></a>
# **searchByAPIID**
> Transaction searchByAPIID(token, account, user, password, id)

Get transaction informations by API ID

Get transaction informations by API ID 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
Integer id = 56; // Integer | API id for blockchain transaction
try {
    Transaction result = apiInstance.searchByAPIID(token, account, user, password, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByAPIID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| a signed JWT token with the company privatekey. |
 **account** | **Integer**| API ID for Account where the coins must be spend. |
 **user** | **String**| API user name. |
 **password** | **String**| API user password. |
 **id** | **Integer**| API id for blockchain transaction |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchByContent"></a>
# **searchByContent**
> Transaction searchByContent(token, account, user, password, content)

Get transaction informations by file or string content

Get transaction informations by file or string content 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
String content = "content_example"; // String | file or string content.
try {
    Transaction result = apiInstance.searchByContent(token, account, user, password, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| a signed JWT token with the company privatekey. |
 **account** | **Integer**| API ID for Account where the coins must be spend. |
 **user** | **String**| API user name. |
 **password** | **String**| API user password. |
 **content** | **String**| file or string content. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchByHash"></a>
# **searchByHash**
> Transaction searchByHash(token, account, user, password, hash)

Get transaction informations by file or string hash

Get transaction informations by file or string hash 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
String hash = "hash_example"; // String | hash of content.
try {
    Transaction result = apiInstance.searchByHash(token, account, user, password, hash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| a signed JWT token with the company privatekey. |
 **account** | **Integer**| API ID for Account where the coins must be spend. |
 **user** | **String**| API user name. |
 **password** | **String**| API user password. |
 **hash** | **String**| hash of content. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

