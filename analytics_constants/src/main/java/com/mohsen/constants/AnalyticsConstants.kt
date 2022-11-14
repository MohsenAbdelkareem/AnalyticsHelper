package com.mohsen.constants

object AnalyticsConstants {
    object Events {
        object FirstLaunch {
            const val EVENT = "first_launch"
        }

        object Navigated {
            const val EVENT = "navigated"

            object Params {
                const val FROM = "from"
                const val TO = "to"
            }
        }

        object NavigationSource {
            const val HOME = "home"
            const val SETTINGS = "settings"
        }

        object SendClicked {
            const val EVENT = "send_clicked"

            object Params {
                const val TIME_BETWEEN_CLICKS = "time_between_clicks"
            }
        }
    }

    object UserProperties {
        const val NOTIFICATION_STATE = "notification_state"
    }
}