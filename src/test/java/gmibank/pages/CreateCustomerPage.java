package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {


    public CreateCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement loginLink;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    // ========================================//

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomersLink;

    @FindBy(xpath = "//span[.='Create a new Customer']")
    public WebElement newCustomersButton;

    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

}
