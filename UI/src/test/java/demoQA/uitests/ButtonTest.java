package demoQA.uitests;

import demoQA.BaseTest;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {
    @Test
    public void ButtonTestPage(){
        driver.get("https://demoqa.com/buttons");
        buttonsPage.doubleClickButton()
                .rightClickButton()
                .clickMeButton();
    }
}
