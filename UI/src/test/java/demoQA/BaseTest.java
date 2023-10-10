package demoQA;

import com.digital.driver.Driver;
import com.digital.pages.*;
import com.digital.utils.FakeDataProvider;
import demoQA.uitests.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPages practiceFormPages;
    public FakeDataProvider fakeDataProvider;

    public RegistrationPage registrationPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public AlertsPage alertsPage;


    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver= Driver.getDriver();
        textBoxPage= new TextBoxPage();
        practiceFormPages= new PracticeFormPages();
        fakeDataProvider= new FakeDataProvider();
        registrationPage= new RegistrationPage();
        radioButtonPage= new RadioButtonPage();
        buttonsPage= new ButtonsPage();
        dynamicPropertiesPage= new DynamicPropertiesPage();
        alertsPage= new AlertsPage();

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
}

}