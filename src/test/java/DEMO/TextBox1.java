package DEMO;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBox1 extends BaseTest{

    @Test
     void TextBox1Demo() throws InterruptedException {


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName = "Meervan Datkaeva";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "meervan@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAdd = "Usa";

        permanentAddress.sendKeys(expectedPermanentAdd);

        WebElement submitBtn = driver.findElement(By.id("submit"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        submitBtn.click();

        Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());
        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAdd));

        WebElement permanentAdd = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(permanentAdd.getText().contains(expectedPermanentAdd));
    }


}
