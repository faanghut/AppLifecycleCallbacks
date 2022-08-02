package com.faanghut.lifecyclecallbacks

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class AppLifeCycleListener: DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Log.i("AppLifeCycleListener", "App Came to Foreground")
        // Add custom logic for app open here.
        super.onCreate(owner)
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.i("AppLifeCycleListener", "App Went to Background")
        // Add custom logic for app close here. For example, saving data, etc.
        super.onStop(owner)
    }
}