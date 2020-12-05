import kotlinx.serialization.Serializable

@Serializable
class ChatLocation(
    val location: Location,
    val address: String
) {
}