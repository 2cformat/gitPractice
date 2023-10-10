package com.digital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.digital.driver.Driver.driver;

public class ButtonsPage extends BasePage {
    @FindBy(id = "doubleClickBtn")
            public WebElement doubleClickBtn;
    @FindBy(id = "rightClickBtn")
            public WebElement rightClickBtn;
    @FindBy(xpath = "//button[text()='Click Me']")
            public WebElement clickMeBtn;
    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickText;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickButtonText;
    @FindBy(id = "dynamicClickMessage")
    public WebElement clickMeText;

    public ButtonsPage doubleClickButton(){
        elementActions.doubleClickElementActions(doubleClickBtn);
        Assert.assertTrue(doubleClickText.getText().contains("You have done a double click"));
        return this;
    }
    public ButtonsPage rightClickButton(){
        elementActions.rightClickElementActions(rightClickBtn);
        Assert.assertTrue(rightClickButtonText.getText().contains("You have done a right click"));
        return this;
    }
    public ButtonsPage clickMeButton(){
        elementActions.clickTheButton(clickMeBtn);
        Assert.assertTrue(clickMeText.getText().contains("You have done a dynamic click"));
        return this;
    }




}
