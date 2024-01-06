package guru.qa.niffler.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final ElementsCollection spendingRows = $(".spendings-table tbody").$$("tr");
    private final SelenideElement deleteSelectedButton = $(byText("Delete selected"));

    public MainPage selectSpendByDescription(String description) {
        spendingRows.find(text(description))
                .$$("td")
                .first()
                .scrollIntoView(true)
                .click();
        return this;
    }

    public ElementsCollection getSpendingTable() {
        return spendingRows;
    }

    public MainPage clickDeleteSelectedButton() {
        deleteSelectedButton.click();
        return this;
    }
}
