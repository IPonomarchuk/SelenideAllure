import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(value = TextReportExtension.class)
public class BaseUITest {

    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://games.crossfit.com/games";
        //Configuration.browser = "chrome";
        SelenideLogger.addListener("alliure", new AllureSelenide().screenshots(true).savePageSource(true));

    }

    @Test
    @DisplayName("Make sure that website is opened")
    public MainPage openWebSite() {
        Selenide.open("");
        return new MainPage();
    }
}
