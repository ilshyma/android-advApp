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
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    AlarmManager alarmManager;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//

    AlarmStuff as;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as = new AlarmStuff();
        as.setRepeatingAlarm(MainActivity.this, 20000);
//            initializeUi();
//        }
//
//    private void initializeUi() {
//        (findViewById(R.id.btn_setAlarm)).setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                as.setOnetimeTimer(MainActivity.this, 5000);
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_settings:
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

    }
}

//  WebView browser=(WebView)findViewById(R.id.webBrowser);
//        browser.loadUrl("http://ya.com");
//        Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(intent);
//        TelephonyManager mTelephonyMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//
//        EditText textView2 = (EditText)findViewById(R.id.editText4);
//        textView2.setText("my Country: " +   mTelephonyMgr.getSimCountryIso() + ", operator: " +  mTelephonyMgr.getNetworkOperatorName());

//        TelephonyManager tMgr = (TelephonyManager)mAppContext.getSystemService(Context.TELEPHONY_SERVICE);
//        String mPhoneNumber = tMgr.getLine1Number();
//    }

//}
