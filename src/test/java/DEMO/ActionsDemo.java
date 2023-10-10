package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends  BaseTest{

@Test
    void demo123(){
    driver.get("https://demoqa.com/buttons");

    WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
    Actions actions = new Actions(driver);
    //make double click
    actions.doubleClick(doubleClickButton).perform();
    //perform() vipolni ili zapusti
    WebElement doubleClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
    Assert.assertEquals(doubleClickText.getText(), "You have done a double click");

    WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
    actions.contextClick(rightClickButton).perform();
    WebElement rightClicktext = driver.findElement(By.xpath("//p[text()='You have done a right click']"));
    Assert.assertEquals(rightClicktext.getText(), "You have done a right click");

    WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
    actions.click(clickBtn).perform();
    WebElement clickBtnText = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
    Assert.assertEquals(clickBtnText.getText(),"You have done a dynamic click");
}


}
