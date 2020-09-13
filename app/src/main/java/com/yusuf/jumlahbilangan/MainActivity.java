package com.yusuf.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bilpertama;
    private EditText bilkedua;
    private EditText hasil;
    private Button btnhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bilpertama = (EditText) findViewById(R.id.bilpertama);
        bilkedua = (EditText) findViewById(R.id.bilkedua);
        hasil = (EditText) findViewById(R.id.hasil);
        btnhasil = (Button) findViewById(R.id.btnhasil);
    }

    private void initEvent(){
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void  hitungJumlah(){
        int angka1 = Integer.parseInt(bilpertama.getText().toString());
        int angka2 = Integer.parseInt(bilkedua.getText().toString());
        int total = angka1 + angka2;
        hasil.setText(total+"");
    }

}