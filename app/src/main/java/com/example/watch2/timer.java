package com.example.watch2;

import android.annotation.SuppressLint;
import android.media.TimedText;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class timer extends WearableActivity {

    private TextView countText;
    private Chronometer chronometer;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);


        chronometer =findViewById(R.id.chronometer);
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                long milils = SystemClock.elapsedRealtime() -chronometer.getBase();
                if(milils>5000){
                    String str ="jjk";
                    Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void start(View v){
        chronometer.start();
    }
    public  void  stop(View v){
        chronometer.stop();
    }

}
