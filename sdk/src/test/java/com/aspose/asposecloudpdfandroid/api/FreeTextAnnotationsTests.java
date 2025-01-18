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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FreeTextAnnotationsTests {
    private TestHelper th;

    public FreeTextAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentFreeTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentFreeTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FreeTextAnnotationsResponse response = th.pdfApi.getDocumentFreeTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageFreeTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageFreeTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        FreeTextAnnotationsResponse response = th.pdfApi.getPageFreeTextAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetFreeTextAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFreeTextAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        FreeTextAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFreeTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        FreeTextAnnotationResponse response = th.pdfApi.getFreeTextAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageFreeTextAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageFreeTextAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

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

        TextStyle textStyle = new TextStyle();
        textStyle.setFont("Arial");
        textStyle.setFontSize(12.);
        textStyle.setForegroundColor(foregroundColor);
        textStyle.setBackgroundColor(backgroundColor);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FreeTextAnnotation freeTextAnnotation = new FreeTextAnnotation();
        freeTextAnnotation.setName("Test Free Text");
        freeTextAnnotation.setTextStyle(textStyle);
        freeTextAnnotation.setRect(rect);
        freeTextAnnotation.setFlags(flags);
        freeTextAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        freeTextAnnotation.setIntent(FreeTextIntent.FREETEXTTYPEWRITER);
        freeTextAnnotation.setRichText("Rich Text");
        freeTextAnnotation.setSubject("Text Box Subj");
        freeTextAnnotation.setZindex(1);
        freeTextAnnotation.setJustification(Justification.CENTER);
        freeTextAnnotation.setTitle("Title");

        List<FreeTextAnnotation> annotations = new ArrayList<>();
        annotations.add(freeTextAnnotation);

        AsposeResponse response = th.pdfApi.postPageFreeTextAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutFreeTextAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFreeTextAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);


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

        TextStyle textStyle = new TextStyle();
        textStyle.setFont("Arial");
        textStyle.setFontSize(12.);
        textStyle.setForegroundColor(foregroundColor);
        textStyle.setBackgroundColor(backgroundColor);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FreeTextAnnotation freeTextAnnotation = new FreeTextAnnotation();
        freeTextAnnotation.setName("Test Free Text");
        freeTextAnnotation.setTextStyle(textStyle);
        freeTextAnnotation.setRect(rect);
        freeTextAnnotation.setFlags(flags);
        freeTextAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        freeTextAnnotation.setIntent(FreeTextIntent.FREETEXTTYPEWRITER);
        freeTextAnnotation.setRichText("Rich Text");
        freeTextAnnotation.setSubject("Text Box Subj");
        freeTextAnnotation.setZindex(1);
        freeTextAnnotation.setJustification(Justification.CENTER);
        freeTextAnnotation.setTitle("Title");

        FreeTextAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentFreeTextAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putFreeTextAnnotation(name, annotationId, freeTextAnnotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
