package com.muchoki.carol.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button mLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin=(Button) findViewById(R.id.btnLogin);
    }

    public void doIt(View view) {
        Toast.makeText(getApplicationContext(), "Hello welcome to ALC", Toast.LENGTH_LONG).show();
    }
}
