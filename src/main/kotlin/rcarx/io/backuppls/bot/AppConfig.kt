package rcarx.io.backuppls.bot

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("bot")
data class AppConfig(
    val token: String,
)
