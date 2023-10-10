package DEMO.homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseChrome {

    WebDriver driver;

    @BeforeClass
    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(25));

    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
