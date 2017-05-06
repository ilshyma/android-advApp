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


        Random randomGenerator = new Random();
        List<String> urlList = new ArrayList<>(5);
        urlList.add("https://comfy.ua");
        urlList.add("http://allo.ua/");
        urlList.add("https://eldorado.ua/");
        urlList.add("http://gorod.dp.ua/");
        urlList.add("http://www.i.ua/");

        Uri uri = Uri.parse(urlList.get(randomGenerator.nextInt(urlList.size())));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}