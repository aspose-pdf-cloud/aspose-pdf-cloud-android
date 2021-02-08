package com.aspose.examples.pdf.examples.fields;

import java.io.File;
import java.util.ArrayList;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.Field;
import com.aspose.asposecloudpdfandroid.model.FieldResponse;
import com.aspose.asposecloudpdfandroid.model.FieldType;
import com.aspose.asposecloudpdfandroid.model.Fields;
import com.aspose.asposecloudpdfandroid.model.FieldsResponse;
import com.aspose.asposecloudpdfandroid.model.Rectangle;

public class FieldExamples {
	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";
	private String setupFile = "setup.json";

	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public FieldExamples()
	   {

	       pdfApi = new PdfApi("app_key", "app_sid");
	       pdfApi.getApiClient().setBasePath("product_uri");
	   }

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getFieldExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		String folder = this.tempFolder;
		String fieldName = "textField";

		FieldResponse response = this.pdfApi.getField(name, fieldName, null, folder);
	}

	public void getFieldsExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		String folder = this.tempFolder;

		FieldsResponse response = this.pdfApi.getFields(name, null, folder);
	}

	public void postCreateFieldExample() throws ApiException {
		String name = "Hello world.pdf";
		this.uploadFile(name);

		Rectangle rect = new Rectangle().LLX(50.).LLY(200.).URX(200.).URY(400.);

		Field field = new Field();
		field.setName("checkboxfield");
		field.setValues(new ArrayList<String>() {
			{
				add("1");
			}
		});
		field.setType(FieldType.BOOLEAN);
		field.setRect(rect);

		int pageNumber = 1;
		String folder = this.tempFolder;

		AsposeResponse response = this.pdfApi.postCreateField(name, pageNumber, field, null, folder);
	}

	public void putUpdateFieldExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		String fieldName = "textField";

		Field field = new Field();
		field.setName(fieldName);
		field.setValues(new ArrayList<String>() {
			{
				add("Text field updated value.");
			}
		});
		field.setType(FieldType.TEXT);

		String folder = this.tempFolder;

		FieldResponse response = this.pdfApi.putUpdateField(name, fieldName, field, null, folder);
	}

	public void putUpdateFieldsExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		Field field = new Field();
		field.setName("textField");
		field.setValues(new ArrayList<String>() {
			{
				add("1");
			}
		});
		field.setType(FieldType.TEXT);

		ArrayList<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(field);

		Fields fields = new Fields().list(fieldsList);

		String folder = this.tempFolder;

		AsposeResponse response = this.pdfApi.putUpdateFields(name, fields, null, folder);
	}

	public void deleteFieldExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		String fieldName = "textField";

		String folder = this.tempFolder;

		AsposeResponse response = this.pdfApi.deleteField(name, fieldName, null, folder);
	}

	public void putFieldsFlattenExample() throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		this.uploadFile(name);

		String folder = this.tempFolder;

		AsposeResponse response = this.pdfApi.putFieldsFlatten(name, null, folder);
		
	}

}
