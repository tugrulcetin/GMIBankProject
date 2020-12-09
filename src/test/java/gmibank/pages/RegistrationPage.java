package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {


    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[@class='d-flex align-items-center dropdown-toggle nav-link']" )
    public WebElement loginLink;

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registrationLink;

    @FindBy(id = "ssn")
    public WebElement snnTextBox;

    @FindBy(id ="firstname")
    public WebElement firstnameTextBox;

    @FindBy(id="lastname")
    public WebElement lastnameTextBox;

    @FindBy(id="address")
    public WebElement addressTextBox;

    @FindBy(id="mobilephone")
    public WebElement mobilephoneTextBox;

    @FindBy(id="username")
    public WebElement usernameTextBox;

    @FindBy(id="email")
    public WebElement emailTextBox;

    @FindBy(id="firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id="secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(id="register-submit")
    public WebElement registerSubmitTextBox;






}
