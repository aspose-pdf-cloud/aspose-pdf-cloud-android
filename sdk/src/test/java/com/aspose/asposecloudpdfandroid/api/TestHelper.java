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
    public static String setupFile = "../../Settings/servercreds.json";

    class ApiCreds{
        public Boolean SelfHost = false;
        public String AppKey;
        public String AppSID;
        public String ProductUri;
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
        if (apiCreds.SelfHost) {
            pdfApi = new PdfApi(apiCreds.ProductUri);
        } else {
            pdfApi = new PdfApi(apiCreds.AppKey, apiCreds.AppSID);
        }
    }

    private TestHelper.ApiCreds getApiCreds() throws ApiException
    {
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(setupFile));
            TestHelper.ApiCreds creds = gson.fromJson(reader, TestHelper.ApiCreds.class);
            if (creds.SelfHost == null) {
                creds.SelfHost = false;
            }
            return creds;
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
