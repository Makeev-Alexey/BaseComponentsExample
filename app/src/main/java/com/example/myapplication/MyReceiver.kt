package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MyReceiver : BroadcastReceiver() {
/*
Ресиверы получают информацию извне и обрабатывают ее, используются везде,где нужно реагировать на внешние события
 */
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val airPlaneMode = intent.getBooleanExtra("state", false) ?: return
        if (airPlaneMode)
            Toast.makeText(context, "AirplaneMode Enabled", LENGTH_LONG).show()
        else
            Toast.makeText(context, "AirplaneModeOFF", LENGTH_LONG).show()
    }
}