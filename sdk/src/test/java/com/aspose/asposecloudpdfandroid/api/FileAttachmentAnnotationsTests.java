/**
 *
 * Copyright (c) 2025 Aspose.PDF Cloud
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

public class FileAttachmentAnnotationsTests {
    private TestHelper th;

    public FileAttachmentAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentFileAttachmentAnnotationsTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentFileAttachmentAnnotationsTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FileAttachmentAnnotationsResponse response = th.pdfApi.getDocumentFileAttachmentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }

    /**
     * GetPageFileAttachmentAnnotationsTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageFileAttachmentAnnotationsTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        FileAttachmentAnnotationsResponse response = th.pdfApi.getPageFileAttachmentAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }

    /**
     * PostPageFileAttachmentAnnotationsTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postPageFileAttachmentAnnotationsTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        String attachmentFile = "4pages.pdf";
        th.uploadFile(attachmentFile);

        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2018 12:00:00.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);
        annotation.setFileName(attachmentFile);

        List<FileAttachmentAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPageFileAttachmentAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }

    /**
     * GetFileAttachmentAnnotationTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileAttachmentAnnotationTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FileAttachmentAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFileAttachmentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int) responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        FileAttachmentAnnotationResponse response = th.pdfApi.getFileAttachmentAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }

    /**
     * PutFileAttachmentAnnotationTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putFileAttachmentAnnotationTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        String attachmentFile = "4pages.pdf";
        th.uploadFile(attachmentFile);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2018 12:00:00.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);
        annotation.setFileName(attachmentFile);

        FileAttachmentAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFileAttachmentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int) responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putFileAttachmentAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }

    /**
     * GetFileAttachmentAnnotationDataTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileAttachmentAnnotationDataTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FileAttachmentAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFileAttachmentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int) responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        File response = th.pdfApi.getFileAttachmentAnnotationData(name, annotationId, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * PutFileAttachmentAnnotationDataExtractTest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putFileAttachmentAnnotationDataExtractTest() throws ApiException {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FileAttachmentAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFileAttachmentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int) responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putFileAttachmentAnnotationDataExtract(name, annotationId, null, null, th.tempFolder);
        assertEquals(200, (int) response.getCode());
    }
}
