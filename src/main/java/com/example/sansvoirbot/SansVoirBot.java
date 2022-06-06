package com.example.sansvoirbot;

import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class SansVoirBot extends TelegramWebhookBot {

    private final String botPath;
    private final String botUsername;
    private final String botToken;

    public SansVoirBot(String botPath, String botUsername, String botToken) {
        this.botPath = botPath;
        this.botUsername = botUsername;
        this.botToken = botToken;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        if (update.getMessage() == null || !update.getMessage().hasText()) return null;

        return new SendMessage(update.getMessage().getChatId().toString(), "Prepare to die!!");
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return botPath;
    }
}
