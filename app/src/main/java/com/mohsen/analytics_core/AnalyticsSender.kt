package com.mohsen.analytics_core

import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import timber.log.Timber
import javax.inject.Inject

class AnalyticsSender @Inject constructor(
    private val firebaseAnalytics: FirebaseAnalytics,
) {
    fun sendEvent(event: AnalyticsEvent) {

        if (event.providers.contains(AnalyticsProvider.ANALYTICS_FIREBASE)) {
            firebaseAnalytics.logEvent(
                event.eventName,
                bundleOf(*event.params.toList().toTypedArray())
            )
        }
        Timber.tag("ArchAnalytics")
            .d("Event was sent: ${event.eventName}. Params: ${event.params}. Providers: ${event.providers}")
    }

    fun setUserProperty(property: AnalyticsProperty) {

        if (property.providers.contains(AnalyticsProvider.ANALYTICS_FIREBASE)) {
            firebaseAnalytics.setUserProperty(
                property.propertyName,
                property.params.toString()
            )
        }
    }
}