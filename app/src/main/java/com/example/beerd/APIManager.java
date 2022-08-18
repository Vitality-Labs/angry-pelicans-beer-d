package com.example.beerd;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class APIManager {
    private static OkHttpClient client = new OkHttpClient();
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
}
