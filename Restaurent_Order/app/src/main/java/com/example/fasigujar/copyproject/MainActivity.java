package com.example.fasigujar.copyproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static int splashTime=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

                finish();
            }
        },splashTime);

    }
  /*  public void onClick (View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }*/
}
