package com.example.samjones.dbapp;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String,Void,Void>
{
  Context context;
  AlertDialog alertDialog;
  BackgroundWorker (Context ctx)
  {
      context = ctx;
  }
    @Override
    protected Void doInBackground(String... parms) {
      String type=parms[0];
      String login_url = "samjc310.000webhostapp.com/login.php/";
      if (true)
      {
          try {
              String user_name=parms[1];
              String password=parms[2];
              URL url=new URL(login_url);
              HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
              httpURLConnection.setRequestMethod("POST");
              httpURLConnection.setDoOutput(true);
              httpURLConnection.setDoInput(true);
              OutputStream outputStream=httpURLConnection.getOutputStream();
              BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(outputStream,"UTF-8"));
              String post_data= URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+
                      URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
            bufferedWriter.write(post_data);
            bufferedWriter.flush();
            bufferedWriter.close();
          httpURLConnection.disconnect();
          } catch (MalformedURLException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
        return null;
    }
    @Override
    protected void onPreExecute(){
        super.onPreExecute();

    }
    @Override
    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);
    }
    @Override
    protected void onProgressUpdate(Void... values){
        super.onProgressUpdate(values);
    }
}
