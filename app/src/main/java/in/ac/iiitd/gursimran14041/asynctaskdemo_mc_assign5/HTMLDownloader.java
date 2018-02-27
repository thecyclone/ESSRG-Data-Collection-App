package in.ac.iiitd.gursimran14041.asynctaskdemo_mc_assign5;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Gursimran Singh on 10-11-2016.
 */

// Assignment Done Using HttpClient, HttpGet and HttpResponse (DEPRECATED)
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class HTMLDownloader extends AsyncTask<String, String, String> {

    private Exception exception;
    public HttpURLConnection urlConnection;
    public static int current;
    public static int prev;
    public static MainActivity mainActivity;
    HTMLDownloader(){
        this.current = 0;
        this.prev = 0;
    }
    protected String doInBackground(String... urls) {
        URL url = null;
        try {
            url = new URL(urls[0]);
            Log.d(urls[0], "doInBackground: ");
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {//process the line response}
                Log.d(line, "doInBackground: ");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }

    protected void onPostExecute(String htmlResponse) {
//        mainActivity.asyncHTMLDownloaderCallback(htmlResponse);
    }
}
