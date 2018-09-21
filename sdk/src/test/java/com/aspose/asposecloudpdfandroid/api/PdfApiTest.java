/**
 *
 *   Copyright (c) 2018 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.AnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.AppendDocument;
import com.aspose.asposecloudpdfandroid.model.AttachmentResponse;
import com.aspose.asposecloudpdfandroid.model.AttachmentsResponse;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.ColorDepth;
import com.aspose.asposecloudpdfandroid.model.CompressionType;
import com.aspose.asposecloudpdfandroid.model.Document;
import com.aspose.asposecloudpdfandroid.model.DocumentPageResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentPagesResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentPrivilege;
import com.aspose.asposecloudpdfandroid.model.DocumentPropertiesResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentProperty;
import com.aspose.asposecloudpdfandroid.model.DocumentPropertyResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentResponse;
import com.aspose.asposecloudpdfandroid.model.FieldType;
import com.aspose.asposecloudpdfandroid.model.Fields;
import com.aspose.asposecloudpdfandroid.model.FontStyles;
import com.aspose.asposecloudpdfandroid.model.ImageSrcType;
import com.aspose.asposecloudpdfandroid.model.ImageTemplate;
import com.aspose.asposecloudpdfandroid.model.ImageTemplatesRequest;
import com.aspose.asposecloudpdfandroid.model.LinkActionType;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotation;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotations;
import com.aspose.asposecloudpdfandroid.model.PdfAType;
import com.aspose.asposecloudpdfandroid.model.RectanglePdf;
import com.aspose.asposecloudpdfandroid.model.Field;
import com.aspose.asposecloudpdfandroid.model.FieldResponse;
import com.aspose.asposecloudpdfandroid.model.FieldsResponse;
import com.aspose.asposecloudpdfandroid.model.Segment;
import com.aspose.asposecloudpdfandroid.model.TextLine;
import com.aspose.asposecloudpdfandroid.model.ShapeType;
import com.aspose.asposecloudpdfandroid.model.StampType;
import com.aspose.asposecloudpdfandroid.model.TextReplace;
import com.aspose.asposecloudpdfandroid.model.TextState;
import com.aspose.asposecloudpdfandroid.model.TextHorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.VerticalAlignment;

import java.io.File;

import com.aspose.asposecloudpdfandroid.model.ImageResponse;
import com.aspose.asposecloudpdfandroid.model.ImagesResponse;
import com.aspose.asposecloudpdfandroid.model.LineSpacing;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.MergeDocuments;
import com.aspose.asposecloudpdfandroid.model.OptimizeOptions;
import com.aspose.asposecloudpdfandroid.model.Paragraph;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.Signature;
import com.aspose.asposecloudpdfandroid.model.SignatureType;
import com.aspose.asposecloudpdfandroid.model.SignatureVerifyResponse;
import com.aspose.asposecloudpdfandroid.model.SplitResultResponse;
import com.aspose.asposecloudpdfandroid.model.Stamp;
import com.aspose.asposecloudpdfandroid.model.TextRectsResponse;
import com.aspose.asposecloudpdfandroid.model.TextReplaceListRequest;
import com.aspose.asposecloudpdfandroid.model.TextReplaceResponse;
import com.aspose.asposecloudpdfandroid.model.WordCountResponse;
import com.aspose.asposecloudpdfandroid.model.WrapMode;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * API tests for PdfApi
 */
public class PdfApiTest
{
    private final PdfApi pdfApi;
    private String tempFolder = "TempPdfCloud";
    private String testDataFolder = "testData";
    private String setupFile = "setup.json";

    class ApiCreds{
        public String app_key;
        public String app_sid;
        public String product_uri;
    }

    public PdfApiTest() throws FileNotFoundException
    {
        ApiCreds apiCreds = getApiCreds();
        pdfApi = new PdfApi(apiCreds.app_key, apiCreds.app_sid);
        pdfApi.getApiClient().setBasePath(apiCreds.product_uri);
    }

