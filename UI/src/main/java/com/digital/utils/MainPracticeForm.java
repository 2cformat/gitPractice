package com.digital.utils;

import com.digital.driver.Driver;
import com.digital.models.Student;
import com.digital.pages.PracticeFormPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class MainPracticeForm {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student= new Student();
        student.setFirstName("Ulan");
        student.setLastName("Tolegenov");
        student.setEMail("2.U@gmail.com");
        student.setCurrentAddress("Lenina 259");
        student.setPhoneNUmber("996707999775");
        PracticeFormPages practiceFormPages= new PracticeFormPages();
        practiceFormPages.fillUpTheForm(student).test(student);



//        student1.fillUpTheFirstName(fakeDataProvider.generateFakeFullName())
//                .fillUpTheLastName(fakeDataProvider.generateFakeLastName())
//                .fillUpTheUserEmail(fakeDataProvider.generateFakeEmail())
//                .fillUpTheUserNumber(fakeDataProvider.generationPhoneNUmber())
//                .fillUpTheCurrentAddress(fakeDataProvider.generationFakeCurrentAddress())
//                .clickGender()
//                .clickHobbies()
//                .selectState()
//                .selectSubject()
//                .selectSubject()
//                .selectSubject()
//                .setUploadPicture()
//                .selectSubmitBtn();

    }
}