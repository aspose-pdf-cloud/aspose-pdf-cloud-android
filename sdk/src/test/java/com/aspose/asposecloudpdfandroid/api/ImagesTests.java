/**
 *
 * Copyright (c) 2021 Aspose.PDF Cloud
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

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ImagesTests {
    private TestHelper th;

    public ImagesTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        ImageResponse response = th.pdfApi.getImage(name, imageId, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * DeleteImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void deleteImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.deleteImage(name, imageId, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetImages Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImagesTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        String folder = th.tempFolder;

        ImagesResponse response = th.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostReplaceImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putReplaceImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        String imageFileName = "Koala.jpg";
        th.uploadFile(imageFileName);

        int pageNumber = 1;
        String folder = th.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, folder);
        assertEquals((int)imagesResponse.getCode(), 200);
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        ImageResponse response = th.pdfApi.putReplaceImage(name, imageId, imageFile, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostInsertImage Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postInsertImageTest() throws ApiException
    {
        String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        String imageFileName = "Koala.jpg";
        File file = new File(th.testDataFolder + "/" + imageFileName);

        int pageNumber = 1;
        String folder = th.tempFolder;
        String imageFile = folder + '/' + imageFileName;

        double llx = 10;
        double lly = 10;
        double urx = 100;
        double ury = 100;

        AsposeResponse response = th.pdfApi.postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFile, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutImagesExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = th.tempFolder + '/' + "extract_jpg";

        AsposeResponse response = th.pdfApi.putImagesExtractAsJpeg(name, pageNumber, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = th.tempFolder + '/' + "extract_tiff";

        AsposeResponse response = th.pdfApi.putImagesExtractAsTiff(name, pageNumber, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = th.tempFolder + '/' + "extract_gif";

        AsposeResponse response = th.pdfApi.putImagesExtractAsGif(name, pageNumber, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutImagesExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImagesExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;
        final String destFolder = th.tempFolder + '/' + "extract_png";

        AsposeResponse response = th.pdfApi.putImagesExtractAsPng(name, pageNumber, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutImageExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = th.tempFolder + '/' + "extract_jpg";

        AsposeResponse response = th.pdfApi.putImageExtractAsJpeg(name, imageId, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsJpeg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsJpegTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = th.pdfApi.getImageExtractAsJpeg(name, imageId, null, null, null,
                th.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = th.tempFolder + '/' + "extract_tiff";

        AsposeResponse response = th.pdfApi.putImageExtractAsTiff(name, imageId, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsTiffTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = th.pdfApi.getImageExtractAsTiff(name, imageId, null, null, null,
                th.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = th.tempFolder + '/' + "extract_gif";

        AsposeResponse response = th.pdfApi.putImageExtractAsGif(name, imageId, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsGif Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsGifTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = th.pdfApi.getImageExtractAsGif(name, imageId, null, null, null,
                th.tempFolder);
        assertNotNull(response);
    }


    /**
     * PutImageExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putImageExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = th.tempFolder + '/' + "extract_png";

        AsposeResponse response = th.pdfApi.putImageExtractAsPng(name, imageId, null, null, null,
                th.tempFolder, destFolder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetImageExtractAsPng Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getImageExtractAsPngTest() throws ApiException
    {
        final String name = "PdfWithImages2.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        ImagesResponse imagesResponse = th.pdfApi.getImages(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)imagesResponse.getCode());
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = th.pdfApi.getImageExtractAsPng(name, imageId, null, null, null,
                th.tempFolder);
        assertNotNull(response);
    }
}

