/*
package uz.pdp.lesson.bot;*/
package uz.pdp.lesson.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.ChatMemberUpdated;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import uz.pdp.lesson.bot.manager.UpdateManager;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bot {

    protected TelegramBot bot;

    public static final String BOT_TOKEN = "7179007441:AAEtUjFIQcNBPK9-dGdQvwXJcvZpClhQX08";
    static final ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    static ThreadLocal<UpdateManager> updateeHandler = ThreadLocal.withInitial(UpdateManager::new);

    public static void main(String[] args) {
        TelegramBot bot = new TelegramBot(BOT_TOKEN);

    }
}
