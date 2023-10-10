package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class homeWork1 {

    @Test
    void fillUpThePracticeForm() throws InterruptedException {


        WebDriverManager.chromedriver().driverVersion("117.0.5938.88").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");


        Actions builder = new Actions(driver);
        builder.sendKeys(Keys.chord(Keys.CONTROL, "-")).perform();



//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(“demoqa.com/automation-practice-form.body.style.zoom=‘50%’”);

        WebElement firstNameInputField = driver.findElement(By.id("firstName"));
        String expectedFirstName = "Tolegenov";
        firstNameInputField.sendKeys(expectedFirstName);

        WebElement lastNameInputField = driver.findElement(By.id("lastName"));
        String expectedLastName = "Ulan";
        lastNameInputField.sendKeys(expectedLastName);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String expectedEmailField = "2cformat@gmail.com";
        emailField.sendKeys(expectedEmailField);


        WebElement genderBtn = driver.findElement(By.id("gender-radio-1"));
        new Actions(driver).moveToElement(genderBtn).click().build().perform();

        WebElement mobileNumberField = driver.findElement(By.id("userNumber"));
        String expectedMobileNumber = "997707999775";
        mobileNumberField.sendKeys(expectedMobileNumber);

//        WebElement inputDateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
//        inputDateOfBirth.clear();
//        inputDateOfBirth.sendKeys("06-May-1983");
//        inputDateOfBirth.click();

        WebElement dateOfBirthInputField = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInputField.click();
        WebElement datePickerMonthSelect = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(datePickerMonthSelect);
//		Thread.sleep(1000);
        select.selectByIndex(4);
        WebElement datePickerYearSelect = driver.findElement(By.className("react-datepicker__year-select"));
        select = new Select(datePickerYearSelect);
        select.selectByIndex(83);
//		Thread.sleep(1000);
        WebElement datePickerDaySelect = driver.findElement(By.className("react-datepicker__month"));
        WebElement dayElement = datePickerDaySelect.findElement(By.xpath(".//*[text()='6']"));
        dayElement.click();
//		Thread.sleep(1000);
        Assert.assertEquals(dateOfBirthInputField.getAttribute("value"),"06 May 1983");



//        WebElement inputSubjectsContainer1 = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div"));
//        WebElement inputSubjectsContainer = driver.findElement(By.xpath("//div[@id='subjectsContainer']/div"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputSubjectsContainer);
//        WebElement inputSubjectsContainer1 = driver.findElement(By.xpath("//div[text()='Computer Science']"));
//        inputSubjectsContainer.sendKeys("Computer Science");
//        inputSubjectsContainer.click();
//        inputSubjectsContainer.sendKeys("Chemistry");

        WebElement inputHobbies = driver.findElement(By.id("hobbies-checkbox-3"));
        new Actions(driver).moveToElement(inputHobbies).click().build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputHobbies);
//        WebElement uploadPictureBtn = driver.findElement(By.id("uploadPicture"));



        WebElement picture= driver.findElement(By.id("uploadPicture"));
//        new Actions(driver).moveToElement(picture).click().build().perform();
        picture.sendKeys("C:\\Users\\user\\Downloads\\111.jpeg");
//        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
//        Actions actions= new Actions(driver);
//        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(7000);


        WebElement inputCurrentAddress = driver.findElement(By.id("currentAddress"));
        inputCurrentAddress.sendKeys("Karakol");

        WebElement selectState = driver.findElement(By.xpath("//div[@id='state']/div/div/div"));

        selectState.click();
        WebElement clickState = driver.findElement(By.xpath("//*[text()='NCR']"));
        clickState.click();

        WebElement selectCity = driver.findElement(By.xpath("//div[@id='city']/div/div/div"));
        selectCity.click();
        WebElement clickState1 = driver.findElement(By.xpath("//*[text()='Delhi']"));
        clickState1.click();

        WebElement setSubmit = driver.findElement(By.id("submit"));
        setSubmit.click();


    }
}
