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

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PageConvertToImageTests {
    private TestHelper th;

    public PageConvertToImageTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetPageConvertToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToTiffTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToTiff(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToTiffTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.tiff";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToTiff(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageConvertToJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToJpegTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToJpeg(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToJpegTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.jpeg";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToJpeg(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToPng Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToPngTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToPng(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToPng Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToPngTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.png";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToPng(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToEmf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToEmfTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToEmf(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToEmf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToEmfTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.emf";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToEmf(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageConvertToBmp Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToBmpTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToBmp(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToBmp Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToBmpTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.bmp";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToBmp(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageConvertToGif Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageConvertToGifTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;

        File response = th.pdfApi.getPageConvertToGif(name, pageNumber, null, null, th.tempFolder, null);
        assertNotNull(response);
    }

    /**
     * PutPageConvertToGif Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPageConvertToGifTest() throws ApiException
    {
        final String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 2;
        final String resultFile = "page.gif";
        final String outPath = th.tempFolder + '/' + resultFile;
        AsposeResponse response = th.pdfApi.putPageConvertToGif(name, pageNumber, outPath,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }
}
