package rcarx.io.backuppls.bot

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication

@Component
class BotRunner(private val config: AppConfig): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {

        val botsApplication = TelegramBotsLongPollingApplication()
        botsApplication.registerBot(
            config.token,
            TelegramBot()
        )
    }
}