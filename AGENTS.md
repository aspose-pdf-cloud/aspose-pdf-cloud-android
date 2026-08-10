# Aspose.PDF Cloud SDK for Android — Agent Analysis

> **Repository:** [aspose-pdf-cloud/aspose-pdf-cloud-android](https://github.com/aspose-pdf-cloud/aspose-pdf-cloud-android)  
> **Version:** 26.7.0 | **Maven:** `com.aspose:aspose-pdf-cloud-android:26.7.0`  
> **License:** MIT | **API Version:** v3.0  
> **Min SDK:** 19 | **Target SDK:** 27 | **Build Tools:** 27.0.3

---

## 1. Repository Overview

The **Aspose.PDF Cloud SDK for Android** is a generated REST API client that wraps the Aspose.PDF Cloud API v3.0 for Android applications. It enables Java-based Android apps to perform a wide range of PDF document processing operations — creation, manipulation, conversion, and rendering — entirely in the cloud.

The SDK is auto-generated from the OpenAPI specification and follows a **single-package** structure (`com.aspose.asposecloudpdfandroid`). All types, services, and models reside under the `sdk/src/main/java/com/aspose/asposecloudpdfandroid/` directory.

---

## 2. Architecture & Core Components

### 2.1 Repository Structure

```
aspose-pdf-cloud-android/
├── sdk/                            # Android library (AAR/JAR)
│   ├── build.gradle                # Gradle build configuration
│   ├── settings.gradle
│   ├── docs/                       # Markdown API docs (PdfApi.md + model docs)
│   ├── settings/
│   │   └── credentials.json        # API credentials template
│   ├── testData/                   # Test fixture PDF files and assets
│   └── src/main/java/com/aspose/asposecloudpdfandroid/
│       ├── ApiClient.java          # Core HTTP client, OAuth2 auth, request building
│       ├── ApiCallback.java        # Async callback interface
│       ├── ApiException.java       # API exception with status code & response body
│       ├── ApiResponse.java        # HTTP response wrapper with status, headers, data
│       ├── Configuration.java      # Default ApiClient singleton holder
│       ├── GzipRequestInterceptor.java
│       ├── JSON.java               # Gson-based JSON serialization/deserialization
│       ├── Pair.java               # Query parameter key-value pair
│       ├── ProgressRequestBody.java
│       ├── ProgressResponseBody.java
│       ├── StringUtil.java
│       ├── api/
│       │   └── PdfApi.java         # PdfApi — 200+ API methods (~3.2 MB)
│       └── model/                  # 190+ flat model files
├── sample/                         # Android sample app (Activities, Fragments, UI)
│   └── app/src/main/java/com/aspose/asposecloudpdfapp/
│       ├── MainActivity.java
│       ├── SettingsActivity.java
│       ├── AppCompatPreferenceActivity.java
│       └── fragment/BlankFragment.java
├── Exampls/                        # Java example code (standalone Maven project)
│   └── src/main/java/com/aspose/pdf/android/examples/
│       └── PdfApiExamples.java     # 4165-line comprehensive examples file
└── README.md                       # Project documentation
```

### 2.2 Core Files

| File | Purpose |
|------|---------|
| **`ApiClient.java`** | HTTP client with OkHttp 2.7.5, OAuth2 client credentials flow, multipart upload, request preparation, response deserialization, self-host support |
| **`Configuration.java`** | Singleton holder for the default `ApiClient` instance |
| **`ApiException.java`** | Custom exception carrying HTTP status code, response headers, and response body |
| **`ApiResponse.java`** | Generic wrapper for `statusCode`, `headers` (Map), and deserialized `data` |
| **`JSON.java`** | Gson-based serializer/deserializer with custom TypeAdapters for `Date`, `OffsetDateTime`, `LocalDate`, `java.sql.Date` |
| **`PdfApi.java`** | `PdfApi` — the main API surface with all REST endpoint methods (200+ methods, ~3.2 MB) |

---

## 3. Data Model Organization

### 3.1 Package Layout

All models reside in a flat `model/` sub-package under the main package. Each PDF concept gets its own `.java` file:

| Category | Example Files |
|----------|---------------|
| **Annotations** | `CaretAnnotation.java`, `CircleAnnotation.java`, `FileAttachmentAnnotation.java`, `FreeTextAnnotation.java`, `HighlightAnnotation.java`, `InkAnnotation.java`, `LineAnnotation.java`, `LinkAnnotation.java`, `MovieAnnotation.java`, `PolygonAnnotation.java`, `PolyLineAnnotation.java`, `PopupAnnotation.java`, `RedactionAnnotation.java`, `ScreenAnnotation.java`, `SoundAnnotation.java`, `SquareAnnotation.java`, `SquigglyAnnotation.java`, `StampAnnotation.java`, `StrikeOutAnnotation.java`, `TextAnnotation.java`, `UnderlineAnnotation.java` + their `{Type}Response.java` and `{Type}sResponse.java` companions |
| **Form Fields** | `Field.java`, `FieldType.java`, `FormField.java`, `CheckBoxField.java`, `ComboBoxField.java`, `ListBoxField.java`, `RadioButtonField.java`, `TextBoxField.java`, `SignatureField.java`, `ChoiceField.java`, `RadioButtonOptionField.java` |
| **Document** | `Document.java`, `DocumentConfig.java`, `DocumentProperty.java`, `DocumentProperties.java`, `DisplayProperties.java`, `DocumentPrivilege.java`, `DocumentLayers.java` |
| **Pages** | `Page.java`, `Pages.java`, `PageLayout.java`, `PageMode.java`, `PageRange.java`, `PageWordCount.java` |
| **Stamps** | `Stamp.java`, `ImageStamp.java`, `TextStamp.java`, `PageNumberStamp.java`, `PdfPageStamp.java`, `ImageStampPageSpecified.java`, `TextStampPageSpecified.java` |
| **Conversions** | `DocFormat.java`, `HtmlDocumentType.java`, `EpubRecognitionMode.java`, `ColorDepth.java`, `CompressionType.java`, `OutputFormat.java`, `PdfAType.java` |
| **Storage** | `FileVersion.java`, `FileVersions.java`, `FilesList.java`, `FilesUploadResult.java`, `DiscUsage.java`, `ObjectExist.java`, `StorageExist.java` |
| **Primitives** | `Color.java`, `Point.java`, `Rectangle.java`, `Dash.java`, `Border.java`, `BorderInfo.java`, `MarginInfo.java`, `GraphInfo.java`, `Link.java`, `LinkElement.java`, `Position.java` |
| **Enums** | `AnnotationType.java`, `BorderStyle.java`, `BorderEffect.java`, `CapStyle.java`, `Direction.java`, `FontStyles.java`, `HorizontalAlignment.java`, `Justification.java`, `LineEnding.java`, `LineSpacing.java`, `CryptoAlgorithm.java`, `PermissionsFlags.java` |
| **Headers/Footers** | `ImageHeader.java`, `ImageFooter.java`, `TextHeader.java`, `TextFooter.java` |

### 3.2 Response Type Naming Convention

- **Single entity:** `{Entity}Response` — e.g., `DocumentResponse`, `BookmarkResponse`, `CircleAnnotationResponse`
- **Collection:** `{Entity}sResponse` — e.g., `BookmarksResponse`, `CircleAnnotationsResponse`, `FieldsResponse`, `StampsInfoResponse`
- **Base:** `AsposeResponse` with `code` (Integer) and `status` (String)

---

## 4. API Capabilities

### 4.1 PdfApi Instantiation

```java
// Standard cloud mode
PdfApi pdfApi = new PdfApi("YOUR_CLIENT_SECRET", "YOUR_CLIENT_ID");

// Self-hosted mode
PdfApi pdfApi = new PdfApi("YOUR_SELFHOST_URL");
```

### 4.2 Document Operations

| Method | Endpoint | Description |
|--------|----------|-------------|
| `getDocument` | GET `/pdf/{name}` | Read document info |
| `putCreateDocument` | PUT `/pdf/{name}` | Create empty document |
| `postCreateDocument` | POST `/pdf/{name}` | Create document with config |
| `postOptimizeDocument` | POST `/pdf/{name}/optimize` | Optimize document |
| `postSplitDocument` | POST `/pdf/{name}/split` | Split document into pages |
| `postSplitRangePdfDocument` | POST `/pdf/{name}/split/range` | Split by page ranges |
| `postOrganizeDocument` | POST `/pdf/{name}/organize` | Reorder pages |
| `postOrganizeDocuments` | POST `/pdf/organize` | Organize pages from multiple documents |
| `putMergeDocuments` | PUT `/pdf/{name}/merge` | Merge multiple documents |

### 4.3 Page Operations

| Method | Description |
|--------|-------------|
| `getPages` | Read document pages |
| `putAddNewPage` | Add new page |
| `deletePage` | Delete page by number |
| `postMovePage` | Move page to new position |
| `postDocumentPagesRotate` | Rotate pages by angle |
| `postDocumentPagesResize` | Resize pages |
| `postDocumentPagesCrop` | Crop pages |
| `getPageConvertToTiff/Jpeg/Png/Emf/Bmp/Gif` | Convert page to image (GET) |
| `putPageConvertToTiff/Jpeg/Png/Emf/Bmp/Gif` | Convert page to image (PUT) |
| `postPageImageStamps` | Add image stamp to page |
| `postPageTextStamps` | Add text stamp to page |
| `postPagePdfPageStamps` | Add PDF page stamp |
| `postPagePageNumberStamps` | Add page number stamp |

### 4.4 Annotations (20+ Types)

Each annotation type supports full CRUD operations:

| Operation | Pattern |
|-----------|---------|
| **Get all** | `getDocument{Type}Annotations(name, storage, folder)` |
| **Get by page** | `getPage{Type}Annotations(name, pageNumber, storage, folder)` |
| **Get by ID** | `get{Type}Annotation(name, annotationId, storage, folder)` |
| **Create** | `postPage{Type}Annotations(name, pageNumber, annotations, storage, folder)` |
| **Update** | `put{Type}Annotation(name, annotationId, annotation, storage, folder)` |
| **Delete** | `deleteAnnotation(name, annotationId, storage, folder)` |
| **Flatten** | `putAnnotationsFlatten(name, startPage, endPage, annotationTypes, storage, folder)` |

Supported annotation types: Caret, Circle, FileAttachment, FreeText, Highlight, Ink, Line, Link, Movie, Polygon, PolyLine, Popup, Redaction, Screen, Sound, Square, Squiggly, Stamp, StrikeOut, Text, Underline.

### 4.5 Form Fields (8 Types)

| Field Type | Operations |
|------------|------------|
| CheckBox, ComboBox, ListBox, RadioButton, TextBox, Signature | Get document fields, get page fields, get by name, create, update, delete |
| General | `getFields`, `putUpdateFields`, `putFieldsFlatten`, `postFlattenDocument` |
| Import/Export | XML, FDF, XFDF formats (PUT and POST for each) |

### 4.6 Bookmarks

| Method | Description |
|--------|-------------|
| `getDocumentBookmarks` | Get bookmark tree |
| `getBookmarks` | Get bookmarks at path |
| `getBookmark` | Get single bookmark |
| `postBookmark` | Add bookmark |
| `putBookmark` | Update bookmark |
| `deleteBookmark` | Delete bookmark |
| `deleteDocumentBookmarks` | Delete all bookmarks |

### 4.7 Conversions

**PDF → Other formats:**
DOC, DOCX, EPUB, Excel (XLS/XLSX), HTML, MobiXML, PDF/A, PPTX, SVG, TEX, TIFF, XLS, XML, XPS, and more.

**Other formats → PDF:**
APS, EPUB, HTML, MHT, Markdown, PCL, PS, SVG, TeX, Web, XML, XPS, XSL FO, images.

**Pattern:** `put{Format}InStorageToPdf` / `putPdfInStorageTo{Format}` for each conversion.

### 4.8 Storage & File Management

| Method | Description |
|--------|-------------|
| `uploadFile` | Upload file to cloud storage |
| `downloadFile` | Download file from cloud storage |
| `copyFile` / `moveFile` / `deleteFile` | File operations |
| `createFolder` / `copyFolder` / `moveFolder` / `deleteFolder` | Folder operations |
| `getFilesList` | List files in folder |
| `getDiscUsage` | Get storage usage |
| `objectExists` / `storageExists` | Check existence |
| `getFileVersions` | List file versions |

### 4.9 Other Features

| Feature | Key Methods |
|---------|-------------|
| **Text** | `getText`, `getPageText`, `putAddText`, `postDocumentTextReplace` |
| **Images** | `getImages`, `getImage`, `deleteImage`, `postInsertImage`, `putReplaceMultipleImage` |
| **Links** | `getPageLinkAnnotations`, `postPageLinkAnnotations`, `putLinkAnnotation`, `deleteLinkAnnotation` |
| **Stamps** | `getDocumentStamps`, `postPageTextStamps`, `postPageImageStamps`, `deleteStamp` |
| **Tables** | `getDocumentTables`, `postPageTables`, `putTable`, `deleteTable` |
| **Headers/Footers** | `postDocumentTextHeader`, `postDocumentTextFooter`, `postDocumentImageHeader`, `postDocumentImageFooter` |
| **Encryption** | `putEncryptDocument`, `putDecryptDocument`, `putChangePasswordDocument`, `postEncryptDocumentInStorage`, `postDecryptDocumentInStorage`, `postChangePasswordDocumentInStorage` |
| **Properties** | `getDocumentProperties`, `putSetProperty`, `deleteProperty` |
| **XMP Metadata** | `getXmpMetadataJson`, `getXmpMetadataXml`, `postXmpMetadata` |
| **Layers** | `getDocumentLayers`, `deleteDocumentLayer`, `putCreatePdfFromLayer` |
| **Compare** | `postComparePdf` |
| **Privileges** | `putPrivileges` |
| **Signatures** | `postSignDocument`, `postSignPage`, `postSignatureField`, `postPageCertify`, `getVerifySignature` |
| **Watermarks** | Via image/text stamps |

---

## 5. Code Generation & Pattern

### 5.1 Auto-Generated Code

The SDK is **auto-generated** from the OpenAPI specification. Evidence:
- `.swagger-codegen-ignore` file present in `sdk/`
- Consistent, repetitive method structure across all 200+ API methods
- Flat file-per-model organization in `model/` sub-package
- Uniform parameter validation and error handling pattern

### 5.2 PdfApi Method Generation Pattern

Each API endpoint follows a consistent three-method pattern:

```
{Xxx}Call()          → Builds okhttp3.Call with parameters, headers, query params
{Xxx}ValidateBeforeCall()  → Validates required parameters, delegates to Call
{Xxx}() / {Xxx}WithHttpInfo()  → Public methods with 401 auto-retry logic
```

The public method includes automatic token refresh on 401 responses:

```java
public AsposeResponse deleteAnnotation(String name, String annotationId, String storage, String folder) throws ApiException {
    try {
        deleteAnnotationWithHttpInfo(name, annotationId, storage, folder);
    } catch (ApiException ex) {
        if (ex.getCode() == 401) {
            apiClient.requestToken();
            deleteAnnotationWithHttpInfo(name, annotationId, storage, folder);
        }
        throw ex;
    }
}
```

### 5.3 Code Convention Details

| Convention | Description |
|------------|-------------|
| **Package** | `com.aspose.asposecloudpdfandroid` with `model/` and `api/` sub-packages |
| **Flat model structure** | All models in `model/` package |
| **MIT license header** | Every `.java` file starts with the same license block |
| **Synchronous/Async** | Both `execute()` and `executeAsync()` via OkHttp Callback |
| **Optional params** | Method signature parameters with nullable fields (String, Integer, etc.) |
| **Custom headers** | `x-aspose-client: android sdk`, `x-aspose-client-version: 26.7.0` |
| **Self-host support** | `PdfApi(String host)` constructor skips OAuth2 authentication |
| **401 auto-retry** | All public methods retry once with fresh token on 401 |
| **Jakarta annotations** | `@SerializedName` for JSON field mapping |

---

## 6. Authentication

### 6.1 OAuth2 Client Credentials Flow

Authentication is handled automatically by `ApiClient`:

1. **Token request:** `requestToken()` sends a POST to `{basePath}/connect/token` with `grant_type=client_credentials`, `client_id`, and `client_secret`
2. **Token caching:** Access token is stored in memory in `ApiClient.accessToken`
3. **Auto-refresh:** If any API call returns HTTP 401, `requestToken()` is called and the request is retried
4. **Self-host mode:** When constructed with a single host URL, OAuth2 is skipped entirely

### 6.2 Credentials Format

```json
{
    "api_url": "https://api.aspose.cloud/v3.0",
    "client_id": "YOUR_CLIENT_ID",
    "client_secret": "YOUR_CLIENT_SECRET",
    "self_host": false
}
```

---

## 7. Example Code

### 7.1 Examples File Structure

The `Exampls/` directory contains a standalone Maven project with a single comprehensive file:

```
Exampls/
├── pom.xml
├── jar/                          # Compiled JARs
└── src/main/java/com/aspose/
    ├── pdf/android/examples/
    │   └── PdfApiExamples.java   # 4165 lines, 90+ example methods
    └── examples/pdf/examples/fields/
        └── FieldExamples.java    # Field-specific examples
```

### 7.2 Example Pattern

```java
public class PdfApiExamples {
    protected final PdfApi pdfApi;
    protected String tempFolder = "TempPdfCloud";
    protected String ExampleDataFolder = "ExampleData";

    protected PdfApiExamples() {
        pdfApi = new PdfApi("app_key", "app_sid");
        pdfApi.getApiClient().setBasePath("product_uri");
    }

    protected void uploadFile(String name) throws ApiException {
        File file = new File(ExampleDataFolder + "/" + name);
        AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
    }

    public void getDocumentAnnotationsExample() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        uploadFile(name);
        AnnotationsInfoResponse response = pdfApi.getDocumentAnnotations(name, null, tempFolder);
    }

    public void postPageFileAttachmentAnnotationsExample() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        uploadFile(name);
        String attachmentFile = "4pages.pdf";
        uploadFile(attachmentFile);
        int pageNumber = 1;

        Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);
        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");

        List<FileAttachmentAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = pdfApi.postPageFileAttachmentAnnotations(
            name, pageNumber, annotations, null, tempFolder);
    }
}
```

### 7.3 Sample Android App

The `sample/` directory provides a fully functional Android application demonstrating SDK usage:

```
sample/app/src/main/java/com/aspose/asposecloudpdfapp/
├── MainActivity.java             # Main activity with navigation drawer
├── SettingsActivity.java         # Preference-based settings
├── AppCompatPreferenceActivity.java
└── fragment/
    └── BlankFragment.java        # Fragment for displaying content
```

The app includes:
- Settings UI for configuring API credentials (`pref_credentials.xml`)
- Navigation drawer with menu options
- Material Design styling

---

## 8. Dependencies & Build

### 8.1 External Dependencies

```groovy
compile 'io.swagger:swagger-annotations:1.5.15'
compile 'com.squareup.okhttp:okhttp:2.7.5'
compile 'com.squareup.okhttp:logging-interceptor:2.7.5'
compile 'com.google.code.gson:gson:2.8.1'
compile 'io.gsonfire:gson-fire:1.8.0'
compile 'org.threeten:threetenbp:1.3.5'
testCompile 'junit:junit:4.12'
provided 'javax.annotation:jsr250-api:1.0'
```

### 8.2 Build Configuration

```groovy
// SDK Library (sdk/build.gradle)
apply plugin: 'com.android.library'
compileSdkVersion 27
buildToolsVersion '27.0.3'
minSdkVersion 19
targetSdkVersion 27
sourceCompatibility JavaVersion.VERSION_1_7
targetCompatibility JavaVersion.VERSION_1_7
```

### 8.3 Installation

**Maven:**
```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-pdf-cloud-android</artifactId>
    <version>26.7.0</version>
    <scope>compile</scope>
</dependency>
```

**Gradle:**
```groovy
compile "com.aspose:aspose-pdf-cloud-android:26.7.0"
```

**Manual JAR:**
```shell
mvn package
# JAR available at target/aspose-pdf-cloud-android-26.7.0.jar
```

---

## 9. Documentation

The `sdk/docs/` directory contains **Markdown files** with the full API reference:

- `PdfApi.md` — Complete API method reference with request/response details
- `{Model}.md` — One file per model type (e.g., `Document.md`, `Annotation.md`, `Bookmark.md`)
- `{Response}.md` — One file per response type (e.g., `DocumentResponse.md`, `AnnotationsResponse.md`)

Each model documentation file includes property descriptions, types, and JSON serialization examples.

---

## 10. Testing

### 10.1 Test Data

The `sdk/testData/` directory contains 50+ test fixture files:

| Category | Files |
|----------|-------|
| **PDF documents** | `4pages.pdf`, `5pages.pdf`, `PdfWithAnnotations.pdf`, `PdfWithBookmarks.pdf`, `PdfWithTable.pdf`, `PdfWithAcroForm.pdf`, `PdfWithImages.pdf`, `PdfWithLayers.pdf`, `PdfWithLinks.pdf`, `PdfWithXfaForm.pdf`, `BlankWithSignature.pdf` |
| **Images** | `Koala.jpg`, `butterfly.jpg`, `Penguins.jpg`, `Penguins.emf`, `Simple.svg` |
| **Other documents** | `4pages.epub`, `5pages.aps`, `Simple.xps`, `sample.tex`, `template.xml`, `template.pcl` |
| **Form data** | `FormData.pdf`, `FormData.fdf`, `FormData.xfdf`, `FormData.xml` |
| **Certificates** | `33226.p12`, `test1234.pfx` |

### 10.2 Credentials File

Credentials are read from `sdk/settings/credentials.json` (template included in the repository).

### 10.3 Test Pattern

All example methods in `PdfApiExamples.java` follow a consistent pattern:
1. Construct `PdfApi` with credentials
2. Upload test file using `uploadFile(name)` helper
3. Call the API method with parameters
4. Process or assert the response

---

## 11. Key Conventions Summary

| Convention | Description |
|------------|-------------|
| **Package structure** | `com.aspose.asposecloudpdfandroid` with `model/` and `api/` sub-packages |
| **Three-tier method pattern** | `Call()`, `ValidateBeforeCall()`, `Public()` for each endpoint |
| **API response type** | `AsposeResponse` base with `code` (Integer) and `status` (String) |
| **HTTP response wrapper** | `ApiResponse<T>` with `statusCode`, `headers`, `data` |
| **Error handling** | `ApiException` with HTTP code, headers, and response body |
| **401 auto-retry** | All public methods retry with fresh token on 401 |
| **Self-host support** | Constructor with host URL skips OAuth2 authentication |
| **Async support** | `executeAsync()` via OkHttp `Callback` interface |
| **Custom headers** | `x-aspose-client: android sdk`, `x-aspose-client-version: 26.7.0` |
| **Flat model files** | One `.java` file per model/concept in `model/` package |
| **MIT license** | Every source file starts with the same MIT license header |
