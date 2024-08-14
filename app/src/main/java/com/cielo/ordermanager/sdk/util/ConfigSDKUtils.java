package com.cielo.ordermanager.sdk.util;

import android.content.Context;

import com.cielo.ordermanager.sdk.BuildConfig;

import cielo.orders.domain.Credentials;
import cielo.sdk.order.OrderManager;

public class ConfigSDKUtils {
    public static final String TAG = "ConfigSDKUtils";

    public static OrderManager configSDK(Context context) {
        Credentials credentials = new Credentials(BuildConfig.CLIENT_ID, BuildConfig.ACCESS_TOKEN);
        return new OrderManager(credentials, context);
    }
}
