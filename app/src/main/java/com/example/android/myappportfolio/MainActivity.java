package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    Toast toast;
    public void showToast(View view) {
        int id = view.getId();
        if(R.id.FirstApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer App", Toast.LENGTH_SHORT);
        }

        else if(R.id.SecondApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch SuperDuo:Football Scores App", Toast.LENGTH_SHORT);
        }

        else if(R.id.ThirdApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch SuperDuo:Library App", Toast.LENGTH_SHORT);
        }

        else if(R.id.FourthApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch Build It Bigger App", Toast.LENGTH_SHORT);
        }

        else if(R.id.FifthApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader App", Toast.LENGTH_SHORT);
        }

        else if(R.id.DreamApp == id) {
            toast = Toast.makeText(getApplicationContext(), "This button will launch Capstone App", Toast.LENGTH_SHORT);
        }

        toast.show();


    }
}
