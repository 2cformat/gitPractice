package com.digital.pages;

import com.digital.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicPropertiesPage {

    @FindBy(id = "enableAfter")
    public WebElement enableAfter;

    @FindBy (xpath = "//button[@id='colorChange']")
    public WebElement colorChange;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter;

    public DynamicPropertiesPage clickClick() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until((ExpectedConditions.elementToBeClickable(By.id("enableAfter"))))
                .click();
        return this;
    }

    public DynamicPropertiesPage setVisibleA(){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
                .click();
        return this;
    }

//    public void color(){
//        Wait<WebDriverWait> wait = new FluentWait<>(Driver.getDriver())
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1));
//        wait.until(new Function<WebDriverWait, Boolean>() {
//        });
//    }


}
