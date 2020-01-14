/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
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

import static org.junit.Assert.assertEquals;

public class LinksTests {
    private TestHelper th;

    public LinksTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetPageLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotationsResponse linksResponse = th.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        LinkAnnotationResponse response = th.pdfApi.getPageLinkAnnotation(name, pageNumber, linkId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotationsResponse linksResponse = th.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.deleteLinkAnnotation(name, linkId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotationsResponse response = th.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostPageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotation link = new LinkAnnotation()
                .actionType(LinkActionType.GOTOURIACTION)
                .action("https://products.aspose.cloud/pdf")
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(500.));

        ArrayList<LinkAnnotation> links = new ArrayList<>();
        links.add(link);

        AsposeResponse response = th.pdfApi.postPageLinkAnnotations(name, pageNumber, links, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotation link = new LinkAnnotation()
                .actionType(LinkActionType.GOTOURIACTION)
                .action("https://products.aspose.cloud/pdf")
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(500.));

        LinkAnnotationsResponse linksResponse = th.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putLinkAnnotation(name, linkId, link, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeletePageLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deletePageLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.deletePageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteDocumentLinkAnnotations Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteDocumentLinkAnnotationsTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.deleteDocumentLinkAnnotations(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetLinkAnnotation Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getLinkAnnotationTest() throws ApiException
    {
        String name = "PdfWithLinks.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        LinkAnnotationsResponse linksResponse = th.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
        assertEquals(200, (int)linksResponse.getCode());
        String linkId = linksResponse.getLinks().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.getLinkAnnotation(name, linkId, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}

