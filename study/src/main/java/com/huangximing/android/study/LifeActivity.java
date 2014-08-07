package com.huangximing.android.study;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class LifeActivity extends ActionBarActivity {
    private String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.w(TAG, "TaskId:" + this.getTaskId());
    }

    protected void onStart(){
        super.onStart();
        Log.w(TAG, "onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.w(TAG, "onResume");
    }

    protected void onPause(){
        super.onPause();
        Log.w(TAG, "onPause");
    }

    protected void onStop(){
        super.onStop();
        Log.w(TAG, "onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w(TAG, "onDestroy");
    }

    protected void onNewIntent(){
        Log.w(TAG, "onNewIntent");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
