import kotlinx.serialization.Serializable

@Serializable
class Game(
    val title: String,
    val description: String,
    val photo: List<PhotoSize>,
    val text: String? = null,
    val text_entities: List<MessageEntity>,
    val animation: Animation? = null
) {
}