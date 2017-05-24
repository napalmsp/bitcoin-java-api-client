# Bitcoin Java API Client

For more information, please visit [http://www.astarlabs.com](http://www.astarlabs.com)

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
<repository>
    <id>astarlabs-maven-repo</id>
    <url>https://mymavenrepo.com/repo/sk03Wn0AHtyMwB3QU3GQ/</url>
</repository>
```

```xml
<dependency>
    <groupId>com.astarlabs</groupId>
    <artifactId>bitcoin-java-api-client</artifactId>
    <version>1.1.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.astarlabs:bitcoin-java-api-client:1.1.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/bitcoin-java-api-client-1.1.1.jar
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
        
        String token = null;
		try {
			token = Token.sign("YOUR-API-PRIVATE-KEY");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        Integer account = 1;
        String user = "test";
        String password = "test";
        Integer id = 10;
        
        Transaction response = api.searchByAPIID(token, account, user, password, id);
        
        System.out.println(response.getTxid());
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
