package com.mohsen.analytics_core

abstract class AnalyticsEvent(
    val eventName: String,
    val params: Map<String, Any> = mapOf(),
    val providers: List<AnalyticsProvider> = listOf( // the list of supported providers for this event. By default, we can send this event to all analytics providers
        AnalyticsProvider.ANALYTICS_FIREBASE
    )
)