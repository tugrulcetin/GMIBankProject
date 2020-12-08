package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
    public CreateNewCustomerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement loginButton;
    @FindBy (id = "username")
    public WebElement username;
    @FindBy (id = "password")
    public WebElement password;
    @FindBy (xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signIn;
    @FindBy  (xpath = "//span[.='My Operations']")
    public WebElement myOperations;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement manageCustomerButton;
    @FindBy (xpath = "//*[.='Create a new Customer']")
    public WebElement createCustomerButton;
    @FindBy (id = "search-ssn")
    public WebElement searchSsn;
    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div/form/div[1]/button")
    public WebElement searchButton;
    @FindBy (id = "tp-customer-email")
    public WebElement emailTextBox;
    @FindBy (id = "tp-customer-mobilePhoneNumber")
    public WebElement mobileTextBox;
    @FindBy (id = "tp-customer-address")
    public WebElement adresTextBox;
    @FindBy (id = "tp-customer-ssn")
    public WebElement ssnTextBox;

    @FindBy (id = "tp-customer-firstName")
    public WebElement firstNameTextBox;

    @FindBy (id = "tp-customer-lastName")
    public WebElement lastNameTextBox;


}

