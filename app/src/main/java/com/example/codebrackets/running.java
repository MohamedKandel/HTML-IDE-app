package com.example.codebrackets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class running extends AppCompatActivity {
    WebView wv;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
        foundation();
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadData(myVar.str_code,"text/html ; charset = UTF-8",null);
    }

    protected void foundation() {
        wv = findViewById(R.id.web);
        btn_back = findViewById(R.id.btn_back);
    }

}