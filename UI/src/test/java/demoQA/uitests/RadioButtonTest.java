package demoQA.uitests;

import demoQA.BaseTest;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
    @Test
    void testRadioBtn() {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYesBtn()
                .clickImpessiveBtn()
                .clickNoBtn();

    }
}