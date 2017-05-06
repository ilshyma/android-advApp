package com.example.asti.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by asti on 06.05.2017.
 */
public class AutoStart extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            // set the alarm again :)
        }
    }

}
