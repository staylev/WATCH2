package com.example.watch2;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.watch2.R;

public class login extends WearableActivity {

    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        user = (EditText)findViewById(R.id.user);
    }
    public  void  login(View view){
        if(user.getText().toString().equals(" "));{
            Toast.makeText(getApplicationContext(), "нет данных",Toast.LENGTH_SHORT).show();
        }

        if(user.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Вход выполнен", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( this,password.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "неправильные данные",Toast.LENGTH_SHORT).show();
        }
}
}