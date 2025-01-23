/**
 *
 * Copyright (c) 2025 Aspose.PDF Cloud
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

public class HeaderFooterTests {
    private TestHelper th;

    public HeaderFooterTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * PostDocumentTextHeaderTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentTextHeaderTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int startPage = 2;
        int endPage = 3;

        Color foregroundColor = new Color();
        foregroundColor.setA(0x00);
        foregroundColor.setR(0x00);
        foregroundColor.setG(0xFF);
        foregroundColor.setB(0x00);

        Color backgroundColor = new Color();
        backgroundColor.setA(0x00);
        backgroundColor.setR(0xFF);
        backgroundColor.setG(0x00);
        backgroundColor.setB(0x00);

        TextState textState = new TextState()
                .fontSize(14.)
                .foregroundColor(foregroundColor)
                .backgroundColor(backgroundColor)
                .font("Arial");

        TextHeader header = new TextHeader()
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .textAlignment(HorizontalAlignment.CENTER)
                .value("Header")
                .textState(textState);
        header.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);


        AsposeResponse response = th.pdfApi.postDocumentTextHeader(name, header, startPage, endPage, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostDocumentTextFooterTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentTextFooterTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int startPage = 2;
        int endPage = 3;

        Color foregroundColor = new Color();
        foregroundColor.setA(0x00);
        foregroundColor.setR(0x00);
        foregroundColor.setG(0xFF);
        foregroundColor.setB(0x00);

        Color backgroundColor = new Color();
        backgroundColor.setA(0x00);
        backgroundColor.setR(0xFF);
        backgroundColor.setG(0x00);
        backgroundColor.setB(0x00);

        TextState textState = new TextState()
                .fontSize(14.)
                .foregroundColor(foregroundColor)
                .backgroundColor(backgroundColor)
                .font("Arial");

        TextFooter footer = new TextFooter()
                .leftMargin(1.)
                .rightMargin(2.)
                .bottomMargin(3.)
                .textAlignment(HorizontalAlignment.CENTER)
                .value("Header")
                .textState(textState);
        footer.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);


        AsposeResponse response = th.pdfApi.postDocumentTextFooter(name, footer, startPage, endPage, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostDocumentImageHeaderTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentImageHeaderTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String image = "Koala.jpg";
        th.uploadFile(image);

        int startPage = 2;
        int endPage = 3;

        ImageHeader header = new ImageHeader()
                .leftMargin(1.)
                .rightMargin(2.)
                .topMargin(3.)
                .fileName(th.tempFolder + '/' + image);
        header.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(.1);


        AsposeResponse response = th.pdfApi.postDocumentImageHeader(name, header, startPage, endPage, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostDocumentImageFooterTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postDocumentImageFooterTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String image = "Koala.jpg";
        th.uploadFile(image);

        int startPage = 2;
        int endPage = 3;

        ImageFooter footer = new ImageFooter()
                .leftMargin(1.)
                .rightMargin(2.)
                .bottomMargin(3.)
                .fileName(th.tempFolder + '/' + image);
        footer.background(true)
                .horizontalAlignment(HorizontalAlignment.CENTER)
                .opacity(1.)
                .rotate(Rotation.NONE)
                .rotateAngle(0.)
                .xindent(0.)
                .yindent(0.)
                .zoom(1.);


        AsposeResponse response = th.pdfApi.postDocumentImageFooter(name, footer, startPage, endPage, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
