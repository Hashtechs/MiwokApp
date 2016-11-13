package com.example.android.miwok.activites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.miwok.R;

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

        Log.d(TAG, "onCreate: ");
        Log.e(TAG, "_________________________________");
    }

    private void initViews() {
        TextView textViewFamily  = (TextView) findViewById(R.id.family);
        TextView textViewColors  = (TextView) findViewById(R.id.colors);
        TextView textViewNumber  = (TextView) findViewById(R.id.numbers);
        TextView textViewPhrases = (TextView) findViewById(R.id.phrases);
        TextView textViewMiwok   = (TextView) findViewById(R.id.miwok);

        textViewFamily .setOnClickListener(this);
        textViewColors .setOnClickListener(this);
        textViewNumber .setOnClickListener(this);
        textViewPhrases.setOnClickListener(this);
        textViewMiwok  .setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.family:
                goToActivity(this, FamilyActivity.class);
                break;
            case R.id.colors:
                goToActivity(this, ColorsActivity.class);
                break;
            case R.id.phrases:
                goToActivity(this, PhrasesActivity.class);
                break;
            case R.id.numbers:
                goToActivity(this, NumbersActivity.class);
                break;
            case R.id.miwok:
                openBrowser();
                break;


        }

    }

    /**
     * open system Browser using Implicit Intent
     */
    private void openBrowser() {
//        https://www.google.jo/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&ved=0ahUKEwiZttWCqZrQAhVCJsAKHbTlBaYQFggbMAA&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FMiwok&usg=AFQjCNHm7r5tzD5tsk4qLBO-_r4oy_C54Q&sig2=OSeXrNhjNAyekO-0WcJRhg&cad=rjt

    }

    /**
     * method to start another activity
     * @param context
     * @param nextActivity
     */
    private void goToActivity(Context context, Class<?> nextActivity) {
        Intent intent = new Intent(this, nextActivity);
        startActivity(intent);
    }


    /**
     * Called after your activity has been stopped, just prior to it being started again.
     * Always followed by onStart()
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
        Log.e(TAG, "_________________________________");

    }


    /**
     * Called when the activity is becoming visible to the user.
     * Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
        Log.e(TAG, "_________________________________");

    }

    /**
     * Called when the activity will start interacting with the user.
     * Always followed by onPause().
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume: ");
        Log.e(TAG, "_________________________________");

    }

    /**
     * Called when the system is about to start resuming a previous activity.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
        Log.e(TAG, "_________________________________");

    }

    /**
     * Called when the activity is no longer visible to the user.
     * Followed by either onRestart() if this activity is coming back to interact with the user, or onDestroy() if this activity is going away.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop: ");
        Log.e(TAG, "_________________________________");


    }

    /**
     * The final call you receive before your activity is destroyed.
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
        Log.e(TAG, "_________________________________");
    }

}
