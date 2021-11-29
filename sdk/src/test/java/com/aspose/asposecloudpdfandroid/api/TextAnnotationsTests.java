/**
 *
 * Copyright (c) 2021 Aspose.PDF Cloud
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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextAnnotationsTests {
    private TestHelper th;

    public TextAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        TextAnnotationsResponse response = th.pdfApi.getDocumentTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        TextAnnotationsResponse response = th.pdfApi.getPageTextAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetTextAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTextAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        TextAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        TextAnnotationResponse response = th.pdfApi.getTextAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        TextAnnotation textAnnotation = new TextAnnotation();
        textAnnotation.setName("Test Free Text");
        textAnnotation.setRect(rect);
        textAnnotation.setFlags(flags);
        textAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        textAnnotation.setRichText("Rich Text");
        textAnnotation.setSubject("Text Box Subj");
        textAnnotation.setZindex(1);
        textAnnotation.setState(AnnotationState.UNDEFINED);

        List<TextAnnotation> annotations = new ArrayList<>();
        annotations.add(textAnnotation);

        AsposeResponse response = th.pdfApi.postPageTextAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutTextAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTextAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);


        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        TextAnnotation textAnnotation = new TextAnnotation();
        textAnnotation.setName("Test Free Text");
        textAnnotation.setRect(rect);
        textAnnotation.setFlags(flags);
        textAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        textAnnotation.setRichText("Rich Text");
        textAnnotation.setSubject("Text Box Subj");
        textAnnotation.setZindex(1);
        textAnnotation.setState(AnnotationState.UNDEFINED);

        TextAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putTextAnnotation(name, annotationId, textAnnotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
