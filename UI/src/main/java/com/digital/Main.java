package com.digital;

import com.digital.driver.Driver;


import com.digital.helper.AlertHelper;
import com.digital.helper.ScreenShotMethods;
import com.digital.pages.TextBoxPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Main {



    WebDriver driver;


    @BeforeClass
    public void setIp(){
        driver = Driver.getDriver();
    }

    @Test
    void test11(){

        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpFullName("John Doe")
                .fillUpTheEmail("user@mail.com")
                .fillUpTheCurrentAdress("Karakol")
                .fillUpThePermanentAddress("Karakol Lenina street 259");
    }

//    @Test
//    void test2(){
//        driver.get("https://demoqa.com/automation-practice-form");
//        MainPracticeForm fakeDataProvider = new MainPracticeForm();
//        PracticeFormPage student1 = new PracticeFormPage();
//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .clickGender()
//                .fillUpTheUserNumber(fakeDataProvider.generateFakeUserNumber())
//                .selectSubject()
//                .clickHobbies()
//                .fillUpTheCurrentAddress(fakeDataProvider.generateFakeCurrentAddress())
//                .selectState()
//                .setUploadPictureInput(student1.uploadPictureInput);
//    }

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

    @Test
    public void testToAlert() throws InterruptedException, IOException {
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        WebDriver driver = Driver.getDriver();
        AlertHelper alertHelper = new AlertHelper();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        alertHelper.acceptAlert();
        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();

        screenShotMethods.takeScreenShot();

        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();
        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Ulan");
    }

    @Test
    void test4(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("H1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }
    @Test
    void test5(){
        driver.get("https://demoqa.com/nestedframes");
        //first go to parent frame
        driver.switchTo().frame("frame1");
        //then go to child frame
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText());

        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

    @Test
            void amazon() {
        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInp = driver.findElement(By.id("twotabsearchtextbox"));
        searchInp.sendKeys("iphone");

        searchInp.sendKeys(Keys.ENTER);
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));
        for (WebElement brand : brands) {
            System.out.println(brand.getText());
            WebElement checkbox = brand.findElement(By.tagName("i"));
            checkbox.click();
        }
        //StaleElementReferenceException: - ссылка на устаревший элемент
    }

}