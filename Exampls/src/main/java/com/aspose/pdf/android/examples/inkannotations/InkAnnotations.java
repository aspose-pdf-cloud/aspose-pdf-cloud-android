package com.aspose.pdf.android.examples.inkannotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.CapStyle;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.InkAnnotation;
import com.aspose.asposecloudpdfandroid.model.InkAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.InkAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.Rectangle;

public class InkAnnotations {
	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";
	private String setupFile = "setup.json";

	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public InkAnnotations() {

		pdfApi = new PdfApi("app_key", "app_sid");
		pdfApi.getApiClient().setBasePath("product_uri");
	}

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getDocumentInkAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		InkAnnotationsResponse response = pdfApi.getDocumentInkAnnotations(name, null, tempFolder);
	}

	public void getPageInkAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 2;

		InkAnnotationsResponse response = pdfApi.getPageInkAnnotations(name, pageNumber, null, tempFolder);
	}

	public void getInkAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		InkAnnotationsResponse responseAnnotations = pdfApi.getDocumentInkAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		InkAnnotationResponse response = pdfApi.getInkAnnotation(name, annotationId, null, tempFolder);
	}

	public void postPageInkAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<List<Point>> inkList = new ArrayList<>();

		List<Point> inks1 = new ArrayList<>();
		inks1.add(new Point().X(10.).Y(40.));
		inks1.add(new Point().X(30.).Y(40.));

		List<Point> inks2 = new ArrayList<>();
		inks2.add(new Point().X(10.).Y(20.));
		inks2.add(new Point().X(20.).Y(20.));
		inks2.add(new Point().X(30.).Y(20.));

		inkList.add(inks1);
		inkList.add(inks2);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		InkAnnotation annotation = new InkAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setInkList(inkList);
		annotation.setCapStyle(CapStyle.ROUNDED);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		List<InkAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageInkAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void putInkAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<List<Point>> inkList = new ArrayList<>();

		List<Point> inks1 = new ArrayList<>();
		inks1.add(new Point().X(10.).Y(40.));
		inks1.add(new Point().X(30.).Y(40.));

		List<Point> inks2 = new ArrayList<>();
		inks2.add(new Point().X(10.).Y(20.));
		inks2.add(new Point().X(20.).Y(20.));
		inks2.add(new Point().X(30.).Y(20.));

		inkList.add(inks1);
		inkList.add(inks2);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		InkAnnotation annotation = new InkAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setInkList(inkList);
		annotation.setCapStyle(CapStyle.ROUNDED);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		InkAnnotationsResponse responseAnnotations = pdfApi.getDocumentInkAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putInkAnnotation(name, annotationId, annotation, null, tempFolder);

	}

}
