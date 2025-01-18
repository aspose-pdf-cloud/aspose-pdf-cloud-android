/**
 *
 * Copyright (c) 2025 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnnotattionsTests
{
    private TestHelper th;
    public AnnotattionsTests() throws ApiException
    {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";

        th.uploadFile(name);
        AnnotationsInfoResponse response = th.pdfApi.getDocumentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteDocumentAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";

        th.uploadFile(name);
        AsposeResponse response = th.pdfApi.deleteDocumentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
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

        th.uploadFile(name);
        AnnotationsInfoResponse response = th.pdfApi.getPageAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeletePageAnnotationsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageAnnotationsTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        int pageNumber = 2;

        th.uploadFile(name);
        AsposeResponse response = th.pdfApi.deletePageAnnotations(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteAnnotationTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAnnotationTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";

        th.uploadFile(name);

        AnnotationsInfoResponse responseAnnotations = th.pdfApi.getDocumentAnnotations(name, null, th.tempFolder);
        assertEquals(200, (int)responseAnnotations.getCode());
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.deleteAnnotation(name, annotationId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutAnnotationsFlattenTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void PutAnnotationsFlattenTest()throws ApiException
    {
        String name = "PdfWithAnnotations.pdf";
        int endPage = 2;
        List<AnnotationType> annotationTypes = new ArrayList<>();
        annotationTypes.add(AnnotationType.STAMP);
        th.uploadFile(name);
        AsposeResponse response = th.pdfApi.putAnnotationsFlatten(name, null, endPage, annotationTypes, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
