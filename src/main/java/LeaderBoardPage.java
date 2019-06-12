import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeaderBoardPage {

    SelenideElement header = $(By.tagName("h1"));

    @Step("Get text of header on page")
    public String getHeaderOfPage() {
        return  header.getText();
    }

}
