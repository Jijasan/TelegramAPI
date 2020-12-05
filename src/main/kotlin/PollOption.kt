import kotlinx.serialization.Serializable

@Serializable
class PollOption(
    val text: String,
    val voter_count: Int
) {
}