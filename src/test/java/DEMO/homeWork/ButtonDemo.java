package DEMO.homeWork;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonDemo extends BaseChrome {

    @Test
    void  testButton(){
        driver.get("https://demoqa.com/radio-button");
        WebElement radioBtn = driver.findElement(By.id("yesRadio"));
        new Actions(driver).moveToElement(radioBtn).click().build().perform();


    }
}
