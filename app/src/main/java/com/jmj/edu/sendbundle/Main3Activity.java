package com.jmj.edu.sendbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle1 = getIntent().getExtras();
        ((TextView) findViewById(R.id.textViewResult1)).setText(bundle1.getString("BundleName2", "No Data"));

    }

}
