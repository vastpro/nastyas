import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class LentaTest {

    @Test
    public void openProductPage(){
        Configuration.baseUrl = "https://lenta.com";
        open("/catalog/bezalkogolnye-napitki/");
        $(".catalog-page__title").shouldHave(Condition.text("Безалкогольные напитки"));
        ElementsCollection allProduct = $$(".sku-card-small-container");
        SelenideElement firstProduct = allProduct.first();
        String productName = firstProduct.find(".sku-card-small__title").getText();
        String productPriceInteger = firstProduct.find(".sku-price__integer").getText();
        String productPriceFraction = firstProduct.find(".sku-price__fraction").getText();
        firstProduct.click();
        $(".sku-page__title").shouldHave(Condition.text(productName));
        $(".sku-price__integer").shouldHave(Condition.text(productPriceInteger));
        $(".sku-price__fraction").shouldHave(Condition.text(productPriceFraction));




    }
}
