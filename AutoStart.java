package com.example.asti.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by asti on 06.05.2017.
 */
public class AutoStart extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("AutoStart", "receive autoStart task!");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Log.i("AutoStart", "if = true...");
            Intent i = new Intent(context, AlarmActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            Log.i("AutoStart", "start activity...");
        }
    }

}
