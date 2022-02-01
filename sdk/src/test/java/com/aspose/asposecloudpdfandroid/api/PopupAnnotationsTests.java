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

public class PopupAnnotationsTests {
    private TestHelper th;

    public PopupAnnotationsTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentPopupAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPopupAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        PopupAnnotationsResponse response = th.pdfApi.getDocumentPopupAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentPopupAnnotationsByParentTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentPopupAnnotationsByParentTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        String parentId = "GI5TAOZRGU3CYNZSGEWDCNZWFQ3TGOI";

        PopupAnnotationsResponse response = th.pdfApi.getDocumentPopupAnnotationsByParent(name, parentId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPagePopupAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagePopupAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        PopupAnnotationsResponse response = th.pdfApi.getPagePopupAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPopupAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPopupAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        PopupAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentPopupAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        PopupAnnotationResponse response = th.pdfApi.getPopupAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPopupAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPopupAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        th.uploadFile(name);

        String parentId = "GI5TCMR3GE2TQLBSGM3CYMJYGUWDENRV";

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        PopupAnnotation annotation = new PopupAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setZindex(1);
        annotation.setModified("02/02/2018 00:00:00.000 AM");


        AsposeResponse response = th.pdfApi.postPopupAnnotation(name, parentId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPopupAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPopupAnnotationTest()throws ApiException
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


        PopupAnnotation annotation = new PopupAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setZindex(1);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        PopupAnnotationsResponse responseAnnotations = th.pdfApi.getDocumentPopupAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putPopupAnnotation(name, annotationId, annotation, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
