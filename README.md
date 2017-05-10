# Bitcoin Java API Client

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
    <name>git-maven-repo-astarlabs</name>
    <url>https://github.com/astarlabs/maven-repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.astarlabs</groupId>
    <artifactId>bitcoin-java-api-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.astarlabs:bitcoin-java-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/bitcoin-java-api-client-1.0.0.jar
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
			token = Token.sign("2d2d2d2d2d424547494e205253412050524956415445204b45592d2d2d2d2d0a4d4949457041494241414b4341514541776e7172444f637439377468596b63584d656e47486966734567797163356f47645971344a30753547686d49596932430a524a72386847394552556a7531643261716e7452395933724b436667344847514c41657a35736c4b67336f6574544c46647574594465424e4f4568504a6431710a6767475a6a2f31496c375a6a32554d77327953614469784d4a35624f4e56336142334248436a694a31303457636f6749306d39466549737732756669366b534f0a542f6e3677656b794b4e414d6e72684e7464796942662f6e686d36794e4a56714349432f62414c39544a4371446f464b5262516879767a49617152564f47514f0a444537344e45316657454f54614b6b61787039325249465434675765786e6b6430556977346e4447414a6e4f3477735a336a524e483451646d44514969656a390a636637797631687252344331465a637544374d65787954574a2b475075533277664a44745977494441514142416f494241426363564b3958325a4b5335654f7a0a357747376368757253745a7151756378366f7156545954393771553357346d764e736649557a4735747a63306a34314370467157425174564c6869376848476e0a6a535a75552b616444516e4b76564e7a455277736f323469745970327256456d6d7232515378746455663856595a417a39393553337976482f395445697753300a666e4262323156506d72484853637561647448712f79707741414a445478632f474f384b2f564334316e6276795136614536695a5631694b4e546d7a566752640a6742614a4b5458796d326b7731514357684648444b566e59377964716d45474466414b6546374a442f68432b5936564f7547775267372f41734a59766351374f0a58486367515779773457305369697057526a684273446c674d694f73414874326b47733561427839796a45516454437a3561766735686f7a45645a3647576d6a0a33774b43516745436759454131314d4a4b6d6d665774437a6e3076497350576b636b642b6644546c7958613839394157684677424a564678755a7032453354390a4e2f6b326254614c7778623678344d584e7662755a5a344d5577452b41465a6841785537325049522b514d79534347426547496a7a786141353975434f6477740a57694c4c41387854714369347962524847624e76466f7865324e384449744869546b5a75356845374362367137316d585054793141794d4367594541357a65530a4b666e796d2b4174555344756f364b707a6e557344644d6e6d69392b754c4675445747433562795035366e50397535577a3643477a70536848485465304d4c370a71677635424c516366425052666e413345762f53564a484c78767a4e6b2f6c456c71693135434861476d36587a6535446f596e353530533255324b6f4e5544300a647a594662644a46653033356e6c4b6f396d69734b526632536376554a6668556a6941684d4d45436759454175502b7a715566305450397778465646535a7a540a5041686e434f6f6433316a7742473435576d4439377755706b354339442f78387273476b58484c333435627a77635445686b6e6b4331536550426165495959560a64614f687473524d597369335137666432414e687873514c33716a2f477830727266796b746b2b774e4a4e414b4c534750664f6e5a78555654486c57355779300a5a68496e702b31333775687454705748316d6f3544306343675945417a5a4633723042644e62377a4b32306e486d38786e3742485561644a54326b6f746c5a780a7251336b44684d2b736b346b367272756a62782f2f6b7a676a4f645062725863674577537774374c63486c4353624c46464778442b524b4335564441436536560a7a346b42356d6b2b657a2b575565326a54597a5a6c59646576765934374e6671516337537474673746437934594d334845515478413777644b584643466477610a65523452784545436759416a304851374c57473969683730664d614869525a645148454d6a55786b41346a77557649764b315569623044563668346c656847650a6851644b3041795363594c2f774f6e6a53346e70774a636d46472f6577573751623467656b525a4f443832756d35476372674c7138325253624f464b504158660a6d796e737057374a6d6d6870643938587538386132734839424c524c6166654c6837344d4f6d4a715235754758325042376762697a773d3d0a2d2d2d2d2d454e44205253412050524956415445204b45592d2d2d2d2d0a");
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
