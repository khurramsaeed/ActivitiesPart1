package com.ksm.activitiespart1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Oprettet af Khurram Saeed Malik on 23/09/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //tag = getClass().getName(); eller (Så får man ikke package path med i consol):
        tag = getClass().getSimpleName();
        Log.e(tag, "-- onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(tag, "-- onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(tag, "-- onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(tag, "-- onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(tag, "-- onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(tag, "-- onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(tag, "-- onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.e(tag, "-- onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(tag, "-- onRestoreInstanceState");
    }
}
