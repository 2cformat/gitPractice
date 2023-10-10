package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBox extends BaseTest{

    @Test
    void fillUpTheFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName = "Jone Doe";

        fullNameInputField.sendKeys(expectedFullName);

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAdd = "Karakol3922";

        currentAdress.sendKeys(expectedCurrentAdd);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAddress = "Lenina 123";

        permanentAddress.sendKeys(expectedPermanentAddress);

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


    }

}
