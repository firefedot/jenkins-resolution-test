import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getSelenideDriver;

/**
 * Created by kovylina on 08.10.2019.
 */
public class ResolutionTest {

    @Test
    public void canOpenBrowserWithDecentResolution() {
        Configuration.browserSize = "1366x768";
        open();
        System.out.println(getSelenideDriver().config().browserSize());
        assert getSelenideDriver().config().browserSize().equals("1366x768");
    }
}
