import com.github.KS2003.telegramAPI.*

fun main() {
    val bot = Bot(System.getenv("token"))
    bot.onCommand("/menu") {msg, _ ->
        bot.sendMessage(msg.chat.id, "Succ")
    }
}

