import kotlinx.serialization.Serializable

@Serializable
class InlineKeyboardMarkup(
    val inline_keyboard: List<List<InlineKeyboardButton>>
) {
}