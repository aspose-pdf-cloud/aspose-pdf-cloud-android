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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StampTests {
    private TestHelper th;

    public StampTests() throws ApiException {
        th = TestHelper.getInstance();
    }
    
    /**
     * GetDocumentStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);

        StampsInfoResponse response = th.pdfApi.getDocumentStamps(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteDocumentStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);
        AsposeResponse response = th.pdfApi.deleteDocumentStamps(name, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);
        int pageNumber = 1;
        StampsInfoResponse response = th.pdfApi.getPageStamps(name, pageNumber, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeletePageStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);
        int pageNumber = 1;
        AsposeResponse response = th.pdfApi.deletePageStamps(name, pageNumber, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageTextStampsTest
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageTextStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);
        int pageNumber = 1;

        TextState textState = new TextState().fontSize(14.).font("Arial");

        TextStamp stamp = new TextStamp()
                .textAlignment(HorizontalAlignment.CENTER)
                .value("Text Stamp")
                .textState(textState)
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .bottomMargin(4.)
                .verticalAlignment(VerticalAlignment.CENTER);

        stamp.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);

        List<TextStamp> stamps = new ArrayList<>();
        stamps.add(stamp);
        AsposeResponse response = th.pdfApi.postPageTextStamps(name, pageNumber, stamps, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageImageStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageImageStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);

        String image = "Koala.jpg";
        th.uploadFile(image);
        int pageNumber = 1;

        ImageStamp stamp = new ImageStamp()
                .fileName(th.tempFolder + '/' + image)
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .bottomMargin(4.)
                .verticalAlignment(VerticalAlignment.CENTER);
        stamp.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);

        List<ImageStamp> stamps = new ArrayList<>();
        stamps.add(stamp);
        AsposeResponse response = th.pdfApi.postPageImageStamps(name, pageNumber, stamps, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPagePdfPageStampsTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagePdfPageStampsTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);

        String pdf = "4pages.pdf";
        th.uploadFile(pdf);
        int pageNumber = 1;

        PdfPageStamp stamp = new PdfPageStamp()
                .fileName(th.tempFolder + '/' + pdf)
                .pageIndex(2)
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .bottomMargin(4.)
                .verticalAlignment(VerticalAlignment.CENTER);
        stamp.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);

        List<PdfPageStamp> stamps = new ArrayList<>();
        stamps.add(stamp);
        AsposeResponse response = th.pdfApi.postPagePdfPageStamps(name, pageNumber, stamps, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteStampTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStampTest()throws ApiException
    {
        String name = "PageNumberStamp.pdf";
        th.uploadFile(name);

        StampsInfoResponse stampsResponse = th.pdfApi.getDocumentStamps(name, null, th.tempFolder);
        assertEquals(200, (int)stampsResponse.getCode());
        String stampId = stampsResponse.getStamps().getList().get(0).getId();
        AsposeResponse response = th.pdfApi.deleteStamp(name, stampId, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostDocumentPageNumberStamps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentPageNumberStampsTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        PageNumberStamp stamp = new PageNumberStamp()
                .value("Page #")
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .bottomMargin(4.)
                .verticalAlignment(VerticalAlignment.BOTTOM)
                .startingNumber(3);

        stamp.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);

        int startPageNumber = 2;
        int endPageNumber = 3;
        AsposeResponse response = th.pdfApi.postDocumentPageNumberStamps(name, stamp, startPageNumber, endPageNumber, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }
}

