package com.example.jcdamo.joettedamoad340hwk2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DemoInitialApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Wire up the button to do stuff
        //..get the button
        Button btn = (Button) findViewById(R.id.btnDoMagic);
       //..set what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"This is a magic log message!");
                Toast.makeText(getApplicationContext(),"It's magic", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
