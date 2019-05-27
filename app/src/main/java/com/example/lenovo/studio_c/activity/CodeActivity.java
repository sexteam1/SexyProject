package com.example.lenovo.studio_c.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lenovo.studio_c.R;
import com.example.lenovo.studio_c.bean.CodeResult;

import java.io.Serializable;

public class CodeActivity extends AppCompatActivity {

    private ImageView iv;
    private EditText edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private CodeResult extra;
    private String num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        Intent intent = getIntent();
        extra = (CodeResult) intent.getSerializableExtra("9874");
        num = extra.getNum();
        initView();
    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        edit4 = (EditText) findViewById(R.id.edit4);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CodeActivity.this,num, Toast.LENGTH_SHORT).show();
            }
        });
        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ed1 = edit1.getText().toString();
                String ed2 = edit2.getText().toString();
                String ed3 = edit3.getText().toString();
                String ed4 = edit4.getText().toString();

                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(ed1);
                stringBuffer.append(ed2);
                stringBuffer.append(ed3);
                stringBuffer.append(ed4);

                String string = stringBuffer.toString();
                Toast.makeText(CodeActivity.this, string, Toast.LENGTH_SHORT).show();
                if (string.equals(num)){
                    Intent intent = new Intent(CodeActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
