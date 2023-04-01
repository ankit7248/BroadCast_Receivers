package com.example.broadcast_receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

// Dynamic Broadcast Receiver

class Airplane_Mode_Changed_Receiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        if (isAirplaneModeEnabled) {
            Toast.makeText(context, " Airplane Mode enabled ", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, " Airplane Mode disabled ", Toast.LENGTH_SHORT).show()
        }
    }
}