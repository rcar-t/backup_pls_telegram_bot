package rcarx.io.backuppls.bot

import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer
import org.telegram.telegrambots.meta.api.objects.Update

class TelegramBot: LongPollingSingleThreadUpdateConsumer{
    override fun consume(update: Update) {
        if (update.hasMessage() && update.message.hasText()) {
            println(update.message.text)
        }
    }
}
