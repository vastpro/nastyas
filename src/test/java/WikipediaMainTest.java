import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WikipediaMainTest {

    @Test
    public void openMainPage() {
        open("https://ru.wikipedia.org/");
        $x("//*[contains(text(), 'Создать статью')]").shouldBe(Condition.visible);
    }
}
