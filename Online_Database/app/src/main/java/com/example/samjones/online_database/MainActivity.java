package com.example.samjones.online_database;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button B1,B2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1= (Button) findViewById(R.id.b1);
        B2= (Button) findViewById(R.id.b2);
        textView = (TextView) findViewById(R.id.textView);
        ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo= connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
        {
            textView.setVisibility(View.INVISIBLE);

        }
        else{

            B1.setEnabled(false);
            B2.setEnabled(false);
        }


    }
    public void addContact(View view)
    {
       startActivity(new Intent(this,Addinfo.class));
    }
}
