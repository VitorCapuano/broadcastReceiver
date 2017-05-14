package com.example.vitor.broad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logar(View v){
        EditText login = (EditText) findViewById(R.id.editText);
        EditText senha = (EditText) findViewById(R.id.editText2);

        Intent i = new Intent();

        i.putExtra("login", login.getText());
        i.putExtra("senha", senha.getText());
        i.setAction("BANANA");
        sendBroadcast(i);
    }
}
