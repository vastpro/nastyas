import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @Test
    public void login() {
        open("https://yandex.ru/");
    }
}
