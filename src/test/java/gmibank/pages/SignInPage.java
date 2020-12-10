package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {



    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginLink;

    @FindBy(id = "login-item")
    public WebElement SignInLink;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[.='admin17 admin']")
    public WebElement firstLastName;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;





}
