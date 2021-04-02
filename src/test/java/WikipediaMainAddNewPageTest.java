import com.codeborne.selenide.Condition;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.*;

public class WikipediaMainAddNewPageTest {

    @Test
    public void openMainPage() {
        open("https://ru.wikipedia.org/");
        $x("//*[contains(text(), 'Создать статью')]").shouldBe(Condition.visible);
    }

    @Test
    public void addNewPage(){
        open("https://ru.wikipedia.org/");
        $x("//*[contains(text(), 'Создать статью')]").shouldBe(Condition.visible);
        $x("//*[contains(text(), 'Создать статью')]").click();
        $(".firstHeading").shouldHave(Condition.text("Википедия:Мастер статей"));
    }

    @Test
    public void openArticle(){
        open("https://ru.wikipedia.org/wiki/Одюбон,_Джон_Джеймс");
        $(".firstHeading").shouldHave(Condition.text("Одюбон, Джон Джеймс"));
    }
}
