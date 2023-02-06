package com.life.cycle.aware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN", "ACTIVITY - ON CREATE")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "ACTIVITY - ON PAUSE")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "ACTIVITY - ON RESUME")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "ACTIVITY - ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "ACTIVITY - ON DESTROY")
    }
}