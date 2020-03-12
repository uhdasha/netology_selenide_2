package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestingBankService {
	@DisplayName("This we send form request")
    @Tes
    public void send_form()
    {
        open("http://127.0.0.1:9999");
        $("[name='name']").setValue("Петр Первый");
        $("[name='phone']").setValue("+79518828046");
        $("[data-test-id='agreement']").click();
        $(".button_view_extra").click();

        $("[data-test-id='order-success']").shouldHave(text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}
