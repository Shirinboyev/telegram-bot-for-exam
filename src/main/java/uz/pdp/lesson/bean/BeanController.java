package uz.pdp.lesson.bean;

import uz.pdp.lesson.backend.service.CurrencyService;
import uz.pdp.lesson.backend.service.UserService;

public interface BeanController {
    ThreadLocal<UserService> userService = ThreadLocal.withInitial(UserService::new);
    ThreadLocal<CurrencyService> currencyServiceByThreadLocal = ThreadLocal.withInitial(CurrencyService::new);
ThreadLocal<UserService> userServiceByThreadLocal = ThreadLocal.withInitial(UserService::new);
}
