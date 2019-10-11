import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by kovylina on 08.10.2019. hgjhjhj
 */
public class ResolutionTest {

    @Test
    public void canOpenBrowserWithDecentResolution() {
        Configuration.browserSize = "1366x768";
        open();
        Selenide.screenshot("Jenkins_resolution");
        assertEquals(new Dimension(1366, 768), getWebDriver().manage().window().getSize());
    }


    @Test
    public void alwaysFailingTest() {
        fail();
    }
}
