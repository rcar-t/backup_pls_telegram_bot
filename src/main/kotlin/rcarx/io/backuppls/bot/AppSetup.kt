package rcarx.io.backuppls.bot

import okhttp3.OkHttpClient
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppSetup {

    @Bean(value = ["okClient"])
    fun okClientHttp(
        @Value("\${hostname}") hostname: String,
        @Value("\${port}") port: String,
        @Value("\${username}") username: String,
        @Value("\${password}") password: String,
    ) = null

    @Bean(value=["telegramClient"])
    fun telegramClient(@Qualifier("\${okClient}") okClient: OkHttpClient, @Value("\${botToken}") botToken: String) = null
}