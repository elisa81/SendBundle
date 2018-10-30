package com.jmj.edu.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        ((TextView) findViewById(R.id.textViewResult)).setText(bundle.getString("BundleName", "No Data"));

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        String text = ((TextView)findViewById(R.id.textView2)).getText().toString();
        String text1 = ((Button)findViewById(R.id.button2)).getText().toString();

        Bundle bundle1 = new Bundle();
        bundle1.putString("BundleName2", "TextView2 Value: " + text + " \n Button2 Info: " + text1);
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtras(bundle1);
        startActivity(intent);
    }
}