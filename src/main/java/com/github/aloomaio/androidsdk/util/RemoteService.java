package com.github.aloomaio.androidsdk.util;

import android.content.Context;


import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public interface RemoteService {
    boolean isOnline(Context context);

    byte[] performRequest(String endpointUrl, List<NameValuePair> params, Map<String, String> headers)
            throws IOException;
}