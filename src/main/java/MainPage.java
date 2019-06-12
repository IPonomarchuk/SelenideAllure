import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement logo = $(".main-nav-logo > a");
    SelenideElement leaderBoardPageButton = $(".sub-nav-children * a[href*='/leaderboard/games/2019']");

    @Step("Get value of title attribute")
    public String getTitleOfElement(){
        return logo.getAttribute("title");
    }

    @Step("Open leaderboard page")
    public LeaderBoardPage openLeaderBoardPage(){
        leaderBoardPageButton.click();
        return new LeaderBoardPage();
    }

}
