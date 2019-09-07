package com.example.student.module2_bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnDN, btnThoat;
    EditText edtTK, edtMK;
    CheckBox ckLuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDN = (Button) findViewById(R.id.btn_dn);
        btnThoat = (Button)findViewById(R.id.btn_Thoat);
        edtMK = (EditText)findViewById(R.id.edt_mk);
        edtTK = (EditText) findViewById(R.id.edt_tk);
        ckLuu = (CheckBox)findViewById(R.id.cb_Luu);

        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
