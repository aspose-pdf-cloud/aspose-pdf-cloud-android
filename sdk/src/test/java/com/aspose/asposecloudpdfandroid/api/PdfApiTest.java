/**
 *
 *   Copyright (c) 2018 Aspose.Pdf for Cloud
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
import com.aspose.asposecloudpdfandroid.model.AppendDocument;
import com.aspose.asposecloudpdfandroid.model.AttachmentResponse;
import com.aspose.asposecloudpdfandroid.model.AttachmentsResponse;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.ColorDepth;
import com.aspose.asposecloudpdfandroid.model.CompressionType;
import com.aspose.asposecloudpdfandroid.model.DocumentPagesResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentPrivilege;
import com.aspose.asposecloudpdfandroid.model.DocumentPropertiesResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentProperty;
import com.aspose.asposecloudpdfandroid.model.DocumentPropertyResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentTextReplaceResponse;
import com.aspose.asposecloudpdfandroid.model.FieldType;
import com.aspose.asposecloudpdfandroid.model.FontStyles;
import com.aspose.asposecloudpdfandroid.model.PdfAType;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
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

import com.aspose.asposecloudpdfandroid.model.HttpStatusCode;
import com.aspose.asposecloudpdfandroid.model.ImageResponse;
import com.aspose.asposecloudpdfandroid.model.ImagesListRequest;
import com.aspose.asposecloudpdfandroid.model.ImagesResponse;
import com.aspose.asposecloudpdfandroid.model.LineSpacing;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.LinkAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.MergeDocuments;
import com.aspose.asposecloudpdfandroid.model.OptimizeOptions;
import com.aspose.asposecloudpdfandroid.model.PageTextReplaceResponse;
import com.aspose.asposecloudpdfandroid.model.Paragraph;
import com.aspose.asposecloudpdfandroid.model.SaaSposeResponse;
import com.aspose.asposecloudpdfandroid.model.Signature;
import com.aspose.asposecloudpdfandroid.model.SignatureType;
import com.aspose.asposecloudpdfandroid.model.SignatureVerifyResponse;
import com.aspose.asposecloudpdfandroid.model.SplitResultResponse;
import com.aspose.asposecloudpdfandroid.model.Stamp;
import com.aspose.asposecloudpdfandroid.model.TextFormatResponse;
import com.aspose.asposecloudpdfandroid.model.TextItemResponse;
import com.aspose.asposecloudpdfandroid.model.TextItemsResponse;
import com.aspose.asposecloudpdfandroid.model.TextRectsResponse;
import com.aspose.asposecloudpdfandroid.model.TextReplaceListRequest;
import com.aspose.asposecloudpdfandroid.model.TextReplaceRequest;
import com.aspose.asposecloudpdfandroid.model.TextReplaceResponse;
import com.aspose.asposecloudpdfandroid.model.TiffExportOptions;
import com.aspose.asposecloudpdfandroid.model.WordCountResponse;
import com.aspose.asposecloudpdfandroid.model.WrapMode;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

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
        SaaSposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


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
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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


    // Document Save As Tiff Tests

    /**
     * PutDocumentSaveAsTiffUsingQueryParams Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putDocumentSaveAsTiffUsingQueryParamsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        String resultFile = "4pages.tiff"; 
        double brightness = 0.6;
        String compression = CompressionType.CCITT4.toString();
        String colorDepth = ColorDepth.FORMAT1BPP.toString();
        int leftMargin = 0;
        int rightMargin = 0;
        int topMargin = 0;
        int bottomMargin = 0;
        String orientation = ShapeType.PORTRAIT.toString();
        boolean skipBlankPages = true;
        int width = 1200;
        int height = 1600;
        int xResolution = 200;
        int yResolution = 200;
        int pageIndex = 2;
        int pageCount = 2;
        String folder = this.tempFolder;

        SaaSposeResponse response = this.pdfApi.putDocumentSaveAsTiff(name, null, resultFile, brightness, compression,
                colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages,
                width, height, xResolution, yResolution, pageIndex, pageCount, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }

    /**
     * PutDocumentSaveAsTiffUsingBodyParams Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putDocumentSaveAsTiffUsingBodyParamsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        TiffExportOptions exportOptions = new TiffExportOptions();
        exportOptions.setResultFile("4pages.tiff");
        exportOptions.setBrightness(0.6);
        exportOptions.setCompression(CompressionType.CCITT4);
        exportOptions.setColorDepth(ColorDepth.FORMAT1BPP);
        exportOptions.setLeftMargin(0);
        exportOptions.setRightMargin(0);
        exportOptions.setTopMargin(0);
        exportOptions.setBottomMargin(0);
        exportOptions.setOrientation(ShapeType.PORTRAIT);
        exportOptions.setSkipBlankPages(true);
        exportOptions.setWidth(1200);
        exportOptions.setHeight(1600);
        exportOptions.setXresolution(200);
        exportOptions.setYresolution(200);
        exportOptions.setPageIndex(2);
        exportOptions.setPageCount(2);

        String folder = this.tempFolder;

        SaaSposeResponse response = this.pdfApi.putDocumentSaveAsTiff(name, exportOptions, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        File response = this.pdfApi.getDocument(name, null, null, folder, null);
        assertNotNull(response);
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

        SaaSposeResponse response = this.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PutConvertDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putConvertDocumentTest() throws ApiException
    {
        String url = "http://pdf995.com/samples/pdf.pdf";
        String format = "tiff";

        File response = this.pdfApi.putConvertDocument(format, url, null, null);
        assertNotNull(response);
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

        DocumentResponse response = this.pdfApi.putCreateDocument(name, null, null, null, null, folder, null, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PutCreateDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCreateDocumentTest() throws ApiException
    {
        String name = "HtmlExample1.pdf"; 
        String templateName = "HtmlExample1.html"; 
        String folder = this.tempFolder;
        String templateFile = folder + '/' + templateName;

        this.uploadFile(templateName);

        String templateType = "html";

        DocumentResponse response = this.pdfApi.putCreateDocument(name, templateFile, null, templateType,
                null, folder, null, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PutCreateDocumentFromImages Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCreateDocumentFromImagesTest() throws ApiException
    {
        final String image1 = "33539.jpg";
        this.uploadFile(image1);

        final String image2 = "44781.jpg";
        this.uploadFile(image2);

        String resultDocName = "pdffromimagesinquery.pdf"; 
        String folder = this.tempFolder;

        ImagesListRequest images = new ImagesListRequest();
        List<String> imagesList = new ArrayList<String>(){{
            add(tempFolder + '/' + image1);
            add(tempFolder + '/' + image2);
        }};
        images.setImagesList(imagesList);

        boolean ocr = false;
        String ocrLang = "eng";
        DocumentResponse response = this.pdfApi.putCreateDocumentFromImages(resultDocName, images , ocr, ocrLang, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(200);
        rect.setWidth(150);
        rect.setHeight(200);


        Field field = new Field();
        field.setName("checkboxfield");
        field.setValues(new ArrayList<String>(){{ add("1");}});
        field.setType(FieldType.BOOLEAN);
        field.setRect(rect);

        int pageNumber = 1;
        String folder = this.tempFolder;

        SaaSposeResponse response = this.pdfApi.postCreateField(name, pageNumber, field, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.deleteField(name, fieldName, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.putFieldsFlatten(name, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    // Fragments And Segments Tests

    /**
     * GetFragment Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFragmentTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int fragmentNumber = 1;
        String folder = this.tempFolder;

        TextItemsResponse response = this.pdfApi.getFragment(name, pageNumber, fragmentNumber, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * GetFragmentTextFormat Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFragmentTextFormatTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int fragmentNumber = 1;
        String folder = this.tempFolder;

        TextFormatResponse response = this.pdfApi.getFragmentTextFormat(name, pageNumber, fragmentNumber, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * GetFragments Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFragmentsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        TextItemsResponse response = this.pdfApi.getFragments(name, pageNumber, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * GetSegment Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSegmentTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int fragmentNumber = 1;
        int segmentNumber = 1;
        String folder = this.tempFolder;

        TextItemResponse response = this.pdfApi.getSegment(name, pageNumber, fragmentNumber, segmentNumber, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * GetSegmentTextFormat Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSegmentTextFormatTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int fragmentNumber = 1;
        int segmentNumber = 1;
        String folder = this.tempFolder;

        TextFormatResponse response = this.pdfApi.getSegmentTextFormat(name, pageNumber, fragmentNumber, segmentNumber, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * GetSegments Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSegmentsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int fragmentNumber = 1;
        String folder = this.tempFolder;

        TextItemsResponse response = this.pdfApi.getSegments(name, pageNumber, fragmentNumber, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        int imageNumber = 1;
        String folder = this.tempFolder;

        File response = this.pdfApi.getImage(name, pageNumber, imageNumber, null, 0, 0, null, folder);
        assertNotNull(response);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PostReplaceImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postReplaceImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf"; 
        this.uploadFile(name);

        String imageFileName = "Koala.jpg"; 
        this.uploadFile(imageFileName);

        int pageNumber = 1;
        int imageNumber = 1;
        String folder = this.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        ImageResponse response = this.pdfApi.postReplaceImage(name, pageNumber, imageNumber, imageFile, null, folder, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }

    /**
     * GetImageWithFormat Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageWithFormatTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int imageNumber = 1;
        String folder = this.tempFolder;

        File response = this.pdfApi.getImage(name, pageNumber, imageNumber, "jpeg", 100, 100, null, folder);
        assertNotNull(response);
    }

    /**
     * PostReplaceImageFromRequest Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postReplaceImageFromRequestTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf"; 
        this.uploadFile(name);

        String imageFileName = "Koala.jpg";
        File file = new File(testDataFolder + "/" + imageFileName);

        int pageNumber = 1;
        int imageNumber = 1;
        String folder = this.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        ImageResponse response = this.pdfApi.postReplaceImage(name, pageNumber, imageNumber, null, null, folder, file);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }

    // Links Tests

    /**
     * GetPageLinkAnnotationByIndex Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageLinkAnnotationByIndexTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        int linkIndex = 1;
        String folder = this.tempFolder;

        LinkAnnotationResponse response = this.pdfApi.getPageLinkAnnotationByIndex(name, pageNumber, linkIndex, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.deletePage(name, pageNumber, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        File response = this.pdfApi.getPage(name, pageNumber, null, 0, 0, null, folder);
        assertNotNull(response);
    }

    /**
     * GetPageWithFormat Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageWithFormatTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 3;
        String folder = this.tempFolder;

        File response = this.pdfApi.getPage(name, pageNumber, "jpeg", 100, 100, null, folder);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.postMovePage(name, pageNumber, newIndex, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.putPageAddStamp(name, pageNumber, stamp, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    // Paragraphs Tests

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

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(200);

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


        SaaSposeResponse response = this.pdfApi.putAddText(name, pageNumber, paragraph, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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


        this.pdfApi.putSetProperty(name, property1.getName(), property1, null, folder);
        this.pdfApi.putSetProperty(name, property2.getName(), property2, null, folder);

        SaaSposeResponse response = this.pdfApi.deleteProperties(name, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        this.pdfApi.putSetProperty(name, property1.getName(), property1, null, folder);

        SaaSposeResponse response = this.pdfApi.deleteProperty(name, property1.getName(), null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        this.pdfApi.putSetProperty(name, property1.getName(), property1, null, folder);
        this.pdfApi.putSetProperty(name, property2.getName(), property2, null, folder);

        DocumentPropertiesResponse response = this.pdfApi.getDocumentProperties(name, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        this.pdfApi.putSetProperty(name, property1.getName(), property1, null, folder);

        DocumentPropertyResponse response = this.pdfApi.getDocumentProperty(name, property1.getName(), null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        DocumentPropertyResponse response = this.pdfApi.putSetProperty(name, property1.getName(), property1, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(100);

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
        signature.setSignatureType(SignatureType.PKCS_7);
        signature.setVisible(true);

        SaaSposeResponse response = this.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(100);

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
        signature.setSignatureType(SignatureType.PKCS_7);
        signature.setVisible(true);

        SaaSposeResponse response = this.pdfApi.postSignPage(name, pageNumber, signature, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(100);

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
        signature.setSignatureType(SignatureType.PKCS_7);
        signature.setVisible(true);

        SaaSposeResponse responseSign = this.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(responseSign.getCode(), HttpStatusCode.OK);

        SignatureVerifyResponse response = this.pdfApi.getVerifySignature(name, signature.getFormFieldName(), folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }

    // Text Items Tests

    /**
     * GetPageTextItems Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTextItemsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;
        String folder = this.tempFolder;

        TextItemsResponse response = this.pdfApi.getPageTextItems(name, pageNumber, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }

    /**
     * GetTextItems Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getTextItemsTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        String folder = this.tempFolder;

        TextItemsResponse response = this.pdfApi.getTextItems(name, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    // Text Replace Tests

    /**
     * PostDocumentReplaceText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentReplaceTextTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        TextReplaceRequest textReplaceRequest = new TextReplaceRequest();
        textReplaceRequest.setOldValue("Page");
        textReplaceRequest.setNewValue("p_a_g_e");
        textReplaceRequest.setRegex(false);

        String folder = this.tempFolder;

        DocumentTextReplaceResponse response = this.pdfApi.postDocumentReplaceText(name, textReplaceRequest, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PostDocumentReplaceTextList Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentReplaceTextListTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        final TextReplaceRequest textReplaceRequest1 = new TextReplaceRequest();
        textReplaceRequest1.setOldValue("First");
        textReplaceRequest1.setNewValue("1");
        textReplaceRequest1.setRegex(false);

        final TextReplaceRequest textReplaceRequest2 = new TextReplaceRequest();
        textReplaceRequest2.setOldValue("Page");
        textReplaceRequest2.setNewValue("p_a_g_e");
        textReplaceRequest2.setRegex(false);

        TextReplaceListRequest textReplaceListRequest = new TextReplaceListRequest();
        textReplaceListRequest.setTextReplaces(new ArrayList<TextReplace>()
                                               {{ add(textReplaceRequest1); add(textReplaceRequest2);}});

        String folder = this.tempFolder;

        DocumentTextReplaceResponse response = this.pdfApi.postDocumentReplaceTextList(name, textReplaceListRequest, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PostPageReplaceText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageReplaceTextTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;

        TextReplaceRequest textReplaceRequest = new TextReplaceRequest();
        textReplaceRequest.setOldValue("Page");
        textReplaceRequest.setNewValue("p_a_g_e");
        textReplaceRequest.setRegex(false);

        String folder = this.tempFolder;

        PageTextReplaceResponse response = this.pdfApi.postPageReplaceText(name, pageNumber, textReplaceRequest, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PostPageReplaceTextList Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageReplaceTextListTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        int pageNumber = 1;

        final TextReplaceRequest textReplaceRequest1 = new TextReplaceRequest();
        textReplaceRequest1.setOldValue("First");
        textReplaceRequest1.setNewValue("1");
        textReplaceRequest1.setRegex(false);

        final TextReplaceRequest textReplaceRequest2 = new TextReplaceRequest();
        textReplaceRequest2.setOldValue("Page");
        textReplaceRequest2.setNewValue("p_a_g_e");
        textReplaceRequest2.setRegex(false);

        TextReplaceListRequest textReplaceListRequest = new TextReplaceListRequest();
        textReplaceListRequest.setTextReplaces(new ArrayList<TextReplace>()
                    {{ add(textReplaceRequest1); add(textReplaceRequest2);}});

        String folder = this.tempFolder;

        PageTextReplaceResponse response = this.pdfApi.postPageReplaceTextList(name, pageNumber, textReplaceListRequest, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, lang);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        String folder = this.tempFolder;

        TextRectsResponse response = this.pdfApi.getText(name, x, y, width, height, null, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;

        List<String> format = new ArrayList<String>(){{ add("First Page"); add("Second Page");}};
        String folder = this.tempFolder;

        TextRectsResponse response = this.pdfApi.getPageText(name, pageNumber, x, y, width, height, format, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    // Text Replace Tests

    /**
     * PostDocumentTextReplaceWholeDocByRect Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentTextReplaceWholeDocByRectTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);

        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(700);
        rect.setWidth(300);
        rect.setHeight(300);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("Page");
        textReplace.setNewValue("p_a_g_e");
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = this.tempFolder;

        TextReplaceResponse response  = this.pdfApi.postDocumentTextReplace(name, textReplaceList, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


    /**
     * PostPageTextReplaceByRect Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageTextReplaceByRectTest() throws ApiException
    {
        String name = "4pages.pdf"; 
        this.uploadFile(name);
        int pageNumber = 1;

        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(700);
        rect.setWidth(300);
        rect.setHeight(300);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("Page");
        textReplace.setNewValue("p_a_g_e");
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = this.tempFolder;

        TextReplaceResponse response = this.pdfApi.postPageTextReplace(name, pageNumber, textReplaceList, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        File response = this.pdfApi.getPdfInStorageToDoc(name, null, null, null, null, null, null, null, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToDoc(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToDoc(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToPdfA(name, type, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToPdfA(name, this.tempFolder + '/' + resFileName, type, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToPdfA(this.tempFolder + '/' + resFileName, type, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToTiff(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToTiff(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToTiff(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToSvg(name, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToSvg(name, this.tempFolder + '/' + resFileName, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToSvg(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToXps(name, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToXps(name, this.tempFolder + '/' + resFileName, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToXps(this.tempFolder + '/' + resFileName, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToXls(name, null, null, null, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToXls(name, this.tempFolder + '/' + resFileName, null, null, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToXls(this.tempFolder + '/' + resFileName, null, null, null, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder);
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
        String resFileName = "result.html";

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToHtml(
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
            folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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
        String resFileName = "result.html";

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToHtml(
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
            file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToEpub(name, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToEpub(name, this.tempFolder + '/' + resFileName, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToEpub(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToPptx(name, null, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToPptx(name, this.tempFolder + '/' + resFileName, null, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToPptx(this.tempFolder + '/' + resFileName, null, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToLaTeX(name, null, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToLaTeX(name, this.tempFolder + '/' + resFileName, null, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToLaTeX(this.tempFolder + '/' + resFileName, null, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToMobiXml(name, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToMobiXml(name, this.tempFolder + '/' + resFileName, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToMobiXml(this.tempFolder + '/' + resFileName, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getXfaPdfInStorageToAcroForm(name, folder);
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

        SaaSposeResponse response = this.pdfApi.putXfaPdfInStorageToAcroForm(name, this.tempFolder + '/' + resFileName, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putXfaPdfInRequestToAcroForm(this.tempFolder + '/' + resFileName, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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


        File response = this.pdfApi.getPdfInStorageToXml(name, folder);
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

        SaaSposeResponse response = this.pdfApi.putPdfInStorageToXml(name, this.tempFolder + '/' + resFileName, folder);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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

        SaaSposeResponse response = this.pdfApi.putPdfInRequestToXml(this.tempFolder + '/' + resFileName, file);
        assertEquals(response.getCode(), HttpStatusCode.CREATED);
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
        SaaSposeResponse response = this.pdfApi.putCreate(path, file, null, null);
        assertEquals(response.getCode(), HttpStatusCode.OK);
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

        SaaSposeResponse response = this.pdfApi.putPrivileges(name, documentPrivilege, folder);
        assertEquals(response.getCode(), HttpStatusCode.OK);
    }


}
