package com.aspose.pdf.android.examples.stampannotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.StampAnnotation;
import com.aspose.asposecloudpdfandroid.model.StampAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.StampAnnotationsResponse;

public class StampAnnotationExamples {

	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";
	private String setupFile = "setup.json";

	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public StampAnnotationExamples() {

		pdfApi = new PdfApi("app_key", "app_sid");
		pdfApi.getApiClient().setBasePath("product_uri");
	}

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getDocumentStampAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		StampAnnotationsResponse response = pdfApi.getDocumentStampAnnotations(name, null, tempFolder);
	}

	public void getPageStampAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 2;

		StampAnnotationsResponse response = pdfApi.getPageStampAnnotations(name, pageNumber, null, tempFolder);
	}

	public void postPageStampAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		String attachmentFile = "4pages.pdf";
		uploadFile(attachmentFile);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		StampAnnotation annotation = new StampAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setModified("01/01/2018 12:00:00.000 AM");
		annotation.setFilePath(tempFolder + '/' + attachmentFile);

		List<StampAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageStampAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void getStampAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		StampAnnotationResponse response = pdfApi.getStampAnnotation(name, annotationId, null, tempFolder);
	}

	public void putStampAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		String attachmentFile = "4pages.pdf";
		uploadFile(attachmentFile);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		StampAnnotation annotation = new StampAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setModified("01/01/2018 12:00:00.000 AM");
		annotation.setFilePath(tempFolder + '/' + attachmentFile);

		StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putStampAnnotation(name, annotationId, annotation, null, tempFolder);

	}

	public void getStampAnnotationDataExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		File response = pdfApi.getStampAnnotationData(name, annotationId, null, tempFolder);
	}

	public void putStampAnnotationDataExtractExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		String outFilePath = tempFolder + '/' + "stamp.dat";

		StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putStampAnnotationDataExtract(name, annotationId, outFilePath, null,
				tempFolder);

	}

}
