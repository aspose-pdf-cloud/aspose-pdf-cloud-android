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

import static org.junit.Assert.assertEquals;

public class OcrTests {
    private TestHelper th;

    public OcrTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * PutSearchableDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSearchableDocumentTest() throws ApiException
    {
        String name = "rusdoc.pdf";
        th.uploadFile(name);

        String lang = "rus,eng";
        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.putSearchableDocument(name, null, folder, lang);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutSearchableDocumentWithDefaultLang Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSearchableDocumentWithDefaultLangTest() throws ApiException
    {
        String name = "rusdoc.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.putSearchableDocument(name, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }
}
