package com.example.sansvoirbot.controllers;

import com.example.sansvoirbot.SansVoirBot;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebHookController {
    private final SansVoirBot sansVoirBot;

    public WebHookController (SansVoirBot sansVoirBot) {
        this.sansVoirBot = sansVoirBot;
    }

    @PostMapping
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return sansVoirBot.onWebhookUpdateReceived(update);
    }

}
