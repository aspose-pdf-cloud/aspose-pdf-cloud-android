/**
 *
 * Copyright (c) 2022 Aspose.PDF Cloud
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

public class SignTests {
    private TestHelper th;

    public SignTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * PostSignDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSignDocumentTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        th.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        th.uploadFile(signatureFileName);

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);

        String folder = th.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = th.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostSignPage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSignPageTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        th.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        th.uploadFile(signatureFileName);

        int pageNumber = 1;

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);

        String folder = th.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = th.pdfApi.postSignPage(name, pageNumber, signature, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetVerifySignature Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getVerifySignatureTest() throws ApiException
    {
        String name = "BlankWithSignature.pdf";
        th.uploadFile(name);

        String signatureFileName = "test1234.pfx";
        th.uploadFile(signatureFileName);

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);

        String folder = th.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("test1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse responseSign = th.pdfApi.postSignDocument(name, signature, null, folder);
        assertEquals(200, (int)responseSign.getCode());

        SignatureVerifyResponse response = th.pdfApi.getVerifySignature(name, signature.getFormFieldName(), null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageCertify Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postPageCertifyTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String signatureFileName = "33226.p12";
        th.uploadFile(signatureFileName);

        int pageNumber = 1;
        DocMDPAccessPermissionType permissionType = DocMDPAccessPermissionType.NOCHANGES;

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);

        String folder = th.tempFolder;

        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("test@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("sIikZSmz");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(folder + '/' + signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = th.pdfApi.postPageCertify(name, pageNumber, signature, permissionType.toString(), null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
