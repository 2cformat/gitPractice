package com.digital.driver;

import com.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver {

    private Driver(){
        // Singleton patter
    }

    public static WebDriver driver;

    @BeforeClass
    public static WebDriver getDriver(){
        if(driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case  "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    @AfterClass
    public static void closeDriver(){
        try {
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e){
            System.err.println("Error while closing the driver");
        }
    }

}
