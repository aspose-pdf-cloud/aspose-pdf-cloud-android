package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.FilesUploadResult;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import io.swagger.annotations.Api;

public class TestHelper {
    public static PdfApi pdfApi;
    public static String tempFolder = "TempPdfCloud";
    public static String testDataFolder = "testData";
    public static String setupFile = "setup.json";

    class ApiCreds{
        public String app_key;
        public String app_sid;
        public String product_uri;
    }

    private static TestHelper instance;
    public static TestHelper getInstance() throws ApiException
    {
        if (instance == null)
        {
            instance = new TestHelper();
        }
        return instance;
    }

    private TestHelper() throws ApiException
    {
        TestHelper.ApiCreds apiCreds = getApiCreds();
        pdfApi = new PdfApi(apiCreds.app_key, apiCreds.app_sid);
        pdfApi.getApiClient().setBasePath(apiCreds.product_uri);
    }

    private TestHelper.ApiCreds getApiCreds() throws ApiException
    {
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(setupFile));
            return gson.fromJson(reader, TestHelper.ApiCreds.class);
        }
        catch (FileNotFoundException ex){
            throw new ApiException(ex.getMessage());
        }
    }


    public void uploadFile(String name) throws ApiException
    {
        File file = new File(testDataFolder + "/" + name);
        FilesUploadResult response = pdfApi.uploadFile(tempFolder + '/' + name, file, null);
    }
}
