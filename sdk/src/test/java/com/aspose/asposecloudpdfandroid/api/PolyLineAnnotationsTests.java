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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PolyLineAnnotationsTests {
    private TestHelper th;

    public PolyLineAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentPolyLineAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPolyLineAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        PolyLineAnnotationsResponse response = th.pdfApi.getDocumentPolyLineAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPagePolyLineAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagePolyLineAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        PolyLineAnnotationsResponse response = th.pdfApi.getPagePolyLineAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPolyLineAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolyLineAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        PolyLineAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentPolyLineAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        PolyLineAnnotationResponse response = th.pdfApi.getPolyLineAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPagePolyLineAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagePolyLineAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<Point> vertices = new ArrayList();
        vertices.add(new Point().X(10.).Y(10.));
        vertices.add(new Point().X(20.).Y(10.));
        vertices.add(new Point().X(10.).Y(20.));
        vertices.add(new Point().X(10.).Y(10.));

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        PolyLineAnnotation annotation = new PolyLineAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setVertices(vertices);

        List<PolyLineAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPagePolyLineAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPolyLineAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPolyLineAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<Point> vertices = new ArrayList();
        vertices.add(new Point().X(10.).Y(10.));
        vertices.add(new Point().X(20.).Y(10.));
        vertices.add(new Point().X(10.).Y(20.));
        vertices.add(new Point().X(10.).Y(10.));

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        PolyLineAnnotation annotation = new PolyLineAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setVertices(vertices);

        PolyLineAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentPolyLineAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putPolyLineAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