    private ApiCreds getApiCreds() throws FileNotFoundException
    {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(setupFile));
        return gson.fromJson(reader, ApiCreds.class);
    }


    private void uploadFile(String name) throws ApiException
    {
        File file = new File(testDataFolder + "/" + name);
        AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
        assertEquals(200, (int)response.getCode());
    }

    //Annotations Tests

    /**
     * GetPageAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        int pageNumber = 2;

        uploadFile(name);
        AnnotationsResponse response = pdfApi.getPageAnnotations(name, pageNumber, null, tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        int pageNumber = 2;
        int annotationNumber = 2;

        uploadFile(name);
        AnnotationResponse response = pdfApi.getPageAnnotation(name, pageNumber, annotationNumber,null, tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    //Append Tests

    /**
     * PostAppendDocumentUsingQueryParams Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postAppendDocumentUsingQueryParamsTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        String appendFileName = "4pages.pdf";

        this.uploadFile(name);
        this.uploadFile(appendFileName);

        int startPage = 2;
        int endPage = 4;

        DocumentResponse response = this.pdfApi.postAppendDocument(name, null, this.tempFolder + '/' + appendFileName, startPage, endPage, null, this.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostAppendDocumentUsingBodyParams Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postAppendDocumentUsingBodyParamsTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        String appendFileName = "4pages.pdf";

        this.uploadFile(name);
        this.uploadFile(appendFileName);

        AppendDocument appendDocument = new AppendDocument();
        appendDocument.setDocument(this.tempFolder + '/' + appendFileName);
        appendDocument.setStartPage(2);
        appendDocument.setEndPage(4);

        DocumentResponse response = this.pdfApi.postAppendDocument(name, appendDocument, null, null, null, null, this.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    //Attachments Tests

    /**
     * GetDocumentAttachmentByIndex Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentAttachmentByIndexTest() throws ApiException
    {
        String name = "PdfWithEmbeddedFiles.pdf";
        this.uploadFile(name);

        int attachmentIndex = 1;

        AttachmentResponse response = this.pdfApi.getDocumentAttachmentByIndex(name, attachmentIndex, null, this.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentAttachments Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentAttachmentsTest() throws ApiException
    {
        String name = "PdfWithEmbeddedFiles.pdf";
        this.uploadFile(name);

        AttachmentsResponse response = this.pdfApi.getDocumentAttachments(name, null, this.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDownloadDocumentAttachmentByIndex Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDownloadDocumentAttachmentByIndexTest() throws ApiException
    {
        String name = "PdfWithEmbeddedFiles.pdf";
        this.uploadFile(name);

        int attachmentIndex = 1;

        File response = this.pdfApi.getDownloadDocumentAttachmentByIndex(name, attachmentIndex, null, this.tempFolder);
        assertNotNull(response);
    }

    // Bookmarks Tests

    /**
     * GetDocumentBookmarks Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentBookmarksTest() throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        this.uploadFile(name);

        File response = this.pdfApi.getDocumentBookmarks(name, null, null, this.tempFolder);
        assertNotNull(response);
    }

    // Convert Tests

    /**
     * GetPdfInStorageToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);
        String folder = this.tempFolder;

        File response = this.pdfApi.getPdfInStorageToDoc(name, null, null, null, null, null, null, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);
        String folder = this.tempFolder;
        String resFileName = "result.doc";

        AsposeResponse response = this.pdfApi.putPdfInStorageToDoc(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.doc";

        AsposeResponse response = this.pdfApi.putPdfInRequestToDoc(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String type = PdfAType.PDFA1A.toString();
        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToPdfA(name, type, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String type = PdfAType.PDFA1A.toString();
        String folder = this.tempFolder;
        String resFileName = "result.pdf";

        AsposeResponse response = this.pdfApi.putPdfInStorageToPdfA(name, this.tempFolder + '/' + resFileName, type, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String type = PdfAType.PDFA1A.toString();
        String resFileName = "result.pdf";

        AsposeResponse response = this.pdfApi.putPdfInRequestToPdfA(this.tempFolder + '/' + resFileName, type, null, file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToTiff(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.tiff";

        AsposeResponse response = this.pdfApi.putPdfInStorageToTiff(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.tiff";

        AsposeResponse response = this.pdfApi.putPdfInRequestToTiff(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToSvg(name, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.svg";

        AsposeResponse response = this.pdfApi.putPdfInStorageToSvg(name, this.tempFolder + '/' + resFileName, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.svg";

        AsposeResponse response = this.pdfApi.putPdfInRequestToSvg(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToXps(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.xps";

        AsposeResponse response = this.pdfApi.putPdfInStorageToXps(name, this.tempFolder + '/' + resFileName, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.xps";

        AsposeResponse response = this.pdfApi.putPdfInRequestToXps(this.tempFolder + '/' + resFileName, null , file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToXls(name, null, null, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.xls";

        AsposeResponse response = this.pdfApi.putPdfInStorageToXls(name, this.tempFolder + '/' + resFileName, null, null, null, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.xls";

        AsposeResponse response = this.pdfApi.putPdfInRequestToXls(this.tempFolder + '/' + resFileName, null, null, null, null, null , file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToHtml(name, null, null, null, null, null,  null,  null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.zip";

        AsposeResponse response = this.pdfApi.putPdfInStorageToHtml(
                name,
                this.tempFolder + '/' + resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                folder,
                null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.zip";

        AsposeResponse response = this.pdfApi.putPdfInRequestToHtml(
                this.tempFolder + '/' + resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                file);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToEpub(name, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.epub";

        AsposeResponse response = this.pdfApi.putPdfInStorageToEpub(name, this.tempFolder + '/' + resFileName, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.epub";

        AsposeResponse response = this.pdfApi.putPdfInRequestToEpub(this.tempFolder + '/' + resFileName, null, null, file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToPptx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToPptx(name, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToPptx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.pptx";

        AsposeResponse response = this.pdfApi.putPdfInStorageToPptx(name, this.tempFolder + '/' + resFileName, null, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToPptx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.pptx";

        AsposeResponse response = this.pdfApi.putPdfInRequestToPptx(this.tempFolder + '/' + resFileName, null, null, null, file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToLaTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToLaTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToLaTeX(name, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToLaTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToLaTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.latex";

        AsposeResponse response = this.pdfApi.putPdfInStorageToLaTeX(name, this.tempFolder + '/' + resFileName, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToLaTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToLaTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.latex";

        AsposeResponse response = this.pdfApi.putPdfInRequestToLaTeX(this.tempFolder + '/' + resFileName, null, null, file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToMobiXml(name, folder, null);
        assertNotNull(response);
    }


    /**
     * PutPdfInStorageToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.mobi";

        AsposeResponse response = this.pdfApi.putPdfInStorageToMobiXml(name, this.tempFolder + '/' + resFileName, folder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * PutPdfInRequestToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.mobi";

        AsposeResponse response = this.pdfApi.putPdfInRequestToMobiXml(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetXfaPdfInStorageToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXfaPdfInStorageToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getXfaPdfInStorageToAcroForm(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutXfaPdfInStorageToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXfaPdfInStorageToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.pdf";

        AsposeResponse response = this.pdfApi.putXfaPdfInStorageToAcroForm(name, this.tempFolder + '/' + resFileName, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutXfaPdfInRequestToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXfaPdfInRequestToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.pdf";

        AsposeResponse response = this.pdfApi.putXfaPdfInRequestToAcroForm(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;


        File response = this.pdfApi.getPdfInStorageToXml(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String resFileName = "result.xml";

        AsposeResponse response = this.pdfApi.putPdfInStorageToXml(name, this.tempFolder + '/' + resFileName, folder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(testDataFolder + "/" + name);
        String resFileName = "result.xml";

        AsposeResponse response = this.pdfApi.putPdfInRequestToXml(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(201, (int)response.getCode());
    }

    // Convert To PDF Tests

    /**
     * GetEpubInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getEpubInStorageToPdfTest() throws ApiException
    {
        String name = "4pages.epub";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getEpubInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutEpubInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putEpubInStorageToPdfTest() throws ApiException
    {
        String name = "4pages.epub";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromEpub.pdf";

        AsposeResponse response = this.pdfApi.putEpubInStorageToPdf(resultName, srcPath, null, this.tempFolder);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetWebInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getWebInStorageToPdfTest() throws ApiException
    {
        String sourceUrl = "http://google.com";

        File response = this.pdfApi.getWebInStorageToPdf(sourceUrl, null, null , null,
                null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutWebInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putWebInStorageToPdfTest() throws ApiException
    {
        String sourceUrl = "http://google.com";
        String resultName = "fromWeb.pdf";

        AsposeResponse response = this.pdfApi.putWebInStorageToPdf(resultName, sourceUrl, null,
                null, null, null, null, null,
                null, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetLaTeXInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getLaTeXInStorageToPdfTest() throws ApiException
    {
        String name = "TexExample.tex";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getLaTeXInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutLaTeXInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putLaTeXInStorageToPdfTest() throws ApiException
    {
        String name = "TexExample.tex";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromTex.pdf";

        AsposeResponse response = this.pdfApi.putLaTeXInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetMhtInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getMhtInStorageToPdfTest() throws ApiException
    {
        String name = "MhtExample.mht";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getMhtInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutMhtInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putMhtInStorageToPdfTest() throws ApiException
    {
        String name = "MhtExample.mht";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromMht.pdf";

        AsposeResponse response = this.pdfApi.putMhtInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetHtmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getHtmlInStorageToPdfTest() throws ApiException
    {
        String name = "HtmlWithImage.zip";
        this.uploadFile(name);

        String htmlFileName = "HtmlWithImage.html";
        double height = 650;
        double width = 250;
        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getHtmlInStorageToPdf(srcPath, htmlFileName, height, width,
                null, null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutHtmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putHtmlInStorageToPdfTest() throws ApiException
    {
        String name = "HtmlWithImage.zip";
        this.uploadFile(name);

        String htmlFileName = "HtmlWithImage.html";
        double height = 650;
        double width = 250;
        String resultName = "fromHtml.pdf";
        String srcPath = this.tempFolder + '/' + name;


        AsposeResponse response = this.pdfApi.putHtmlInStorageToPdf(name, srcPath, htmlFileName,
                height, width, null, null, null,
                null, null, null, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetXslFoInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXslFoInStorageToPdfTest() throws ApiException
    {
        String name = "XslfoExample.xslfo";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getXslFoInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutXslFoInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXslFoInStorageToPdfTest() throws ApiException
    {
        String name = "XslfoExample.xslfo";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromXlsFo.pdf";

        AsposeResponse response = this.pdfApi.putXslFoInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetXpsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXpsInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.xps";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getXpsInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutXpsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXpsInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.xps";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromXps.pdf";

        AsposeResponse response = this.pdfApi.putXpsInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetSvgInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSvgInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.svg";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getSvgInStorageToPdf(srcPath, null, null, null,
                null, null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutSvgInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSvgInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.svg";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromSvg.pdf";

        AsposeResponse response = this.pdfApi.putSvgInStorageToPdf(resultName, srcPath, null,
                null, null, null, null, null,
                null, null, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }

    /**
     * GetPclInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPclInStorageToPdfTest() throws ApiException
    {
        String name = "template.pcl";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getPclInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutPclInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPclInStorageToPdfTest() throws ApiException
    {
        String name = "template.pcl";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromPcl.pdf";

        AsposeResponse response = this.pdfApi.putPclInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetXmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXmlInStorageToPdfTest() throws ApiException
    {
        String name = "template.xml";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getXmlInStorageToPdf(srcPath, null, null);
        assertNotNull(response);
    }


    /**
     * PutXmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXmlInStorageToPdfTest() throws ApiException
    {
        String name = "template.xml";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromXml.pdf";

        AsposeResponse response = this.pdfApi.putXmlInStorageToPdf(resultName, srcPath, null, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * GetPsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPsInStorageToPdfTest() throws ApiException
    {
        String name = "Typography.PS";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;

        File response = this.pdfApi.getPsInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutPsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPsInStorageToPdfTest() throws ApiException
    {
        String name = "Typography.PS";
        this.uploadFile(name);


        String srcPath = this.tempFolder + '/' + name;
        String resultName = "fromPs.pdf";

        AsposeResponse response = this.pdfApi.putPsInStorageToPdf(resultName, srcPath, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * PutImageInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageInStorageToPdfTest() throws ApiException
    {
        final String dataFile1 = "33539.jpg";
        this.uploadFile(dataFile1);

        final String dataFile2 = "44781.jpg";
        this.uploadFile(dataFile2);

        String resultName = "result.pdf";


        ImageTemplatesRequest imageTemplatesRequest = new ImageTemplatesRequest()
                .isOCR(true)
                .ocRLangs("eng")
                .imagesList(new ArrayList<ImageTemplate>(){{
                    add(new ImageTemplate().imagePath(PdfApiTest.this.tempFolder + '/' + dataFile1).imageSrcType(ImageSrcType.COMMON));
                    add(new ImageTemplate().imagePath(PdfApiTest.this.tempFolder + '/' + dataFile2).imageSrcType(ImageSrcType.COMMON));
                }});

        AsposeResponse response = this.pdfApi.putImageInStorageToPdf(resultName, imageTemplatesRequest, this.tempFolder, null);
        assertEquals(201, (int)response.getCode());
    }

    // Document Tests

    /**
     * GetDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        DocumentResponse response = this.pdfApi.getDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostOptimizeDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postOptimizeDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        OptimizeOptions optimizeOptions = new OptimizeOptions();
        optimizeOptions.setAllowReusePageContent(false);
        optimizeOptions.setCompressImages(true);
        optimizeOptions.setImageQuality(100);
        optimizeOptions.setLinkDuplcateStreams(true);
        optimizeOptions.setRemoveUnusedObjects(true);
        optimizeOptions.setRemoveUnusedStreams(true);
        optimizeOptions.setUnembedFonts(true);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostSplitDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSplitDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        SplitResultResponse response = this.pdfApi.postSplitDocument(name, null, null, null, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutCreateEmptyDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCreateEmptyDocumentTest() throws ApiException
    {
        String name = "empty.pdf";

        String folder = this.tempFolder;

        DocumentResponse response = this.pdfApi.putCreateDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Fields Tests

    /**
     * GetField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        String fieldName = "textField";

        FieldResponse response = this.pdfApi.getField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        FieldsResponse response = this.pdfApi.getFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostCreateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postCreateFieldTest() throws ApiException
    {
        String name = "Hello world.pdf";
        this.uploadFile(name);

        RectanglePdf rect = new RectanglePdf()
                .LLX(50.)
                .LLY(200.)
                .URX(200.)
                .URY(400.);

        Field field = new Field();
        field.setName("checkboxfield");
        field.setValues(new ArrayList<String>(){{ add("1");}});
        field.setType(FieldType.BOOLEAN);
        field.setRect(rect);

        int pageNumber = 1;
        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.postCreateField(name, pageNumber, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutUpdateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putUpdateFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        String fieldName = "textField";

        Field field = new Field();
        field.setName(fieldName);
        field.setValues(new ArrayList<String>(){{ add("Text field updated value.");}});
        field.setType(FieldType.TEXT);

        String folder = this.tempFolder;

        FieldResponse response = this.pdfApi.putUpdateField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutUpdateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putUpdateFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        Field field = new Field();
        field.setName("textField");
        field.setValues(new ArrayList<String>(){{ add("1");}});
        field.setType(FieldType.TEXT);

        ArrayList<Field> fieldsList = new ArrayList<Field>();
        fieldsList.add(field);

        Fields fields = new Fields().list(fieldsList);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.putUpdateFields(name, fields,null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        String fieldName = "textField";

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.deleteField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutFieldsFlatten Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putFieldsFlattenTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.putFieldsFlatten(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Images Tests

    /**
     * GetImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        ImageResponse response = this.pdfApi.getImage(name, imageId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        AsposeResponse response = this.pdfApi.deleteImage(name, imageId, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetImages Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImagesTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        ImagesResponse response = this.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostReplaceImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putReplaceImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        String imageFileName = "Koala.jpg";
        this.uploadFile(imageFileName);

        int pageNumber = 1;
        String folder = this.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        ImageResponse response = this.pdfApi.putReplaceImage(name, imageId, imageFile, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostInsertImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postInsertImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        String imageFileName = "Koala.jpg";
        File file = new File(testDataFolder + "/" + imageFileName);

        int pageNumber = 1;
        String folder = this.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        double llx = 10;
        double lly = 10;
        double urx = 100;
        double ury = 100;

        AsposeResponse response = this.pdfApi.postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFile, null, folder, null);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * PutImagesExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = this.tempFolder + '/' + "extract_jpg";

        AsposeResponse response = this.pdfApi.putImagesExtractAsJpeg(name, pageNumber, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = this.tempFolder + '/' + "extract_tiff";

        AsposeResponse response = this.pdfApi.putImagesExtractAsTiff(name, pageNumber, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = this.tempFolder + '/' + "extract_gif";

        AsposeResponse response = this.pdfApi.putImagesExtractAsGif(name, pageNumber, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = this.tempFolder + '/' + "extract_png";

        AsposeResponse response = this.pdfApi.putImagesExtractAsPng(name, pageNumber, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutImageExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = this.tempFolder + '/' + "extract_jpg";

        AsposeResponse response = this.pdfApi.putImageExtractAsJpeg(name, imageId, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = this.pdfApi.getImageExtractAsJpeg(name, imageId, null, null, null,
                this.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = this.tempFolder + '/' + "extract_tiff";

        AsposeResponse response = this.pdfApi.putImageExtractAsTiff(name, imageId, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = this.pdfApi.getImageExtractAsTiff(name, imageId, null, null, null,
                this.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = this.tempFolder + '/' + "extract_gif";

        AsposeResponse response = this.pdfApi.putImageExtractAsGif(name, imageId, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = this.pdfApi.getImageExtractAsGif(name, imageId, null, null, null,
                this.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = this.tempFolder + '/' + "extract_png";

        AsposeResponse response = this.pdfApi.putImageExtractAsPng(name, imageId, null, null, null,
                this.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        this.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = this.pdfApi.getImageExtractAsPng(name, imageId, null, null, null,
                this.tempFolder);
        assertNotNull(response);
    }


    // Links Tests

    /**
     * GetPageLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        LinkAnnotationResponse response = this.pdfApi.getPageLinkAnnotation(name, pageNumber, linkId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        AsposeResponse response = this.pdfApi.deleteLinkAnnotation(name, linkId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        LinkAnnotationsResponse response = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostPageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        LinkAnnotation link = new LinkAnnotation()
                .actionType(LinkActionType.GOTOURIACTION)
                .action("https://products.aspose.cloud/pdf")
                .rect(new RectanglePdf().LLX(100.).LLY(100.).URX(500.).URY(500.));

        ArrayList<LinkAnnotation> links = new ArrayList<>();
        links.add(link);

        AsposeResponse response = this.pdfApi.postPageLinkAnnotations(name, pageNumber, links, null, folder);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * PutLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        LinkAnnotation link = new LinkAnnotation()
                .actionType(LinkActionType.GOTOURIACTION)
                .action("https://products.aspose.cloud/pdf")
                .rect(new RectanglePdf().LLX(100.).LLY(100.).URX(500.).URY(500.));

        LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        AsposeResponse response = this.pdfApi.putLinkAnnotation(name, linkId, link, null, folder);
        assertEquals(201, (int)response.getCode());
    }


    /**
     * DeletePageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.deletePageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteDocumentLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteDocumentLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.deleteDocumentLinkAnnotations(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Merge Tests

    /**
     * PutMergeDocuments Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putMergeDocumentsTest() throws ApiException
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("4pages.pdf");
        nameList.add("PdfWithImages2.pdf");
        nameList.add("marketing.pdf");

        for (String name : nameList)
        {
            this.uploadFile(name);
        }

        String resultName = "MergingResult.pdf";

        MergeDocuments mergeDocuments = new MergeDocuments();

        for(int i = 0; i < nameList.size(); i++)
        {
            nameList.set(i, this.tempFolder + '/' + nameList.get(i));
        }

        mergeDocuments.setList(nameList);

        String folder = this.tempFolder;

        DocumentResponse response = this.pdfApi.putMergeDocuments(resultName, mergeDocuments, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // OCR Tests

    /**
     * PutSearchableDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSearchableDocumentTest() throws ApiException
    {
        String name = "rusdoc.pdf";
        this.uploadFile(name);

        String lang = "rus,eng";
        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, lang);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutSearchableDocumentWithDefaultLang Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSearchableDocumentWithDefaultLangTest() throws ApiException
    {
        String name = "rusdoc.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    // Page Convert To Image Tests

    /**
     * GetPageConvertToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToTiffTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToTiff(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToTiffTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.tiff";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToTiff(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageConvertToJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToJpegTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToJpeg(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToJpegTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.jpeg";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToJpeg(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToPng Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToPngTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToPng(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToPng Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToPngTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.png";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToPng(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToEmf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToEmfTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToEmf(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToEmf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToEmfTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.emf";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToEmf(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageConvertToBmp Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToBmpTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToBmp(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToBmp Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToBmpTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.bmp";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToBmp(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToGif Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToGifTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;

        File response = this.pdfApi.getPageConvertToGif(name, pageNumber, null, null, this.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToGif Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToGifTest() throws ApiException
    {
        final String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.gif";
        final String outPath = this.tempFolder + '/' + resultFile;
        AsposeResponse response = this.pdfApi.putPageConvertToGif(name, pageNumber, outPath,
                null, null, this.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    // Pages Tests

    /**
     * DeletePage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.deletePage(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 3;
        String folder = this.tempFolder;

        DocumentPageResponse response = this.pdfApi.getPage(name, pageNumber, null, folder);
        assertNotNull(response);
    }


    /**
     * GetPages Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPagesTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        DocumentPagesResponse response = this.pdfApi.getPages(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetWordsPerPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getWordsPerPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        WordCountResponse response = this.pdfApi.getWordsPerPage(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostMovePage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postMovePageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;
        int pageNumber = 1;
        int newIndex = 1;

        AsposeResponse response = this.pdfApi.postMovePage(name, pageNumber, newIndex, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutAddNewPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putAddNewPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String folder = this.tempFolder;

        DocumentPagesResponse response = this.pdfApi.putAddNewPage(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPageAddStamp Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPageAddStampTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String stampFileName = "Penguins.jpg";
        this.uploadFile(stampFileName);

        int pageNumber = 1;
        String folder = this.tempFolder;


        Stamp stamp = new Stamp();
        stamp.setType(StampType.IMAGE);
        stamp.setFileName(folder + '/' + stampFileName);
        stamp.setBackground(true);
        stamp.setWidth(200.);
        stamp.setHeight(200.);
        stamp.setXindent(100.);
        stamp.setYindent(100.);

        AsposeResponse response = this.pdfApi.putPageAddStamp(name, pageNumber, stamp, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Privileges Tests

    /**
     * PutPrivileges Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPrivilegesTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        DocumentPrivilege documentPrivilege = new DocumentPrivilege();
        documentPrivilege.setAllowCopy(false);
        documentPrivilege.setAllowPrint(false);

        String folder = this.tempFolder;

        AsposeResponse response = this.pdfApi.putPrivileges(name, documentPrivilege, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Properties Tests

    /**
     * DeleteProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePropertiesTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = this.tempFolder;

        DocumentProperty property2 = new DocumentProperty();
        property2.setName("prop2");
        property2.setValue("val2");


        this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
        this.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder);

        AsposeResponse response = this.pdfApi.deleteProperties(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = this.tempFolder;

        this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);

        AsposeResponse response = this.pdfApi.deleteProperty(name, property1.getName(), null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentPropertiesTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = this.tempFolder;

        DocumentProperty property2 = new DocumentProperty();
        property2.setName("prop2");
        property2.setValue("val2");

        this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
        this.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder);

        DocumentPropertiesResponse response = this.pdfApi.getDocumentProperties(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentPropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = this.tempFolder;

        this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);

        DocumentPropertyResponse response = this.pdfApi.getDocumentProperty(name, property1.getName(), null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutSetProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSetPropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        this.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = this.tempFolder;

        DocumentPropertyResponse response = this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Sign Tests

    /**
     * PostSignDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSignDocumentTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        this.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        this.uploadFile(signatureFileName);

        RectanglePdf rectangle = new RectanglePdf()
            .LLX(100.)
            .LLY(100.)
            .URX(500.)
            .URY(200.);

        String folder = this.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = this.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostSignPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSignPageTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        this.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        this.uploadFile(signatureFileName);

        int pageNumber = 1;

        RectanglePdf rectangle = new RectanglePdf()
            .LLX(100.)
            .LLY(100.)
            .URX(500.)
            .URY(200.);

        String folder = this.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = this.pdfApi.postSignPage(name, pageNumber, signature, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetVerifySignature Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getVerifySignatureTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        this.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        this.uploadFile(signatureFileName);

        RectanglePdf rectangle = new RectanglePdf()
            .LLX(100.)
            .LLY(100.)
            .URX(500.)
            .URY(200.);

        String folder = this.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse responseSign = this.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(200, (int)responseSign.getCode());

        SignatureVerifyResponse response = this.pdfApi.getVerifySignature(name, signature.getFormFieldName(), null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Text Replace Tests

    /**
     * PostDocumentTextReplace Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentTextReplaceTest() throws ApiException
    {
        String name = "marketing.pdf";
        this.uploadFile(name);

        RectanglePdf rect = new RectanglePdf()
            .LLX(100.)
            .LLY(100.)
            .URX(300.)
            .URY(300.);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("market");
        textReplace.setNewValue("m_a_r_k_e_t");
        textReplace.setRegex(false);
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = this.tempFolder;

        TextReplaceResponse response  = this.pdfApi.postDocumentTextReplace(name, textReplaceList, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostPageTextReplaceByRect Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageTextReplaceByRectTest() throws ApiException
    {
        String name = "marketing.pdf";
        this.uploadFile(name);
        int pageNumber = 1;

        RectanglePdf rect = new RectanglePdf()
            .LLX(100.)
            .LLY(700.)
            .URX(400.)
            .URY(1000.);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("market");
        textReplace.setNewValue("m_a_r_k_e_t");
        textReplace.setRegex(false);
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = this.tempFolder;

        TextReplaceResponse response = this.pdfApi.postPageTextReplace(name, pageNumber, textReplaceList, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    // Text Tests

    /**
     * GetText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getTextTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        double llx = 0;
        double lly = 0;
        double urx = 0;
        double ury = 0;
        String folder = this.tempFolder;

        TextRectsResponse response = this.pdfApi.getText(name, llx, lly, urx, ury, null, null, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageTextByTwoTextOnPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTextByTwoTextOnPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        double llx = 0;
        double lly = 0;
        double urx = 0;
        double ury = 0;

        List<String> format = new ArrayList<String>(){{ add("First Page"); add("Second Page");}};
        String folder = this.tempFolder;

        TextRectsResponse response = this.pdfApi.getPageText(name, pageNumber, llx, lly, urx, ury, format, null, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutAddText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putAddTextTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        RectanglePdf rectangle = new RectanglePdf();
        rectangle.setLLX(100.);
        rectangle.setLLY(100.);
        rectangle.setURX(200.);
        rectangle.setURY(200.);

        Color foregroundColor = new Color();
        foregroundColor.setA(0x00);
        foregroundColor.setR(0x00);
        foregroundColor.setG(0xFF);
        foregroundColor.setB(0x00);

        Color backgroundColor = new Color();
        backgroundColor.setA(0x00);
        backgroundColor.setR(0xFF);
        backgroundColor.setG(0x00);
        backgroundColor.setB(0x00);

        TextState textState = new TextState();
        textState.setFont("Arial");
        textState.setFontSize(10.);
        textState.setForegroundColor(foregroundColor);
        textState.setBackgroundColor(backgroundColor);
        textState.setFontStyle(FontStyles.BOLD);

        final Segment segment = new Segment();
        segment.setValue("segment 1");
        segment.setTextState(textState);

        final TextLine textLine = new TextLine();
        textLine.setHorizontalAlignment(TextHorizontalAlignment.RIGHT);
        textLine.setSegments(new ArrayList<Segment>(){{ add(segment);}});

        Paragraph paragraph = new Paragraph();
        paragraph.setRectangle(rectangle);
        paragraph.setLeftMargin(10.);
        paragraph.setRightMargin(10.);
        paragraph.setTopMargin(20.);
        paragraph.setBottomMargin(20.);
        paragraph.setHorizontalAlignment(TextHorizontalAlignment.FULLJUSTIFY);
        paragraph.setLineSpacing(LineSpacing.FONTSIZE);
        paragraph.setRotation(10.);
        paragraph.setSubsequentLinesIndent(20.);
        paragraph.setVerticalAlignment(VerticalAlignment.CENTER);
        paragraph.setWrapMode(WrapMode.BYWORDS);
        paragraph.setLines(new ArrayList<TextLine>(){{ add(textLine);}});


        AsposeResponse response = this.pdfApi.putAddText(name, pageNumber, paragraph, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    // Upload/Download Tests

    /**
     * UploadFile Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void uploadFileTest() throws ApiException
    {
        String name = "4pages.pdf";
        String path = this.tempFolder + '/' + name;
        File file = new File(testDataFolder + "/" + name);
        AsposeResponse response = this.pdfApi.putCreate(path, file, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDownload Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDownloadTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.uploadFile(name);

        String path = this.tempFolder + '/' + name;

        File response = this.pdfApi.getDownload(path, null, null);
        assertNotNull(response);
    }
}
