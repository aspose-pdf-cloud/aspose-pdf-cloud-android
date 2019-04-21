package com.aspose.pdf.android.examples.movieannotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotation;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.MovieAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.Rectangle;

public class MovieAnnotations {
	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";
	private String setupFile = "setup.json";

	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public MovieAnnotations() {

		pdfApi = new PdfApi("app_key", "app_sid");
		pdfApi.getApiClient().setBasePath("product_uri");
	}

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getDocumentMovieAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations1.pdf";
		uploadFile(name);

		MovieAnnotationsResponse response = pdfApi.getDocumentMovieAnnotations(name, null, tempFolder);
	}

	public void getPageMovieAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations1.pdf";
		uploadFile(name);

		int pageNumber = 2;

		MovieAnnotationsResponse response = pdfApi.getPageMovieAnnotations(name, pageNumber, null, tempFolder);
	}

	public void postPageMovieAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations1.pdf";
		uploadFile(name);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		MovieAnnotation annotation = new MovieAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setZindex(1);
		annotation.setModified("01/01/2018 12:00:00.000 AM");

		List<MovieAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageMovieAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void getMovieAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations1.pdf";
		uploadFile(name);

		MovieAnnotationsResponse responseAnnotations = pdfApi.getDocumentMovieAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		MovieAnnotationResponse response = pdfApi.getMovieAnnotation(name, annotationId, null, tempFolder);
	}

	public void putMovieAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations1.pdf";
		uploadFile(name);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		MovieAnnotation annotation = new MovieAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setZindex(1);
		annotation.setModified("01/01/2018 12:02:03.000 AM");

		MovieAnnotationsResponse responseAnnotations = pdfApi.getDocumentMovieAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putMovieAnnotation(name, annotationId, annotation, null, tempFolder);

	}

}
