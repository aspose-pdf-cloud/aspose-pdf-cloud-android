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

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StorageTests
{
    private TestHelper th;
    public StorageTests() throws ApiException
    {
        th = TestHelper.getInstance();
    }
    /**
     * UploadFile Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void uploadFileTest() throws ApiException
    {
        String name = "4pages.pdf";
        String path = th.tempFolder + '/' + name;
        File file = new File(th.testDataFolder + "/" + name);
        FilesUploadResult response = th.pdfApi.uploadFile(path, file, null);
        assertEquals(1, response.getUploaded().size());
    }

    /**
     * GetDownload Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void downloadFileTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String path = th.tempFolder + '/' + name;

        File response = th.pdfApi.downloadFile(path, null, null);
        assertNotNull(response);
    }

    /**
     * GetListFiles Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFilesListTest() throws ApiException
    {
        FilesList response = th.pdfApi.getFilesList(th.tempFolder, null);
        assertTrue(response.getValue().size() > 0);
    }

    /**
     * PostMoveFile Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void moveFileTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String src = th.tempFolder + '/' + name;
        String dest = th.tempFolder + "/4pages_renamed.pdf";

        th.pdfApi.moveFile(src, dest, null, null, null);
    }

    /**
     * DeleteFile Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteFileTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String path = th.tempFolder + '/' + name;

        th.pdfApi.deleteFile(path, null, null);
    }

    /**
     * PutCreateFolder Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void createFolderTest() throws ApiException
    {
        String path = th.tempFolder + "/testFolder";
        th.pdfApi.createFolder(path, null);
    }

    /**
     * PostMoveFolder Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void moveFolderTest() throws ApiException
    {
        String src = th.tempFolder + "/testFolder";
        th.pdfApi.createFolder(src, null);

        String dest = th.tempFolder + "/testFolderRenamed";
        th.pdfApi.moveFolder(src, dest, null, null);
    }

    /**
     * DeleteFolder Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteFolderTest() throws ApiException
    {
        String path = th.tempFolder + "/testFolder";

        th.pdfApi.createFolder(path, null);
        th.pdfApi.deleteFolder(path,null, null);
    }

    /**
     * GetIsStorageExist Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getIsStorageExistTest() throws ApiException
    {
        String name = "First Storage";

        StorageExist response = th.pdfApi.storageExists(name);
        assertTrue(response.isExists());
    }

    /**
     * GetIsExist Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void objectExistsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String path = th.tempFolder + '/' + name;

        ObjectExist response = th.pdfApi.objectExists(path, null, null);
        assertTrue(response.isExists());
    }

    /**
     * GetDiscUsage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDiscUsageTest() throws ApiException
    {
        DiscUsage response = th.pdfApi.getDiscUsage(null);
        assertTrue(response.getTotalSize() > 0);
    }

    /**
     * GetListFileVersions Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFileVersionsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String path = th.tempFolder + '/' + name;

        FileVersions response = th.pdfApi.getFileVersions(path, null);
        assertTrue(response.getValue().size() > 0);
    }
}

