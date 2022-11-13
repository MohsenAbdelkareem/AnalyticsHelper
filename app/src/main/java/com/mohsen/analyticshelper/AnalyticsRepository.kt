package com.mohsen.analyticshelper

import android.os.Bundle
import com.mohsen.analyticshelper.dummy.FacebookAnalyticsDummy
import com.mohsen.analyticshelper.dummy.FirebaseAnalyticsDummy

class AnalyticsRepository(
    private val firebaseAnalyticsDummy: FirebaseAnalyticsDummy,
    private val facebookAnalyticsDummy: FacebookAnalyticsDummy
) {

    fun sendEvent(eventName: String, event: Bundle) {
        firebaseAnalyticsDummy.sendEvent(eventName, event)
        facebookAnalyticsDummy.sendEvent(eventName, event)
    }
}