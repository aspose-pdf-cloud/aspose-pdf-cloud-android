/**
 *
 *   Copyright (c) 2009 Aspose.PDF Cloud
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

public class DocumentTests {
    private TestHelper th;

    public DocumentTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);

        String folder = this.th.tempFolder;

        DocumentResponse response = this.th.pdfApi.getDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostOptimizeDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postOptimizeDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);

        OptimizeOptions optimizeOptions = new OptimizeOptions();
        optimizeOptions.setAllowReusePageContent(false);
        optimizeOptions.setCompressImages(true);
        optimizeOptions.setImageQuality(100);
        optimizeOptions.setLinkDuplcateStreams(true);
        optimizeOptions.setRemoveUnusedObjects(true);
        optimizeOptions.setRemoveUnusedStreams(true);
        optimizeOptions.setUnembedFonts(true);

        String folder = this.th.tempFolder;

        AsposeResponse response = this.th.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostSplitDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSplitDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);

        String folder = this.th.tempFolder;

        SplitResultResponse response = this.th.pdfApi.postSplitDocument(name, null, null, null, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutCreateEmptyDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCreateEmptyDocumentTest() throws ApiException
    {
        String name = "empty.pdf";

        String folder = this.th.tempFolder;

        DocumentResponse response = this.th.pdfApi.putCreateDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
