package com.aspose.pdf.android.examples;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.*;



public class PdfApiExamples
{
   protected final PdfApi pdfApi;
   protected String tempFolder = "TempPdfCloud";
   protected String ExampleDataFolder = "ExampleData";

   class ApiCreds{
       public String app_key;
       public String app_sid;
       public String product_uri;
   }

   protected PdfApiExamples()
   {

       pdfApi = new PdfApi("app_key", "app_sid");
       pdfApi.getApiClient().setBasePath("product_uri");
   }

  


   protected void uploadFile(String name) throws ApiException
   {
       File file = new File(ExampleDataFolder + "/" + name);
       AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
   }

   public void getDocumentAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";

       uploadFile(name);
       AnnotationsInfoResponse response = pdfApi.getDocumentAnnotations(name, null, tempFolder);
   }


   
   public void deleteDocumentAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";

       uploadFile(name);
       AsposeResponse response = pdfApi.deleteDocumentAnnotations(name, null, tempFolder);
   }


   
   public void getPageAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       int pageNumber = 2;

       uploadFile(name);
       AnnotationsInfoResponse response = pdfApi.getPageAnnotations(name, pageNumber, null, tempFolder);
   }



   
   public void deletePageAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       int pageNumber = 2;

       uploadFile(name);
       AsposeResponse response = pdfApi.deletePageAnnotations(name, pageNumber, null, tempFolder);
   }



   
   public void deleteAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";

       uploadFile(name);

       AnnotationsInfoResponse responseAnnotations = pdfApi.getDocumentAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.deleteAnnotation(name, annotationId, null, tempFolder);
   }


   
   public void PutAnnotationsFlattenExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       int endPage = 2;
       List<AnnotationType> annotationTypes = new ArrayList<>();
       annotationTypes.add(AnnotationType.STAMP);
       uploadFile(name);
       AsposeResponse response = pdfApi.putAnnotationsFlatten(name, null, endPage, annotationTypes, null, tempFolder);
   }


   
   public void getDocumentFileAttachmentAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FileAttachmentAnnotationsResponse response = pdfApi.getDocumentFileAttachmentAnnotations(name, null, tempFolder);
   }


   
   public void getPageFileAttachmentAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       FileAttachmentAnnotationsResponse response = pdfApi.getPageFileAttachmentAnnotations(name, pageNumber, null, tempFolder);
   }


   
   public void postPageFileAttachmentAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       String attachmentFile = "4pages.pdf";
       uploadFile(attachmentFile);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
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
       annotation.setFileName(attachmentFile);

       List<FileAttachmentAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageFileAttachmentAnnotations(name, pageNumber, annotations, null, tempFolder);
   }


   
   public void getFileAttachmentAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       FileAttachmentAnnotationResponse response = pdfApi.getFileAttachmentAnnotation(name, annotationId, null, tempFolder);
   }


   public void putFileAttachmentAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       String attachmentFile = "4pages.pdf";
       uploadFile(attachmentFile);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
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
       annotation.setFileName(attachmentFile);

       FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putFileAttachmentAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   
   public void getFileAttachmentAnnotationDataExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       File response = pdfApi.getFileAttachmentAnnotationData(name, annotationId, null, tempFolder);
   }


   public void putFileAttachmentAnnotationDataExtractExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putFileAttachmentAnnotationDataExtract(name, annotationId,  null, null, tempFolder);
   }

   
   public void getDocumentStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       StampsInfoResponse response = pdfApi.getDocumentStamps(name, null, tempFolder);
   }


   
   public void deleteDocumentStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       AsposeResponse response = pdfApi.deleteDocumentStamps(name, null, tempFolder);
   }

 
   
   public void getPageStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);
       int pageNumber = 1;
       StampsInfoResponse response = pdfApi.getPageStamps(name, pageNumber,null, tempFolder);
   }

 
   
   public void deletePageStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);
       int pageNumber = 1;
       AsposeResponse response = pdfApi.deletePageStamps(name, pageNumber,null, tempFolder);
   }


   
   public void postPageTextStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);
       int pageNumber = 1;

       TextState textState = new TextState().fontSize(14.);

       TextStamp stamp = new TextStamp()
           .textAlignment(HorizontalAlignment.CENTER)
           .value("Text Stamp")
           .textState(textState);
           stamp.background(true)
           .leftMargin(1.)
           .rightMargin(2.)
           .topMargin(3.)
           .bottomMargin(4.)
           .horizontalAlignment(HorizontalAlignment.CENTER)
           .verticalAlignment(VerticalAlignment.CENTER)
           .opacity(1.)
           .rotate(Rotation.NONE)
           .rotateAngle(0.)
           .xindent(0.)
           .yindent(0.)
           .zoom(1.);

       List<TextStamp> stamps = new ArrayList<>();
       stamps.add(stamp);

       AsposeResponse response = pdfApi.postPageTextStamps(name, pageNumber, stamps,null, tempFolder);
      
   }


   public void postDocumentTextStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       TextState textState = new TextState().fontSize(14.);

       TextStamp stamp = new TextStamp()
           .textAlignment(HorizontalAlignment.CENTER)
           .value("Text Stamp")
           .textState(textState);
           stamp.background(true)
           .leftMargin(1.)
           .rightMargin(2.)
           .topMargin(3.)
           .bottomMargin(4.)
           .horizontalAlignment(HorizontalAlignment.CENTER)
           .verticalAlignment(VerticalAlignment.CENTER)
           .opacity(1.)
           .rotate(Rotation.NONE)
           .rotateAngle(0.)
           .xindent(0.)
           .yindent(0.)
           .zoom(1.);

       List<TextStamp> stamps = new ArrayList<>();
       stamps.add(stamp);

       AsposeResponse response = pdfApi.postDocumentTextStamps(name, stamps, null, tempFolder);
      
   }

   
   public void postPageImageStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       String image = "Koala.jpg";
       uploadFile(image);
       int pageNumber = 1;

       ImageStamp stamp = new ImageStamp().fileName(tempFolder + '/' + image);
       stamp.background(true)
               .leftMargin(1.)
               .rightMargin(2.)
               .topMargin(3.)
               .bottomMargin(4.)
               .horizontalAlignment(HorizontalAlignment.CENTER)
               .verticalAlignment(VerticalAlignment.CENTER)
               .opacity(1.)
               .rotate(Rotation.NONE)
               .rotateAngle(0.)
               .xindent(0.)
               .yindent(0.)
               .zoom(1.);

       List<ImageStamp> stamps = new ArrayList<>();
       stamps.add(stamp);

       AsposeResponse response = pdfApi.postPageImageStamps(name, pageNumber, stamps,null, tempFolder);
      
   }

   
   public void postDocumentImageStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       String image = "Koala.jpg";
       uploadFile(image);

       ImageStamp stamp = new ImageStamp().fileName(tempFolder + '/' + image);
       stamp.background(true)
               .leftMargin(1.)
               .rightMargin(2.)
               .topMargin(3.)
               .bottomMargin(4.)
               .horizontalAlignment(HorizontalAlignment.CENTER)
               .verticalAlignment(VerticalAlignment.CENTER)
               .opacity(1.)
               .rotate(Rotation.NONE)
               .rotateAngle(0.)
               .xindent(0.)
               .yindent(0.)
               .zoom(1.);

       List<ImageStamp> stamps = new ArrayList<>();
       stamps.add(stamp);

       AsposeResponse response = pdfApi.postDocumentImageStamps(name, stamps, null, tempFolder);
      
   }

   
   public void postPagePdfPageStampsExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       String pdf = "4pages.pdf";
       uploadFile(pdf);
       int pageNumber = 1;

       PdfPageStamp stamp = new PdfPageStamp().fileName(tempFolder + '/' + pdf).pageIndex(2);
       stamp.background(true)
               .leftMargin(1.)
               .rightMargin(2.)
               .topMargin(3.)
               .bottomMargin(4.)
               .horizontalAlignment(HorizontalAlignment.CENTER)
               .verticalAlignment(VerticalAlignment.CENTER)
               .opacity(1.)
               .rotate(Rotation.NONE)
               .rotateAngle(0.)
               .xindent(0.)
               .yindent(0.)
               .zoom(1.);

       List<PdfPageStamp> stamps = new ArrayList<>();
       stamps.add(stamp);

       AsposeResponse response = pdfApi.postPagePdfPageStamps(name, pageNumber, stamps,null, tempFolder);
      
   }


   
   public void deleExampleampExample()throws ApiException
   {
       String name = "PageNumberStamp.pdf";
       uploadFile(name);

       StampsInfoResponse stampsResponse = pdfApi.getDocumentStamps(name, null, tempFolder);
       String stampId = stampsResponse.getStamps().getList().get(0).getId();

       AsposeResponse response = pdfApi.deleteStamp(name, stampId, null, tempFolder);
   }


   public void getDocumentTablesExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);

       TablesRecognizedResponse response = pdfApi.getDocumentTables(name, null, tempFolder);
   }


   
   public void deleteDocumentTablesExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);

       AsposeResponse response = pdfApi.deleteDocumentTables(name, null, tempFolder);
   }


   
   public void getPageTablesExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);
       int pageNumber = 1;

       TablesRecognizedResponse response = pdfApi.getPageTables(name, pageNumber, null, tempFolder);
   }

   
   public void deletePageTablesExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);
       int pageNumber = 1;

       AsposeResponse response = pdfApi.deletePageTables(name, pageNumber, null, tempFolder);
   }


   public void getTableExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);

       TablesRecognizedResponse tablesResponse = pdfApi.getDocumentTables(name, null, tempFolder);
       String tableId = tablesResponse.getTables().getList().get(0).getId();

       TableRecognizedResponse response = pdfApi.getTable(name, tableId, null, tempFolder);
   }


   
   public void deleteTableExample()throws ApiException
   {
       String name = "PdfWithTable.pdf";
       uploadFile(name);

       TablesRecognizedResponse tablesResponse = pdfApi.getDocumentTables(name, null, tempFolder);
       String tableId = tablesResponse.getTables().getList().get(0).getId();

       AsposeResponse response = pdfApi.deleteTable(name, tableId, null, tempFolder);
   }


   
   

   
   public void getDocumentScreenAnnotationsExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       ScreenAnnotationsResponse response = pdfApi.getDocumentScreenAnnotations(name, null, tempFolder);
   }


   
   public void getPageScreenAnnotationsExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       ScreenAnnotationsResponse response = pdfApi.getPageScreenAnnotations(name, pageNumber, null, tempFolder);
   }


   
   public void postPageScreenAnnotationsExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       String attachmentFile = "ScreenMovie.swf";
       uploadFile(attachmentFile);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       ScreenAnnotation annotation = new ScreenAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setModified("01/01/2018 12:00:00.000 AM");
       annotation.setFilePath(tempFolder + '/' + attachmentFile);

       List<ScreenAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageScreenAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }

   
   public void getScreenAnnotationExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       ScreenAnnotationResponse response = pdfApi.getScreenAnnotation(name, annotationId, null, tempFolder);
   }

   
   public void putScreenAnnotationExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       String attachmentFile = "ScreenMovie.swf";
       uploadFile(attachmentFile);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       ScreenAnnotation annotation = new ScreenAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setModified("01/01/2018 12:00:00.000 AM");
       annotation.setFilePath(tempFolder + '/' + attachmentFile);

       ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putScreenAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   
   public void getScreenAnnotationDataExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       File response = pdfApi.getScreenAnnotationData(name, annotationId, null, tempFolder);
   }


   public void putScreenAnnotationDataExtractExample()throws ApiException
   {
       String name = "PdfWithScreenAnnotations.pdf";
       uploadFile(name);

       ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putScreenAnnotationDataExtract(name, annotationId,  "outFile.dat", null, tempFolder);
      
   }

   // Sound Annotations


  

   
   public void getDocumentRedactionAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       RedactionAnnotationsResponse response = pdfApi.getDocumentRedactionAnnotations(name, null, tempFolder);
   }


   public void getPageRedactionAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       RedactionAnnotationsResponse response = pdfApi.getPageRedactionAnnotations(name, pageNumber, null, tempFolder);
   }


   
   public void postPageRedactionAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       List<Point> points = new ArrayList<>();
       points.add(new Point().X(10.).Y(40.));
       points.add(new Point().X(30.).Y(40.));

       RedactionAnnotation annotation = new RedactionAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setModified("01/01/2018 12:00:00.000 AM");
       annotation.setQuadPoint(points);

       List<RedactionAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageRedactionAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }


   
   public void getRedactionAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       RedactionAnnotationsResponse responseAnnotations = pdfApi.getDocumentRedactionAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       RedactionAnnotationResponse response = pdfApi.getRedactionAnnotation(name, annotationId, null, tempFolder);
   }


   
   public void putRedactionAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       List<Point> points = new ArrayList<>();
       points.add(new Point().X(10.).Y(40.));
       points.add(new Point().X(30.).Y(40.));

       RedactionAnnotation annotation = new RedactionAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setModified("01/01/2018 12:02:03.000 AM");
       annotation.setQuadPoint(points);

       RedactionAnnotationsResponse responseAnnotations = pdfApi.getDocumentRedactionAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putRedactionAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   
  


   
   public void getDocumentLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       LineAnnotationsResponse response = pdfApi.getDocumentLineAnnotations(name, null, tempFolder);
   }


   public void getPageLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       LineAnnotationsResponse response = pdfApi.getPageLineAnnotations(name, pageNumber, null, tempFolder);
   }



   public void getLineAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       LineAnnotationsResponse responseAnnotations = pdfApi.getDocumentLineAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       LineAnnotationResponse response = pdfApi.getLineAnnotation(name, annotationId, null, tempFolder);
   }


   public void postPageLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       LineAnnotation annotation = new LineAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setStarting(new Point().X(10.).Y(10.));
       annotation.setEnding(new Point().X(100.).Y(100.));

       List<LineAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageLineAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }


   
   public void putLineAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       LineAnnotation annotation = new LineAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");
       annotation.setStarting(new Point().X(10.).Y(10.));
       annotation.setEnding(new Point().X(100.).Y(100.));

       LineAnnotationsResponse responseAnnotations = pdfApi.getDocumentLineAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putLineAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }

   
   public void getDocumentSquareAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       SquareAnnotationsResponse response = pdfApi.getDocumentSquareAnnotations(name, null, tempFolder);
   }


   
   public void getPageSquareAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       SquareAnnotationsResponse response = pdfApi.getPageSquareAnnotations(name, pageNumber, null, tempFolder);
   }


   
   public void getSquareAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       SquareAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquareAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       SquareAnnotationResponse response = pdfApi.getSquareAnnotation(name, annotationId, null, tempFolder);
   }

   /**
    * PostPageSquareAnnotationsExample
    * @throws ApiException
    *          if the Api call fails
    */
   
   public void postPageSquareAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       SquareAnnotation annotation = new SquareAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");

       List<SquareAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageSquareAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }

   public void putSquareAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       SquareAnnotation annotation = new SquareAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");

       SquareAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquareAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putSquareAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   
   public void getDocumentCircleAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       CircleAnnotationsResponse response = pdfApi.getDocumentCircleAnnotations(name, null, tempFolder);
   }


   
   public void getPageCircleAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       CircleAnnotationsResponse response = pdfApi.getPageCircleAnnotations(name, pageNumber, null, tempFolder);
   }


   public void getCircleAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       CircleAnnotationsResponse responseAnnotations = pdfApi.getDocumentCircleAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       CircleAnnotationResponse response = pdfApi.getCircleAnnotation(name, annotationId, null, tempFolder);
   }

   
   public void postPageCircleAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       CircleAnnotation annotation = new CircleAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");

       List<CircleAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageCircleAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }



   public void putCircleAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       CircleAnnotation annotation = new CircleAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");

       CircleAnnotationsResponse responseAnnotations = pdfApi.getDocumentCircleAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putCircleAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   public void getDocumentPolygonAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PolygonAnnotationsResponse response = pdfApi.getDocumentPolygonAnnotations(name, null, tempFolder);
   }


   
   public void getPagePolygonAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       PolygonAnnotationsResponse response = pdfApi.getPagePolygonAnnotations(name, pageNumber, null, tempFolder);
   }


   public void getPolygonAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PolygonAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolygonAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       PolygonAnnotationResponse response = pdfApi.getPolygonAnnotation(name, annotationId, null, tempFolder);
   }


   
   public void postPagePolygonAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<Point> vertices = new ArrayList();
       vertices.add(new Point().X(10.).Y(10.));
       vertices.add(new Point().X(20.).Y(10.));
       vertices.add(new Point().X(10.).Y(20.));
       vertices.add(new Point().X(10.).Y(10.));

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       PolygonAnnotation annotation = new PolygonAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setVertices(vertices);

       List<PolygonAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPagePolygonAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }

   
   public void putPolygonAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<Point> vertices = new ArrayList();
       vertices.add(new Point().X(10.).Y(10.));
       vertices.add(new Point().X(20.).Y(10.));
       vertices.add(new Point().X(10.).Y(20.));
       vertices.add(new Point().X(10.).Y(10.));

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       PolygonAnnotation annotation = new PolygonAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");
       annotation.setVertices(vertices);

       PolygonAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolygonAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putPolygonAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   public void getDocumentPolyLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PolyLineAnnotationsResponse response = pdfApi.getDocumentPolyLineAnnotations(name, null, tempFolder);
   }


   
   public void getPagePolyLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       PolyLineAnnotationsResponse response = pdfApi.getPagePolyLineAnnotations(name, pageNumber, null, tempFolder);
   }



   
   public void getPolyLineAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PolyLineAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolyLineAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       PolyLineAnnotationResponse response = pdfApi.getPolyLineAnnotation(name, annotationId, null, tempFolder);
   }

   
   public void postPagePolyLineAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<Point> vertices = new ArrayList();
       vertices.add(new Point().X(10.).Y(10.));
       vertices.add(new Point().X(20.).Y(10.));
       vertices.add(new Point().X(10.).Y(20.));
       vertices.add(new Point().X(10.).Y(10.));

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       PolyLineAnnotation annotation = new PolyLineAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setVertices(vertices);

       List<PolyLineAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPagePolyLineAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }



   
   public void putPolyLineAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<Point> vertices = new ArrayList();
       vertices.add(new Point().X(10.).Y(10.));
       vertices.add(new Point().X(20.).Y(10.));
       vertices.add(new Point().X(10.).Y(20.));
       vertices.add(new Point().X(10.).Y(10.));

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       PolyLineAnnotation annotation = new PolyLineAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");
       annotation.setVertices(vertices);

       PolyLineAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolyLineAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putPolyLineAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }


   public void getDocumentFreeTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FreeTextAnnotationsResponse response = pdfApi.getDocumentFreeTextAnnotations(name, null, tempFolder);
   }

   
   public void getPageFreeTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       FreeTextAnnotationsResponse response = pdfApi.getPageFreeTextAnnotations(name, pageNumber, null, tempFolder);
   }



   public void getFreeTextAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       FreeTextAnnotationsResponse responseAnnotations = pdfApi.getDocumentFreeTextAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       FreeTextAnnotationResponse response = pdfApi.getFreeTextAnnotation(name, annotationId, null, tempFolder);
   }


   
   public void postPageFreeTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Color foregroundColor = new Color();
       foregroundColor.setA(0x00);
       foregroundColor.setR(0x00);
       foregroundColor.setG(0xFF);
       foregroundColor.setB(0x00);

       Color backgroundColor = new Color();
       backgroundColor.setA(0x00);
       backgroundColor.setR(0xFF);
       backgroundColor.setG(0x00);
       backgroundColor.setB(0x00);

       TextStyle textStyle = new TextStyle();
       textStyle.setFont("Arial");
       textStyle.setFontSize(12.);
       textStyle.setForegroundColor(foregroundColor);
       textStyle.setBackgroundColor(backgroundColor);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       FreeTextAnnotation freeTextAnnotation = new FreeTextAnnotation();
       freeTextAnnotation.setName("Example Free Text");
       freeTextAnnotation.setTextStyle(textStyle);
       freeTextAnnotation.setRect(rect);
       freeTextAnnotation.setFlags(flags);
       freeTextAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       freeTextAnnotation.setIntent(FreeTextIntent.FREETEXTTYPEWRITER);
       freeTextAnnotation.setRichText("Rich Text");
       freeTextAnnotation.setSubject("Text Box Subj");
       freeTextAnnotation.setZindex(1);
       freeTextAnnotation.setJustification(Justification.CENTER);
       freeTextAnnotation.setTitle("Title");

       List<FreeTextAnnotation> annotations = new ArrayList<>();
       annotations.add(freeTextAnnotation);

       AsposeResponse response = pdfApi.postPageFreeTextAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }


   
   public void putFreeTextAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);


       Color foregroundColor = new Color();
       foregroundColor.setA(0x00);
       foregroundColor.setR(0x00);
       foregroundColor.setG(0xFF);
       foregroundColor.setB(0x00);

       Color backgroundColor = new Color();
       backgroundColor.setA(0x00);
       backgroundColor.setR(0xFF);
       backgroundColor.setG(0x00);
       backgroundColor.setB(0x00);

       TextStyle textStyle = new TextStyle();
       textStyle.setFont("Arial");
       textStyle.setFontSize(12.);
       textStyle.setForegroundColor(foregroundColor);
       textStyle.setBackgroundColor(backgroundColor);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       FreeTextAnnotation freeTextAnnotation = new FreeTextAnnotation();
       freeTextAnnotation.setName("Example Free Text");
       freeTextAnnotation.setTextStyle(textStyle);
       freeTextAnnotation.setRect(rect);
       freeTextAnnotation.setFlags(flags);
       freeTextAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       freeTextAnnotation.setIntent(FreeTextIntent.FREETEXTTYPEWRITER);
       freeTextAnnotation.setRichText("Rich Text");
       freeTextAnnotation.setSubject("Text Box Subj");
       freeTextAnnotation.setZindex(1);
       freeTextAnnotation.setJustification(Justification.CENTER);
       freeTextAnnotation.setTitle("Title");

       FreeTextAnnotationsResponse responseAnnotations = pdfApi.getDocumentFreeTextAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putFreeTextAnnotation(name, annotationId, freeTextAnnotation, null, tempFolder);
      
   }



   public void getDocumentTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       TextAnnotationsResponse response = pdfApi.getDocumentTextAnnotations(name, null, tempFolder);
   }


   
   public void getPageTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       TextAnnotationsResponse response = pdfApi.getPageTextAnnotations(name, pageNumber, null, tempFolder);
   }



   
   public void getTextAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       TextAnnotationsResponse responseAnnotations = pdfApi.getDocumentTextAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       TextAnnotationResponse response = pdfApi.getTextAnnotation(name, annotationId, null, tempFolder);
   }


   public void postPageTextAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       TextAnnotation textAnnotation = new TextAnnotation();
       textAnnotation.setName("Example Free Text");
       textAnnotation.setRect(rect);
       textAnnotation.setFlags(flags);
       textAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       textAnnotation.setRichText("Rich Text");
       textAnnotation.setSubject("Text Box Subj");
       textAnnotation.setZindex(1);
       textAnnotation.setState(AnnotationState.UNDEFINED);

       List<TextAnnotation> annotations = new ArrayList<>();
       annotations.add(textAnnotation);

       AsposeResponse response = pdfApi.postPageTextAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }


   
   public void putTextAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);


       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       TextAnnotation textAnnotation = new TextAnnotation();
       textAnnotation.setName("Example Free Text");
       textAnnotation.setRect(rect);
       textAnnotation.setFlags(flags);
       textAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       textAnnotation.setRichText("Rich Text");
       textAnnotation.setSubject("Text Box Subj");
       textAnnotation.setZindex(1);
       textAnnotation.setState(AnnotationState.UNDEFINED);

       TextAnnotationsResponse responseAnnotations = pdfApi.getDocumentTextAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putTextAnnotation(name, annotationId, textAnnotation, null, tempFolder);
      
   }



   
  

  
   
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

   public void postPageSquigglyAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 1;

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       List<Point> points = new ArrayList<>();
       points.add(new Point().X(10.).Y(10.));
       points.add(new Point().X(20.).Y(10.));
       points.add(new Point().X(10.).Y(20.));
       points.add(new Point().X(10.).Y(10.));

       SquigglyAnnotation annotation = new SquigglyAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text");
       annotation.setSubject("Subj");
       annotation.setZindex(1);
       annotation.setTitle("Title");
       annotation.setQuadPoints(points);
       annotation.setModified("02/02/2018 00:00:00.000 AM");

       List<SquigglyAnnotation> annotations = new ArrayList<>();
       annotations.add(annotation);

       AsposeResponse response = pdfApi.postPageSquigglyAnnotations(name, pageNumber, annotations, null, tempFolder);
      
   }


  
   
   public void putSquigglyAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       List<Point> points = new ArrayList<>();
       points.add(new Point().X(10.).Y(10.));
       points.add(new Point().X(20.).Y(10.));
       points.add(new Point().X(10.).Y(20.));
       points.add(new Point().X(10.).Y(10.));

       SquigglyAnnotation annotation = new SquigglyAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setRichText("Rich Text Updated");
       annotation.setSubject("Subj Updated");
       annotation.setZindex(1);
       annotation.setTitle("Title Updated");
       annotation.setQuadPoints(points);
       annotation.setModified("02/02/2018 00:00:00.000 AM");

       SquigglyAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquigglyAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putSquigglyAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }

 

   
  
   
   

   

   // Popup Annotations

   public void getDocumentPopupAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PopupAnnotationsResponse response = pdfApi.getDocumentPopupAnnotations(name, null, tempFolder);
   }


   
   public void getDocumentPopupAnnotationsByParentExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       String parentId = "GI5TAOZRGU3CYNZSGEWDCNZWFQ3TGOI";

       PopupAnnotationsResponse response = pdfApi.getDocumentPopupAnnotationsByParent(name, parentId, null, tempFolder);
   }


   
   public void getPagePopupAnnotationsExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       int pageNumber = 2;

       PopupAnnotationsResponse response = pdfApi.getPagePopupAnnotations(name, pageNumber, null, tempFolder);
   }

   
   public void getPopupAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       PopupAnnotationsResponse responseAnnotations = pdfApi.getDocumentPopupAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       PopupAnnotationResponse response = pdfApi.getPopupAnnotation(name, annotationId, null, tempFolder);
   }


   public void postPopupAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       String parentId = "GI5TCMR3GE2TQLBSGM3CYMJYGUWDENRV";

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);

       PopupAnnotation annotation = new PopupAnnotation();
       annotation.setName("Name");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setModified("02/02/2018 00:00:00.000 AM");


       AsposeResponse response = pdfApi.postPopupAnnotation(name, parentId, annotation, null, tempFolder);
      
   }


   
   public void putPopupAnnotationExample()throws ApiException
   {
       String name = "PdfWithAnnotations.pdf";
       uploadFile(name);

       Rectangle rect = new Rectangle()
               .LLX(100.)
               .LLY(100.)
               .URX(200.)
               .URY(200.);

       List<AnnotationFlags> flags = new ArrayList<>();
       flags.add(AnnotationFlags.DEFAULT);


       PopupAnnotation annotation = new PopupAnnotation();
       annotation.setName("Name Updated");
       annotation.setRect(rect);
       annotation.setFlags(flags);
       annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
       annotation.setZindex(1);
       annotation.setModified("02/02/2018 00:00:00.000 AM");

       PopupAnnotationsResponse responseAnnotations = pdfApi.getDocumentPopupAnnotations(name, null, tempFolder);
       String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

       AsposeResponse response = pdfApi.putPopupAnnotation(name, annotationId, annotation, null, tempFolder);
      
   }

   

   
   public void postAppendDocumentUsingQueryParamsExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       String appendFileName = "4pages.pdf";

       this.uploadFile(name);
       this.uploadFile(appendFileName);

       int startPage = 2;
       int endPage = 4;

       DocumentResponse response = this.pdfApi.postAppendDocument(name, null, this.tempFolder + '/' + appendFileName, startPage, endPage, null, this.tempFolder);
   }



   
   public void postAppendDocumentUsingBodyParamsExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       String appendFileName = "4pages.pdf";

       this.uploadFile(name);
       this.uploadFile(appendFileName);

       AppendDocument appendDocument = new AppendDocument();
       appendDocument.setDocument(this.tempFolder + '/' + appendFileName);
       appendDocument.setStartPage(2);
       appendDocument.setEndPage(4);

       DocumentResponse response = this.pdfApi.postAppendDocument(name, appendDocument, null, null, null, null, this.tempFolder);
   }



   public void getDocumentAttachmentByIndexExample() throws ApiException
   {
       String name = "PdfWithEmbeddedFiles.pdf";
       this.uploadFile(name);

       int attachmentIndex = 1;

       AttachmentResponse response = this.pdfApi.getDocumentAttachmentByIndex(name, attachmentIndex, null, this.tempFolder);
   }


   
   public void getDocumentAttachmentsExample() throws ApiException
   {
       String name = "PdfWithEmbeddedFiles.pdf";
       this.uploadFile(name);

       AttachmentsResponse response = this.pdfApi.getDocumentAttachments(name, null, this.tempFolder);
   }



   
   public void getDownloadDocumentAttachmentByIndexExample() throws ApiException
   {
       String name = "PdfWithEmbeddedFiles.pdf";
       this.uploadFile(name);

       int attachmentIndex = 1;

       File response = this.pdfApi.getDownloadDocumentAttachmentByIndex(name, attachmentIndex, null, this.tempFolder);
   }


   
   public void getDocumentBookmarksExample() throws ApiException
   {
       String name = "PdfWithBookmarks.pdf";
       this.uploadFile(name);

       File response = this.pdfApi.getDocumentBookmarks(name, null, null, this.tempFolder);
   }


   public void getPdfInStorageToDocExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);
       String folder = this.tempFolder;

       File response = this.pdfApi.getPdfInStorageToDoc(name, null, null, null, null, null, null, null, null, folder, null);
   }


   
   public void putPdfInStorageToDocExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);
       String folder = this.tempFolder;
       String resFileName = "result.doc";

       AsposeResponse response = this.pdfApi.putPdfInStorageToDoc(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, folder, null);
      
   }


   public void putPdfInRequestToDocExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.doc";

       AsposeResponse response = this.pdfApi.putPdfInRequestToDoc(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, file);
      
   }


   
   public void getPdfInStorageToPdfAExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String type = PdfAType.PDFA1A.toString();
       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToPdfA(name, type, folder, null);
   }


   
   public void putPdfInStorageToPdfAExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String type = PdfAType.PDFA1A.toString();
       String folder = this.tempFolder;
       String resFileName = "result.pdf";

       AsposeResponse response = this.pdfApi.putPdfInStorageToPdfA(name, this.tempFolder + '/' + resFileName, type, folder, null);
      
   }



   
   public void putPdfInRequestToPdfAExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String type = PdfAType.PDFA1A.toString();
       String resFileName = "result.pdf";

       AsposeResponse response = this.pdfApi.putPdfInRequestToPdfA(this.tempFolder + '/' + resFileName, type, null, file);
      
   }



   
   public void getPdfInStorageToTiffExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToTiff(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
   }


   
   public void putPdfInStorageToTiffExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.tiff";

       AsposeResponse response = this.pdfApi.putPdfInStorageToTiff(name, this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
      
   }



   
   public void putPdfInRequestToTiffExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.tiff";

       AsposeResponse response = this.pdfApi.putPdfInRequestToTiff(this.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file);
      
   }


   
   public void getPdfInStorageToSvgExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToSvg(name, null, folder, null);
   }



   
   public void putPdfInStorageToSvgExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.svg";

       AsposeResponse response = this.pdfApi.putPdfInStorageToSvg(name, this.tempFolder + '/' + resFileName, folder, null);
      
   }


   
   public void putPdfInRequestToSvgExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.svg";

       AsposeResponse response = this.pdfApi.putPdfInRequestToSvg(this.tempFolder + '/' + resFileName, null, file);
      
   }



   
   public void getPdfInStorageToXpsExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToXps(name, folder, null);
   }



   
   public void putPdfInStorageToXpsExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.xps";

       AsposeResponse response = this.pdfApi.putPdfInStorageToXps(name, this.tempFolder + '/' + resFileName, folder, null);
      
   }


   public void putPdfInRequestToXpsExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.xps";

       AsposeResponse response = this.pdfApi.putPdfInRequestToXps(this.tempFolder + '/' + resFileName, null , file);
      
   }

   
   public void getPdfInStorageToXlsExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToXls(name, null, null, null, null, folder, null);
   }


   
   public void putPdfInStorageToXlsExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.xls";

       AsposeResponse response = this.pdfApi.putPdfInStorageToXls(name, this.tempFolder + '/' + resFileName, null, null, null, null, folder, null);
      
   }



   
   public void putPdfInRequestToXlsExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.xls";

       AsposeResponse response = this.pdfApi.putPdfInRequestToXls(this.tempFolder + '/' + resFileName, null, null, null, null, null , file);
      
   }




   
   public void getPdfInStorageToHtmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToHtml(name, null, null, null, null, null,  null,  null, null,
               null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
   }



   
   public void putPdfInStorageToHtmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.zip";

       AsposeResponse response = this.pdfApi.putPdfInStorageToHtml(
               name,
               this.tempFolder + '/' + resFileName,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               folder,
               null);
      
   }


   public void putPdfInRequestToHtmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.zip";

       AsposeResponse response = this.pdfApi.putPdfInRequestToHtml(
               this.tempFolder + '/' + resFileName,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               file);
      
   }



   
   public void getPdfInStorageToEpubExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToEpub(name, null, folder, null);
   }



   
   public void putPdfInStorageToEpubExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.epub";

       AsposeResponse response = this.pdfApi.putPdfInStorageToEpub(name, this.tempFolder + '/' + resFileName, null, folder, null);
      
   }


   
   public void putPdfInRequestToEpubExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.epub";

       AsposeResponse response = this.pdfApi.putPdfInRequestToEpub(this.tempFolder + '/' + resFileName, null, null, file);
      
   }


 
   
   public void getPdfInStorageToPptxExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToPptx(name, null, null, folder, null);
   }


   
   public void putPdfInStorageToPptxExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.pptx";

       AsposeResponse response = this.pdfApi.putPdfInStorageToPptx(name, this.tempFolder + '/' + resFileName, null, null, folder, null);
      
   }


   
   public void putPdfInRequestToPptxExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.pptx";

       AsposeResponse response = this.pdfApi.putPdfInRequestToPptx(this.tempFolder + '/' + resFileName, null, null, null, file);
      
   }


   
   public void getPdfInStorageToLaTeXExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToLaTeX(name, null, folder, null);
   }


   
   public void putPdfInStorageToLaTeXExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.latex";

       AsposeResponse response = this.pdfApi.putPdfInStorageToLaTeX(name, this.tempFolder + '/' + resFileName, null, folder, null);
      
   }



   
   public void putPdfInRequestToLaTeXExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.latex";

       AsposeResponse response = this.pdfApi.putPdfInRequestToLaTeX(this.tempFolder + '/' + resFileName, null, null, file);
      
   }




   
   public void getPdfInStorageToMobiXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToMobiXml(name, folder, null);
   }



   
   public void putPdfInStorageToMobiXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.mobi";

       AsposeResponse response = this.pdfApi.putPdfInStorageToMobiXml(name, this.tempFolder + '/' + resFileName, folder, null);
      
   }




   
   public void putPdfInRequestToMobiXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.mobi";

       AsposeResponse response = this.pdfApi.putPdfInRequestToMobiXml(this.tempFolder + '/' + resFileName, null, file);
      
   }



   
   public void getXfaPdfInStorageToAcroFormExample() throws ApiException
   {
       String name = "PdfWithXfaForm.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getXfaPdfInStorageToAcroForm(name, folder, null);
   }


   
   public void putXfaPdfInStorageToAcroFormExample() throws ApiException
   {
       String name = "PdfWithXfaForm.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.pdf";

       AsposeResponse response = this.pdfApi.putXfaPdfInStorageToAcroForm(name, this.tempFolder + '/' + resFileName, folder, null);
      
   }


   
   public void putXfaPdfInRequestToAcroFormExample() throws ApiException
   {
       String name = "PdfWithXfaForm.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.pdf";

       AsposeResponse response = this.pdfApi.putXfaPdfInRequestToAcroForm(this.tempFolder + '/' + resFileName, null, file);
      
   }


   
   public void getPdfInStorageToXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;


       File response = this.pdfApi.getPdfInStorageToXml(name, folder, null);
   }


   
   public void putPdfInStorageToXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       String resFileName = "result.xml";

       AsposeResponse response = this.pdfApi.putPdfInStorageToXml(name, this.tempFolder + '/' + resFileName, folder, null);
      
   }



   
   public void putPdfInRequestToXmlExample() throws ApiException
   {
       String name = "4pages.pdf";
       File file = new File(ExampleDataFolder + "/" + name);
       String resFileName = "result.xml";

       AsposeResponse response = this.pdfApi.putPdfInRequestToXml(this.tempFolder + '/' + resFileName, null, file);
      
   }



   
   public void getEpubInStorageToPdfExample() throws ApiException
   {
       String name = "4pages.epub";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getEpubInStorageToPdf(srcPath, null);
   }



   
   public void putEpubInStorageToPdfExample() throws ApiException
   {
       String name = "4pages.epub";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromEpub.pdf";

       AsposeResponse response = this.pdfApi.putEpubInStorageToPdf(resultName, srcPath, null, this.tempFolder);
      
   }


   public void getWebInStorageToPdfExample() throws ApiException
   {
       String sourceUrl = "http://google.com";

       File response = this.pdfApi.getWebInStorageToPdf(sourceUrl, null, null , null,
               null, null, null, null, null);
   }


   
   public void putWebInStorageToPdfExample() throws ApiException
   {
       String sourceUrl = "http://google.com";
       String resultName = "fromWeb.pdf";

       AsposeResponse response = this.pdfApi.putWebInStorageToPdf(resultName, sourceUrl, null,
               null, null, null, null, null,
               null, this.tempFolder, null);
      
   }




   
   public void getLaTeXInStorageToPdfExample() throws ApiException
   {
       String name = "TexExample.tex";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getLaTeXInStorageToPdf(srcPath, null);
   }



   public void putLaTeXInStorageToPdfExample() throws ApiException
   {
       String name = "TexExample.tex";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromTex.pdf";

       AsposeResponse response = this.pdfApi.putLaTeXInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }



   
   public void getMhtInStorageToPdfExample() throws ApiException
   {
       String name = "MhtExample.mht";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getMhtInStorageToPdf(srcPath, null);
   }


   
   public void putMhtInStorageToPdfExample() throws ApiException
   {
       String name = "MhtExample.mht";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromMht.pdf";

       AsposeResponse response = this.pdfApi.putMhtInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }



   public void getHtmlInStorageToPdfExample() throws ApiException
   {
       String name = "HtmlWithImage.zip";
       this.uploadFile(name);

       String htmlFileName = "HtmlWithImage.html";
       double height = 650;
       double width = 250;
       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getHtmlInStorageToPdf(srcPath, htmlFileName, height, width,
               null, null, null, null, null, null);
   }




   
   public void putHtmlInStorageToPdfExample() throws ApiException
   {
       String name = "HtmlWithImage.zip";
       this.uploadFile(name);

       String htmlFileName = "HtmlWithImage.html";
       double height = 650;
       double width = 250;
       String resultName = "fromHtml.pdf";
       String srcPath = this.tempFolder + '/' + name;


       AsposeResponse response = this.pdfApi.putHtmlInStorageToPdf(name, srcPath, htmlFileName,
               height, width, null, null, null,
               null, null, null, null);
      
   }


   public void getXslFoInStorageToPdfExample() throws ApiException
   {
       String name = "XslfoExample.xslfo";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getXslFoInStorageToPdf(srcPath, null);
   }


   
   public void putXslFoInStorageToPdfExample() throws ApiException
   {
       String name = "XslfoExample.xslfo";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromXlsFo.pdf";

       AsposeResponse response = this.pdfApi.putXslFoInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }



   
   public void getXpsInStorageToPdfExample() throws ApiException
   {
       String name = "Simple.xps";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getXpsInStorageToPdf(srcPath, null);
   }



   
   public void putXpsInStorageToPdfExample() throws ApiException
   {
       String name = "Simple.xps";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromXps.pdf";

       AsposeResponse response = this.pdfApi.putXpsInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }


 

   
   public void getSvgInStorageToPdfExample() throws ApiException
   {
       String name = "Simple.svg";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getSvgInStorageToPdf(srcPath, null, null, null,
               null, null, null, null, null, null);
   }




   
   public void putSvgInStorageToPdfExample() throws ApiException
   {
       String name = "Simple.svg";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromSvg.pdf";

       AsposeResponse response = this.pdfApi.putSvgInStorageToPdf(resultName, srcPath, null,
               null, null, null, null, null,
               null, null, this.tempFolder, null);
      
   }


   
   public void getPclInStorageToPdfExample() throws ApiException
   {
       String name = "template.pcl";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getPclInStorageToPdf(srcPath, null);
   }



   
   public void putPclInStorageToPdfExample() throws ApiException
   {
       String name = "template.pcl";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromPcl.pdf";

       AsposeResponse response = this.pdfApi.putPclInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }




   
   public void getXmlInStorageToPdfExample() throws ApiException
   {
       String name = "template.xml";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getXmlInStorageToPdf(srcPath, null, null);
   }



   
   public void putXmlInStorageToPdfExample() throws ApiException
   {
       String name = "template.xml";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromXml.pdf";

       AsposeResponse response = this.pdfApi.putXmlInStorageToPdf(resultName, srcPath, null, this.tempFolder, null);
      
   }



   
   public void getPsInStorageToPdfExample() throws ApiException
   {
       String name = "Typography.PS";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;

       File response = this.pdfApi.getPsInStorageToPdf(srcPath, null);
   }



   
   public void putPsInStorageToPdfExample() throws ApiException
   {
       String name = "Typography.PS";
       this.uploadFile(name);


       String srcPath = this.tempFolder + '/' + name;
       String resultName = "fromPs.pdf";

       AsposeResponse response = this.pdfApi.putPsInStorageToPdf(resultName, srcPath, this.tempFolder, null);
      
   }



   
   public void putImageInStorageToPdfExample() throws ApiException
   {
       final String dataFile1 = "33539.jpg";
       this.uploadFile(dataFile1);

       final String dataFile2 = "44781.jpg";
       this.uploadFile(dataFile2);

       String resultName = "result.pdf";


       ImageTemplatesRequest imageTemplatesRequest = new ImageTemplatesRequest()
               .isOCR(true)
               .ocRLangs("eng")
               .imagesList(new ArrayList<ImageTemplate>(){{
                   add(new ImageTemplate().imagePath("" + '/' + dataFile1).imageSrcType(ImageSrcType.COMMON));
                   add(new ImageTemplate().imagePath("" + '/' + dataFile2).imageSrcType(ImageSrcType.COMMON));
               }});

       AsposeResponse response = this.pdfApi.putImageInStorageToPdf(resultName, imageTemplatesRequest, this.tempFolder, null);
      
   }



   
   public void getDocumentExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       DocumentResponse response = this.pdfApi.getDocument(name, null, folder);
   }



   
   public void postOptimizeDocumentExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       OptimizeOptions optimizeOptions = new OptimizeOptions();
       optimizeOptions.setAllowReusePageContent(false);
       optimizeOptions.setCompressImages(true);
       optimizeOptions.setImageQuality(100);
       optimizeOptions.setLinkDuplcateStreams(true);
       optimizeOptions.setRemoveUnusedObjects(true);
       optimizeOptions.setRemoveUnusedStreams(true);
       optimizeOptions.setUnembedFonts(true);

       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
   }

   public void postSplitDocumentExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       SplitResultResponse response = this.pdfApi.postSplitDocument(name, null, null, null, null, folder);
   }


   public void putCreateEmptyDocumentExample() throws ApiException
   {
       String name = "empty.pdf";

       String folder = this.tempFolder;

       DocumentResponse response = this.pdfApi.putCreateDocument(name, null, folder);
   }



   
 
   
   public void postFlattenDocumentExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       boolean updateAppearances = true;
       boolean hideButtons = true;
       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.postFlattenDocument(name, updateAppearances, null, hideButtons, null, folder);
   }




   
   public void getImageExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       ImageResponse response = this.pdfApi.getImage(name, imageId, null, folder);
   }




   
   public void deleteImageExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       AsposeResponse response = this.pdfApi.deleteImage(name, imageId, null, folder);
   }


   
   public void getImagesExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       ImagesResponse response = this.pdfApi.getImages(name, pageNumber, null, folder);
   }




   
   public void putReplaceImageExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       String imageFileName = "Koala.jpg";
       this.uploadFile(imageFileName);

       int pageNumber = 1;
       String folder = this.tempFolder;
       String imageFile = folder + '/' + imageFileName;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, folder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       ImageResponse response = this.pdfApi.putReplaceImage(name, imageId, imageFile, null, folder, null);
   }



   
   public void postInsertImageExample() throws ApiException
   {
       String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       String imageFileName = "Koala.jpg";
       File file = new File(ExampleDataFolder + "/" + imageFileName);

       int pageNumber = 1;
       String folder = this.tempFolder;
       String imageFile = folder + '/' + imageFileName;

       double llx = 10;
       double lly = 10;
       double urx = 100;
       double ury = 100;

       AsposeResponse response = this.pdfApi.postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFile, null, folder, null);
      
   }


   /**
    * PutImagesExtractAsJpeg Example
    * @throws ApiException
    *          if the Api call fails
    */

   
   public void putImagesExtractAsJpegExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       final String destFolder = this.tempFolder + '/' + "extract_jpg";

       AsposeResponse response = this.pdfApi.putImagesExtractAsJpeg(name, pageNumber, null, null, null,
               this.tempFolder, destFolder);
   }


   public void putImagesExtractAsTiffExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       final String destFolder = this.tempFolder + '/' + "extract_tiff";

       AsposeResponse response = this.pdfApi.putImagesExtractAsTiff(name, pageNumber, null, null, null,
               this.tempFolder, destFolder);
   }


   
   public void putImagesExtractAsGifExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       final String destFolder = this.tempFolder + '/' + "extract_gif";

       AsposeResponse response = this.pdfApi.putImagesExtractAsGif(name, pageNumber, null, null, null,
               this.tempFolder, destFolder);
   }



   
   public void putImagesExtractAsPngExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       final String destFolder = this.tempFolder + '/' + "extract_png";

       AsposeResponse response = this.pdfApi.putImagesExtractAsPng(name, pageNumber, null, null, null,
               this.tempFolder, destFolder);
   }


   
   public void putImageExtractAsJpegExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       final String destFolder = this.tempFolder + '/' + "extract_jpg";

       AsposeResponse response = this.pdfApi.putImageExtractAsJpeg(name, imageId, null, null, null,
               this.tempFolder, destFolder);
   }



   
   public void getImageExtractAsJpegExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();


       File response = this.pdfApi.getImageExtractAsJpeg(name, imageId, null, null, null,
               this.tempFolder);
   }




   
   public void putImageExtractAsTiffExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       final String destFolder = this.tempFolder + '/' + "extract_tiff";

       AsposeResponse response = this.pdfApi.putImageExtractAsTiff(name, imageId, null, null, null,
               this.tempFolder, destFolder);
   }


   
   public void getImageExtractAsTiffExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();


       File response = this.pdfApi.getImageExtractAsTiff(name, imageId, null, null, null,
               this.tempFolder);
   }


   
   public void putImageExtractAsGifExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       final String destFolder = this.tempFolder + '/' + "extract_gif";

       AsposeResponse response = this.pdfApi.putImageExtractAsGif(name, imageId, null, null, null,
               this.tempFolder, destFolder);
   }




   
   public void getImageExtractAsGifExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();


       File response = this.pdfApi.getImageExtractAsGif(name, imageId, null, null, null,
               this.tempFolder);
   }




   
   public void putImageExtractAsPngExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();

       final String destFolder = this.tempFolder + '/' + "extract_png";

       AsposeResponse response = this.pdfApi.putImageExtractAsPng(name, imageId, null, null, null,
               this.tempFolder, destFolder);
   }



   
   public void getImageExtractAsPngExample() throws ApiException
   {
       final String name = "PdfWithImages2.pdf";
       this.uploadFile(name);

       int pageNumber = 1;

       ImagesResponse imagesResponse = this.pdfApi.getImages(name, pageNumber, null, this.tempFolder);
       String imageId = imagesResponse.getImages().getList().get(0).getId();


       File response = this.pdfApi.getImageExtractAsPng(name, imageId, null, null, null,
               this.tempFolder);
   }



   
   public void getPageLinkAnnotationExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
       String linkId = linksResponse.getLinks().getList().get(0).getId();

       LinkAnnotationResponse response = this.pdfApi.getPageLinkAnnotation(name, pageNumber, linkId, null, folder);
   }



   
   public void deleteLinkAnnotationExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
       String linkId = linksResponse.getLinks().getList().get(0).getId();

       AsposeResponse response = this.pdfApi.deleteLinkAnnotation(name, linkId, null, folder);
   }




   
   public void getPageLinkAnnotationsExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotationsResponse response = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
   }



   
   public void postPageLinkAnnotationsExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotation link = new LinkAnnotation()
               .actionType(LinkActionType.GOTOURIACTION)
               .action("https://products.aspose.cloud/pdf")
               .rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(500.));

       ArrayList<LinkAnnotation> links = new ArrayList<>();
       links.add(link);

       AsposeResponse response = this.pdfApi.postPageLinkAnnotations(name, pageNumber, links, null, folder);
      
   }


   public void putLinkAnnotationExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotation link = new LinkAnnotation()
               .actionType(LinkActionType.GOTOURIACTION)
               .action("https://products.aspose.cloud/pdf")
               .rect(new Rectangle().LLX(100.).LLY(100.).URX(500.).URY(500.));

       LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
       String linkId = linksResponse.getLinks().getList().get(0).getId();

       AsposeResponse response = this.pdfApi.putLinkAnnotation(name, linkId, link, null, folder);
      
   }


  

   
   public void deletePageLinkAnnotationsExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.deletePageLinkAnnotations(name, pageNumber, null, folder);

   }


   
   public void deleteDocumentLinkAnnotationsExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.deleteDocumentLinkAnnotations(name, null, folder);
   }


   
   public void getLinkAnnotationExample() throws ApiException
   {
       String name = "PdfWithLinks.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       LinkAnnotationsResponse linksResponse = this.pdfApi.getPageLinkAnnotations(name, pageNumber, null, folder);
       String linkId = linksResponse.getLinks().getList().get(0).getId();

       AsposeResponse response = this.pdfApi.getLinkAnnotation(name, linkId, null, folder);
   }



   
   public void putMergeDocumentsExample() throws ApiException
   {
       ArrayList<String> nameList = new ArrayList<String>();
       nameList.add("4pages.pdf");
       nameList.add("PdfWithImages2.pdf");
       nameList.add("marketing.pdf");

       for (String name : nameList)
       {
           this.uploadFile(name);
       }

       String resultName = "MergingResult.pdf";

       MergeDocuments mergeDocuments = new MergeDocuments();

       for(int i = 0; i < nameList.size(); i++)
       {
           nameList.set(i, this.tempFolder + '/' + nameList.get(i));
       }

       mergeDocuments.setList(nameList);

       String folder = this.tempFolder;

       DocumentResponse response = this.pdfApi.putMergeDocuments(resultName, mergeDocuments, null, folder);
   }


   
   public void putSearchableDocumentExample() throws ApiException
   {
       String name = "rusdoc.pdf";
       this.uploadFile(name);

       String lang = "rus,eng";
       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, lang);
   }


   
   public void putSearchableDocumentWithDefaultLangExample() throws ApiException
   {
       String name = "rusdoc.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.putSearchableDocument(name, null, folder, null);
   }



   
   public void getPageConvertToTiffExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToTiff(name, pageNumber, null, null, this.tempFolder, null);
   }

   
   public void putPageConvertToTiffExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.tiff";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToTiff(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }

   public void getPageConvertToJpegExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToJpeg(name, pageNumber, null, null, this.tempFolder, null);
   }

   
   public void putPageConvertToJpegExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.jpeg";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToJpeg(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }

   public void getPageConvertToPngExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToPng(name, pageNumber, null, null, this.tempFolder, null);
   }


   
   public void putPageConvertToPngExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.png";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToPng(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }


   
   public void getPageConvertToEmfExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToEmf(name, pageNumber, null, null, this.tempFolder, null);
   }


   
   public void putPageConvertToEmfExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.emf";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToEmf(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }

   
   public void getPageConvertToBmpExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToBmp(name, pageNumber, null, null, this.tempFolder, null);
   }

   public void putPageConvertToBmpExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.bmp";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToBmp(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }


   
   public void getPageConvertToGifExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;

       File response = this.pdfApi.getPageConvertToGif(name, pageNumber, null, null, this.tempFolder, null);
   }

   public void putPageConvertToGifExample() throws ApiException
   {
       final String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 2;
       final String resultFile = "page.gif";
       final String outPath = this.tempFolder + '/' + resultFile;
       AsposeResponse response = this.pdfApi.putPageConvertToGif(name, pageNumber, outPath,
               null, null, this.tempFolder, null);
   }



   
   public void deletePageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.deletePage(name, pageNumber, null, folder);
   }



   
   public void getPageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 3;
       String folder = this.tempFolder;

       DocumentPageResponse response = this.pdfApi.getPage(name, pageNumber, null, folder);
   }


   
   public void getPagesExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       DocumentPagesResponse response = this.pdfApi.getPages(name, null, folder);
   }




   
   public void getWordsPerPageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       WordCountResponse response = this.pdfApi.getWordsPerPage(name, null, folder);
   }




   
   public void postMovePageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;
       int pageNumber = 1;
       int newIndex = 1;

       AsposeResponse response = this.pdfApi.postMovePage(name, pageNumber, newIndex, null, folder);
   }


   
   public void putAddNewPageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String folder = this.tempFolder;

       DocumentPagesResponse response = this.pdfApi.putAddNewPage(name, null, folder);
   }



   
   public void putPageAddStampExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String stampFileName = "Penguins.jpg";
       this.uploadFile(stampFileName);

       int pageNumber = 1;
       String folder = this.tempFolder;


       Stamp stamp = new Stamp();
       stamp.setType(StampType.IMAGE);
       stamp.setFileName(folder + '/' + stampFileName);
       stamp.setBackground(true);
       stamp.setWidth(200.);
       stamp.setHeight(200.);
       stamp.setXindent(100.);
       stamp.setYindent(100.);

       AsposeResponse response = this.pdfApi.putPageAddStamp(name, pageNumber, stamp, null, folder);
   }


   
   public void putPrivilegesExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       DocumentPrivilege documentPrivilege = new DocumentPrivilege();
       documentPrivilege.setAllowCopy(false);
       documentPrivilege.setAllowPrint(false);

       String folder = this.tempFolder;

       AsposeResponse response = this.pdfApi.putPrivileges(name, documentPrivilege, null, folder);
   }




   
   public void deletePropertiesExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       DocumentProperty property1 = new DocumentProperty();
       property1.setName("prop1");
       property1.setValue("val1");

       String folder = this.tempFolder;

       DocumentProperty property2 = new DocumentProperty();
       property2.setName("prop2");
       property2.setValue("val2");


       this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
       this.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder);

       AsposeResponse response = this.pdfApi.deleteProperties(name, null, folder);
   }



   
   public void deletePropertyExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       DocumentProperty property1 = new DocumentProperty();
       property1.setName("prop1");
       property1.setValue("val1");

       String folder = this.tempFolder;

       this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);

       AsposeResponse response = this.pdfApi.deleteProperty(name, property1.getName(), null, folder);
   }


   
   public void getDocumentPropertiesExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       DocumentProperty property1 = new DocumentProperty();
       property1.setName("prop1");
       property1.setValue("val1");

       String folder = this.tempFolder;

       DocumentProperty property2 = new DocumentProperty();
       property2.setName("prop2");
       property2.setValue("val2");

       this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
       this.pdfApi.putSetProperty(name, property2.getName(), property2.getValue(), null, folder);

       DocumentPropertiesResponse response = this.pdfApi.getDocumentProperties(name, null, folder);
   }



   
   public void getDocumentPropertyExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       DocumentProperty property1 = new DocumentProperty();
       property1.setName("prop1");
       property1.setValue("val1");

       String folder = this.tempFolder;

       this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);

       DocumentPropertyResponse response = this.pdfApi.getDocumentProperty(name, property1.getName(), null, folder);
   }


   
   public void putSetPropertyExample() throws ApiException
   {
       String name = "PdfWithAcroForm.pdf";
       this.uploadFile(name);

       DocumentProperty property1 = new DocumentProperty();
       property1.setName("prop1");
       property1.setValue("val1");

       String folder = this.tempFolder;

       DocumentPropertyResponse response = this.pdfApi.putSetProperty(name, property1.getName(), property1.getValue(), null, folder);
   }



   
   public void postSignDocumentExample() throws ApiException
   {
       String name = "BlankWithSignature.pdf";
       this.uploadFile(name);

       String signatureFileName = "Example1234.pfx";
       this.uploadFile(signatureFileName);

       Rectangle rectangle = new Rectangle()
           .LLX(100.)
           .LLY(100.)
           .URX(500.)
           .URY(200.);

       String folder = this.tempFolder;

       Signature signature = new Signature();
       signature.setAuthority("Sergey Smal");
       signature.setContact("Example@mail.ru");
       signature.setDate("08/01/2012 12:15:00.000 PM");
       signature.setFormFieldName("Signature1");
       signature.setLocation("Ukraine");
       signature.setPassword("Example1234");
       signature.setRectangle(rectangle);
       signature.setSignaturePath(folder + '/' + signatureFileName);
       signature.setSignatureType(SignatureType.PKCS7);
       signature.setVisible(true);

       AsposeResponse response = this.pdfApi.postSignDocument(name, signature, null, folder);
   }

   
   public void postSignPageExample() throws ApiException
   {
       String name = "BlankWithSignature.pdf";
       this.uploadFile(name);

       String signatureFileName = "Example1234.pfx";
       this.uploadFile(signatureFileName);

       int pageNumber = 1;

       Rectangle rectangle = new Rectangle()
           .LLX(100.)
           .LLY(100.)
           .URX(500.)
           .URY(200.);

       String folder = this.tempFolder;

       Signature signature = new Signature();
       signature.setAuthority("Sergey Smal");
       signature.setContact("Example@mail.ru");
       signature.setDate("08/01/2012 12:15:00.000 PM");
       signature.setFormFieldName("Signature1");
       signature.setLocation("Ukraine");
       signature.setPassword("Example1234");
       signature.setRectangle(rectangle);
       signature.setSignaturePath(folder + '/' + signatureFileName);
       signature.setSignatureType(SignatureType.PKCS7);
       signature.setVisible(true);

       AsposeResponse response = this.pdfApi.postSignPage(name, pageNumber, signature, null, folder);
   }



   public void getVerifySignatureExample() throws ApiException
   {
       String name = "BlankWithSignature.pdf";
       this.uploadFile(name);

       String signatureFileName = "Example1234.pfx";
       this.uploadFile(signatureFileName);

       Rectangle rectangle = new Rectangle()
           .LLX(100.)
           .LLY(100.)
           .URX(500.)
           .URY(200.);

       String folder = this.tempFolder;

       Signature signature = new Signature();
       signature.setAuthority("Sergey Smal");
       signature.setContact("Example@mail.ru");
       signature.setDate("08/01/2012 12:15:00.000 PM");
       signature.setFormFieldName("Signature1");
       signature.setLocation("Ukraine");
       signature.setPassword("Example1234");
       signature.setRectangle(rectangle);
       signature.setSignaturePath(folder + '/' + signatureFileName);
       signature.setSignatureType(SignatureType.PKCS7);
       signature.setVisible(true);

       AsposeResponse responseSign = this.pdfApi.postSignDocument(name, signature, null, folder);

       SignatureVerifyResponse response = this.pdfApi.getVerifySignature(name, signature.getFormFieldName(), null, folder);
   }



   
   public void postDocumentTextReplaceExample() throws ApiException
   {
       String name = "marketing.pdf";
       this.uploadFile(name);

       Rectangle rect = new Rectangle()
           .LLX(100.)
           .LLY(100.)
           .URX(300.)
           .URY(300.);

       final TextReplace textReplace = new TextReplace();
       textReplace.setOldValue("market");
       textReplace.setNewValue("m_a_r_k_e_t");
       textReplace.setRegex(false);
       textReplace.setRect(rect);

       TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
       textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
       textReplaceList.setStartIndex(0);
       textReplaceList.setCountReplace(0);

       String folder = this.tempFolder;

       TextReplaceResponse response  = this.pdfApi.postDocumentTextReplace(name, textReplaceList, null, folder);
   }


   
   public void postPageTextReplaceByRectExample() throws ApiException
   {
       String name = "marketing.pdf";
       this.uploadFile(name);
       int pageNumber = 1;

       Rectangle rect = new Rectangle()
           .LLX(100.)
           .LLY(700.)
           .URX(400.)
           .URY(1000.);

       final TextReplace textReplace = new TextReplace();
       textReplace.setOldValue("market");
       textReplace.setNewValue("m_a_r_k_e_t");
       textReplace.setRegex(false);
       textReplace.setRect(rect);

       TextReplaceListRequest textReplaceList = new TextReplaceListRequest();
       textReplaceList.setTextReplaces(new ArrayList<TextReplace>(){{ add(textReplace); }});
       textReplaceList.setStartIndex(0);
       textReplaceList.setCountReplace(0);

       String folder = this.tempFolder;

       TextReplaceResponse response = this.pdfApi.postPageTextReplace(name, pageNumber, textReplaceList, null, folder);
   }



   public void getTextExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       double llx = 0;
       double lly = 0;
       double urx = 0;
       double ury = 0;
       String folder = this.tempFolder;

       TextRectsResponse response = this.pdfApi.getText(name, llx, lly, urx, ury, null, null, null, folder, null);
   }



   
   public void getPageTextByTwoTextOnPageExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       double llx = 0;
       double lly = 0;
       double urx = 0;
       double ury = 0;

       List<String> format = new ArrayList<String>(){{ add("First Page"); add("Second Page");}};
       String folder = this.tempFolder;

       TextRectsResponse response = this.pdfApi.getPageText(name, pageNumber, llx, lly, urx, ury, format, null, null, folder, null);
   }




   
   public void putAddTextExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       int pageNumber = 1;
       String folder = this.tempFolder;

       Rectangle rectangle = new Rectangle();
       rectangle.setLLX(100.);
       rectangle.setLLY(100.);
       rectangle.setURX(200.);
       rectangle.setURY(200.);

       Color foregroundColor = new Color();
       foregroundColor.setA(0x00);
       foregroundColor.setR(0x00);
       foregroundColor.setG(0xFF);
       foregroundColor.setB(0x00);

       Color backgroundColor = new Color();
       backgroundColor.setA(0x00);
       backgroundColor.setR(0xFF);
       backgroundColor.setG(0x00);
       backgroundColor.setB(0x00);

       TextState textState = new TextState();
       textState.setFont("Arial");
       textState.setFontSize(10.);
       textState.setForegroundColor(foregroundColor);
       textState.setBackgroundColor(backgroundColor);
       textState.setFontStyle(FontStyles.BOLD);

       final Segment segment = new Segment();
       segment.setValue("segment 1");
       segment.setTextState(textState);

       final TextLine textLine = new TextLine();
       textLine.setHorizontalAlignment(TextHorizontalAlignment.RIGHT);
       textLine.setSegments(new ArrayList<Segment>(){{ add(segment);}});

       Paragraph paragraph = new Paragraph();
       paragraph.setRectangle(rectangle);
       paragraph.setLeftMargin(10.);
       paragraph.setRightMargin(10.);
       paragraph.setTopMargin(20.);
       paragraph.setBottomMargin(20.);
       paragraph.setHorizontalAlignment(TextHorizontalAlignment.FULLJUSTIFY);
       paragraph.setLineSpacing(LineSpacing.FONTSIZE);
       paragraph.setRotation(10.);
       paragraph.setSubsequentLinesIndent(20.);
       paragraph.setVerticalAlignment(VerticalAlignment.CENTER);
       paragraph.setWrapMode(WrapMode.BYWORDS);
       paragraph.setLines(new ArrayList<TextLine>(){{ add(textLine);}});


       AsposeResponse response = this.pdfApi.putAddText(name, pageNumber, paragraph, folder, null);
   }



   public void uploadFileExample() throws ApiException
   {
       String name = "4pages.pdf";
       String path = this.tempFolder + '/' + name;
       File file = new File(ExampleDataFolder + "/" + name);
       AsposeResponse response = this.pdfApi.putCreate(path, file, null, null);
   }


   public void getDownloadExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String path = this.tempFolder + '/' + name;

       File response = this.pdfApi.getDownload(path, null, null);
   }


   public void getListFilesExample() throws ApiException
   {
       FilesResponse response = this.pdfApi.getListFiles(this.tempFolder, null);
   }


   public void postMoveFileExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String src = this.tempFolder + '/' + name;
       String dest = this.tempFolder + "/4pages_renamed.pdf";

       AsposeResponse response = this.pdfApi.postMoveFile(src, dest, null, null, null);
   }


   
   public void deleteFileExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String path = this.tempFolder + '/' + name;

       AsposeResponse response = this.pdfApi.deleteFile(path, null, null);
   }


   
   public void putCreateFolderExample() throws ApiException
   {
       String path = this.tempFolder + "/ExampleFolder";

       AsposeResponse response = this.pdfApi.putCreateFolder(path, null, null);
   }


   public void postMoveFolderExample() throws ApiException
   {
       String src = this.tempFolder + "/ExampleFolder";

       AsposeResponse responseCreateFolder = this.pdfApi.putCreateFolder(src, null, null);

       String dest = this.tempFolder + "/ExampleFolderRenamed";

       AsposeResponse response = this.pdfApi.postMoveFolder(src, dest, null, null);
   }


   
   public void deleteFolderExample() throws ApiException
   {
       String path = this.tempFolder + "/ExampleFolder";

       AsposeResponse responseCreateFolder = this.pdfApi.putCreateFolder(path, null, null);

       AsposeResponse response = this.pdfApi.deleteFolder(path,null, null);
   }


   public void getIsStorageExistExample() throws ApiException
   {
       String name = "PDF-CI";

       AsposeResponse response = this.pdfApi.getIsStorageExist(name);
   }



   
   public void getIsExistExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String path = this.tempFolder + '/' + name;

       AsposeResponse response = this.pdfApi.getIsExist(path, null, null);
   }



   
   public void getDiscUsageExample() throws ApiException
   {
       DiscUsageResponse response = this.pdfApi.getDiscUsage(null);
   }

  

   
   public void getListFileVersionsExample() throws ApiException
   {
       String name = "4pages.pdf";
       this.uploadFile(name);

       String path = this.tempFolder + '/' + name;

       FileVersionsResponse response = this.pdfApi.getListFileVersions(path, null);
   }
}
