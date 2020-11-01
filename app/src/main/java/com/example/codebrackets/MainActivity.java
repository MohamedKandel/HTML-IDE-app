package com.example.codebrackets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt_code;
    Button btn_new;
    Button btn_run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*txt_code = findViewById(R.id.txt_code);
        btn_new = findViewById(R.id.btn_new);
        btn_run = findViewById(R.id.btn_run);*/
        foundation();
        final Intent in = new Intent(this,running.class);

        final String html = "" +
                "<html>\n" +
                "   <head>\n" +
                "       <style>\n" +
                "       </style>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "   </body>\n" +
                "</html>";
        txt_code.setText(html);

        btn_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myVar.str_code = txt_code.getText() + "";
                startActivity(in);
            }
        });

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_code.setText(html);
                //txt_code.setHint("Write your code here");
                myVar.str_code = txt_code.getText()+"";
            }
        });
    }
    protected void foundation() {
        txt_code = findViewById(R.id.txt_code);
        btn_new = findViewById(R.id.btn_new);
        btn_run = findViewById(R.id.btn_run);
    }
}