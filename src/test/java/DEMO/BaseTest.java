package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUpBrowser(){
        //        WebDriverManager.edgedriver().setup(); //setup the chrome driver
//        WebDriverManager.chromedriver().setup(); //setup the chrome driver
        WebDriverManager.firefoxdriver().setup(); //setup the chrome driver
//        WebDriverManager.chromedriver().driverVersion("117.0.5938.88").setup(); //create new object

//        System.setProperty("webdriver.Firefox.driver","C:\\Program Files\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize(); //make full screen

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(25));
        //setup the time zagruzki ojidaniya
        //implicitlyWait ne yavnoe ojidanie

        PageFactory.initElements(driver, this);

//        driver.get("https://demoqa.com/dynamic-properties");
    }



    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}