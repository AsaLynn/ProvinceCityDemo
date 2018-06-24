package com.think.province.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by think on 2018/1/5.
 */

public class EnterActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button btn1;
    protected Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_enter);
        initView();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn1) {
            startActivity(new Intent(this,MainActivity.class));
        } else if (view.getId() == R.id.btn2) {
            startActivity(new Intent(this,PopupDemoActivity.class));
        }
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(EnterActivity.this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(EnterActivity.this);
    }
}
