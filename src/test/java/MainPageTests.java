import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MainPageTests extends BaseUITest {

    @Test
    @Description("Check title of logo")
    @DisplayName("Check title of logo")
    void checkLogoHasProperTitle() {
        MainPage mainPage = openWebSite();
        String title = mainPage.getTitleOfElement();

        assertEquals(title, "CrossFit Games 2018");
    }

    @Test
    @Description("Check LeaderBoard page")
    @DisplayName("Check LeaderBoard page")
    void checkLeaderBoardPageIsOpened() {
        MainPage mainPage =  openWebSite();
        LeaderBoardPage page = mainPage.openLeaderBoardPage();
        String pageHeader = page.getHeaderOfPage();

        assertEquals(pageHeader, "Leaderboard");
    }
}
