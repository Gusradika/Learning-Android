package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class simpleCounterActivity extends AppCompatActivity implements View.OnClickListener {

        Button btnTambah, btnKurang;

        TextView tvValue;
        Integer value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);

//        value = 0;

//        Seperti halnya javascript dan HTML kita harus mendeklarasikan nya dulu dalam Constructor ini
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);


        tvValue = (TextView) findViewById(R.id.tvValue);

//        Setting onclick Listener ini adalah Essential untuk memberikan perintah bahwa Clickable
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnTambah:
                value++;
                Log.d("state","Nilai saat ini : " + value.toString());
                tvValue.setText(value.toString());
                break;
            case R.id.btnKurang:
                value--;
                Log.d("state", "Nilai saat ini : " + value.toString());
                tvValue.setText(value.toString());
                break;
        }
    }

    public void back(View v){
        Intent i = new Intent(this , MainActivity.class);
        i.putExtra("akses", "Kamu baru saja mengakses Simple Counter!");
        startActivity(i);
    }


}