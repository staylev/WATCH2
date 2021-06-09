package com.example.watch2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class password extends WearableActivity {

    Button btm1,btm2,btm3,btm4,btm5,btm6,btm7,btm8,btm9;

    int Final;
    int[] randomArray;
    String Finm="1234";
    String fres ="";
    int finalshet=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);

    btm1 = (Button) findViewById(R.id.bt1);
    btm2 = (Button) findViewById(R.id.bt2);
    btm3 = (Button) findViewById(R.id.bt3);
    btm4 = (Button) findViewById(R.id.bt4);
    btm5 = (Button) findViewById(R.id.bt5);
    btm6= (Button) findViewById(R.id.bt6);
    btm7 = (Button) findViewById(R.id.bt7);
    btm8 = (Button) findViewById(R.id.bt8);
    btm9 = (Button) findViewById(R.id.bt9);

    random();
    Text(btm1, randomArray[0]);
    Text(btm2, randomArray[1]);
    Text(btm3, randomArray[2]);
    Text(btm4, randomArray[3]);
    Text(btm5, randomArray[4]);
    Text(btm6, randomArray[5]);
    Text(btm7, randomArray[6]);
    Text(btm8, randomArray[7]);
    Text(btm9, randomArray[8]);


}


    public void onClick2(View v){
        switch (v.getId()){
            case R.id.bt1: Final = randomArray[0]; break;
            case R.id.bt2: Final = randomArray[1]; break;
            case R.id.bt3: Final = randomArray[2]; break;
            case R.id.bt4: Final = randomArray[3]; break;
            case R.id.bt5: Final = randomArray[4]; break;
            case R.id.bt6: Final = randomArray[5]; break;
            case R.id.bt7: Final = randomArray[6]; break;
            case R.id.bt8: Final = randomArray[7]; break;
            case R.id.bt9: Final = randomArray[8]; break;

        }
        random();
        Text(btm1, randomArray[0]);
        Text(btm2, randomArray[1]);
        Text(btm3, randomArray[2]);
        Text(btm4, randomArray[3]);
        Text(btm5, randomArray[4]);
        Text(btm6, randomArray[5]);
        Text(btm7, randomArray[6]);
        Text(btm8, randomArray[7]);
        Text(btm9, randomArray[8]);

        fres+=Final;
        if(Finm.equals(fres)){
            Intent intent =new Intent(this,timer.class);
            startActivity(intent);
        }
        if (finalshet == 4) {
            finalshet = 0;
            fres = "";
        }
        finalshet++;


    }

    @SuppressLint("NewApi")
    public  void  random(){
        final int N =9;
        ArrayList<Integer> arrayList = new ArrayList<>(N);
        Random random = new Random();

        while (arrayList.size()<N){
            int i = random.nextInt(N)+1;
            if(!arrayList.contains(i)){
                arrayList.add(i);
            }
        }
        randomArray=arrayList.stream().mapToInt(i->i).toArray();
    }
    public void Text(Button bt, int c){
        bt.setText(""+c);
    }

}
