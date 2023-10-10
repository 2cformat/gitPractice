package demoQA.uitests;

import demoQA.BaseTest;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    @Test
    public void testAlert(){
        driver.get("https://demoqa.com/alerts");
        alertsPage.clickAlertBtn()
                .clickTimerAlertBtn()
                .clickConfirmButton()
                .testpromtBtn();
    }
}
