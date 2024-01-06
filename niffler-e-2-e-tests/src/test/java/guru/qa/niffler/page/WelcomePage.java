package guru.qa.niffler.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WelcomePage {

    private final SelenideElement loginButton = $("a[href*='redirect']");

    public void clickLoginButton() {
        loginButton.click();
    }
}
