/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONObject;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
/**
/**
 *
 * @author Popsan
 */
public class callApi {
        public static void main (String [] args){
            System.out.print(Response("1"));
        }
       public static String Response(String status){
        try {
            int s = parseInt(status);
            OkHttpClient client = new OkHttpClient().newBuilder()
                        .build();
            String url = "";
            String method = "";
            switch(s) {
                case 1:
                    url = "https://opend.data.go.th/get-ckan/datastore_search?resource_id=4dfd7aad-c2d7-4975-9bee-6e0095a22d02&limit=3";
                    method = "GET";
                    break;
                case 2:
                    url = "https://opend.data.go.th/get-ckan/datastore_search?resource_id=84e08de3-349b-4131-bc6a-9c0b1097b552&limit=3";
                    method = "GET";
                    break;
            }
                    Request request = new Request.Builder()
                        .url(url)
                        .method(method, null)
                        .addHeader("api-key", "Dkk9VHcGE1vYqa60308W5IX6NawokuUc")
                        .build();
                        Response response = client.newCall(request).execute();
                        String result = response.body().string().toString();
                        String records = result;
                        JSONObject json = new JSONObject(records);
                        System.out.println("============================");
                        System.out.println("=>" + result);
                        System.out.println("=>" + json);
                        System.out.println("============================");

//                        JSONArray data = new JSONArray(json.getJSONObject("result").getJSONArray("records")); 
                        return json.toString(4);
        }
        catch (Exception e){
            return "Error: " + e;
        }
    }
}