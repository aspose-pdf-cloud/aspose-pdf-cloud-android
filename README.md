# Aspose.PDF Cloud
- API version: 2.0
- Package version: 19.4.0

[Aspose.PDF Cloud](https://products.aspose.cloud/pdf) is a true REST API that enables you to perform a wide range of document processing operations including creation, manipulation, conversion and rendering of PDF documents in the cloud.

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
    <version>19.4.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cloud-pdf-android:19.4.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cloud-pdf-android-19.4.0.jar
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

## Documentation for API Endpoints

All URIs are relative to *https://api.aspose.cloud/v2.0/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PdfApi* | [**deleteAnnotation**](sdk/docs/PdfApi.md#deleteAnnotation) | **DELETE** /pdf/\{name}/annotations/\{annotationId} | Delete document annotation by ID
*PdfApi* | [**deleteDocumentAnnotations**](sdk/docs/PdfApi.md#deleteDocumentAnnotations) | **DELETE** /pdf/\{name}/annotations | Delete all annotations from the document
*PdfApi* | [**deleteDocumentLinkAnnotations**](sdk/docs/PdfApi.md#deleteDocumentLinkAnnotations) | **DELETE** /pdf/\{name}/links | Delete all link annotations from the document
*PdfApi* | [**deleteDocumentStamps**](sdk/docs/PdfApi.md#deleteDocumentStamps) | **DELETE** /pdf/\{name}/stamps | Delete all stamps from the document
*PdfApi* | [**deleteDocumentTables**](sdk/docs/PdfApi.md#deleteDocumentTables) | **DELETE** /pdf/\{name}/tables | Delete all tables from the document
*PdfApi* | [**deleteField**](sdk/docs/PdfApi.md#deleteField) | **DELETE** /pdf/\{name}/fields/\{fieldName} | Delete document field by name.
*PdfApi* | [**deleteFile**](sdk/docs/PdfApi.md#deleteFile) | **DELETE** /storage/file | Remove a specific file 
*PdfApi* | [**deleteFolder**](sdk/docs/PdfApi.md#deleteFolder) | **DELETE** /storage/folder | Remove a specific folder 
*PdfApi* | [**deleteImage**](sdk/docs/PdfApi.md#deleteImage) | **DELETE** /pdf/\{name}/images/\{imageId} | Delete image from document page.
*PdfApi* | [**deleteLinkAnnotation**](sdk/docs/PdfApi.md#deleteLinkAnnotation) | **DELETE** /pdf/\{name}/links/\{linkId} | Delete document page link annotation by ID
*PdfApi* | [**deletePage**](sdk/docs/PdfApi.md#deletePage) | **DELETE** /pdf/\{name}/pages/\{pageNumber} | Delete document page by its number.
*PdfApi* | [**deletePageAnnotations**](sdk/docs/PdfApi.md#deletePageAnnotations) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/annotations | Delete all annotations from the page
*PdfApi* | [**deletePageLinkAnnotations**](sdk/docs/PdfApi.md#deletePageLinkAnnotations) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/links | Delete all link annotations from the page
*PdfApi* | [**deletePageStamps**](sdk/docs/PdfApi.md#deletePageStamps) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/stamps | Delete all stamps from the page
*PdfApi* | [**deletePageTables**](sdk/docs/PdfApi.md#deletePageTables) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/tables | Delete all tables from the page
*PdfApi* | [**deleteProperties**](sdk/docs/PdfApi.md#deleteProperties) | **DELETE** /pdf/\{name}/documentproperties | Delete custom document properties.
*PdfApi* | [**deleteProperty**](sdk/docs/PdfApi.md#deleteProperty) | **DELETE** /pdf/\{name}/documentproperties/\{propertyName} | Delete document property.
*PdfApi* | [**deleteStamp**](sdk/docs/PdfApi.md#deleteStamp) | **DELETE** /pdf/\{name}/stamps/\{stampId} | Delete document stamp by ID
*PdfApi* | [**deleteTable**](sdk/docs/PdfApi.md#deleteTable) | **DELETE** /pdf/\{name}/tables/\{tableId} | Delete document table by ID
*PdfApi* | [**getCaretAnnotation**](sdk/docs/PdfApi.md#getCaretAnnotation) | **GET** /pdf/\{name}/annotations/caret/\{annotationId} | Read document page caret annotation by ID.
*PdfApi* | [**getCircleAnnotation**](sdk/docs/PdfApi.md#getCircleAnnotation) | **GET** /pdf/\{name}/annotations/circle/\{annotationId} | Read document page circle annotation by ID.
*PdfApi* | [**getDiscUsage**](sdk/docs/PdfApi.md#getDiscUsage) | **GET** /storage/disc | Check the disk usage of the current account 
*PdfApi* | [**getDocument**](sdk/docs/PdfApi.md#getDocument) | **GET** /pdf/\{name} | Read common document info.
*PdfApi* | [**getDocumentAnnotations**](sdk/docs/PdfApi.md#getDocumentAnnotations) | **GET** /pdf/\{name}/annotations | Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
*PdfApi* | [**getDocumentAttachmentByIndex**](sdk/docs/PdfApi.md#getDocumentAttachmentByIndex) | **GET** /pdf/\{name}/attachments/\{attachmentIndex} | Read document attachment info by its index.
*PdfApi* | [**getDocumentAttachments**](sdk/docs/PdfApi.md#getDocumentAttachments) | **GET** /pdf/\{name}/attachments | Read document attachments info.
*PdfApi* | [**getDocumentCaretAnnotations**](sdk/docs/PdfApi.md#getDocumentCaretAnnotations) | **GET** /pdf/\{name}/annotations/caret | Read document caret annotations.
*PdfApi* | [**getDocumentCircleAnnotations**](sdk/docs/PdfApi.md#getDocumentCircleAnnotations) | **GET** /pdf/\{name}/annotations/circle | Read document circle annotations.
*PdfApi* | [**getDocumentFileAttachmentAnnotations**](sdk/docs/PdfApi.md#getDocumentFileAttachmentAnnotations) | **GET** /pdf/\{name}/annotations/fileattachment | Read document FileAttachment annotations.
*PdfApi* | [**getDocumentFreeTextAnnotations**](sdk/docs/PdfApi.md#getDocumentFreeTextAnnotations) | **GET** /pdf/\{name}/annotations/freetext | Read document free text annotations.
*PdfApi* | [**getDocumentHighlightAnnotations**](sdk/docs/PdfApi.md#getDocumentHighlightAnnotations) | **GET** /pdf/\{name}/annotations/highlight | Read document highlight annotations.
*PdfApi* | [**getDocumentInkAnnotations**](sdk/docs/PdfApi.md#getDocumentInkAnnotations) | **GET** /pdf/\{name}/annotations/ink | Read document ink annotations.
*PdfApi* | [**getDocumentLineAnnotations**](sdk/docs/PdfApi.md#getDocumentLineAnnotations) | **GET** /pdf/\{name}/annotations/line | Read document line annotations.
*PdfApi* | [**getDocumentMovieAnnotations**](sdk/docs/PdfApi.md#getDocumentMovieAnnotations) | **GET** /pdf/\{name}/annotations/movie | Read document movie annotations.
*PdfApi* | [**getDocumentPolyLineAnnotations**](sdk/docs/PdfApi.md#getDocumentPolyLineAnnotations) | **GET** /pdf/\{name}/annotations/polyline | Read document polyline annotations.
*PdfApi* | [**getDocumentPolygonAnnotations**](sdk/docs/PdfApi.md#getDocumentPolygonAnnotations) | **GET** /pdf/\{name}/annotations/polygon | Read document polygon annotations.
*PdfApi* | [**getDocumentPopupAnnotations**](sdk/docs/PdfApi.md#getDocumentPopupAnnotations) | **GET** /pdf/\{name}/annotations/popup | Read document popup annotations.
*PdfApi* | [**getDocumentPopupAnnotationsByParent**](sdk/docs/PdfApi.md#getDocumentPopupAnnotationsByParent) | **GET** /pdf/\{name}/annotations/\{annotationId}/popup | Read document popup annotations by parent id.
*PdfApi* | [**getDocumentProperties**](sdk/docs/PdfApi.md#getDocumentProperties) | **GET** /pdf/\{name}/documentproperties | Read document properties.
*PdfApi* | [**getDocumentProperty**](sdk/docs/PdfApi.md#getDocumentProperty) | **GET** /pdf/\{name}/documentproperties/\{propertyName} | Read document property by name.
*PdfApi* | [**getDocumentRedactionAnnotations**](sdk/docs/PdfApi.md#getDocumentRedactionAnnotations) | **GET** /pdf/\{name}/annotations/redaction | Read document redaction annotations.
*PdfApi* | [**getDocumentScreenAnnotations**](sdk/docs/PdfApi.md#getDocumentScreenAnnotations) | **GET** /pdf/\{name}/annotations/screen | Read document screen annotations.
*PdfApi* | [**getDocumentSoundAnnotations**](sdk/docs/PdfApi.md#getDocumentSoundAnnotations) | **GET** /pdf/\{name}/annotations/sound | Read document sound annotations.
*PdfApi* | [**getDocumentSquareAnnotations**](sdk/docs/PdfApi.md#getDocumentSquareAnnotations) | **GET** /pdf/\{name}/annotations/square | Read document square annotations.
*PdfApi* | [**getDocumentSquigglyAnnotations**](sdk/docs/PdfApi.md#getDocumentSquigglyAnnotations) | **GET** /pdf/\{name}/annotations/squiggly | Read document squiggly annotations.
*PdfApi* | [**getDocumentStampAnnotations**](sdk/docs/PdfApi.md#getDocumentStampAnnotations) | **GET** /pdf/\{name}/annotations/stamp | Read document stamp annotations.
*PdfApi* | [**getDocumentStamps**](sdk/docs/PdfApi.md#getDocumentStamps) | **GET** /pdf/\{name}/stamps | Read document stamps.
*PdfApi* | [**getDocumentStrikeOutAnnotations**](sdk/docs/PdfApi.md#getDocumentStrikeOutAnnotations) | **GET** /pdf/\{name}/annotations/strikeout | Read document StrikeOut annotations.
*PdfApi* | [**getDocumentTables**](sdk/docs/PdfApi.md#getDocumentTables) | **GET** /pdf/\{name}/tables | Read document tables.
*PdfApi* | [**getDocumentTextAnnotations**](sdk/docs/PdfApi.md#getDocumentTextAnnotations) | **GET** /pdf/\{name}/annotations/text | Read document text annotations.
*PdfApi* | [**getDocumentUnderlineAnnotations**](sdk/docs/PdfApi.md#getDocumentUnderlineAnnotations) | **GET** /pdf/\{name}/annotations/underline | Read document underline annotations.
*PdfApi* | [**getDownload**](sdk/docs/PdfApi.md#getDownload) | **GET** /storage/file | Download a specific file 
*PdfApi* | [**getDownloadDocumentAttachmentByIndex**](sdk/docs/PdfApi.md#getDownloadDocumentAttachmentByIndex) | **GET** /pdf/\{name}/attachments/\{attachmentIndex}/download | Download document attachment content by its index.
*PdfApi* | [**getEpubInStorageToPdf**](sdk/docs/PdfApi.md#getEpubInStorageToPdf) | **GET** /pdf/create/epub | Convert EPUB file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getField**](sdk/docs/PdfApi.md#getField) | **GET** /pdf/\{name}/fields/\{fieldName} | Get document field by name.
*PdfApi* | [**getFields**](sdk/docs/PdfApi.md#getFields) | **GET** /pdf/\{name}/fields | Get document fields.
*PdfApi* | [**getFileAttachmentAnnotation**](sdk/docs/PdfApi.md#getFileAttachmentAnnotation) | **GET** /pdf/\{name}/annotations/fileattachment/\{annotationId} | Read document page FileAttachment annotation by ID.
*PdfApi* | [**getFileAttachmentAnnotationData**](sdk/docs/PdfApi.md#getFileAttachmentAnnotationData) | **GET** /pdf/\{name}/annotations/fileattachment/\{annotationId}/data | Read document page FileAttachment annotation by ID.
*PdfApi* | [**getFreeTextAnnotation**](sdk/docs/PdfApi.md#getFreeTextAnnotation) | **GET** /pdf/\{name}/annotations/freetext/\{annotationId} | Read document page free text annotation by ID.
*PdfApi* | [**getHighlightAnnotation**](sdk/docs/PdfApi.md#getHighlightAnnotation) | **GET** /pdf/\{name}/annotations/highlight/\{annotationId} | Read document page highlight annotation by ID.
*PdfApi* | [**getHtmlInStorageToPdf**](sdk/docs/PdfApi.md#getHtmlInStorageToPdf) | **GET** /pdf/create/html | Convert HTML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getImage**](sdk/docs/PdfApi.md#getImage) | **GET** /pdf/\{name}/images/\{imageId} | Read document image by ID.
*PdfApi* | [**getImageExtractAsGif**](sdk/docs/PdfApi.md#getImageExtractAsGif) | **GET** /pdf/\{name}/images/\{imageId}/extract/gif | Extract document image in GIF format
*PdfApi* | [**getImageExtractAsJpeg**](sdk/docs/PdfApi.md#getImageExtractAsJpeg) | **GET** /pdf/\{name}/images/\{imageId}/extract/jpeg | Extract document image in JPEG format
*PdfApi* | [**getImageExtractAsPng**](sdk/docs/PdfApi.md#getImageExtractAsPng) | **GET** /pdf/\{name}/images/\{imageId}/extract/png | Extract document image in PNG format
*PdfApi* | [**getImageExtractAsTiff**](sdk/docs/PdfApi.md#getImageExtractAsTiff) | **GET** /pdf/\{name}/images/\{imageId}/extract/tiff | Extract document image in TIFF format
*PdfApi* | [**getImages**](sdk/docs/PdfApi.md#getImages) | **GET** /pdf/\{name}/pages/\{pageNumber}/images | Read document images.
*PdfApi* | [**getInkAnnotation**](sdk/docs/PdfApi.md#getInkAnnotation) | **GET** /pdf/\{name}/annotations/ink/\{annotationId} | Read document page ink annotation by ID.
*PdfApi* | [**getIsExist**](sdk/docs/PdfApi.md#getIsExist) | **GET** /storage/exist | Check if a specific file or folder exists
*PdfApi* | [**getIsStorageExist**](sdk/docs/PdfApi.md#getIsStorageExist) | **GET** /storage/\{name}/exist | Check if storage exists 
*PdfApi* | [**getLaTeXInStorageToPdf**](sdk/docs/PdfApi.md#getLaTeXInStorageToPdf) | **GET** /pdf/create/latex | Convert LaTeX file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getLineAnnotation**](sdk/docs/PdfApi.md#getLineAnnotation) | **GET** /pdf/\{name}/annotations/line/\{annotationId} | Read document page line annotation by ID.
*PdfApi* | [**getLinkAnnotation**](sdk/docs/PdfApi.md#getLinkAnnotation) | **GET** /pdf/\{name}/links/\{linkId} | Read document link annotation by ID.
*PdfApi* | [**getListFileVersions**](sdk/docs/PdfApi.md#getListFileVersions) | **GET** /storage/version | Get the file&#39;s versions list 
*PdfApi* | [**getListFiles**](sdk/docs/PdfApi.md#getListFiles) | **GET** /storage/folder | Get the file listing of a specific folder 
*PdfApi* | [**getMhtInStorageToPdf**](sdk/docs/PdfApi.md#getMhtInStorageToPdf) | **GET** /pdf/create/mht | Convert MHT file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getMovieAnnotation**](sdk/docs/PdfApi.md#getMovieAnnotation) | **GET** /pdf/\{name}/annotations/movie/\{annotationId} | Read document page movie annotation by ID.
*PdfApi* | [**getPage**](sdk/docs/PdfApi.md#getPage) | **GET** /pdf/\{name}/pages/\{pageNumber} | Read document page info.
*PdfApi* | [**getPageAnnotations**](sdk/docs/PdfApi.md#getPageAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations | Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
*PdfApi* | [**getPageCaretAnnotations**](sdk/docs/PdfApi.md#getPageCaretAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/caret | Read document page caret annotations.
*PdfApi* | [**getPageCircleAnnotations**](sdk/docs/PdfApi.md#getPageCircleAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/circle | Read document page circle annotations.
*PdfApi* | [**getPageConvertToBmp**](sdk/docs/PdfApi.md#getPageConvertToBmp) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/bmp | Convert document page to Bmp image and return resulting file in response.
*PdfApi* | [**getPageConvertToEmf**](sdk/docs/PdfApi.md#getPageConvertToEmf) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/emf | Convert document page to Emf image and return resulting file in response.
*PdfApi* | [**getPageConvertToGif**](sdk/docs/PdfApi.md#getPageConvertToGif) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/gif | Convert document page to Gif image and return resulting file in response.
*PdfApi* | [**getPageConvertToJpeg**](sdk/docs/PdfApi.md#getPageConvertToJpeg) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/jpeg | Convert document page to Jpeg image and return resulting file in response.
*PdfApi* | [**getPageConvertToPng**](sdk/docs/PdfApi.md#getPageConvertToPng) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/png | Convert document page to Png image and return resulting file in response.
*PdfApi* | [**getPageConvertToTiff**](sdk/docs/PdfApi.md#getPageConvertToTiff) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/tiff | Convert document page to Tiff image  and return resulting file in response.
*PdfApi* | [**getPageFileAttachmentAnnotations**](sdk/docs/PdfApi.md#getPageFileAttachmentAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/fileattachment | Read document page FileAttachment annotations.
*PdfApi* | [**getPageFreeTextAnnotations**](sdk/docs/PdfApi.md#getPageFreeTextAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/freetext | Read document page free text annotations.
*PdfApi* | [**getPageHighlightAnnotations**](sdk/docs/PdfApi.md#getPageHighlightAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/highlight | Read document page highlight annotations.
*PdfApi* | [**getPageInkAnnotations**](sdk/docs/PdfApi.md#getPageInkAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/ink | Read document page ink annotations.
*PdfApi* | [**getPageLineAnnotations**](sdk/docs/PdfApi.md#getPageLineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/line | Read document page line annotations.
*PdfApi* | [**getPageLinkAnnotation**](sdk/docs/PdfApi.md#getPageLinkAnnotation) | **GET** /pdf/\{name}/pages/\{pageNumber}/links/\{linkId} | Read document page link annotation by ID.
*PdfApi* | [**getPageLinkAnnotations**](sdk/docs/PdfApi.md#getPageLinkAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/links | Read document page link annotations.
*PdfApi* | [**getPageMovieAnnotations**](sdk/docs/PdfApi.md#getPageMovieAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/movie | Read document page movie annotations.
*PdfApi* | [**getPagePolyLineAnnotations**](sdk/docs/PdfApi.md#getPagePolyLineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/polyline | Read document page polyline annotations.
*PdfApi* | [**getPagePolygonAnnotations**](sdk/docs/PdfApi.md#getPagePolygonAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/polygon | Read document page polygon annotations.
*PdfApi* | [**getPagePopupAnnotations**](sdk/docs/PdfApi.md#getPagePopupAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/popup | Read document page popup annotations.
*PdfApi* | [**getPageRedactionAnnotations**](sdk/docs/PdfApi.md#getPageRedactionAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/redaction | Read document page redaction annotations.
*PdfApi* | [**getPageScreenAnnotations**](sdk/docs/PdfApi.md#getPageScreenAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/screen | Read document page screen annotations.
*PdfApi* | [**getPageSoundAnnotations**](sdk/docs/PdfApi.md#getPageSoundAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/sound | Read document page sound annotations.
*PdfApi* | [**getPageSquareAnnotations**](sdk/docs/PdfApi.md#getPageSquareAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/square | Read document page square annotations.
*PdfApi* | [**getPageSquigglyAnnotations**](sdk/docs/PdfApi.md#getPageSquigglyAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/squiggly | Read document page squiggly annotations.
*PdfApi* | [**getPageStampAnnotations**](sdk/docs/PdfApi.md#getPageStampAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/stamp | Read document page stamp annotations.
*PdfApi* | [**getPageStamps**](sdk/docs/PdfApi.md#getPageStamps) | **GET** /pdf/\{name}/pages/\{pageNumber}/stamps | Read page document stamps.
*PdfApi* | [**getPageStrikeOutAnnotations**](sdk/docs/PdfApi.md#getPageStrikeOutAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/strikeout | Read document page StrikeOut annotations.
*PdfApi* | [**getPageTables**](sdk/docs/PdfApi.md#getPageTables) | **GET** /pdf/\{name}/pages/\{pageNumber}/tables | Read document page tables.
*PdfApi* | [**getPageText**](sdk/docs/PdfApi.md#getPageText) | **GET** /pdf/\{name}/pages/\{pageNumber}/text | Read page text items.
*PdfApi* | [**getPageTextAnnotations**](sdk/docs/PdfApi.md#getPageTextAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/text | Read document page text annotations.
*PdfApi* | [**getPageUnderlineAnnotations**](sdk/docs/PdfApi.md#getPageUnderlineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/underline | Read document page underline annotations.
*PdfApi* | [**getPages**](sdk/docs/PdfApi.md#getPages) | **GET** /pdf/\{name}/pages | Read document pages info.
*PdfApi* | [**getPclInStorageToPdf**](sdk/docs/PdfApi.md#getPclInStorageToPdf) | **GET** /pdf/create/pcl | Convert PCL file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getPdfInStorageToDoc**](sdk/docs/PdfApi.md#getPdfInStorageToDoc) | **GET** /pdf/\{name}/convert/doc | Converts PDF document (located on storage) to DOC format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToEpub**](sdk/docs/PdfApi.md#getPdfInStorageToEpub) | **GET** /pdf/\{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToHtml**](sdk/docs/PdfApi.md#getPdfInStorageToHtml) | **GET** /pdf/\{name}/convert/html | Converts PDF document (located on storage) to Html format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToLaTeX**](sdk/docs/PdfApi.md#getPdfInStorageToLaTeX) | **GET** /pdf/\{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToMobiXml**](sdk/docs/PdfApi.md#getPdfInStorageToMobiXml) | **GET** /pdf/\{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPdfA**](sdk/docs/PdfApi.md#getPdfInStorageToPdfA) | **GET** /pdf/\{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPptx**](sdk/docs/PdfApi.md#getPdfInStorageToPptx) | **GET** /pdf/\{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToSvg**](sdk/docs/PdfApi.md#getPdfInStorageToSvg) | **GET** /pdf/\{name}/convert/svg | Converts PDF document (located on storage) to SVG format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToTiff**](sdk/docs/PdfApi.md#getPdfInStorageToTiff) | **GET** /pdf/\{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXls**](sdk/docs/PdfApi.md#getPdfInStorageToXls) | **GET** /pdf/\{name}/convert/xls | Converts PDF document (located on storage) to XLS format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXlsx**](sdk/docs/PdfApi.md#getPdfInStorageToXlsx) | **GET** /pdf/\{name}/convert/xlsx | Converts PDF document (located on storage) to XLSX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXml**](sdk/docs/PdfApi.md#getPdfInStorageToXml) | **GET** /pdf/\{name}/convert/xml | Converts PDF document (located on storage) to XML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXps**](sdk/docs/PdfApi.md#getPdfInStorageToXps) | **GET** /pdf/\{name}/convert/xps | Converts PDF document (located on storage) to XPS format and returns resulting file in response content
*PdfApi* | [**getPolyLineAnnotation**](sdk/docs/PdfApi.md#getPolyLineAnnotation) | **GET** /pdf/\{name}/annotations/polyline/\{annotationId} | Read document page polyline annotation by ID.
*PdfApi* | [**getPolygonAnnotation**](sdk/docs/PdfApi.md#getPolygonAnnotation) | **GET** /pdf/\{name}/annotations/polygon/\{annotationId} | Read document page polygon annotation by ID.
*PdfApi* | [**getPopupAnnotation**](sdk/docs/PdfApi.md#getPopupAnnotation) | **GET** /pdf/\{name}/annotations/popup/\{annotationId} | Read document page popup annotation by ID.
*PdfApi* | [**getPsInStorageToPdf**](sdk/docs/PdfApi.md#getPsInStorageToPdf) | **GET** /pdf/create/ps | Convert PS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getRedactionAnnotation**](sdk/docs/PdfApi.md#getRedactionAnnotation) | **GET** /pdf/\{name}/annotations/redaction/\{annotationId} | Read document page redaction annotation by ID.
*PdfApi* | [**getScreenAnnotation**](sdk/docs/PdfApi.md#getScreenAnnotation) | **GET** /pdf/\{name}/annotations/screen/\{annotationId} | Read document page screen annotation by ID.
*PdfApi* | [**getScreenAnnotationData**](sdk/docs/PdfApi.md#getScreenAnnotationData) | **GET** /pdf/\{name}/annotations/screen/\{annotationId}/data | Read document page screen annotation by ID.
*PdfApi* | [**getSoundAnnotation**](sdk/docs/PdfApi.md#getSoundAnnotation) | **GET** /pdf/\{name}/annotations/sound/\{annotationId} | Read document page sound annotation by ID.
*PdfApi* | [**getSoundAnnotationData**](sdk/docs/PdfApi.md#getSoundAnnotationData) | **GET** /pdf/\{name}/annotations/sound/\{annotationId}/data | Read document page sound annotation by ID.
*PdfApi* | [**getSquareAnnotation**](sdk/docs/PdfApi.md#getSquareAnnotation) | **GET** /pdf/\{name}/annotations/square/\{annotationId} | Read document page square annotation by ID.
*PdfApi* | [**getSquigglyAnnotation**](sdk/docs/PdfApi.md#getSquigglyAnnotation) | **GET** /pdf/\{name}/annotations/squiggly/\{annotationId} | Read document page squiggly annotation by ID.
*PdfApi* | [**getStampAnnotation**](sdk/docs/PdfApi.md#getStampAnnotation) | **GET** /pdf/\{name}/annotations/stamp/\{annotationId} | Read document page stamp annotation by ID.
*PdfApi* | [**getStampAnnotationData**](sdk/docs/PdfApi.md#getStampAnnotationData) | **GET** /pdf/\{name}/annotations/stamp/\{annotationId}/data | Read document page stamp annotation by ID.
*PdfApi* | [**getStrikeOutAnnotation**](sdk/docs/PdfApi.md#getStrikeOutAnnotation) | **GET** /pdf/\{name}/annotations/strikeout/\{annotationId} | Read document page StrikeOut annotation by ID.
*PdfApi* | [**getSvgInStorageToPdf**](sdk/docs/PdfApi.md#getSvgInStorageToPdf) | **GET** /pdf/create/svg | Convert SVG file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getTable**](sdk/docs/PdfApi.md#getTable) | **GET** /pdf/\{name}/tables/\{tableId} | Read document page table by ID.
*PdfApi* | [**getText**](sdk/docs/PdfApi.md#getText) | **GET** /pdf/\{name}/text | Read document text.
*PdfApi* | [**getTextAnnotation**](sdk/docs/PdfApi.md#getTextAnnotation) | **GET** /pdf/\{name}/annotations/text/\{annotationId} | Read document page text annotation by ID.
*PdfApi* | [**getUnderlineAnnotation**](sdk/docs/PdfApi.md#getUnderlineAnnotation) | **GET** /pdf/\{name}/annotations/underline/\{annotationId} | Read document page underline annotation by ID.
*PdfApi* | [**getVerifySignature**](sdk/docs/PdfApi.md#getVerifySignature) | **GET** /pdf/\{name}/verifySignature | Verify signature document.
*PdfApi* | [**getWebInStorageToPdf**](sdk/docs/PdfApi.md#getWebInStorageToPdf) | **GET** /pdf/create/web | Convert web page to PDF format and return resulting file in response. 
*PdfApi* | [**getWordsPerPage**](sdk/docs/PdfApi.md#getWordsPerPage) | **GET** /pdf/\{name}/pages/wordCount | Get number of words per document page.
*PdfApi* | [**getXfaPdfInStorageToAcroForm**](sdk/docs/PdfApi.md#getXfaPdfInStorageToAcroForm) | **GET** /pdf/\{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
*PdfApi* | [**getXmlInStorageToPdf**](sdk/docs/PdfApi.md#getXmlInStorageToPdf) | **GET** /pdf/create/xml | Convert XML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXpsInStorageToPdf**](sdk/docs/PdfApi.md#getXpsInStorageToPdf) | **GET** /pdf/create/xps | Convert XPS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXslFoInStorageToPdf**](sdk/docs/PdfApi.md#getXslFoInStorageToPdf) | **GET** /pdf/create/xslfo | Convert XslFo file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**postAppendDocument**](sdk/docs/PdfApi.md#postAppendDocument) | **POST** /pdf/\{name}/appendDocument | Append document to existing one.
*PdfApi* | [**postChangePasswordDocumentInStorage**](sdk/docs/PdfApi.md#postChangePasswordDocumentInStorage) | **POST** /pdf/\{name}/changepassword | Change document password in storage.
*PdfApi* | [**postCreateField**](sdk/docs/PdfApi.md#postCreateField) | **POST** /pdf/\{name}/fields | Create field.
*PdfApi* | [**postDecryptDocumentInStorage**](sdk/docs/PdfApi.md#postDecryptDocumentInStorage) | **POST** /pdf/\{name}/decrypt | Decrypt document in storage.
*PdfApi* | [**postDocumentImageFooter**](sdk/docs/PdfApi.md#postDocumentImageFooter) | **POST** /pdf/\{name}/footer/image | Add document image footer.
*PdfApi* | [**postDocumentImageHeader**](sdk/docs/PdfApi.md#postDocumentImageHeader) | **POST** /pdf/\{name}/header/image | Add document image header.
*PdfApi* | [**postDocumentPageNumberStamps**](sdk/docs/PdfApi.md#postDocumentPageNumberStamps) | **POST** /pdf/\{name}/stamps/pagenumber | Add document page number stamps.
*PdfApi* | [**postDocumentTextFooter**](sdk/docs/PdfApi.md#postDocumentTextFooter) | **POST** /pdf/\{name}/footer/text | Add document text footer.
*PdfApi* | [**postDocumentTextHeader**](sdk/docs/PdfApi.md#postDocumentTextHeader) | **POST** /pdf/\{name}/header/text | Add document text header.
*PdfApi* | [**postDocumentTextReplace**](sdk/docs/PdfApi.md#postDocumentTextReplace) | **POST** /pdf/\{name}/text/replace | Document&#39;s replace text method.
*PdfApi* | [**postEncryptDocumentInStorage**](sdk/docs/PdfApi.md#postEncryptDocumentInStorage) | **POST** /pdf/\{name}/encrypt | Encrypt document in storage.
*PdfApi* | [**postFlattenDocument**](sdk/docs/PdfApi.md#postFlattenDocument) | **POST** /pdf/\{name}/flatten | Flatten the document.
*PdfApi* | [**postInsertImage**](sdk/docs/PdfApi.md#postInsertImage) | **POST** /pdf/\{name}/pages/\{pageNumber}/images | Insert image to document page.
*PdfApi* | [**postMoveFile**](sdk/docs/PdfApi.md#postMoveFile) | **POST** /storage/file | Move a specific file
*PdfApi* | [**postMoveFolder**](sdk/docs/PdfApi.md#postMoveFolder) | **POST** /storage/folder | Move a specific folder 
*PdfApi* | [**postMovePage**](sdk/docs/PdfApi.md#postMovePage) | **POST** /pdf/\{name}/pages/\{pageNumber}/movePage | Move page to new position.
*PdfApi* | [**postOptimizeDocument**](sdk/docs/PdfApi.md#postOptimizeDocument) | **POST** /pdf/\{name}/optimize | Optimize document.
*PdfApi* | [**postPageCaretAnnotations**](sdk/docs/PdfApi.md#postPageCaretAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/caret | Add document page caret annotations.
*PdfApi* | [**postPageCircleAnnotations**](sdk/docs/PdfApi.md#postPageCircleAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/circle | Add document page circle annotations.
*PdfApi* | [**postPageFileAttachmentAnnotations**](sdk/docs/PdfApi.md#postPageFileAttachmentAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/fileattachment | Add document page FileAttachment annotations.
*PdfApi* | [**postPageFreeTextAnnotations**](sdk/docs/PdfApi.md#postPageFreeTextAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/freetext | Add document page free text annotations.
*PdfApi* | [**postPageHighlightAnnotations**](sdk/docs/PdfApi.md#postPageHighlightAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/highlight | Add document page highlight annotations.
*PdfApi* | [**postPageImageStamps**](sdk/docs/PdfApi.md#postPageImageStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/image | Add document page image stamps.
*PdfApi* | [**postPageInkAnnotations**](sdk/docs/PdfApi.md#postPageInkAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/ink | Add document page ink annotations.
*PdfApi* | [**postPageLineAnnotations**](sdk/docs/PdfApi.md#postPageLineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/line | Add document page line annotations.
*PdfApi* | [**postPageLinkAnnotations**](sdk/docs/PdfApi.md#postPageLinkAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/links | Add document page link annotations.
*PdfApi* | [**postPageMovieAnnotations**](sdk/docs/PdfApi.md#postPageMovieAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/movie | Add document page movie annotations.
*PdfApi* | [**postPagePdfPageStamps**](sdk/docs/PdfApi.md#postPagePdfPageStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/pdfpage | Add document pdf page stamps.
*PdfApi* | [**postPagePolyLineAnnotations**](sdk/docs/PdfApi.md#postPagePolyLineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/polyline | Add document page polyline annotations.
*PdfApi* | [**postPagePolygonAnnotations**](sdk/docs/PdfApi.md#postPagePolygonAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/polygon | Add document page polygon annotations.
*PdfApi* | [**postPageRedactionAnnotations**](sdk/docs/PdfApi.md#postPageRedactionAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/redaction | Add document page redaction annotations.
*PdfApi* | [**postPageScreenAnnotations**](sdk/docs/PdfApi.md#postPageScreenAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/screen | Add document page screen annotations.
*PdfApi* | [**postPageSoundAnnotations**](sdk/docs/PdfApi.md#postPageSoundAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/sound | Add document page sound annotations.
*PdfApi* | [**postPageSquareAnnotations**](sdk/docs/PdfApi.md#postPageSquareAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/square | Add document page square annotations.
*PdfApi* | [**postPageSquigglyAnnotations**](sdk/docs/PdfApi.md#postPageSquigglyAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/squiggly | Add document page squiggly annotations.
*PdfApi* | [**postPageStampAnnotations**](sdk/docs/PdfApi.md#postPageStampAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/stamp | Add document page stamp annotations.
*PdfApi* | [**postPageStrikeOutAnnotations**](sdk/docs/PdfApi.md#postPageStrikeOutAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/strikeout | Add document page StrikeOut annotations.
*PdfApi* | [**postPageTables**](sdk/docs/PdfApi.md#postPageTables) | **POST** /pdf/\{name}/pages/\{pageNumber}/tables | Add document page tables.
*PdfApi* | [**postPageTextAnnotations**](sdk/docs/PdfApi.md#postPageTextAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/text | Add document page text annotations.
*PdfApi* | [**postPageTextReplace**](sdk/docs/PdfApi.md#postPageTextReplace) | **POST** /pdf/\{name}/pages/\{pageNumber}/text/replace | Page&#39;s replace text method.
*PdfApi* | [**postPageTextStamps**](sdk/docs/PdfApi.md#postPageTextStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/text | Add document page text stamps.
*PdfApi* | [**postPageUnderlineAnnotations**](sdk/docs/PdfApi.md#postPageUnderlineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/underline | Add document page underline annotations.
*PdfApi* | [**postPopupAnnotation**](sdk/docs/PdfApi.md#postPopupAnnotation) | **POST** /pdf/\{name}/annotations/\{annotationId}/popup | Add document popup annotations.
*PdfApi* | [**postSignDocument**](sdk/docs/PdfApi.md#postSignDocument) | **POST** /pdf/\{name}/sign | Sign document.
*PdfApi* | [**postSignPage**](sdk/docs/PdfApi.md#postSignPage) | **POST** /pdf/\{name}/pages/\{pageNumber}/sign | Sign page.
*PdfApi* | [**postSplitDocument**](sdk/docs/PdfApi.md#postSplitDocument) | **POST** /pdf/\{name}/split | Split document to parts.
*PdfApi* | [**putAddNewPage**](sdk/docs/PdfApi.md#putAddNewPage) | **PUT** /pdf/\{name}/pages | Add new page to end of the document.
*PdfApi* | [**putAddText**](sdk/docs/PdfApi.md#putAddText) | **PUT** /pdf/\{name}/pages/\{pageNumber}/text | Add text to PDF document page.
*PdfApi* | [**putAnnotationsFlatten**](sdk/docs/PdfApi.md#putAnnotationsFlatten) | **PUT** /pdf/\{name}/annotations/flatten | Flattens the annotations of the specified types
*PdfApi* | [**putCaretAnnotation**](sdk/docs/PdfApi.md#putCaretAnnotation) | **PUT** /pdf/\{name}/annotations/caret/\{annotationId} | Replace document caret annotation
*PdfApi* | [**putChangePasswordDocument**](sdk/docs/PdfApi.md#putChangePasswordDocument) | **PUT** /pdf/changepassword | Change document password from content.
*PdfApi* | [**putCircleAnnotation**](sdk/docs/PdfApi.md#putCircleAnnotation) | **PUT** /pdf/\{name}/annotations/circle/\{annotationId} | Replace document circle annotation
*PdfApi* | [**putCreate**](sdk/docs/PdfApi.md#putCreate) | **PUT** /storage/file | Upload a specific file 
*PdfApi* | [**putCreateDocument**](sdk/docs/PdfApi.md#putCreateDocument) | **PUT** /pdf/\{name} | Create empty document.
*PdfApi* | [**putCreateFolder**](sdk/docs/PdfApi.md#putCreateFolder) | **PUT** /storage/folder | Create the folder 
*PdfApi* | [**putDecryptDocument**](sdk/docs/PdfApi.md#putDecryptDocument) | **PUT** /pdf/decrypt | Decrypt document from content.
*PdfApi* | [**putEncryptDocument**](sdk/docs/PdfApi.md#putEncryptDocument) | **PUT** /pdf/encrypt | Encrypt document from content.
*PdfApi* | [**putEpubInStorageToPdf**](sdk/docs/PdfApi.md#putEpubInStorageToPdf) | **PUT** /pdf/\{name}/create/epub | Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putFieldsFlatten**](sdk/docs/PdfApi.md#putFieldsFlatten) | **PUT** /pdf/\{name}/fields/flatten | Flatten form fields in document.
*PdfApi* | [**putFileAttachmentAnnotation**](sdk/docs/PdfApi.md#putFileAttachmentAnnotation) | **PUT** /pdf/\{name}/annotations/fileattachment/\{annotationId} | Replace document FileAttachment annotation
*PdfApi* | [**putFileAttachmentAnnotationDataExtract**](sdk/docs/PdfApi.md#putFileAttachmentAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/fileattachment/\{annotationId}/data/extract | Extract document FileAttachment annotation content to storage
*PdfApi* | [**putFreeTextAnnotation**](sdk/docs/PdfApi.md#putFreeTextAnnotation) | **PUT** /pdf/\{name}/annotations/freetext/\{annotationId} | Replace document free text annotation
*PdfApi* | [**putHighlightAnnotation**](sdk/docs/PdfApi.md#putHighlightAnnotation) | **PUT** /pdf/\{name}/annotations/highlight/\{annotationId} | Replace document highlight annotation
*PdfApi* | [**putHtmlInStorageToPdf**](sdk/docs/PdfApi.md#putHtmlInStorageToPdf) | **PUT** /pdf/\{name}/create/html | Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImageExtractAsGif**](sdk/docs/PdfApi.md#putImageExtractAsGif) | **PUT** /pdf/\{name}/images/\{imageId}/extract/gif | Extract document image in GIF format to folder
*PdfApi* | [**putImageExtractAsJpeg**](sdk/docs/PdfApi.md#putImageExtractAsJpeg) | **PUT** /pdf/\{name}/images/\{imageId}/extract/jpeg | Extract document image in JPEG format to folder
*PdfApi* | [**putImageExtractAsPng**](sdk/docs/PdfApi.md#putImageExtractAsPng) | **PUT** /pdf/\{name}/images/\{imageId}/extract/png | Extract document image in PNG format to folder
*PdfApi* | [**putImageExtractAsTiff**](sdk/docs/PdfApi.md#putImageExtractAsTiff) | **PUT** /pdf/\{name}/images/\{imageId}/extract/tiff | Extract document image in TIFF format to folder
*PdfApi* | [**putImageInStorageToPdf**](sdk/docs/PdfApi.md#putImageInStorageToPdf) | **PUT** /pdf/\{name}/create/images | Convert image file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImagesExtractAsGif**](sdk/docs/PdfApi.md#putImagesExtractAsGif) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/gif | Extract document images in GIF format to folder.
*PdfApi* | [**putImagesExtractAsJpeg**](sdk/docs/PdfApi.md#putImagesExtractAsJpeg) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/jpeg | Extract document images in JPEG format to folder.
*PdfApi* | [**putImagesExtractAsPng**](sdk/docs/PdfApi.md#putImagesExtractAsPng) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/png | Extract document images in PNG format to folder.
*PdfApi* | [**putImagesExtractAsTiff**](sdk/docs/PdfApi.md#putImagesExtractAsTiff) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/tiff | Extract document images in TIFF format to folder.
*PdfApi* | [**putInkAnnotation**](sdk/docs/PdfApi.md#putInkAnnotation) | **PUT** /pdf/\{name}/annotations/ink/\{annotationId} | Replace document ink annotation
*PdfApi* | [**putLaTeXInStorageToPdf**](sdk/docs/PdfApi.md#putLaTeXInStorageToPdf) | **PUT** /pdf/\{name}/create/latex | Convert LaTeX file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putLineAnnotation**](sdk/docs/PdfApi.md#putLineAnnotation) | **PUT** /pdf/\{name}/annotations/line/\{annotationId} | Replace document line annotation
*PdfApi* | [**putLinkAnnotation**](sdk/docs/PdfApi.md#putLinkAnnotation) | **PUT** /pdf/\{name}/links/\{linkId} | Replace document page link annotations
*PdfApi* | [**putMergeDocuments**](sdk/docs/PdfApi.md#putMergeDocuments) | **PUT** /pdf/\{name}/merge | Merge a list of documents.
*PdfApi* | [**putMhtInStorageToPdf**](sdk/docs/PdfApi.md#putMhtInStorageToPdf) | **PUT** /pdf/\{name}/create/mht | Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putMovieAnnotation**](sdk/docs/PdfApi.md#putMovieAnnotation) | **PUT** /pdf/\{name}/annotations/movie/\{annotationId} | Replace document movie annotation
*PdfApi* | [**putPageAddStamp**](sdk/docs/PdfApi.md#putPageAddStamp) | **PUT** /pdf/\{name}/pages/\{pageNumber}/stamp | Add page stamp.
*PdfApi* | [**putPageConvertToBmp**](sdk/docs/PdfApi.md#putPageConvertToBmp) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/bmp | Convert document page to bmp image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToEmf**](sdk/docs/PdfApi.md#putPageConvertToEmf) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/emf | Convert document page to emf image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToGif**](sdk/docs/PdfApi.md#putPageConvertToGif) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/gif | Convert document page to gif image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToJpeg**](sdk/docs/PdfApi.md#putPageConvertToJpeg) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/jpeg | Convert document page to Jpeg image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToPng**](sdk/docs/PdfApi.md#putPageConvertToPng) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/png | Convert document page to png image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToTiff**](sdk/docs/PdfApi.md#putPageConvertToTiff) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/tiff | Convert document page to Tiff image and upload resulting file to storage.
*PdfApi* | [**putPclInStorageToPdf**](sdk/docs/PdfApi.md#putPclInStorageToPdf) | **PUT** /pdf/\{name}/create/pcl | Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putPdfInRequestToDoc**](sdk/docs/PdfApi.md#putPdfInRequestToDoc) | **PUT** /pdf/convert/doc | Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToEpub**](sdk/docs/PdfApi.md#putPdfInRequestToEpub) | **PUT** /pdf/convert/epub | Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToHtml**](sdk/docs/PdfApi.md#putPdfInRequestToHtml) | **PUT** /pdf/convert/html | Converts PDF document (in request content) to Html format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToLaTeX**](sdk/docs/PdfApi.md#putPdfInRequestToLaTeX) | **PUT** /pdf/convert/latex | Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToMobiXml**](sdk/docs/PdfApi.md#putPdfInRequestToMobiXml) | **PUT** /pdf/convert/mobixml | Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPdfA**](sdk/docs/PdfApi.md#putPdfInRequestToPdfA) | **PUT** /pdf/convert/pdfa | Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPptx**](sdk/docs/PdfApi.md#putPdfInRequestToPptx) | **PUT** /pdf/convert/pptx | Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToSvg**](sdk/docs/PdfApi.md#putPdfInRequestToSvg) | **PUT** /pdf/convert/svg | Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToTiff**](sdk/docs/PdfApi.md#putPdfInRequestToTiff) | **PUT** /pdf/convert/tiff | Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXls**](sdk/docs/PdfApi.md#putPdfInRequestToXls) | **PUT** /pdf/convert/xls | Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXlsx**](sdk/docs/PdfApi.md#putPdfInRequestToXlsx) | **PUT** /pdf/convert/xlsx | Converts PDF document (in request content) to XLSX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXml**](sdk/docs/PdfApi.md#putPdfInRequestToXml) | **PUT** /pdf/convert/xml | Converts PDF document (in request content) to XML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXps**](sdk/docs/PdfApi.md#putPdfInRequestToXps) | **PUT** /pdf/convert/xps | Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInStorageToDoc**](sdk/docs/PdfApi.md#putPdfInStorageToDoc) | **PUT** /pdf/\{name}/convert/doc | Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToEpub**](sdk/docs/PdfApi.md#putPdfInStorageToEpub) | **PUT** /pdf/\{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToHtml**](sdk/docs/PdfApi.md#putPdfInStorageToHtml) | **PUT** /pdf/\{name}/convert/html | Converts PDF document (located on storage) to Html format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToLaTeX**](sdk/docs/PdfApi.md#putPdfInStorageToLaTeX) | **PUT** /pdf/\{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToMobiXml**](sdk/docs/PdfApi.md#putPdfInStorageToMobiXml) | **PUT** /pdf/\{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPdfA**](sdk/docs/PdfApi.md#putPdfInStorageToPdfA) | **PUT** /pdf/\{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPptx**](sdk/docs/PdfApi.md#putPdfInStorageToPptx) | **PUT** /pdf/\{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToSvg**](sdk/docs/PdfApi.md#putPdfInStorageToSvg) | **PUT** /pdf/\{name}/convert/svg | Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToTiff**](sdk/docs/PdfApi.md#putPdfInStorageToTiff) | **PUT** /pdf/\{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXls**](sdk/docs/PdfApi.md#putPdfInStorageToXls) | **PUT** /pdf/\{name}/convert/xls | Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXlsx**](sdk/docs/PdfApi.md#putPdfInStorageToXlsx) | **PUT** /pdf/\{name}/convert/xlsx | Converts PDF document (located on storage) to XLSX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXml**](sdk/docs/PdfApi.md#putPdfInStorageToXml) | **PUT** /pdf/\{name}/convert/xml | Converts PDF document (located on storage) to XML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXps**](sdk/docs/PdfApi.md#putPdfInStorageToXps) | **PUT** /pdf/\{name}/convert/xps | Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
*PdfApi* | [**putPolyLineAnnotation**](sdk/docs/PdfApi.md#putPolyLineAnnotation) | **PUT** /pdf/\{name}/annotations/polyline/\{annotationId} | Replace document polyline annotation
*PdfApi* | [**putPolygonAnnotation**](sdk/docs/PdfApi.md#putPolygonAnnotation) | **PUT** /pdf/\{name}/annotations/polygon/\{annotationId} | Replace document polygon annotation
*PdfApi* | [**putPopupAnnotation**](sdk/docs/PdfApi.md#putPopupAnnotation) | **PUT** /pdf/\{name}/annotations/popup/\{annotationId} | Replace document popup annotation
*PdfApi* | [**putPrivileges**](sdk/docs/PdfApi.md#putPrivileges) | **PUT** /pdf/\{name}/privileges | Update privilege document.
*PdfApi* | [**putPsInStorageToPdf**](sdk/docs/PdfApi.md#putPsInStorageToPdf) | **PUT** /pdf/\{name}/create/ps | Convert PS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putRedactionAnnotation**](sdk/docs/PdfApi.md#putRedactionAnnotation) | **PUT** /pdf/\{name}/annotations/redaction/\{annotationId} | Replace document redaction annotation
*PdfApi* | [**putReplaceImage**](sdk/docs/PdfApi.md#putReplaceImage) | **PUT** /pdf/\{name}/images/\{imageId} | Replace document image.
*PdfApi* | [**putScreenAnnotation**](sdk/docs/PdfApi.md#putScreenAnnotation) | **PUT** /pdf/\{name}/annotations/screen/\{annotationId} | Replace document screen annotation
*PdfApi* | [**putScreenAnnotationDataExtract**](sdk/docs/PdfApi.md#putScreenAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/screen/\{annotationId}/data/extract | Extract document screen annotation content to storage
*PdfApi* | [**putSearchableDocument**](sdk/docs/PdfApi.md#putSearchableDocument) | **PUT** /pdf/\{name}/ocr | Create searchable PDF document. Generate OCR layer for images in input PDF document.
*PdfApi* | [**putSetProperty**](sdk/docs/PdfApi.md#putSetProperty) | **PUT** /pdf/\{name}/documentproperties/\{propertyName} | Add/update document property.
*PdfApi* | [**putSoundAnnotation**](sdk/docs/PdfApi.md#putSoundAnnotation) | **PUT** /pdf/\{name}/annotations/sound/\{annotationId} | Replace document sound annotation
*PdfApi* | [**putSoundAnnotationDataExtract**](sdk/docs/PdfApi.md#putSoundAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/sound/\{annotationId}/data/extract | Extract document sound annotation content to storage
*PdfApi* | [**putSquareAnnotation**](sdk/docs/PdfApi.md#putSquareAnnotation) | **PUT** /pdf/\{name}/annotations/square/\{annotationId} | Replace document square annotation
*PdfApi* | [**putSquigglyAnnotation**](sdk/docs/PdfApi.md#putSquigglyAnnotation) | **PUT** /pdf/\{name}/annotations/squiggly/\{annotationId} | Replace document squiggly annotation
*PdfApi* | [**putStampAnnotation**](sdk/docs/PdfApi.md#putStampAnnotation) | **PUT** /pdf/\{name}/annotations/stamp/\{annotationId} | Replace document stamp annotation
*PdfApi* | [**putStampAnnotationDataExtract**](sdk/docs/PdfApi.md#putStampAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/stamp/\{annotationId}/data/extract | Extract document stamp annotation content to storage
*PdfApi* | [**putStrikeOutAnnotation**](sdk/docs/PdfApi.md#putStrikeOutAnnotation) | **PUT** /pdf/\{name}/annotations/strikeout/\{annotationId} | Replace document StrikeOut annotation
*PdfApi* | [**putSvgInStorageToPdf**](sdk/docs/PdfApi.md#putSvgInStorageToPdf) | **PUT** /pdf/\{name}/create/svg | Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putTable**](sdk/docs/PdfApi.md#putTable) | **PUT** /pdf/\{name}/tables/\{tableId} | Replace document page table.
*PdfApi* | [**putTextAnnotation**](sdk/docs/PdfApi.md#putTextAnnotation) | **PUT** /pdf/\{name}/annotations/text/\{annotationId} | Replace document text annotation
*PdfApi* | [**putUnderlineAnnotation**](sdk/docs/PdfApi.md#putUnderlineAnnotation) | **PUT** /pdf/\{name}/annotations/underline/\{annotationId} | Replace document underline annotation
*PdfApi* | [**putUpdateField**](sdk/docs/PdfApi.md#putUpdateField) | **PUT** /pdf/\{name}/fields/\{fieldName} | Update field.
*PdfApi* | [**putUpdateFields**](sdk/docs/PdfApi.md#putUpdateFields) | **PUT** /pdf/\{name}/fields | Update fields.
*PdfApi* | [**putWebInStorageToPdf**](sdk/docs/PdfApi.md#putWebInStorageToPdf) | **PUT** /pdf/\{name}/create/web | Convert web page to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXfaPdfInRequestToAcroForm**](sdk/docs/PdfApi.md#putXfaPdfInRequestToAcroForm) | **PUT** /pdf/convert/xfatoacroform | Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
*PdfApi* | [**putXfaPdfInStorageToAcroForm**](sdk/docs/PdfApi.md#putXfaPdfInStorageToAcroForm) | **PUT** /pdf/\{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
*PdfApi* | [**putXmlInStorageToPdf**](sdk/docs/PdfApi.md#putXmlInStorageToPdf) | **PUT** /pdf/\{name}/create/xml | Convert XML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXpsInStorageToPdf**](sdk/docs/PdfApi.md#putXpsInStorageToPdf) | **PUT** /pdf/\{name}/create/xps | Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXslFoInStorageToPdf**](sdk/docs/PdfApi.md#putXslFoInStorageToPdf) | **PUT** /pdf/\{name}/create/xslfo | Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 


## Documentation for Models

 - [AnnotationFlags](sdk/docs/AnnotationFlags.md)
 - [AnnotationState](sdk/docs/AnnotationState.md)
 - [AnnotationType](sdk/docs/AnnotationType.md)
 - [AntialiasingProcessingType](sdk/docs/AntialiasingProcessingType.md)
 - [AppendDocument](sdk/docs/AppendDocument.md)
 - [AsposeResponse](sdk/docs/AsposeResponse.md)
 - [BorderCornerStyle](sdk/docs/BorderCornerStyle.md)
 - [BorderInfo](sdk/docs/BorderInfo.md)
 - [CapStyle](sdk/docs/CapStyle.md)
 - [CaptionPosition](sdk/docs/CaptionPosition.md)
 - [CaretSymbol](sdk/docs/CaretSymbol.md)
 - [Cell](sdk/docs/Cell.md)
 - [CellRecognized](sdk/docs/CellRecognized.md)
 - [Color](sdk/docs/Color.md)
 - [ColorDepth](sdk/docs/ColorDepth.md)
 - [ColumnAdjustment](sdk/docs/ColumnAdjustment.md)
 - [CompressionType](sdk/docs/CompressionType.md)
 - [CryptoAlgorithm](sdk/docs/CryptoAlgorithm.md)
 - [DiscUsage](sdk/docs/DiscUsage.md)
 - [DocFormat](sdk/docs/DocFormat.md)
 - [DocRecognitionMode](sdk/docs/DocRecognitionMode.md)
 - [DocumentPrivilege](sdk/docs/DocumentPrivilege.md)
 - [EpubRecognitionMode](sdk/docs/EpubRecognitionMode.md)
 - [FieldType](sdk/docs/FieldType.md)
 - [FileExist](sdk/docs/FileExist.md)
 - [FileIcon](sdk/docs/FileIcon.md)
 - [FontEncodingRules](sdk/docs/FontEncodingRules.md)
 - [FontSavingModes](sdk/docs/FontSavingModes.md)
 - [FontStyles](sdk/docs/FontStyles.md)
 - [FreeTextIntent](sdk/docs/FreeTextIntent.md)
 - [GraphInfo](sdk/docs/GraphInfo.md)
 - [HorizontalAlignment](sdk/docs/HorizontalAlignment.md)
 - [HtmlDocumentType](sdk/docs/HtmlDocumentType.md)
 - [HtmlMarkupGenerationModes](sdk/docs/HtmlMarkupGenerationModes.md)
 - [ImageSrcType](sdk/docs/ImageSrcType.md)
 - [ImageTemplate](sdk/docs/ImageTemplate.md)
 - [ImageTemplatesRequest](sdk/docs/ImageTemplatesRequest.md)
 - [Justification](sdk/docs/Justification.md)
 - [LettersPositioningMethods](sdk/docs/LettersPositioningMethods.md)
 - [LineEnding](sdk/docs/LineEnding.md)
 - [LineIntent](sdk/docs/LineIntent.md)
 - [LineSpacing](sdk/docs/LineSpacing.md)
 - [Link](sdk/docs/Link.md)
 - [LinkActionType](sdk/docs/LinkActionType.md)
 - [LinkElement](sdk/docs/LinkElement.md)
 - [LinkHighlightingMode](sdk/docs/LinkHighlightingMode.md)
 - [MarginInfo](sdk/docs/MarginInfo.md)
 - [MergeDocuments](sdk/docs/MergeDocuments.md)
 - [OptimizeOptions](sdk/docs/OptimizeOptions.md)
 - [PageWordCount](sdk/docs/PageWordCount.md)
 - [Paragraph](sdk/docs/Paragraph.md)
 - [PartsEmbeddingModes](sdk/docs/PartsEmbeddingModes.md)
 - [PdfAType](sdk/docs/PdfAType.md)
 - [PermissionsFlags](sdk/docs/PermissionsFlags.md)
 - [Point](sdk/docs/Point.md)
 - [PolyIntent](sdk/docs/PolyIntent.md)
 - [Position](sdk/docs/Position.md)
 - [RasterImagesSavingModes](sdk/docs/RasterImagesSavingModes.md)
 - [Rectangle](sdk/docs/Rectangle.md)
 - [Rotation](sdk/docs/Rotation.md)
 - [Row](sdk/docs/Row.md)
 - [RowRecognized](sdk/docs/RowRecognized.md)
 - [Segment](sdk/docs/Segment.md)
 - [ShapeType](sdk/docs/ShapeType.md)
 - [Signature](sdk/docs/Signature.md)
 - [SignatureType](sdk/docs/SignatureType.md)
 - [SoundEncoding](sdk/docs/SoundEncoding.md)
 - [SoundIcon](sdk/docs/SoundIcon.md)
 - [SplitResult](sdk/docs/SplitResult.md)
 - [Stamp](sdk/docs/Stamp.md)
 - [StampIcon](sdk/docs/StampIcon.md)
 - [StampType](sdk/docs/StampType.md)
 - [TableBroken](sdk/docs/TableBroken.md)
 - [TextHorizontalAlignment](sdk/docs/TextHorizontalAlignment.md)
 - [TextIcon](sdk/docs/TextIcon.md)
 - [TextLine](sdk/docs/TextLine.md)
 - [TextRect](sdk/docs/TextRect.md)
 - [TextRects](sdk/docs/TextRects.md)
 - [TextReplace](sdk/docs/TextReplace.md)
 - [TextReplaceListRequest](sdk/docs/TextReplaceListRequest.md)
 - [TextState](sdk/docs/TextState.md)
 - [TextStyle](sdk/docs/TextStyle.md)
 - [VerticalAlignment](sdk/docs/VerticalAlignment.md)
 - [WordCount](sdk/docs/WordCount.md)
 - [WrapMode](sdk/docs/WrapMode.md)
 - [Annotation](sdk/docs/Annotation.md)
 - [AnnotationsInfo](sdk/docs/AnnotationsInfo.md)
 - [AnnotationsInfoResponse](sdk/docs/AnnotationsInfoResponse.md)
 - [Attachment](sdk/docs/Attachment.md)
 - [AttachmentResponse](sdk/docs/AttachmentResponse.md)
 - [Attachments](sdk/docs/Attachments.md)
 - [AttachmentsResponse](sdk/docs/AttachmentsResponse.md)
 - [CaretAnnotationResponse](sdk/docs/CaretAnnotationResponse.md)
 - [CaretAnnotations](sdk/docs/CaretAnnotations.md)
 - [CaretAnnotationsResponse](sdk/docs/CaretAnnotationsResponse.md)
 - [CircleAnnotationResponse](sdk/docs/CircleAnnotationResponse.md)
 - [CircleAnnotations](sdk/docs/CircleAnnotations.md)
 - [CircleAnnotationsResponse](sdk/docs/CircleAnnotationsResponse.md)
 - [DiscUsageResponse](sdk/docs/DiscUsageResponse.md)
 - [Document](sdk/docs/Document.md)
 - [DocumentPageResponse](sdk/docs/DocumentPageResponse.md)
 - [DocumentPagesResponse](sdk/docs/DocumentPagesResponse.md)
 - [DocumentProperties](sdk/docs/DocumentProperties.md)
 - [DocumentPropertiesResponse](sdk/docs/DocumentPropertiesResponse.md)
 - [DocumentProperty](sdk/docs/DocumentProperty.md)
 - [DocumentPropertyResponse](sdk/docs/DocumentPropertyResponse.md)
 - [DocumentResponse](sdk/docs/DocumentResponse.md)
 - [Field](sdk/docs/Field.md)
 - [FieldResponse](sdk/docs/FieldResponse.md)
 - [Fields](sdk/docs/Fields.md)
 - [FieldsResponse](sdk/docs/FieldsResponse.md)
 - [FileAttachmentAnnotationResponse](sdk/docs/FileAttachmentAnnotationResponse.md)
 - [FileAttachmentAnnotations](sdk/docs/FileAttachmentAnnotations.md)
 - [FileAttachmentAnnotationsResponse](sdk/docs/FileAttachmentAnnotationsResponse.md)
 - [FileExistResponse](sdk/docs/FileExistResponse.md)
 - [FileVersion](sdk/docs/FileVersion.md)
 - [FileVersionsResponse](sdk/docs/FileVersionsResponse.md)
 - [FilesResponse](sdk/docs/FilesResponse.md)
 - [FreeTextAnnotationResponse](sdk/docs/FreeTextAnnotationResponse.md)
 - [FreeTextAnnotations](sdk/docs/FreeTextAnnotations.md)
 - [FreeTextAnnotationsResponse](sdk/docs/FreeTextAnnotationsResponse.md)
 - [HighlightAnnotationResponse](sdk/docs/HighlightAnnotationResponse.md)
 - [HighlightAnnotations](sdk/docs/HighlightAnnotations.md)
 - [HighlightAnnotationsResponse](sdk/docs/HighlightAnnotationsResponse.md)
 - [Image](sdk/docs/Image.md)
 - [ImageResponse](sdk/docs/ImageResponse.md)
 - [Images](sdk/docs/Images.md)
 - [ImagesResponse](sdk/docs/ImagesResponse.md)
 - [InkAnnotationResponse](sdk/docs/InkAnnotationResponse.md)
 - [InkAnnotations](sdk/docs/InkAnnotations.md)
 - [InkAnnotationsResponse](sdk/docs/InkAnnotationsResponse.md)
 - [LineAnnotationResponse](sdk/docs/LineAnnotationResponse.md)
 - [LineAnnotations](sdk/docs/LineAnnotations.md)
 - [LineAnnotationsResponse](sdk/docs/LineAnnotationsResponse.md)
 - [LinkAnnotation](sdk/docs/LinkAnnotation.md)
 - [LinkAnnotationResponse](sdk/docs/LinkAnnotationResponse.md)
 - [LinkAnnotations](sdk/docs/LinkAnnotations.md)
 - [LinkAnnotationsResponse](sdk/docs/LinkAnnotationsResponse.md)
 - [MovieAnnotationResponse](sdk/docs/MovieAnnotationResponse.md)
 - [MovieAnnotations](sdk/docs/MovieAnnotations.md)
 - [MovieAnnotationsResponse](sdk/docs/MovieAnnotationsResponse.md)
 - [Page](sdk/docs/Page.md)
 - [Pages](sdk/docs/Pages.md)
 - [PolyLineAnnotationResponse](sdk/docs/PolyLineAnnotationResponse.md)
 - [PolyLineAnnotations](sdk/docs/PolyLineAnnotations.md)
 - [PolyLineAnnotationsResponse](sdk/docs/PolyLineAnnotationsResponse.md)
 - [PolygonAnnotationResponse](sdk/docs/PolygonAnnotationResponse.md)
 - [PolygonAnnotations](sdk/docs/PolygonAnnotations.md)
 - [PolygonAnnotationsResponse](sdk/docs/PolygonAnnotationsResponse.md)
 - [PopupAnnotationResponse](sdk/docs/PopupAnnotationResponse.md)
 - [PopupAnnotations](sdk/docs/PopupAnnotations.md)
 - [PopupAnnotationsResponse](sdk/docs/PopupAnnotationsResponse.md)
 - [RedactionAnnotationResponse](sdk/docs/RedactionAnnotationResponse.md)
 - [RedactionAnnotations](sdk/docs/RedactionAnnotations.md)
 - [RedactionAnnotationsResponse](sdk/docs/RedactionAnnotationsResponse.md)
 - [ScreenAnnotationResponse](sdk/docs/ScreenAnnotationResponse.md)
 - [ScreenAnnotations](sdk/docs/ScreenAnnotations.md)
 - [ScreenAnnotationsResponse](sdk/docs/ScreenAnnotationsResponse.md)
 - [SignatureVerifyResponse](sdk/docs/SignatureVerifyResponse.md)
 - [SoundAnnotationResponse](sdk/docs/SoundAnnotationResponse.md)
 - [SoundAnnotations](sdk/docs/SoundAnnotations.md)
 - [SoundAnnotationsResponse](sdk/docs/SoundAnnotationsResponse.md)
 - [SplitResultDocument](sdk/docs/SplitResultDocument.md)
 - [SplitResultResponse](sdk/docs/SplitResultResponse.md)
 - [SquareAnnotationResponse](sdk/docs/SquareAnnotationResponse.md)
 - [SquareAnnotations](sdk/docs/SquareAnnotations.md)
 - [SquareAnnotationsResponse](sdk/docs/SquareAnnotationsResponse.md)
 - [SquigglyAnnotationResponse](sdk/docs/SquigglyAnnotationResponse.md)
 - [SquigglyAnnotations](sdk/docs/SquigglyAnnotations.md)
 - [SquigglyAnnotationsResponse](sdk/docs/SquigglyAnnotationsResponse.md)
 - [StampAnnotationResponse](sdk/docs/StampAnnotationResponse.md)
 - [StampAnnotations](sdk/docs/StampAnnotations.md)
 - [StampAnnotationsResponse](sdk/docs/StampAnnotationsResponse.md)
 - [StampBase](sdk/docs/StampBase.md)
 - [StampInfo](sdk/docs/StampInfo.md)
 - [StampsInfo](sdk/docs/StampsInfo.md)
 - [StampsInfoResponse](sdk/docs/StampsInfoResponse.md)
 - [StorageExistResponse](sdk/docs/StorageExistResponse.md)
 - [StrikeOutAnnotationResponse](sdk/docs/StrikeOutAnnotationResponse.md)
 - [StrikeOutAnnotations](sdk/docs/StrikeOutAnnotations.md)
 - [StrikeOutAnnotationsResponse](sdk/docs/StrikeOutAnnotationsResponse.md)
 - [Table](sdk/docs/Table.md)
 - [TableRecognized](sdk/docs/TableRecognized.md)
 - [TableRecognizedResponse](sdk/docs/TableRecognizedResponse.md)
 - [TablesRecognized](sdk/docs/TablesRecognized.md)
 - [TablesRecognizedResponse](sdk/docs/TablesRecognizedResponse.md)
 - [TextAnnotationResponse](sdk/docs/TextAnnotationResponse.md)
 - [TextAnnotations](sdk/docs/TextAnnotations.md)
 - [TextAnnotationsResponse](sdk/docs/TextAnnotationsResponse.md)
 - [TextRectsResponse](sdk/docs/TextRectsResponse.md)
 - [TextReplaceResponse](sdk/docs/TextReplaceResponse.md)
 - [UnderlineAnnotationResponse](sdk/docs/UnderlineAnnotationResponse.md)
 - [UnderlineAnnotations](sdk/docs/UnderlineAnnotations.md)
 - [UnderlineAnnotationsResponse](sdk/docs/UnderlineAnnotationsResponse.md)
 - [WordCountResponse](sdk/docs/WordCountResponse.md)
 - [AnnotationInfo](sdk/docs/AnnotationInfo.md)
 - [ImageFooter](sdk/docs/ImageFooter.md)
 - [ImageHeader](sdk/docs/ImageHeader.md)
 - [ImageStamp](sdk/docs/ImageStamp.md)
 - [MarkupAnnotation](sdk/docs/MarkupAnnotation.md)
 - [MovieAnnotation](sdk/docs/MovieAnnotation.md)
 - [PageNumberStamp](sdk/docs/PageNumberStamp.md)
 - [PdfPageStamp](sdk/docs/PdfPageStamp.md)
 - [PopupAnnotation](sdk/docs/PopupAnnotation.md)
 - [RedactionAnnotation](sdk/docs/RedactionAnnotation.md)
 - [ScreenAnnotation](sdk/docs/ScreenAnnotation.md)
 - [TextFooter](sdk/docs/TextFooter.md)
 - [TextHeader](sdk/docs/TextHeader.md)
 - [TextStamp](sdk/docs/TextStamp.md)
 - [CaretAnnotation](sdk/docs/CaretAnnotation.md)
 - [CommonFigureAnnotation](sdk/docs/CommonFigureAnnotation.md)
 - [FileAttachmentAnnotation](sdk/docs/FileAttachmentAnnotation.md)
 - [FreeTextAnnotation](sdk/docs/FreeTextAnnotation.md)
 - [HighlightAnnotation](sdk/docs/HighlightAnnotation.md)
 - [InkAnnotation](sdk/docs/InkAnnotation.md)
 - [LineAnnotation](sdk/docs/LineAnnotation.md)
 - [PolyAnnotation](sdk/docs/PolyAnnotation.md)
 - [PopupAnnotationWithParent](sdk/docs/PopupAnnotationWithParent.md)
 - [SoundAnnotation](sdk/docs/SoundAnnotation.md)
 - [SquigglyAnnotation](sdk/docs/SquigglyAnnotation.md)
 - [StampAnnotation](sdk/docs/StampAnnotation.md)
 - [StrikeOutAnnotation](sdk/docs/StrikeOutAnnotation.md)
 - [TextAnnotation](sdk/docs/TextAnnotation.md)
 - [UnderlineAnnotation](sdk/docs/UnderlineAnnotation.md)
 - [CircleAnnotation](sdk/docs/CircleAnnotation.md)
 - [PolyLineAnnotation](sdk/docs/PolyLineAnnotation.md)
 - [PolygonAnnotation](sdk/docs/PolygonAnnotation.md)
 - [SquareAnnotation](sdk/docs/SquareAnnotation.md)

