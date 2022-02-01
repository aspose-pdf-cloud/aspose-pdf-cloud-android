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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PagesTests {
    private TestHelper th;

    public PagesTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * DeletePage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.deletePage(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 3;
        String folder = th.tempFolder;

        DocumentPageResponse response = th.pdfApi.getPage(name, pageNumber, null, folder);
        assertNotNull(response);
    }


    /**
     * GetPages Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPagesTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        DocumentPagesResponse response = th.pdfApi.getPages(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetWordsPerPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getWordsPerPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        WordCountResponse response = th.pdfApi.getWordsPerPage(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostMovePage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postMovePageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;
        int newIndex = 1;

        AsposeResponse response = th.pdfApi.postMovePage(name, pageNumber, newIndex, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutAddNewPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putAddNewPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        DocumentPagesResponse response = th.pdfApi.putAddNewPage(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPageAddStamp Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPageAddStampTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String stampFileName = "Penguins.jpg";
        th.uploadFile(stampFileName);

        int pageNumber = 1;
        String folder = th.tempFolder;


        Stamp stamp = new Stamp();
        stamp.setType(StampType.IMAGE);
        stamp.setFileName(folder + '/' + stampFileName);
        stamp.setBackground(true);
        stamp.setWidth(200.);
        stamp.setHeight(200.);
        stamp.setXindent(100.);
        stamp.setYindent(100.);

        AsposeResponse response = th.pdfApi.putPageAddStamp(name, pageNumber, stamp, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
