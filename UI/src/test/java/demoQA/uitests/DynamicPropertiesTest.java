package demoQA.uitests;

import demoQA.BaseTest;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest {
    @Test
    public void DynamicPropertiesTest(){
        driver.get("https://demoqa.com/dynamic-properties");
        dynamicPropertiesPage.clickClick()
                .setVisibleA();
    }
}
