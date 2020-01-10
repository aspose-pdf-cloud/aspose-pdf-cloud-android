/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
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

import static org.junit.Assert.assertEquals;

public class AppendTests
{
    private TestHelper th;
    public AppendTests() throws ApiException
    {
        th = TestHelper.getInstance();
    }
    /**
     * PostAppendDocumentUsingQueryParams Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postAppendDocumentTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        String appendFileName = "4pages.pdf";

        th.uploadFile(name);
        th.uploadFile(appendFileName);

        int startPage = 2;
        int endPage = 4;

        DocumentResponse response = th.pdfApi.postAppendDocument(name, th.tempFolder + '/' + appendFileName, startPage, endPage, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}

