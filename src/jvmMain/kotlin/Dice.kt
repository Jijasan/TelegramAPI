import kotlinx.serialization.Serializable

@Serializable
class Dice(
    val emoji: String,
    val value: Int
) {
}