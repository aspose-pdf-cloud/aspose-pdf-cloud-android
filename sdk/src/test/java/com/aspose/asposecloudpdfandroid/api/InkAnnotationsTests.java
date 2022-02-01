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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InkAnnotationsTests {
    private TestHelper th;

    public InkAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentInkAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentInkAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        InkAnnotationsResponse response = th.pdfApi.getDocumentInkAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageInkAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageInkAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        InkAnnotationsResponse response = th.pdfApi.getPageInkAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetInkAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInkAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        InkAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentInkAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        InkAnnotationResponse response = th.pdfApi.getInkAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageInkAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageInkAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<List<Point>> inkList = new ArrayList<>();

        List<Point> inks1 = new ArrayList<>();
        inks1.add(new Point().X(10.).Y(40.));
        inks1.add(new Point().X(30.).Y(40.));

        List<Point> inks2 = new ArrayList<>();
        inks2.add(new Point().X(10.).Y(20.));
        inks2.add(new Point().X(20.).Y(20.));
        inks2.add(new Point().X(30.).Y(20.));

        inkList.add(inks1);
        inkList.add(inks2);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        InkAnnotation annotation = new InkAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setInkList(inkList);
        annotation.setCapStyle(CapStyle.ROUNDED);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        List<InkAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = th.pdfApi.postPageInkAnnotations(name, pageNumber, annotations, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutInkAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInkAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<List<Point>> inkList = new ArrayList<>();

        List<Point> inks1 = new ArrayList<>();
        inks1.add(new Point().X(10.).Y(40.));
        inks1.add(new Point().X(30.).Y(40.));

        List<Point> inks2 = new ArrayList<>();
        inks2.add(new Point().X(10.).Y(20.));
        inks2.add(new Point().X(20.).Y(20.));
        inks2.add(new Point().X(30.).Y(20.));

        inkList.add(inks1);
        inkList.add(inks2);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);


        InkAnnotation annotation = new InkAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setInkList(inkList);
        annotation.setCapStyle(CapStyle.ROUNDED);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        InkAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentInkAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putInkAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
