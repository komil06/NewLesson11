package uz.ictschool.newlesson11

import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


class MyBroadcast:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        if (BluetoothDevice.ACTION_ACL_CONNECTED == action) {
            Log.d("TAG"," Device is now Connected")
        } else if (BluetoothDevice.ACTION_ACL_DISCONNECTED == action) {
            Log.d("TAG"," Device is now DisConnected")
        }

    }

}