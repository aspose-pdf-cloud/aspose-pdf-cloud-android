# Aspose.PDF Cloud
[Aspose.PDF Cloud](https://products.aspose.cloud/pdf/cloud) is a true REST API that enables you to perform a wide range of document processing operations including creation, manipulation, conversion and rendering of PDF documents in the cloud.

Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process documents in language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. This repository contains new generation SDKs for Aspose.PDF Cloud and examples.

These SDKs are now fully supported. If you have any questions, see any bugs or have enhancement request, feel free to reach out to us at [Free Support Forums](https://forum.aspose.cloud/c/pdf).


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
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cloud-pdf-android</artifactId>
    <version>18.6.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cloud-pdf-android:18.6.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cloud-pdf-android-18.6.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aspose.asposecloudpdfandroid.*;
import com.aspose.asposecloudpdfandroid.model.*;
import com.aspose.asposecloudpdfandroid.api.PdfApi;

import java.io.File;
import java.util.*;

public class PdfApiExample {

    public static void main(String[] args) {
        // Get App key and App SID from https://cloud.aspose.com
        PdfApi apiInstance = new PdfApi("app_key", "app_sid");
        String name = "name_example"; // String | The document name.
        String fieldName = "fieldName_example"; // String | The field name/
        String storage = "storage_example"; // String | The document storage.
        String folder = "folder_example"; // String | The document folder.
        try {
            SaaSposeResponse result = apiInstance.deleteField(name, fieldName, storage, folder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PdfApi#deleteField");
            e.printStackTrace();
        }
    }
}

```

## Unit Tests
Aspose PDF Cloud SDK includes a suite of unit tests within the "test" subdirectory. These Unit Tests also serves as examples of how to use the Aspose PDF Cloud SDK.

## Licensing
All Aspose.PDF Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/pdf/cloud)
+ [**Documentation**](https://docs.aspose.cloud/display/pdfcloud/Home)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/pdf)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
+ [**Blog**](https://blog.aspose.cloud/category/aspose-products/aspose-pdf-product-family/)


