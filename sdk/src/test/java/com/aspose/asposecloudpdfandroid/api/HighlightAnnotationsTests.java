/**
 *
 * Copyright (c) 2024 Aspose.PDF Cloud
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

public class HighlightAnnotationsTests {
    private TestHelper th;

    public HighlightAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentHighlightAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentHighlightAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        HighlightAnnotationsResponse response = th.pdfApi.getDocumentHighlightAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageHighlightAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageHighlightAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        HighlightAnnotationsResponse response = th.pdfApi.getPageHighlightAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetHighlightAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHighlightAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        HighlightAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentHighlightAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        HighlightAnnotationResponse response = th.pdfApi.getHighlightAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageHighlightAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageHighlightAnnotationsTest()throws ApiException
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

        List<Point> points = new ArrayList<>();
        points.add(new Point().X(10.).Y(10.));
        points.add(new Point().X(20.).Y(10.));
        points.add(new Point().X(10.).Y(20.));
        points.add(new Point().X(10.).Y(10.));

        HighlightAnnotation annotation = new HighlightAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setQuadPoints(points);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        List<HighlightAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPageHighlightAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutHighlightAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putHighlightAnnotationTest()throws ApiException
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

        List<Point> points = new ArrayList<>();
        points.add(new Point().X(10.).Y(10.));
        points.add(new Point().X(20.).Y(10.));
        points.add(new Point().X(10.).Y(20.));
        points.add(new Point().X(10.).Y(10.));

        HighlightAnnotation annotation = new HighlightAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setQuadPoints(points);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        HighlightAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentHighlightAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putHighlightAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
