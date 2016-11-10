/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivity";
    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


    }

    /**
     * Called after your activity has been stopped, just prior to it being started again.
     * Always followed by onStart()
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }


    /**
     * Called when the activity is becoming visible to the user.
     * Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    /**
     * Called when the activity will start interacting with the user.
     * Always followed by onPause().
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume: " );
    }

    /**
     * Called when the system is about to start resuming a previous activity.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: " );
    }

    /**
     * Called when the activity is no longer visible to the user.
     * Followed by either onRestart() if this activity is coming back to interact with the user, or onDestroy() if this activity is going away.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onPause: " );

    }

    /**
     * The final call you receive before your activity is destroyed.
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }







    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.family);
        TextView textViewColors = (TextView) findViewById(R.id.colors);
        TextView miwok = (TextView) findViewById(R.id.miwok);
        textView.setOnClickListener(this);
        textViewColors.setOnClickListener(this);
        miwok.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.family:
                Intent intent = new Intent(this, FamilyActivty.class);
                startActivity(intent);
                break;
            case R.id.colors:
                Intent colors = new Intent(this, ColorsActivity.class);
                startActivity(colors);
            case R.id.miwok:

                break;


        }

    }
}
