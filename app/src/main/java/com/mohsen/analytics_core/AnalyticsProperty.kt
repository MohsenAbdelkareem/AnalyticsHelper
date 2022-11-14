package com.mohsen.analytics_core

abstract class AnalyticsProperty(
    val propertyName: String,
    val params: Any,
    val providers: List<AnalyticsProvider> = listOf(
        AnalyticsProvider.ANALYTICS_FIREBASE
    )
)