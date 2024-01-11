package uz.ictschool.newlesson11

import android.bluetooth.BluetoothDevice
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uz.ictschool.newlesson11.ui.theme.NewLesson11Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewLesson11Theme {
                val myBroadcast = MyBroadcast()
                val filter = IntentFilter()
                filter.addAction(BluetoothDevice.ACTION_ACL_CONNECTED)
                filter.addAction(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)
                filter.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
                registerReceiver(myBroadcast, filter)
            }
        }
    }
}

