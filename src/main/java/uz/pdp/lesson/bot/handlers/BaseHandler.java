package uz.pdp.lesson.bot.handlers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;
import uz.pdp.lesson.backend.model.MyUser;
import uz.pdp.lesson.backend.service.UserService;
import uz.pdp.lesson.bot.Bot;
import uz.pdp.lesson.bot.maker.MessageMaker;
import uz.pdp.lesson.bot.state.BaseState;
import uz.pdp.lesson.bot.state.child.MainState;

public abstract class BaseHandler {

protected MyUser curUser;
protected TelegramBot bot;
protected Update update;
protected UserService userService;
protected MessageMaker messageMaker;

    public BaseHandler() {
        this.messageMaker = new MessageMaker();
        this.userService = new UserService();
        this.update = new Update();
        this.curUser = new MyUser();
        this.bot = new TelegramBot(Bot.BOT_TOKEN);
    }
    public abstract void handle(Update update);


    protected MyUser getUserOrCreate(User from) {
        MyUser myUser = userService.get(from.id());
        if (myUser==null){
            myUser = MyUser.builder()
                    .id(from.id())
                    .username(from.username())
                    .baseState(BaseState.MAIN_STATE.name())
                    .state(MainState.REGISTER.name())
                    .firstname(from.firstName())
                    .lastname(from.lastName())
                    .build();
            userService.save(myUser);
        }
        return myUser;
    }
}
