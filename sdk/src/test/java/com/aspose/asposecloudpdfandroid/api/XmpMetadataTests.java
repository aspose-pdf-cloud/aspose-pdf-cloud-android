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
import static org.junit.Assert.assertNotEquals;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.DocumentLayers;
import com.aspose.asposecloudpdfandroid.model.XmpMetadata;
import com.aspose.asposecloudpdfandroid.model.XmpMetadataProperty;

public class XmpMetadataTests {
    private TestHelper th;
    private static String name;

    public XmpMetadataTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetXmpMetadataJson
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXmpMetadataJsonTest() throws ApiException
    {
        name = "4pages.pdf";
        th.uploadFile(name);

        XmpMetadata response = TestHelper.pdfApi.getXmpMetadataJson(name, TestHelper.tempFolder, null, null);
        assertEquals(9, response.getProperties().size());
    }

    /**
     * GetXmpMetadataXml
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getXmpMetadataXmlTest() throws ApiException
    {
        name = "4pages.pdf";
        th.uploadFile(name);

        File response = TestHelper.pdfApi.getXmpMetadataXml(name, TestHelper.tempFolder, null, null);
        assertNotEquals(0, response.length());
    }

    /**
     * PostXmpMetadataTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postXmpMetadataTest() throws ApiException
    {
        name = "4pages.pdf";
        th.uploadFile(name);

        String date = "2024-10-27T09:59:52+02:00";
        XmpMetadata metadata = new XmpMetadata()
            // Modify Default property without prefix
            .addPropertiesItem(new XmpMetadataProperty()
                .key("ModifyDate")
                .value(date))
            // Modify Default property with prefix
            .addPropertiesItem(new XmpMetadataProperty()
                .key("xmp:CreateDate")
                .value(date))
            //Remove Default property
            .addPropertiesItem(new XmpMetadataProperty()
                .key("CreatorTool"))
            //Add Default property
            .addPropertiesItem(new XmpMetadataProperty()
                .key("BaseURL")
                .value("http://www.somename.com/path"))
            //Remove User defined property
            .addPropertiesItem(new XmpMetadataProperty()
                .key("dc:title"))
            // Update user defined property
            .addPropertiesItem(new XmpMetadataProperty()
                .key("pdf:Producer")
                .value("Aspose.PDF Cloud")
                .namespaceUri("http://ns.adobe.com/pdf/1.3/"))
            .addPropertiesItem(new XmpMetadataProperty()
                .key("pdf:Prop")
                .value("PropValue")
                .namespaceUri("http://ns.adobe.com/pdf/1.3/"));

        AsposeResponse response = TestHelper.pdfApi.postXmpMetadata(name, metadata, TestHelper.tempFolder, null, null);
        assertEquals(200, (int) response.getCode());

        XmpMetadata xmp = TestHelper.pdfApi.getXmpMetadataJson(name, TestHelper.tempFolder, null, null);
        assertEquals(9, xmp.getProperties().size());
    }
}
