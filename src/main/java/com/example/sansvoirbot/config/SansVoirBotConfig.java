package com.example.sansvoirbot.config;

import com.example.sansvoirbot.SansVoirBot;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class SansVoirBotConfig {
    private String botPath;
    private String botUsername;
    private String botToken;

    @Bean
    public SansVoirBot sansVoirBot() {
        return new SansVoirBot(botPath,botUsername,botToken);
    }
}
