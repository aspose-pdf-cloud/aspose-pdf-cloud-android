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

public class BookmarksTests {
    private TestHelper th;

    public BookmarksTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocumentBookmarksTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentBookmarksTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        BookmarksResponse response = th.pdfApi.getDocumentBookmarks(name, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetBookmarksTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarksTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        String bookmarkPath = "1/1";

        BookmarksResponse response = th.pdfApi.getBookmarks(name, bookmarkPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetBookmarkTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarkTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        String bookmarkPath = "1/1";

        BookmarkResponse response = th.pdfApi.getBookmark(name, bookmarkPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteDocumentBookmarksTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentBookmarksTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        AsposeResponse response = th.pdfApi.deleteDocumentBookmarks(name, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteBookmarkTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBookmarkTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        String bookmarkPath = "1/1";

        AsposeResponse response = th.pdfApi.deleteBookmark(name, bookmarkPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostBookmarkTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBookmarkTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        String bookmarkPath = "1/1";

        Bookmark bookmark = new Bookmark();
        bookmark.setAction("GoTo");
        bookmark.setBold(true);
        bookmark.setItalic(false);
        bookmark.setTitle("New Bookmark XYZ");
        bookmark.setPageDisplay("XYZ");
        bookmark.setPageDisplayBottom(10);
        bookmark.setPageDisplayLeft(10);
        bookmark.setPageDisplayRight(10);
        bookmark.setPageDisplayTop(10);
        bookmark.setPageDisplayZoom(2);
        bookmark.setPageNumber(2);
        bookmark.setColor(new Color().A(255).R(255));
        ArrayList<Bookmark> bookmarks = new ArrayList<Bookmark>();
        bookmarks.add(bookmark);

        BookmarksResponse response = th.pdfApi.postBookmark(name, bookmarkPath, bookmarks, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostBookmarkTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putBookmarkTest()throws ApiException
    {
        String name = "PdfWithBookmarks.pdf";
        th.uploadFile(name);

        String bookmarkPath = "1/1";

        Bookmark bookmark = new Bookmark();
        bookmark.setAction("GoTo");
        bookmark.setBold(true);
        bookmark.setItalic(false);
        bookmark.setTitle("New Bookmark XYZ");
        bookmark.setPageDisplay("XYZ");
        bookmark.setPageDisplayBottom(10);
        bookmark.setPageDisplayLeft(10);
        bookmark.setPageDisplayRight(10);
        bookmark.setPageDisplayTop(10);
        bookmark.setPageDisplayZoom(2);
        bookmark.setPageNumber(2);
        bookmark.setColor(new Color().A(255).R(255));


        BookmarkResponse response = th.pdfApi.putBookmark(name, bookmarkPath, bookmark, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }
}
