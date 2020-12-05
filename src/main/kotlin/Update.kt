import kotlinx.serialization.Serializable

@Serializable
class Update(
    val update_id: Int,
    val message: Message? = null
) {
}