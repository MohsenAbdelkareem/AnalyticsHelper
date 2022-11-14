package com.mohsen.analytics_core.events

import com.mohsen.analytics_core.AnalyticsEvent
import com.mohsen.analytics_core.AnalyticsProvider
import com.mohsen.constants.AnalyticsConstants

class Navigated(
    from: NavigatedSource,
    to: NavigatedSource
) : AnalyticsEvent(
    AnalyticsConstants.Events.Navigated.EVENT,
    mapOf(
        AnalyticsConstants.Events.Navigated.Params.FROM to from.toConstant(),
        AnalyticsConstants.Events.Navigated.Params.TO to to.toConstant()
    ),
    listOf(AnalyticsProvider.ANALYTICS_FIREBASE)
) {

    enum class NavigatedSource {
        HOME,
        SETTINGS;

        fun toConstant(): String =
            when (this) {
                HOME -> AnalyticsConstants.Events.NavigationSource.HOME
                SETTINGS -> AnalyticsConstants.Events.NavigationSource.SETTINGS
            }
    }
}