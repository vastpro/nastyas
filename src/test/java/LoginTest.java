

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class LoginTest {

    @Test
    public void login() {
        open("https://yandex.ru/");
        System.out.println(title());
    }
}
