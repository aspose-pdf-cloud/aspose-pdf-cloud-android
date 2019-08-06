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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TextTests {
    private TestHelper th;

    public TextTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getTextTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        double llx = 0;
        double lly = 0;
        double urx = 0;
        double ury = 0;
        String folder = th.tempFolder;

        TextRectsResponse response = th.pdfApi.getText(name, llx, lly, urx, ury, null, null, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPageTextByTwoTextOnPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTextByTwoTextOnPageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        double llx = 0;
        double lly = 0;
        double urx = 0;
        double ury = 0;

        List<String> format = new ArrayList<String>(){{ add("First Page"); add("Second Page");}};
        String folder = th.tempFolder;

        TextRectsResponse response = th.pdfApi.getPageText(name, pageNumber, llx, lly, urx, ury, format, null, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutAddText Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putAddTextTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        Rectangle rectangle = new Rectangle();
        rectangle.setLLX(100.);
        rectangle.setLLY(100.);
        rectangle.setURX(200.);
        rectangle.setURY(200.);

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

        TextState textState = new TextState();
        textState.setFont("Arial");
        textState.setFontSize(10.);
        textState.setForegroundColor(foregroundColor);
        textState.setBackgroundColor(backgroundColor);
        textState.setFontStyle(FontStyles.BOLD);

        final Segment segment = new Segment();
        segment.setValue("segment 1");
        segment.setTextState(textState);

        final TextLine textLine = new TextLine();
        textLine.setHorizontalAlignment(TextHorizontalAlignment.RIGHT);
        textLine.setSegments(new ArrayList<Segment>(){{ add(segment);}});

        Paragraph paragraph = new Paragraph();
        paragraph.setRectangle(rectangle);
        paragraph.setLeftMargin(10.);
        paragraph.setRightMargin(10.);
        paragraph.setTopMargin(20.);
        paragraph.setBottomMargin(20.);
        paragraph.setHorizontalAlignment(TextHorizontalAlignment.FULLJUSTIFY);
        paragraph.setLineSpacing(LineSpacing.FONTSIZE);
        paragraph.setRotation(10.);
        paragraph.setSubsequentLinesIndent(20.);
        paragraph.setVerticalAlignment(VerticalAlignment.CENTER);
        paragraph.setWrapMode(WrapMode.BYWORDS);
        paragraph.setLines(new ArrayList<TextLine>(){{ add(textLine);}});


        AsposeResponse response = th.pdfApi.putAddText(name, pageNumber, paragraph, folder, null);
        assertEquals(200, (int)response.getCode());
    }
}
