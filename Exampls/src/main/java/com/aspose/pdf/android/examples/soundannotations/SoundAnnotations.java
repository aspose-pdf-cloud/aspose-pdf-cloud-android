package com.aspose.pdf.android.examples.soundannotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotation;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.SoundAnnotationsResponse;

public class SoundAnnotations {
	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";


	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public SoundAnnotations() {

		pdfApi = new PdfApi("app_key", "app_sid");
		pdfApi.getApiClient().setBasePath("product_uri");
	}

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getDocumentSoundAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		SoundAnnotationsResponse response = pdfApi.getDocumentSoundAnnotations(name, null, tempFolder);
	}

	public void getPageSoundAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 2;

		SoundAnnotationsResponse response = pdfApi.getPageSoundAnnotations(name, pageNumber, null, tempFolder);
	}

	public void postPageSoundAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		String attachmentFile = "4pages.pdf";
		uploadFile(attachmentFile);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		SoundAnnotation annotation = new SoundAnnotation();
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

		List<SoundAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageSoundAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void getSoundAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		SoundAnnotationsResponse responseAnnotations = pdfApi.getDocumentSoundAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		SoundAnnotationResponse response = pdfApi.getSoundAnnotation(name, annotationId, null, tempFolder);
	}

	public void putSoundAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		String attachmentFile = "4pages.pdf";
		uploadFile(attachmentFile);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		SoundAnnotation annotation = new SoundAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setModified("01/01/2018 12:01:02.000 AM");
		annotation.setFilePath(tempFolder + '/' + attachmentFile);

		SoundAnnotationsResponse responseAnnotations = pdfApi.getDocumentSoundAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putSoundAnnotation(name, annotationId, annotation, null, tempFolder);

	}

	public void getSoundAnnotationDataExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		SoundAnnotationsResponse responseAnnotations = pdfApi.getDocumentSoundAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		File response = pdfApi.getSoundAnnotationData(name, annotationId, null, tempFolder);
	}

	public void putSoundAnnotationDataExtractExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		SoundAnnotationsResponse responseAnnotations = pdfApi.getDocumentSoundAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putSoundAnnotationDataExtract(name, annotationId, "outFile.dat", null,
				tempFolder);

	}

}
