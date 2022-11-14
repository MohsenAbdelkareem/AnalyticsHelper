package com.mohsen.analytics_core.properties

import com.mohsen.analytics_core.AnalyticsProperty

class NotificationProperty(
    state: Boolean
): AnalyticsProperty(
    com.mohsen.constants.AnalyticsConstants.UserProperties.NOTIFICATION_STATE,
    state
)