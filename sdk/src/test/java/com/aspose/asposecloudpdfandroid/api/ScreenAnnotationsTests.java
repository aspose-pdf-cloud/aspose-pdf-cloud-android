/**
 *
 * Copyright (c) 2023 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of TestHelper.getInstance() software and associated documentation files (the "Software"), to deal
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
import com.aspose.asposecloudpdfandroid.model.*;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScreenAnnotationsTests {
    private TestHelper th;

    public ScreenAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentScreenAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentScreenAnnotationsTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        ScreenAnnotationsResponse response = th.pdfApi.getDocumentScreenAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageScreenAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageScreenAnnotationsTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        ScreenAnnotationsResponse response = th.pdfApi.getPageScreenAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageScreenAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageScreenAnnotationsTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        String attachmentFile = "ScreenMovie.swf";
        th.uploadFile(attachmentFile);

        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        ScreenAnnotation annotation = new ScreenAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2008 12:00:00.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);

        List<ScreenAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPageScreenAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetScreenAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScreenAnnotationTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        ScreenAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentScreenAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        ScreenAnnotationResponse response = th.pdfApi.getScreenAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutScreenAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putScreenAnnotationTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        String attachmentFile = "ScreenMovie.swf";
        th.uploadFile(attachmentFile);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        ScreenAnnotation annotation = new ScreenAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2008 12:00:00.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);

        ScreenAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentScreenAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putScreenAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetScreenAnnotationDataTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScreenAnnotationDataTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        ScreenAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentScreenAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        File response = th.pdfApi.getScreenAnnotationData(name, annotationId, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * PutScreenAnnotationDataExtractTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putScreenAnnotationDataExtractTest()throws ApiException
    {
        String name = "PdfWithScreenAnnotations.pdf";
        th.uploadFile(name);

        ScreenAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentScreenAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putScreenAnnotationDataExtract(name, annotationId,  "outFile.dat", null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}