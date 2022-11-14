package com.mohsen.analytics_core.events

import com.mohsen.analytics_core.AnalyticsEvent

class SendClicked(
    timeBetweenClicks: Long
) : AnalyticsEvent(
    com.mohsen.constants.AnalyticsConstants.Events.SendClicked.EVENT,
    mapOf(com.mohsen.constants.AnalyticsConstants.Events.SendClicked.Params.TIME_BETWEEN_CLICKS to timeBetweenClicks)
)