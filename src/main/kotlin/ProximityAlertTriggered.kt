import kotlinx.serialization.Serializable

@Serializable
class ProximityAlertTriggered(
    val traveler: User,
    val watcher: User,
    val distance: Int
) {
}