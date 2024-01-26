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
import java.util.Arrays;

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

    /**
     * GetDocumentSignatureFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentSignatureFieldsTest() throws ApiException
    {
        String name = "adbe.x509.rsa_sha1.valid.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        SignatureFieldsResponse response = th.pdfApi.getDocumentSignatureFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageSignatureFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageSignatureFieldsTest() throws ApiException
    {
        String name = "adbe.x509.rsa_sha1.valid.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;
        SignatureFieldsResponse response = th.pdfApi.getPageSignatureFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetSignatureField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSignatureFieldTest() throws ApiException
    {
        String name = "adbe.x509.rsa_sha1.valid.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "Signature1";
        SignatureFieldResponse response = th.pdfApi.getSignatureField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostSignatureField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void PostSignatureFieldTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String signatureFileName = "33226.p12";
        th.uploadFile(signatureFileName);

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(0.)
                .URY(0.);

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

        SignatureField field = new SignatureField()
                .signature(signature);
        field.rect(rectangle)
                .pageIndex(1)
                .partialName("sign1");

        AsposeResponse response = th.pdfApi.postSignatureField(name, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutSignatureField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void PutSignatureFieldTest() throws ApiException
    {
        String name = "adbe.x509.rsa_sha1.valid.pdf";
        th.uploadFile(name);

        String signatureFileName = "33226.p12";
        th.uploadFile(signatureFileName);

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(0.)
                .URY(0.);

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

        SignatureField field = new SignatureField()
                .signature(signature);
        field.rect(rectangle)
                .pageIndex(1)
                .partialName("sign1");

        AsposeResponse response = th.pdfApi.putSignatureField(name, "Signature1", field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentTextBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentTextBoxFieldsTest() throws ApiException
    {
        String name = "FormDataTextBox.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        TextBoxFieldsResponse response = th.pdfApi.getDocumentTextBoxFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageTextBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageTextBoxFieldsTest() throws ApiException
    {
        String name = "FormDataTextBox.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;

        TextBoxFieldsResponse response = th.pdfApi.getPageTextBoxFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetTextBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getTextBoxFieldTest() throws ApiException
    {
        String name = "FormDataTextBox.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "Petitioner";

        TextBoxFieldResponse response = th.pdfApi.getTextBoxField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostTextBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postTextBoxFieldsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        TextBoxField textBox = new TextBoxField()
            .multiline(true)
            .maxLen(100);

        textBox.rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(200.))
            .pageIndex(1)
            .isGroup(false)
            .color(new Color().A(255).R(255).G(0).B(0))
            .value("Page 1\nValue")
            .partialName("testField");

        ArrayList<TextBoxField> fields = new ArrayList<>();
        fields.add(textBox);

        AsposeResponse response = th.pdfApi.postTextBoxFields(name, fields, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutTextBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putTextBoxFieldTest() throws ApiException
    {
        String name = "FormDataTextBox.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        TextBoxField textBox = new TextBoxField()
                .multiline(true)
                .maxLen(100);

        textBox.rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(200.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .value("Page 1\nValue")
                .partialName("testField");

        String fieldName = "Petitioner";

        AsposeResponse response = th.pdfApi.putTextBoxField(name, fieldName, textBox, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentCheckBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentCheckBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        CheckBoxFieldsResponse response = th.pdfApi.getDocumentCheckBoxFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageCheckBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageCheckBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;

        CheckBoxFieldsResponse response = th.pdfApi.getPageCheckBoxFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetCheckBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getCheckBoxFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "checkboxField";

        CheckBoxFieldResponse response = th.pdfApi.getCheckBoxField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostCheckBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postCheckBoxFieldsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        CheckBoxField field = new CheckBoxField()
                .checked(true)
                .exportValue("true")
                .style(BoxStyle.CROSS);

        field.rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(200.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");

        ArrayList<CheckBoxField> fields = new ArrayList<>();
        fields.add(field);

        AsposeResponse response = th.pdfApi.postCheckBoxFields(name, fields, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutCheckBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCheckBoxFieldTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "checkboxField";

        CheckBoxField field = new CheckBoxField()
                .checked(true)
                .exportValue("true")
                .style(BoxStyle.CROSS);

        field.rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(200.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");


        AsposeResponse response = th.pdfApi.putCheckBoxField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentRadioButtonFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentRadioButtonFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        RadioButtonFieldsResponse response = th.pdfApi.getDocumentRadioButtonFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageRadioButtonFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageRadioButtonFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;

        RadioButtonFieldsResponse response = th.pdfApi.getPageRadioButtonFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetRadioButtonField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getRadioButtonFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "radiobuttonField";

        RadioButtonFieldResponse response = th.pdfApi.getRadioButtonField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostRadioButtonFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postRadioButtonFieldsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        ArrayList<RadioButtonOptionField> options = new ArrayList<>();

        RadioButtonOptionField option1 = new RadioButtonOptionField()
            .optionName("1")
            .style(BoxStyle.CROSS);

        option1.pageIndex(1)
                .isGroup(false)
                .rect(new Rectangle().LLX(100.).LLY(130.).URX(160.).URY(140.));

        RadioButtonOptionField option2 = new RadioButtonOptionField()
                .optionName("2")
                .style(BoxStyle.CROSS);

        option2.pageIndex(1)
                .isGroup(false)
                .rect(new Rectangle().LLX(150.).LLY(120.).URX(160.).URY(130.));

        options.add(option1);
        options.add(option2);

        RadioButtonField field = new RadioButtonField()

                .style(BoxStyle.CROSS)
                .radioButtonOptionsField(options);

        field.selected(1)
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");

        ArrayList<RadioButtonField> fields = new ArrayList<>();
        fields.add(field);

        AsposeResponse response = th.pdfApi.postRadioButtonFields(name, fields, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutRadioButtonField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putRadioButtonFieldTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "radiobuttonField";

        ArrayList<RadioButtonOptionField> options = new ArrayList<>();

        RadioButtonOptionField option1 = new RadioButtonOptionField()
                .optionName("1")
                .style(BoxStyle.CROSS);

        option1.pageIndex(1)
                .isGroup(false)
                .rect(new Rectangle().LLX(100.).LLY(130.).URX(160.).URY(140.));

        RadioButtonOptionField option2 = new RadioButtonOptionField()
                .optionName("2")
                .style(BoxStyle.CROSS);

        option2.pageIndex(1)
                .isGroup(false)
                .rect(new Rectangle().LLX(150.).LLY(120.).URX(160.).URY(130.));

        options.add(option1);
        options.add(option2);

        RadioButtonField field = new RadioButtonField()
                .style(BoxStyle.CROSS)
                .radioButtonOptionsField(options);

        field.selected(1)
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");


        AsposeResponse response = th.pdfApi.putRadioButtonField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentComboBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentComboBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        ComboBoxFieldsResponse response = th.pdfApi.getDocumentComboBoxFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageComboBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageComboBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;

        ComboBoxFieldsResponse response = th.pdfApi.getPageComboBoxFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetComboBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getComboBoxFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "comboboxField";

        ComboBoxFieldResponse response = th.pdfApi.getComboBoxField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostComboBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postComboBoxFieldsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        ArrayList<Option> options = new ArrayList<>();

        Option option1 = new Option()
                .name("one")
                .value("one");

        Option option2 = new Option()
                .name("two")
                .value("two");

        options.add(option1);
        options.add(option2);

        ComboBoxField field = new ComboBoxField()

                .options(options);

        field.selected(1)
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");

        ArrayList<ComboBoxField> fields = new ArrayList<>();
        fields.add(field);

        AsposeResponse response = th.pdfApi.postComboBoxFields(name, fields, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutComboBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putComboBoxFieldTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "comboboxField";

        ArrayList<Option> options = new ArrayList<>();

        Option option1 = new Option()
                .name("one")
                .value("one");

        Option option2 = new Option()
                .name("two")
                .value("two");

        options.add(option1);
        options.add(option2);

        ComboBoxField field = new ComboBoxField()

                .options(options);

        field.selected(1)
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");


        AsposeResponse response = th.pdfApi.putComboBoxField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetDocumentListBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentListBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        ListBoxFieldsResponse response = th.pdfApi.getDocumentListBoxFields(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageListBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPageListBoxFieldsTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        int pageNumber = 1;

        ListBoxFieldsResponse response = th.pdfApi.getPageListBoxFields(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetListBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getListBoxFieldTest() throws ApiException
    {
        String name = "PdfWithAcroForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "listboxField";

        ListBoxFieldResponse response = th.pdfApi.getListBoxField(name, fieldName, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostListBoxFields Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postListBoxFieldsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        ArrayList<Option> options = new ArrayList<>();

        Option option1 = new Option()
                .name("one")
                .value("one");

        Option option2 = new Option()
                .name("two")
                .value("two");

        Option option3 = new Option()
                .name("three")
                .value("three");

        Option option4 = new Option()
                .name("four")
                .value("four");

        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);

        ListBoxField field = new ListBoxField()

                .options(options);

        field.multiSelect(true);
        field.selectedItems(new ArrayList<>(Arrays.asList(1, 4)))
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");

        ArrayList<ListBoxField> fields = new ArrayList<>();
        fields.add(field);

        AsposeResponse response = th.pdfApi.postListBoxFields(name, fields, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutListBoxField Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putListBoxFieldTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String fieldName = "listboxField";

        ArrayList<Option> options = new ArrayList<>();

        Option option1 = new Option()
                .name("one")
                .value("one");

        Option option2 = new Option()
                .name("two")
                .value("two");

        Option option3 = new Option()
                .name("three")
                .value("three");

        Option option4 = new Option()
                .name("four")
                .value("four");

        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);

        ListBoxField field = new ListBoxField()

                .options(options);

        field.multiSelect(true);
        field.selectedItems(new ArrayList<>(Arrays.asList(1, 4)))
                .rect(new Rectangle().LLX(100.).LLY(100.).URX(160.).URY(140.))
                .margin(new MarginInfo().bottom(0.).left(0.).right(0.).top(0.))
                .pageIndex(1)
                .isGroup(false)
                .color(new Color().A(255).R(255).G(0).B(0))
                .partialName("testField");


        AsposeResponse response = th.pdfApi.putListBoxField(name, fieldName, field, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
