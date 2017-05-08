# SendApi

All URIs are relative to *http://localhost:8080/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendFile**](SendApi.md#sendFile) | **POST** /send/opreturn/base64 | Send file hash to bitcoin blockchain
[**sendPayAddress**](SendApi.md#sendPayAddress) | **POST** /send/payaddress | Send a value for address
[**sendString**](SendApi.md#sendString) | **POST** /send/opreturn/string | Send string to bitcoin blockchain


<a name="sendFile"></a>
# **sendFile**
> SingleResult sendFile(token, account, user, password, base64, coin, test)

Send file hash to bitcoin blockchain

Send an OP_RETURN transaction with a base64 encoded file and return the API id for the blockchain transaction. 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SendApi;


SendApi apiInstance = new SendApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
String base64 = "base64_example"; // String | base64 encoded file.
String coin = "coin_example"; // String | the coin name - bitcoin/litecoin.
Integer test = 56; // Integer | if test = 1 so use testnet else test = 0 for mainnet.
try {
    SingleResult result = apiInstance.sendFile(token, account, user, password, base64, coin, test);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendApi#sendFile");
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
 **base64** | **String**| base64 encoded file. |
 **coin** | **String**| the coin name - bitcoin/litecoin. |
 **test** | **Integer**| if test &#x3D; 1 so use testnet else test &#x3D; 0 for mainnet. |

### Return type

[**SingleResult**](SingleResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendPayAddress"></a>
# **sendPayAddress**
> SingleResult sendPayAddress(token, account, user, password, address, coin, test)

Send a value for address

Send a value for address by an blockchain transaction. 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SendApi;


SendApi apiInstance = new SendApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
String address = "address_example"; // String | Address to send the amount.
String coin = "coin_example"; // String | the coin name - bitcoin/litecoin.
Integer test = 56; // Integer | if test = 1 so use testnet else test = 0 for mainnet.
try {
    SingleResult result = apiInstance.sendPayAddress(token, account, user, password, address, coin, test);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendApi#sendPayAddress");
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
 **address** | **String**| Address to send the amount. |
 **coin** | **String**| the coin name - bitcoin/litecoin. |
 **test** | **Integer**| if test &#x3D; 1 so use testnet else test &#x3D; 0 for mainnet. |

### Return type

[**SingleResult**](SingleResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendString"></a>
# **sendString**
> SingleResult sendString(token, account, user, password, string, coin, test)

Send string to bitcoin blockchain

Send an OP_RETURN transaction with a string and return the API id for the blockchain transaction. 

### Example
```java
// Import classes:
//import br.com.astarlabs.client.ApiException;
//import br.com.astarlabs.client.api.SendApi;


SendApi apiInstance = new SendApi();
String token = "token_example"; // String | a signed JWT token with the company privatekey.
Integer account = 56; // Integer | API ID for Account where the coins must be spend.
String user = "user_example"; // String | API user name.
String password = "password_example"; // String | API user password.
String string = "string_example"; // String | string to send.
String coin = "coin_example"; // String | the coin name - bitcoin/litecoin.
Integer test = 56; // Integer | if test = 1 so use testnet else test = 0 for mainnet.
try {
    SingleResult result = apiInstance.sendString(token, account, user, password, string, coin, test);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendApi#sendString");
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
 **string** | **String**| string to send. |
 **coin** | **String**| the coin name - bitcoin/litecoin. |
 **test** | **Integer**| if test &#x3D; 1 so use testnet else test &#x3D; 0 for mainnet. |

### Return type

[**SingleResult**](SingleResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

