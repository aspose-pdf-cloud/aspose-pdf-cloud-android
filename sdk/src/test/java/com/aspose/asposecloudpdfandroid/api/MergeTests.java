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

import static org.junit.Assert.assertEquals;

public class MergeTests {
    private TestHelper th;

    public MergeTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * PutMergeDocuments Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putMergeDocumentsTest() throws ApiException
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("4pages.pdf");
        nameList.add("PdfWithImages2.pdf");
        nameList.add("marketing.pdf");

        for (String name : nameList)
        {
            th.uploadFile(name);
        }

        String resultName = "MergingResult.pdf";

        MergeDocuments mergeDocuments = new MergeDocuments();

        for(int i = 0; i < nameList.size(); i++)
        {
            nameList.set(i, th.tempFolder + '/' + nameList.get(i));
        }

        mergeDocuments.setList(nameList);

        String folder = th.tempFolder;

        DocumentResponse response = th.pdfApi.putMergeDocuments(resultName, mergeDocuments, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
