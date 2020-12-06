import kotlinx.serialization.Serializable

@Serializable
class MessageEntity(
    val type: Type,
    val offset: Int,
    val length: Int,
    val url: String? = null,
    val user: User? = null,
    val language: String? = null
) {

    enum class Type{
        mention,
        hashtag,
        cashtag,
        bot_command,
        url,
        email,
        phone_number,
        bold,
        italic,
        underline,
        strikethrough,
        code,
        pre,
        text_link,
        text_mention
    }

}