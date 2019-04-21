package com.aspose.pdf.android.examples.carretannotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotation;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.CaretAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.pdf.android.examples.PdfApiExamples;

public class CarretAnnotations extends PdfApiExamples{
	

	public void getDocumentCaretAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		CaretAnnotationsResponse response = pdfApi.getDocumentCaretAnnotations(name, null, tempFolder);
	}

	public void getPageCaretAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 2;

		CaretAnnotationsResponse response = pdfApi.getPageCaretAnnotations(name, pageNumber, null, tempFolder);
	}

	public void getCaretAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		CaretAnnotationsResponse responseAnnotations = pdfApi.getDocumentCaretAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		CaretAnnotationResponse response = pdfApi.getCaretAnnotation(name, annotationId, null, tempFolder);
	}

	public void postPageCaretAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		CaretAnnotation annotation = new CaretAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setFrame(rect);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		List<CaretAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageCaretAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void putCaretAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		CaretAnnotation annotation = new CaretAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setFrame(rect);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		CaretAnnotationsResponse responseAnnotations = pdfApi.getDocumentCaretAnnotations(name, null, tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putCaretAnnotation(name, annotationId, annotation, null, tempFolder);

	}

}
