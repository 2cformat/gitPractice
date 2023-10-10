package demoQA.uitests;

import demoQA.BaseTest;
import com.digital.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();

        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("Nuta");
        alert.accept();
    }
}
