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

import static org.junit.Assert.assertEquals;

public class TextReplaceTests {
    private TestHelper th;

    public TextReplaceTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * PostDocumentTextReplace Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postDocumentTextReplaceTest() throws ApiException
    {
        String name = "marketing.pdf";
        th.uploadFile(name);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(300.)
                .URY(300.);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("market");
        textReplace.setNewValue("m_a_r_k_e_t");
        textReplace.setRegex(false);
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = th.tempFolder;

        TextReplaceResponse response  = th.pdfApi.postDocumentTextReplace(name, textReplaceList, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostPageTextReplaceByRect Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageTextReplaceByRectTest() throws ApiException
    {
        String name = "marketing.pdf";
        th.uploadFile(name);
        int pageNumber = 1;

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(700.)
                .URX(400.)
                .URY(1000.);

        final TextReplace textReplace = new TextReplace();
        textReplace.setOldValue("market");
        textReplace.setNewValue("m_a_r_k_e_t");
        textReplace.setRegex(false);
        textReplace.setRect(rect);

        TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
        textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
        textReplaceList.setStartIndex(0);
        textReplaceList.setCountReplace(0);

        String folder = th.tempFolder;

        TextReplaceResponse response = th.pdfApi.postPageTextReplace(name, pageNumber, textReplaceList, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
