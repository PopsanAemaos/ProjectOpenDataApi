/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/**
 *
 * @author Popsan
 */
public class helloworld {
        public static void main (String [] args){
            System.out.print(Response("1"));
        }
       public static String Response(String status){
        try {
        OkHttpClient client = new OkHttpClient().newBuilder()
          .build();
        Request request = new Request.Builder()
          .url("https://opend.data.go.th/get-ckan/datastore_search?resource_id=4dfd7aad-c2d7-4975-9bee-6e0095a22d02&limit=5")
          .method("GET", null)
          .addHeader("api-key", "Dkk9VHcGE1vYqa60308W5IX6NawokuUc")
          .build();
        Response response = client.newCall(request).execute();
        JSONObject json = new JSONObject(response.body().string().toString());
        System.out.println("============================");
        System.out.println("=>" + response.body().string().toString());
        System.out.print(json);
        System.out.println("============================");
        return response.toString();
        }
        catch (Exception e){
            return "Error: " + e;
        }
    }
  
    
}
