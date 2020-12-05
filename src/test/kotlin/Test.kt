import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

fun main() {
    val bot = Bot(System.getenv("token"))
    bot.onCommand("/menu") {msg, _ ->
        bot.sendMessage(msg.chat.id, "Succ")
    }
}

