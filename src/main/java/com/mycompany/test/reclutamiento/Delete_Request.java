/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.reclutamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
/**
 *
 * @author HP
 */
public class Delete_Request {
    
    public void CreateProduct(String idProducto) throws ClientProtocolException, IOException {

        String putEndpoint = "https://iitd7euw75.execute-api.us-east-1.amazonaws.com/services/products/createProduct";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = new HttpRequest(putEndpoint)
            .newBuilder()
            .DELETE()
            .uri(URI.create(URL))
            .build();
         

        StringEntity stringEntity = new StringEntity(inputJson);
        httpPut.setEntity(stringEntity);
        System.out.println("Executing request " + httpRequest.getRequestLine());

        HttpResponse response = httpclient.execute(httpRequest);

        BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

        //Throw runtime exception if status code isn't 200 
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
        }else{
            System.out.println("EXITO");
        }       

    }
     
}
