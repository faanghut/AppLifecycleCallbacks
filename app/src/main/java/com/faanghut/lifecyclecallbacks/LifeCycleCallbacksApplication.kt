package com.faanghut.lifecyclecallbacks

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class LifeCycleCallbacksApplication: Application() {

    override fun onCreate() {
        ProcessLifecycleOwner.get().lifecycle.addObserver( AppLifeCycleListener())
        super.onCreate()
    }

}