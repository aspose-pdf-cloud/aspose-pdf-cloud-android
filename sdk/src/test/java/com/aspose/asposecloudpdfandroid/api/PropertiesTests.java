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

import static org.junit.Assert.assertEquals;

public class PropertiesTests {
    private TestHelper th;

    public PropertiesTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * DeleteProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePropertiesTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = th.tempFolder;

        DocumentProperty property2 = new DocumentProperty();
        property2.setName("prop2");
        property2.setValue("val2");


        th.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder, null);
        th.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder, null);

        AsposeResponse response = th.pdfApi.deleteProperties(name, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = th.tempFolder;

        th.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder, null);

        AsposeResponse response = th.pdfApi.deleteProperty(name, property1.getName(), null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentPropertiesTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = th.tempFolder;

        DocumentProperty property2 = new DocumentProperty();
        property2.setName("prop2");
        property2.setValue("val2");

        th.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder, null);
        th.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder, null);

        DocumentPropertiesResponse response = th.pdfApi.getDocumentProperties(name, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentPropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = th.tempFolder;

        th.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder, null);

        DocumentPropertyResponse response = th.pdfApi.getDocumentProperty(name, property1.getName(), null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutSetProperty Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSetPropertyTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        DocumentProperty property1 = new DocumentProperty();
        property1.setName("prop1");
        property1.setValue("val1");

        String folder = th.tempFolder;

        DocumentPropertyResponse response = th.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder, null);
        assertEquals(200, (int)response.getCode());
    }
}

