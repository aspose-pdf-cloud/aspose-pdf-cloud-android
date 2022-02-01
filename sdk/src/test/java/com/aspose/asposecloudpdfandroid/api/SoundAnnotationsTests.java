/**
 *
 * Copyright (c) 2022 Aspose.PDF Cloud
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

public class SoundAnnotationsTests {
    private TestHelper th;

    public SoundAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }


    /**
     * GetDocumentSoundAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentSoundAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        SoundAnnotationsResponse response = th.pdfApi.getDocumentSoundAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageSoundAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageSoundAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        SoundAnnotationsResponse response = th.pdfApi.getPageSoundAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageSoundAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageSoundAnnotationsTest()throws ApiException
    {
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

        SoundAnnotation annotation = new SoundAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2008 12:00:00.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);

        List<SoundAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPageSoundAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetSoundAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSoundAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        SoundAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentSoundAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        SoundAnnotationResponse response = th.pdfApi.getSoundAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutSoundAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSoundAnnotationTest()throws ApiException
    {
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

        SoundAnnotation annotation = new SoundAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setModified("01/01/2008 12:01:02.000 AM");
        annotation.setFilePath(th.tempFolder + '/' + attachmentFile);

        SoundAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentSoundAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putSoundAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetSoundAnnotationDataTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSoundAnnotationDataTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        SoundAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentSoundAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        File response = th.pdfApi.getSoundAnnotationData(name, annotationId, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * PutSoundAnnotationDataExtractTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSoundAnnotationDataExtractTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        SoundAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentSoundAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putSoundAnnotationDataExtract(name, annotationId,  "outFile.dat", null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

}
