package com.example.beerd;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Base64;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class APIManager {
    private static OkHttpClient client = new OkHttpClient();
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public static JSONObject getRequest(String urlPath) {
        Request request = new Request.Builder().url(urlPath).get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject getRequest(String urlPath, String token) {
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Bearer " + token)
                .get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject getRequest(String urlPath, String username, String password) {
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Basic " + Base64.getEncoder()
                        .encodeToString((username + ":" + password).getBytes()))
                .get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONArray getRequestArr(String urlPath) {
        Request request = new Request.Builder().url(urlPath).get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONArray(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONArray getRequestArr(String urlPath, String token) {
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Bearer " + token)
                .get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONArray(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONArray getRequestArr(String urlPath, String username, String password) {
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Basic " + Base64.getEncoder()
                        .encodeToString((username + ":" + password).getBytes()))
                .get().build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONArray(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject postRequest(String urlPath, JSONObject body) {
        RequestBody reqBody = RequestBody.create(JSON, body.toString());
        Request request = new Request.Builder().url(urlPath).post(reqBody).build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject postRequest(String urlPath, JSONObject body, String token) {
        RequestBody reqBody = RequestBody.create(JSON, body.toString());
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Bearer " + token).post(reqBody).build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONObject postRequest(String urlPath, JSONObject body, String username, String password) {
        RequestBody reqBody = RequestBody.create(JSON, body.toString());
        Request request = new Request.Builder().url(urlPath)
                .header("Authorization", "Basic " + Base64.getEncoder()
                        .encodeToString((username + ":" + password).getBytes()))
                .post(reqBody).build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) return null;
            String responseData = response.body().string();
            return new JSONObject(responseData);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
