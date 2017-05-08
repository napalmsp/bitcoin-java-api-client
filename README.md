# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import br.com.astarlabs.client.*;
import br.com.astarlabs.client.auth.*;
import br.com.astarlabs.client.model.*;
import br.com.astarlabs.client.api.SearchApi;

import java.io.File;
import java.util.*;

public class SearchApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SearchApi* | [**searchByAPIID**](docs/SearchApi.md#searchByAPIID) | **POST** /search/registered/id | Get transaction informations by API ID
*SearchApi* | [**searchByContent**](docs/SearchApi.md#searchByContent) | **POST** /search/registered/content | Get transaction informations by file or string content
*SearchApi* | [**searchByHash**](docs/SearchApi.md#searchByHash) | **POST** /search/registered/hash | Get transaction informations by file or string hash
*SendApi* | [**sendFile**](docs/SendApi.md#sendFile) | **POST** /send/opreturn/base64 | Send file hash to bitcoin blockchain
*SendApi* | [**sendPayAddress**](docs/SendApi.md#sendPayAddress) | **POST** /send/payaddress | Send a value for address
*SendApi* | [**sendString**](docs/SendApi.md#sendString) | **POST** /send/opreturn/string | Send string to bitcoin blockchain


## Documentation for Models

 - [SingleResult](docs/SingleResult.md)
 - [Transaction](docs/Transaction.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contato@astarlabs.com

