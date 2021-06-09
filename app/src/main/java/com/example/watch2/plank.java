package com.example.watch2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class plank extends WearableActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plank);
    }
    public void onClik4(){
        Intent intent =  new Intent(this,timer.class);
        startActivity(intent);
    }
}
