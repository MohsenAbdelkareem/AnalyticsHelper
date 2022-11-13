package com.mohsen.analyticshelper.dummy

import android.os.Bundle
import timber.log.Timber

class FirebaseAnalyticsDummy {

    fun sendEvent(eventName: String, event: Bundle){
        Timber.d("Event : $eventName $event")
    }
}