package com.jmj.edu.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TextView textView = (TextView) findViewById(R.id.textView);
        String text = ((TextView)findViewById(R.id.textView)).getText().toString();
        String text1 = ((Button) v).getText().toString();


        Bundle bundle = new Bundle();
        bundle.putString("BundleName", "TextView Value: " + text + " \n Button Info: " + text1);
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }

}