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
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ImportExportTests {
    private TestHelper th;

    public ImportExportTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetExportFieldsFromPdfToXmlInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getExportFieldsFromPdfToXmlInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        File response = th.pdfApi.getExportFieldsFromPdfToXmlInStorage(name, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * GetExportFieldsFromPdfToFdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getExportFieldsFromPdfToFdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        File response = th.pdfApi.getExportFieldsFromPdfToFdfInStorage(name, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * GetExportFieldsFromPdfToXfdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getExportFieldsFromPdfToXfdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        File response = th.pdfApi.getExportFieldsFromPdfToXfdfInStorage(name, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * PutExportFieldsFromPdfToXmlInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putExportFieldsFromPdfToXmlInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);
        String outPath = th.tempFolder + "/exportData.xml";
        AsposeResponse response = th.pdfApi.putExportFieldsFromPdfToXmlInStorage(name, outPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutExportFieldsFromPdfToFdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putExportFieldsFromPdfToFdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);
        String outPath = th.tempFolder + "/exportData.fdf";
        AsposeResponse response = th.pdfApi.putExportFieldsFromPdfToFdfInStorage(name, outPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutExportFieldsFromPdfToXfdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putExportFieldsFromPdfToXfdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);
        String outPath = th.tempFolder + "/exportData.xfdf";
        AsposeResponse response = th.pdfApi.putExportFieldsFromPdfToXfdfInStorage(name, outPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetImportFieldsFromFdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImportFieldsFromFdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        String dataFile = "FormData.fdf";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        File response = th.pdfApi.getImportFieldsFromFdfInStorage(name, dataPath, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * GetImportFieldsFromXfdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImportFieldsFromXfdfInStorageTest() throws ApiException
    {
        String name = "FormDataXfdf_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfdf_in.xfdf";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        File response = th.pdfApi.getImportFieldsFromXfdfInStorage(name, dataPath, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * GetImportFieldsFromXmlInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImportFieldsFromXmlInStorageTest() throws ApiException
    {
        String name = "FormDataXfa_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfa_in.xml";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        File response = th.pdfApi.getImportFieldsFromXmlInStorage(name, dataPath, null, th.tempFolder);
        assertNotNull(response);
    }

    /**
     * PutImportFieldsFromFdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImportFieldsFromFdfInStorageTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        String dataFile = "FormData.fdf";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        AsposeResponse response = th.pdfApi.putImportFieldsFromFdfInStorage(name, dataPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImportFieldsFromXfdfInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImportFieldsFromXfdfInStorageTest() throws ApiException
    {
        String name = "FormDataXfdf_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfdf_in.xfdf";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        AsposeResponse response = th.pdfApi.putImportFieldsFromXfdfInStorage(name, dataPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImportFieldsFromXmlInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImportFieldsFromXmlInStorageTest() throws ApiException
    {
        String name = "FormDataXfa_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfa_in.xml";
        th.uploadFile(dataFile);

        String dataPath = th.tempFolder + "/" + dataFile;

        AsposeResponse response = th.pdfApi.putImportFieldsFromXmlInStorage(name, dataPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostImportFieldsFromFdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postImportFieldsFromFdfTest() throws ApiException
    {
        String name = "FormData.pdf";
        th.uploadFile(name);

        String dataFile = "FormData.fdf";

        File file = new File(th.testDataFolder + "/" + dataFile);

        AsposeResponse response = th.pdfApi.postImportFieldsFromFdf(name, null, th.tempFolder, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostImportFieldsFromXfdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postImportFieldsFromXfdfTest() throws ApiException
    {
        String name = "FormDataXfdf_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfdf_in.xfdf";

        File file = new File(th.testDataFolder + "/" + dataFile);

        AsposeResponse response = th.pdfApi.postImportFieldsFromXfdf(name, null, th.tempFolder, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostImportFieldsFromXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postImportFieldsFromXmlTest() throws ApiException
    {
        String name = "FormDataXfa_in.pdf";
        th.uploadFile(name);

        String dataFile = "FormDataXfa_in.xml";
        File file = new File(th.testDataFolder + "/" + dataFile);

        AsposeResponse response = th.pdfApi.postImportFieldsFromXml(name, null, th.tempFolder, file);
        assertEquals(200, (int)response.getCode());
    }

}
