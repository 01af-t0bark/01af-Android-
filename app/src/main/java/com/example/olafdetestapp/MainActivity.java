package com.example.olafdetestapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.Button_1);
        button1.setOnClickListener(view -> Toast.makeText(MainActivity.this,"哈哈哈，并没有什么用", Toast.LENGTH_LONG).show());
        Button button2 = findViewById(R.id.Button_2);
        button2.setOnClickListener(view -> finish());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过item.getItemId()对不同选项进行不同的处理
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(MainActivity.this, "没得添加。", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(MainActivity.this, "也没有什么可以，移除。", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
        return true;
    }
}
