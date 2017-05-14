package com.example.vitor.broad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Logado " + intent.getExtras().get("login") +
                " " + intent.getExtras().get("senha") , Toast.LENGTH_LONG).show();

    }
}
