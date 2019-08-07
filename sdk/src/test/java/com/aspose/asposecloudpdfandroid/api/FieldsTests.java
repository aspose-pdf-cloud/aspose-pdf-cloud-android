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

public class FieldsTests {
    private TestHelper th;

    public FieldsTests() throws ApiException {
        th = TestHelper.getInstance();
    }


    /**
     * GetField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "textField";

        FieldResponse response = th.pdfApi.getField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        FieldsResponse response = th.pdfApi.getFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostCreateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postCreateFieldTest() throws ApiException
    {
        String name = "Hello world.pdf";
        th.uploadFile(name);

        Rectangle rect = new Rectangle()
                .LLX(50.)
                .LLY(200.)
                .URX(200.)
                .URY(400.);

        Field field = new Field();
        field.setName("checkboxfield");
        field.setValues(new ArrayList<String>(){{ add("1");}});
        field.setType(FieldType.BOOLEAN);
        field.setRect(rect);

        int pageNumber = 1;
        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.postCreateField(name, pageNumber, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutUpdateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putUpdateFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String fieldName = "textField";

        Field field = new Field();
        field.setName(fieldName);
        field.setValues(new ArrayList<String>(){{ add("Text field updated value.");}});
        field.setType(FieldType.TEXT);

        String folder = th.tempFolder;

        FieldResponse response = th.pdfApi.putUpdateField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutUpdateField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putUpdateFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        Field field = new Field();
        field.setName("textField");
        field.setValues(new ArrayList<String>(){{ add("1");}});
        field.setType(FieldType.TEXT);

        ArrayList<Field> fieldsList = new ArrayList<Field>();
        fieldsList.add(field);

        Fields fields = new Fields().list(fieldsList);

        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.putUpdateFields(name, fields,null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String fieldName = "textField";

        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.deleteField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutFieldsFlatten Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putFieldsFlattenTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.putFieldsFlatten(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostFlattenDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postFlattenDocumentTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        boolean updateAppearances = true;
        boolean hideButtons = true;
        String folder = th.tempFolder;

        AsposeResponse response = th.pdfApi.postFlattenDocument(name, updateAppearances, null, hideButtons, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
