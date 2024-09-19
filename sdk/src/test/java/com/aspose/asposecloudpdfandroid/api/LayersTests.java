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

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentLayers;

public class LayersTests {
    private TestHelper th;
    private static String name;

    public LayersTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentLayersTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentLayersTest() throws ApiException
    {
        name = "PdfWithLayers.pdf";
        th.uploadFile(name);

        DocumentLayers response = TestHelper.pdfApi.getDocumentLayers(name, TestHelper.tempFolder, null, null);
        assertEquals(2, response.getLayers().size());
    }

    /**
     * DeleteDocumentLayersTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentLayersTest() throws ApiException
    {
        name = "PdfWithLayers.pdf";
        th.uploadFile(name);

        AsposeResponse response = TestHelper.pdfApi.deleteDocumentLayer(name, 1, "oc1", TestHelper.tempFolder, null, null);
        assertEquals(200, (int) response.getCode());

        DocumentLayers layers = TestHelper.pdfApi.getDocumentLayers(name, TestHelper.tempFolder, null, null);
        assertEquals(1, layers.getLayers().size());
    }

    /**
     * PutCreatePdfFromLayer
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCreatePdfFromLayer() throws ApiException
    {
        name = "PdfWithLayers.pdf";
        th.uploadFile(name);

        AsposeResponse response = TestHelper.pdfApi.putCreatePdfFromLayer(name, 1, "result.pdf", "oc1", TestHelper.tempFolder, null, null);
        assertEquals(200, (int) response.getCode());
    }
}
