package com.aspose.pdf.android.examples.squiglyannotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.SquigglyAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.SquigglyAnnotationsResponse;
import com.aspose.pdf.android.examples.PdfApiExamples;

public class SquigglyAnnotation  extends PdfApiExamples{
	 public void getDocumentSquigglyAnnotationsExample()throws ApiException
	   {
	       String name = "PdfWithAnnotations.pdf";
	       uploadFile(name);
	
	       SquigglyAnnotationsResponse response = pdfApi.getDocumentSquigglyAnnotations(name, null, tempFolder);
	   }
	
	
	   
	   public void getPageSquigglyAnnotationsExample()throws ApiException
	   {
	       String name = "PdfWithAnnotations.pdf";
	       uploadFile(name);
	
	       int pageNumber = 2;
	
	       SquigglyAnnotationsResponse response = pdfApi.getPageSquigglyAnnotations(name, pageNumber, null, tempFolder);
	   }
	
	
	
	   public void getSquigglyAnnotationExample()throws ApiException
	   {
	       String name = "PdfWithAnnotations.pdf";
	       uploadFile(name);
	
	       SquigglyAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquigglyAnnotations(name, null, tempFolder);
	       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();
	
	       SquigglyAnnotationResponse response = pdfApi.getSquigglyAnnotation(name, annotationId, null, tempFolder);
	   }
	
	  
}

