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
    <version>18.9.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cloud-pdf-android:18.9.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cloud-pdf-android-18.9.0.jar
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
*PdfApi* | [**deleteAnnotation**](docs/PdfApi.md#deleteAnnotation) | **DELETE** /pdf/{name}/annotations/{annotationId} | Delete document annotation by ID
*PdfApi* | [**deleteDocumentAnnotations**](docs/PdfApi.md#deleteDocumentAnnotations) | **DELETE** /pdf/{name}/annotations | Delete all annotations from the document
*PdfApi* | [**deleteDocumentLinkAnnotations**](docs/PdfApi.md#deleteDocumentLinkAnnotations) | **DELETE** /pdf/{name}/links | Delete all link annotations from the document
*PdfApi* | [**deleteField**](docs/PdfApi.md#deleteField) | **DELETE** /pdf/{name}/fields/{fieldName} | Delete document field by name.
*PdfApi* | [**deleteImage**](docs/PdfApi.md#deleteImage) | **DELETE** /pdf/{name}/images/{imageId} | Delete image from document page.
*PdfApi* | [**deleteLinkAnnotation**](docs/PdfApi.md#deleteLinkAnnotation) | **DELETE** /pdf/{name}/links/{linkId} | Delete document page link annotation by ID
*PdfApi* | [**deletePage**](docs/PdfApi.md#deletePage) | **DELETE** /pdf/{name}/pages/{pageNumber} | Delete document page by its number.
*PdfApi* | [**deletePageAnnotations**](docs/PdfApi.md#deletePageAnnotations) | **DELETE** /pdf/{name}/pages/{pageNumber}/annotations | Delete all annotations from the page
*PdfApi* | [**deletePageLinkAnnotations**](docs/PdfApi.md#deletePageLinkAnnotations) | **DELETE** /pdf/{name}/pages/{pageNumber}/links | Delete all link annotations from the page
*PdfApi* | [**deleteProperties**](docs/PdfApi.md#deleteProperties) | **DELETE** /pdf/{name}/documentproperties | Delete custom document properties.
*PdfApi* | [**deleteProperty**](docs/PdfApi.md#deleteProperty) | **DELETE** /pdf/{name}/documentproperties/{propertyName} | Delete document property.
*PdfApi* | [**getDocument**](docs/PdfApi.md#getDocument) | **GET** /pdf/{name} | Read common document info.
*PdfApi* | [**getDocumentAnnotations**](docs/PdfApi.md#getDocumentAnnotations) | **GET** /pdf/{name}/annotations | Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
*PdfApi* | [**getDocumentAttachmentByIndex**](docs/PdfApi.md#getDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex} | Read document attachment info by its index.
*PdfApi* | [**getDocumentAttachments**](docs/PdfApi.md#getDocumentAttachments) | **GET** /pdf/{name}/attachments | Read document attachments info.
*PdfApi* | [**getDocumentBookmarks**](docs/PdfApi.md#getDocumentBookmarks) | **GET** /pdf/{name}/bookmarks | Read document bookmark/bookmarks (including children).
*PdfApi* | [**getDocumentFreeTextAnnotations**](docs/PdfApi.md#getDocumentFreeTextAnnotations) | **GET** /pdf/{name}/annotations/freetext | Read document free text annotations.
*PdfApi* | [**getDocumentProperties**](docs/PdfApi.md#getDocumentProperties) | **GET** /pdf/{name}/documentproperties | Read document properties.
*PdfApi* | [**getDocumentProperty**](docs/PdfApi.md#getDocumentProperty) | **GET** /pdf/{name}/documentproperties/{propertyName} | Read document property by name.
*PdfApi* | [**getDocumentTextAnnotations**](docs/PdfApi.md#getDocumentTextAnnotations) | **GET** /pdf/{name}/annotations/text | Read document text annotations.
*PdfApi* | [**getDownload**](docs/PdfApi.md#getDownload) | **GET** /storage/file | Download a specific file 
*PdfApi* | [**getDownloadDocumentAttachmentByIndex**](docs/PdfApi.md#getDownloadDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex}/download | Download document attachment content by its index.
*PdfApi* | [**getEpubInStorageToPdf**](docs/PdfApi.md#getEpubInStorageToPdf) | **GET** /pdf/create/epub | Convert EPUB file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getField**](docs/PdfApi.md#getField) | **GET** /pdf/{name}/fields/{fieldName} | Get document field by name.
*PdfApi* | [**getFields**](docs/PdfApi.md#getFields) | **GET** /pdf/{name}/fields | Get document fields.
*PdfApi* | [**getFreeTextAnnotation**](docs/PdfApi.md#getFreeTextAnnotation) | **GET** /pdf/{name}/annotations/freetext/{annotationId} | Read document page free text annotation by ID.
*PdfApi* | [**getHtmlInStorageToPdf**](docs/PdfApi.md#getHtmlInStorageToPdf) | **GET** /pdf/create/html | Convert HTML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getImage**](docs/PdfApi.md#getImage) | **GET** /pdf/{name}/images/{imageId} | Read document image by ID.
*PdfApi* | [**getImageExtractAsGif**](docs/PdfApi.md#getImageExtractAsGif) | **GET** /pdf/{name}/images/{imageId}/extract/gif | Extract document image in GIF format
*PdfApi* | [**getImageExtractAsJpeg**](docs/PdfApi.md#getImageExtractAsJpeg) | **GET** /pdf/{name}/images/{imageId}/extract/jpeg | Extract document image in JPEG format
*PdfApi* | [**getImageExtractAsPng**](docs/PdfApi.md#getImageExtractAsPng) | **GET** /pdf/{name}/images/{imageId}/extract/png | Extract document image in PNG format
*PdfApi* | [**getImageExtractAsTiff**](docs/PdfApi.md#getImageExtractAsTiff) | **GET** /pdf/{name}/images/{imageId}/extract/tiff | Extract document image in TIFF format
*PdfApi* | [**getImages**](docs/PdfApi.md#getImages) | **GET** /pdf/{name}/pages/{pageNumber}/images | Read document images.
*PdfApi* | [**getLaTeXInStorageToPdf**](docs/PdfApi.md#getLaTeXInStorageToPdf) | **GET** /pdf/create/latex | Convert LaTeX file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getLinkAnnotation**](docs/PdfApi.md#getLinkAnnotation) | **GET** /pdf/{name}/links/{linkId} | Read document link annotation by ID.
*PdfApi* | [**getMhtInStorageToPdf**](docs/PdfApi.md#getMhtInStorageToPdf) | **GET** /pdf/create/mht | Convert MHT file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getPage**](docs/PdfApi.md#getPage) | **GET** /pdf/{name}/pages/{pageNumber} | Read document page info.
*PdfApi* | [**getPageAnnotations**](docs/PdfApi.md#getPageAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations | Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
*PdfApi* | [**getPageConvertToBmp**](docs/PdfApi.md#getPageConvertToBmp) | **GET** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to Bmp image and return resulting file in response.
*PdfApi* | [**getPageConvertToEmf**](docs/PdfApi.md#getPageConvertToEmf) | **GET** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to Emf image and return resulting file in response.
*PdfApi* | [**getPageConvertToGif**](docs/PdfApi.md#getPageConvertToGif) | **GET** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to Gif image and return resulting file in response.
*PdfApi* | [**getPageConvertToJpeg**](docs/PdfApi.md#getPageConvertToJpeg) | **GET** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image and return resulting file in response.
*PdfApi* | [**getPageConvertToPng**](docs/PdfApi.md#getPageConvertToPng) | **GET** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to Png image and return resulting file in response.
*PdfApi* | [**getPageConvertToTiff**](docs/PdfApi.md#getPageConvertToTiff) | **GET** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image  and return resulting file in response.
*PdfApi* | [**getPageFreeTextAnnotations**](docs/PdfApi.md#getPageFreeTextAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations/freetext | Read document page free text annotations.
*PdfApi* | [**getPageLinkAnnotation**](docs/PdfApi.md#getPageLinkAnnotation) | **GET** /pdf/{name}/pages/{pageNumber}/links/{linkId} | Read document page link annotation by ID.
*PdfApi* | [**getPageLinkAnnotations**](docs/PdfApi.md#getPageLinkAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/links | Read document page link annotations.
*PdfApi* | [**getPageText**](docs/PdfApi.md#getPageText) | **GET** /pdf/{name}/pages/{pageNumber}/text | Read page text items.
*PdfApi* | [**getPageTextAnnotations**](docs/PdfApi.md#getPageTextAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations/text | Read document page text annotations.
*PdfApi* | [**getPages**](docs/PdfApi.md#getPages) | **GET** /pdf/{name}/pages | Read document pages info.
*PdfApi* | [**getPclInStorageToPdf**](docs/PdfApi.md#getPclInStorageToPdf) | **GET** /pdf/create/pcl | Convert PCL file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getPdfInStorageToDoc**](docs/PdfApi.md#getPdfInStorageToDoc) | **GET** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToEpub**](docs/PdfApi.md#getPdfInStorageToEpub) | **GET** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToHtml**](docs/PdfApi.md#getPdfInStorageToHtml) | **GET** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToLaTeX**](docs/PdfApi.md#getPdfInStorageToLaTeX) | **GET** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToMobiXml**](docs/PdfApi.md#getPdfInStorageToMobiXml) | **GET** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPdfA**](docs/PdfApi.md#getPdfInStorageToPdfA) | **GET** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPptx**](docs/PdfApi.md#getPdfInStorageToPptx) | **GET** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToSvg**](docs/PdfApi.md#getPdfInStorageToSvg) | **GET** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToTiff**](docs/PdfApi.md#getPdfInStorageToTiff) | **GET** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXls**](docs/PdfApi.md#getPdfInStorageToXls) | **GET** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXml**](docs/PdfApi.md#getPdfInStorageToXml) | **GET** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXps**](docs/PdfApi.md#getPdfInStorageToXps) | **GET** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and returns resulting file in response content
*PdfApi* | [**getPsInStorageToPdf**](docs/PdfApi.md#getPsInStorageToPdf) | **GET** /pdf/create/ps | Convert PS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getSvgInStorageToPdf**](docs/PdfApi.md#getSvgInStorageToPdf) | **GET** /pdf/create/svg | Convert SVG file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getText**](docs/PdfApi.md#getText) | **GET** /pdf/{name}/text | Read document text.
*PdfApi* | [**getTextAnnotation**](docs/PdfApi.md#getTextAnnotation) | **GET** /pdf/{name}/annotations/text/{annotationId} | Read document page text annotation by ID.
*PdfApi* | [**getVerifySignature**](docs/PdfApi.md#getVerifySignature) | **GET** /pdf/{name}/verifySignature | Verify signature document.
*PdfApi* | [**getWebInStorageToPdf**](docs/PdfApi.md#getWebInStorageToPdf) | **GET** /pdf/create/web | Convert web page to PDF format and return resulting file in response. 
*PdfApi* | [**getWordsPerPage**](docs/PdfApi.md#getWordsPerPage) | **GET** /pdf/{name}/pages/wordCount | Get number of words per document page.
*PdfApi* | [**getXfaPdfInStorageToAcroForm**](docs/PdfApi.md#getXfaPdfInStorageToAcroForm) | **GET** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
*PdfApi* | [**getXmlInStorageToPdf**](docs/PdfApi.md#getXmlInStorageToPdf) | **GET** /pdf/create/xml | Convert XML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXpsInStorageToPdf**](docs/PdfApi.md#getXpsInStorageToPdf) | **GET** /pdf/create/xps | Convert XPS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXslFoInStorageToPdf**](docs/PdfApi.md#getXslFoInStorageToPdf) | **GET** /pdf/create/xslfo | Convert XslFo file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**postAppendDocument**](docs/PdfApi.md#postAppendDocument) | **POST** /pdf/{name}/appendDocument | Append document to existing one.
*PdfApi* | [**postCreateField**](docs/PdfApi.md#postCreateField) | **POST** /pdf/{name}/fields | Create field.
*PdfApi* | [**postDocumentTextReplace**](docs/PdfApi.md#postDocumentTextReplace) | **POST** /pdf/{name}/text/replace | Document&#39;s replace text method.
*PdfApi* | [**postInsertImage**](docs/PdfApi.md#postInsertImage) | **POST** /pdf/{name}/pages/{pageNumber}/images | Insert image to document page.
*PdfApi* | [**postMovePage**](docs/PdfApi.md#postMovePage) | **POST** /pdf/{name}/pages/{pageNumber}/movePage | Move page to new position.
*PdfApi* | [**postOptimizeDocument**](docs/PdfApi.md#postOptimizeDocument) | **POST** /pdf/{name}/optimize | Optimize document.
*PdfApi* | [**postPageFreeTextAnnotations**](docs/PdfApi.md#postPageFreeTextAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/annotations/freetext | Add document page free text annotations.
*PdfApi* | [**postPageLinkAnnotations**](docs/PdfApi.md#postPageLinkAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/links | Add document page link annotations.
*PdfApi* | [**postPageTextAnnotations**](docs/PdfApi.md#postPageTextAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/annotations/text | Add document page text annotations.
*PdfApi* | [**postPageTextReplace**](docs/PdfApi.md#postPageTextReplace) | **POST** /pdf/{name}/pages/{pageNumber}/text/replace | Page&#39;s replace text method.
*PdfApi* | [**postSignDocument**](docs/PdfApi.md#postSignDocument) | **POST** /pdf/{name}/sign | Sign document.
*PdfApi* | [**postSignPage**](docs/PdfApi.md#postSignPage) | **POST** /pdf/{name}/pages/{pageNumber}/sign | Sign page.
*PdfApi* | [**postSplitDocument**](docs/PdfApi.md#postSplitDocument) | **POST** /pdf/{name}/split | Split document to parts.
*PdfApi* | [**putAddNewPage**](docs/PdfApi.md#putAddNewPage) | **PUT** /pdf/{name}/pages | Add new page to end of the document.
*PdfApi* | [**putAddText**](docs/PdfApi.md#putAddText) | **PUT** /pdf/{name}/pages/{pageNumber}/text | Add text to PDF document page.
*PdfApi* | [**putCreate**](docs/PdfApi.md#putCreate) | **PUT** /storage/file | Upload a specific file 
*PdfApi* | [**putCreateDocument**](docs/PdfApi.md#putCreateDocument) | **PUT** /pdf/{name} | Create empty document.
*PdfApi* | [**putEpubInStorageToPdf**](docs/PdfApi.md#putEpubInStorageToPdf) | **PUT** /pdf/{name}/create/epub | Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putFieldsFlatten**](docs/PdfApi.md#putFieldsFlatten) | **PUT** /pdf/{name}/fields/flatten | Flatten form fields in document.
*PdfApi* | [**putFreeTextAnnotation**](docs/PdfApi.md#putFreeTextAnnotation) | **PUT** /pdf/{name}/annotations/freetext/{annotationId} | Replace document free text annotation
*PdfApi* | [**putHtmlInStorageToPdf**](docs/PdfApi.md#putHtmlInStorageToPdf) | **PUT** /pdf/{name}/create/html | Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImageExtractAsGif**](docs/PdfApi.md#putImageExtractAsGif) | **PUT** /pdf/{name}/images/{imageId}/extract/gif | Extract document image in GIF format to folder
*PdfApi* | [**putImageExtractAsJpeg**](docs/PdfApi.md#putImageExtractAsJpeg) | **PUT** /pdf/{name}/images/{imageId}/extract/jpeg | Extract document image in JPEG format to folder
*PdfApi* | [**putImageExtractAsPng**](docs/PdfApi.md#putImageExtractAsPng) | **PUT** /pdf/{name}/images/{imageId}/extract/png | Extract document image in PNG format to folder
*PdfApi* | [**putImageExtractAsTiff**](docs/PdfApi.md#putImageExtractAsTiff) | **PUT** /pdf/{name}/images/{imageId}/extract/tiff | Extract document image in TIFF format to folder
*PdfApi* | [**putImageInStorageToPdf**](docs/PdfApi.md#putImageInStorageToPdf) | **PUT** /pdf/{name}/create/images | Convert image file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImagesExtractAsGif**](docs/PdfApi.md#putImagesExtractAsGif) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/gif | Extract document images in GIF format to folder.
*PdfApi* | [**putImagesExtractAsJpeg**](docs/PdfApi.md#putImagesExtractAsJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/jpeg | Extract document images in JPEG format to folder.
*PdfApi* | [**putImagesExtractAsPng**](docs/PdfApi.md#putImagesExtractAsPng) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/png | Extract document images in PNG format to folder.
*PdfApi* | [**putImagesExtractAsTiff**](docs/PdfApi.md#putImagesExtractAsTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/tiff | Extract document images in TIFF format to folder.
*PdfApi* | [**putLaTeXInStorageToPdf**](docs/PdfApi.md#putLaTeXInStorageToPdf) | **PUT** /pdf/{name}/create/latex | Convert LaTeX file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putLinkAnnotation**](docs/PdfApi.md#putLinkAnnotation) | **PUT** /pdf/{name}/links/{linkId} | Replace document page link annotations
*PdfApi* | [**putMergeDocuments**](docs/PdfApi.md#putMergeDocuments) | **PUT** /pdf/{name}/merge | Merge a list of documents.
*PdfApi* | [**putMhtInStorageToPdf**](docs/PdfApi.md#putMhtInStorageToPdf) | **PUT** /pdf/{name}/create/mht | Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putPageAddStamp**](docs/PdfApi.md#putPageAddStamp) | **PUT** /pdf/{name}/pages/{pageNumber}/stamp | Add page stamp.
*PdfApi* | [**putPageConvertToBmp**](docs/PdfApi.md#putPageConvertToBmp) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to bmp image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToEmf**](docs/PdfApi.md#putPageConvertToEmf) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to emf image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToGif**](docs/PdfApi.md#putPageConvertToGif) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to gif image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToJpeg**](docs/PdfApi.md#putPageConvertToJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToPng**](docs/PdfApi.md#putPageConvertToPng) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to png image and upload resulting file to storage.
*PdfApi* | [**putPageConvertToTiff**](docs/PdfApi.md#putPageConvertToTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image and upload resulting file to storage.
*PdfApi* | [**putPclInStorageToPdf**](docs/PdfApi.md#putPclInStorageToPdf) | **PUT** /pdf/{name}/create/pcl | Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putPdfInRequestToDoc**](docs/PdfApi.md#putPdfInRequestToDoc) | **PUT** /pdf/convert/doc | Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToEpub**](docs/PdfApi.md#putPdfInRequestToEpub) | **PUT** /pdf/convert/epub | Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToHtml**](docs/PdfApi.md#putPdfInRequestToHtml) | **PUT** /pdf/convert/html | Converts PDF document (in request content) to Html format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToLaTeX**](docs/PdfApi.md#putPdfInRequestToLaTeX) | **PUT** /pdf/convert/latex | Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToMobiXml**](docs/PdfApi.md#putPdfInRequestToMobiXml) | **PUT** /pdf/convert/mobixml | Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPdfA**](docs/PdfApi.md#putPdfInRequestToPdfA) | **PUT** /pdf/convert/pdfa | Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPptx**](docs/PdfApi.md#putPdfInRequestToPptx) | **PUT** /pdf/convert/pptx | Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToSvg**](docs/PdfApi.md#putPdfInRequestToSvg) | **PUT** /pdf/convert/svg | Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToTiff**](docs/PdfApi.md#putPdfInRequestToTiff) | **PUT** /pdf/convert/tiff | Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXls**](docs/PdfApi.md#putPdfInRequestToXls) | **PUT** /pdf/convert/xls | Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXml**](docs/PdfApi.md#putPdfInRequestToXml) | **PUT** /pdf/convert/xml | Converts PDF document (in request content) to XML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXps**](docs/PdfApi.md#putPdfInRequestToXps) | **PUT** /pdf/convert/xps | Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInStorageToDoc**](docs/PdfApi.md#putPdfInStorageToDoc) | **PUT** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToEpub**](docs/PdfApi.md#putPdfInStorageToEpub) | **PUT** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToHtml**](docs/PdfApi.md#putPdfInStorageToHtml) | **PUT** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToLaTeX**](docs/PdfApi.md#putPdfInStorageToLaTeX) | **PUT** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToMobiXml**](docs/PdfApi.md#putPdfInStorageToMobiXml) | **PUT** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPdfA**](docs/PdfApi.md#putPdfInStorageToPdfA) | **PUT** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPptx**](docs/PdfApi.md#putPdfInStorageToPptx) | **PUT** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToSvg**](docs/PdfApi.md#putPdfInStorageToSvg) | **PUT** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToTiff**](docs/PdfApi.md#putPdfInStorageToTiff) | **PUT** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXls**](docs/PdfApi.md#putPdfInStorageToXls) | **PUT** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXml**](docs/PdfApi.md#putPdfInStorageToXml) | **PUT** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXps**](docs/PdfApi.md#putPdfInStorageToXps) | **PUT** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
*PdfApi* | [**putPrivileges**](docs/PdfApi.md#putPrivileges) | **PUT** /pdf/{name}/privileges | Update privilege document.
*PdfApi* | [**putPsInStorageToPdf**](docs/PdfApi.md#putPsInStorageToPdf) | **PUT** /pdf/{name}/create/ps | Convert PS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putReplaceImage**](docs/PdfApi.md#putReplaceImage) | **PUT** /pdf/{name}/images/{imageId} | Replace document image.
*PdfApi* | [**putSearchableDocument**](docs/PdfApi.md#putSearchableDocument) | **PUT** /pdf/{name}/ocr | Create searchable PDF document. Generate OCR layer for images in input PDF document.
*PdfApi* | [**putSetProperty**](docs/PdfApi.md#putSetProperty) | **PUT** /pdf/{name}/documentproperties/{propertyName} | Add/update document property.
*PdfApi* | [**putSvgInStorageToPdf**](docs/PdfApi.md#putSvgInStorageToPdf) | **PUT** /pdf/{name}/create/svg | Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putTextAnnotation**](docs/PdfApi.md#putTextAnnotation) | **PUT** /pdf/{name}/annotations/text/{annotationId} | Replace document text annotation
*PdfApi* | [**putUpdateField**](docs/PdfApi.md#putUpdateField) | **PUT** /pdf/{name}/fields/{fieldName} | Update field.
*PdfApi* | [**putUpdateFields**](docs/PdfApi.md#putUpdateFields) | **PUT** /pdf/{name}/fields | Update fields.
*PdfApi* | [**putWebInStorageToPdf**](docs/PdfApi.md#putWebInStorageToPdf) | **PUT** /pdf/{name}/create/web | Convert web page to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXfaPdfInRequestToAcroForm**](docs/PdfApi.md#putXfaPdfInRequestToAcroForm) | **PUT** /pdf/convert/xfatoacroform | Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
*PdfApi* | [**putXfaPdfInStorageToAcroForm**](docs/PdfApi.md#putXfaPdfInStorageToAcroForm) | **PUT** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
*PdfApi* | [**putXmlInStorageToPdf**](docs/PdfApi.md#putXmlInStorageToPdf) | **PUT** /pdf/{name}/create/xml | Convert XML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXpsInStorageToPdf**](docs/PdfApi.md#putXpsInStorageToPdf) | **PUT** /pdf/{name}/create/xps | Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXslFoInStorageToPdf**](docs/PdfApi.md#putXslFoInStorageToPdf) | **PUT** /pdf/{name}/create/xslfo | Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 


## Documentation for Models

 - [AnnotationFlags](docs/AnnotationFlags.md)
 - [AnnotationState](docs/AnnotationState.md)
 - [AnnotationType](docs/AnnotationType.md)
 - [AntialiasingProcessingType](docs/AntialiasingProcessingType.md)
 - [AppendDocument](docs/AppendDocument.md)
 - [AsposeResponse](docs/AsposeResponse.md)
 - [Color](docs/Color.md)
 - [ColorDepth](docs/ColorDepth.md)
 - [CompressionType](docs/CompressionType.md)
 - [DocFormat](docs/DocFormat.md)
 - [DocRecognitionMode](docs/DocRecognitionMode.md)
 - [DocumentPrivilege](docs/DocumentPrivilege.md)
 - [EpubRecognitionMode](docs/EpubRecognitionMode.md)
 - [FieldType](docs/FieldType.md)
 - [FontEncodingRules](docs/FontEncodingRules.md)
 - [FontSavingModes](docs/FontSavingModes.md)
 - [FontStyles](docs/FontStyles.md)
 - [FreeTextIntent](docs/FreeTextIntent.md)
 - [HorizontalAlignment](docs/HorizontalAlignment.md)
 - [HtmlDocumentType](docs/HtmlDocumentType.md)
 - [HtmlMarkupGenerationModes](docs/HtmlMarkupGenerationModes.md)
 - [ImageSrcType](docs/ImageSrcType.md)
 - [ImageTemplate](docs/ImageTemplate.md)
 - [ImageTemplatesRequest](docs/ImageTemplatesRequest.md)
 - [Justification](docs/Justification.md)
 - [LettersPositioningMethods](docs/LettersPositioningMethods.md)
 - [LineSpacing](docs/LineSpacing.md)
 - [Link](docs/Link.md)
 - [LinkActionType](docs/LinkActionType.md)
 - [LinkElement](docs/LinkElement.md)
 - [LinkHighlightingMode](docs/LinkHighlightingMode.md)
 - [MarginInfo](docs/MarginInfo.md)
 - [MergeDocuments](docs/MergeDocuments.md)
 - [OptimizeOptions](docs/OptimizeOptions.md)
 - [PageWordCount](docs/PageWordCount.md)
 - [Paragraph](docs/Paragraph.md)
 - [PartsEmbeddingModes](docs/PartsEmbeddingModes.md)
 - [PdfAType](docs/PdfAType.md)
 - [RasterImagesSavingModes](docs/RasterImagesSavingModes.md)
 - [RectanglePdf](docs/RectanglePdf.md)
 - [Rotation](docs/Rotation.md)
 - [Segment](docs/Segment.md)
 - [ShapeType](docs/ShapeType.md)
 - [Signature](docs/Signature.md)
 - [SignatureType](docs/SignatureType.md)
 - [SplitResult](docs/SplitResult.md)
 - [Stamp](docs/Stamp.md)
 - [StampType](docs/StampType.md)
 - [TextHorizontalAlignment](docs/TextHorizontalAlignment.md)
 - [TextIcon](docs/TextIcon.md)
 - [TextLine](docs/TextLine.md)
 - [TextRect](docs/TextRect.md)
 - [TextRects](docs/TextRects.md)
 - [TextReplace](docs/TextReplace.md)
 - [TextReplaceListRequest](docs/TextReplaceListRequest.md)
 - [TextState](docs/TextState.md)
 - [TextStyle](docs/TextStyle.md)
 - [VerticalAlignment](docs/VerticalAlignment.md)
 - [WordCount](docs/WordCount.md)
 - [WrapMode](docs/WrapMode.md)
 - [Annotation](docs/Annotation.md)
 - [AnnotationsInfo](docs/AnnotationsInfo.md)
 - [AnnotationsInfoResponse](docs/AnnotationsInfoResponse.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [Attachments](docs/Attachments.md)
 - [AttachmentsResponse](docs/AttachmentsResponse.md)
 - [Document](docs/Document.md)
 - [DocumentPageResponse](docs/DocumentPageResponse.md)
 - [DocumentPagesResponse](docs/DocumentPagesResponse.md)
 - [DocumentProperties](docs/DocumentProperties.md)
 - [DocumentPropertiesResponse](docs/DocumentPropertiesResponse.md)
 - [DocumentProperty](docs/DocumentProperty.md)
 - [DocumentPropertyResponse](docs/DocumentPropertyResponse.md)
 - [DocumentResponse](docs/DocumentResponse.md)
 - [Field](docs/Field.md)
 - [FieldResponse](docs/FieldResponse.md)
 - [Fields](docs/Fields.md)
 - [FieldsResponse](docs/FieldsResponse.md)
 - [FreeTextAnnotationResponse](docs/FreeTextAnnotationResponse.md)
 - [FreeTextAnnotations](docs/FreeTextAnnotations.md)
 - [FreeTextAnnotationsResponse](docs/FreeTextAnnotationsResponse.md)
 - [Image](docs/Image.md)
 - [ImageResponse](docs/ImageResponse.md)
 - [Images](docs/Images.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [LinkAnnotation](docs/LinkAnnotation.md)
 - [LinkAnnotationResponse](docs/LinkAnnotationResponse.md)
 - [LinkAnnotations](docs/LinkAnnotations.md)
 - [LinkAnnotationsResponse](docs/LinkAnnotationsResponse.md)
 - [Page](docs/Page.md)
 - [Pages](docs/Pages.md)
 - [SignatureVerifyResponse](docs/SignatureVerifyResponse.md)
 - [SplitResultDocument](docs/SplitResultDocument.md)
 - [SplitResultResponse](docs/SplitResultResponse.md)
 - [TextAnnotationResponse](docs/TextAnnotationResponse.md)
 - [TextAnnotations](docs/TextAnnotations.md)
 - [TextAnnotationsResponse](docs/TextAnnotationsResponse.md)
 - [TextRectsResponse](docs/TextRectsResponse.md)
 - [TextReplaceResponse](docs/TextReplaceResponse.md)
 - [WordCountResponse](docs/WordCountResponse.md)
 - [AnnotationInfo](docs/AnnotationInfo.md)
 - [MarkupAnnotation](docs/MarkupAnnotation.md)
 - [FreeTextAnnotation](docs/FreeTextAnnotation.md)
 - [TextAnnotation](docs/TextAnnotation.md)

