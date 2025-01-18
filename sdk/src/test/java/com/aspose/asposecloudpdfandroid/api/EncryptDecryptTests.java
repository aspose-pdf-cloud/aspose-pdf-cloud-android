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

import java.io.File;

import static org.junit.Assert.assertEquals;

public class EncryptDecryptTests {
    private TestHelper th;

    public EncryptDecryptTests() throws ApiException {
        th = TestHelper.getInstance();
    }
    // Encrypt Decrypt Tests

    /**
     * PutEncryptDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putEncryptDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);

        String outPath = th.tempFolder + '/' + name;
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        String ownerPasswordBase64encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&

        AsposeResponse response  = th.pdfApi.putEncryptDocument(outPath, userPasswordBase64encoded, ownerPasswordBase64encoded,
                CryptoAlgorithm.AESX128.getValue(), null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostEncryptDocumentInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postEncryptDocumentInStorageTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        String ownerPasswordBase64encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&

        AsposeResponse response  = th.pdfApi.postEncryptDocumentInStorage(name, userPasswordBase64encoded, ownerPasswordBase64encoded,
                CryptoAlgorithm.AESX128.getValue(), null, null, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutDecryptDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putDecryptDocumentTest() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        File file = new File(th.testDataFolder + "/" + name);

        String outPath = th.tempFolder + '/' + name;
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&

        AsposeResponse response  = th.pdfApi.putDecryptDocument(outPath, userPasswordBase64encoded, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostDencryptDocumentInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void posttDencryptDocumentInStorageTest() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        th.uploadFile(name);

        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&

        AsposeResponse response  = th.pdfApi.postDecryptDocumentInStorage(name, userPasswordBase64encoded, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutChangePasswordDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putChangePasswordDocumentTest() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        File file = new File(th.testDataFolder + "/" + name);

        String outPath = th.tempFolder + '/' + name;
        String ownerPasswordBase64Encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&
        String newUserPasswordBase64Encoded = "dXNlciBuZXcvLz8gJDEyXlBhc3N3b3JkISY="; //user new\//? $12^Password!&
        String newOwnerPasswordBase64Encoded = "b3duZXIgbmV3Ly8/ICQxMl5QYXNzd29yZCEm"; //owner new\//? $12^Password!&

        AsposeResponse response  = th.pdfApi.putChangePasswordDocument(outPath, ownerPasswordBase64Encoded,
                newUserPasswordBase64Encoded, newOwnerPasswordBase64Encoded, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostChangePasswordDocumentInStorage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postChangePasswordDocumentInStorageTest() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        th.uploadFile(name);

        String ownerPasswordBase64Encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&
        String newUserPasswordBase64Encoded = "dXNlciBuZXcvLz8gJDEyXlBhc3N3b3JkISY="; //user new\//? $12^Password!&
        String newOwnerPasswordBase64Encoded = "b3duZXIgbmV3Ly8/ICQxMl5QYXNzd29yZCEm"; //owner new\//? $12^Password!&

        AsposeResponse response  = th.pdfApi.postChangePasswordDocumentInStorage(name, ownerPasswordBase64Encoded,
                newUserPasswordBase64Encoded, newOwnerPasswordBase64Encoded, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }
}
