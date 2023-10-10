package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{
    //Page Object Model

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "currentAddress")
    public WebElement userCurrentAddressInput;
    @FindBy(id = "permanentAddress")
    public WebElement userPermanentAddress;

    public TextBoxPage fillUpFullName(String fullName){
        elementActions.writeText(fullNameInput, fullName);
        return this;
    }

    public TextBoxPage fillUpTheEmail(String email){
        elementActions.writeText(userEmailInput, email);
        return this;
    }
    public TextBoxPage fillUpTheCurrentAdress(String currentAddress){
        elementActions.writeText(userCurrentAddressInput, currentAddress);
        return this;
    }
    public TextBoxPage fillUpThePermanentAddress(String permanentAddress){
        elementActions.writeText(userPermanentAddress, permanentAddress);
        return this;
    }
}
