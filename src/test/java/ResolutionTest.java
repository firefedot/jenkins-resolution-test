import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by kovylina on 08.10.2019.
 */
public class ResolutionTest {

    @Test
    public void canOpenBrowserWithDecentResolution() {
        Configuration.browserSize = "1366x768";
        open();
        Dimension s = getWebDriver().manage().window().getSize();
        System.out.println(s);
        assert s.equals(new Dimension(1366, 768));
    }
}
