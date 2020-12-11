package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

    public CreateNewAccountPage(){
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

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]/span")
    public WebElement manageAccountsButton;

    @FindBy (id = "jh-create-entity")
    public WebElement createAccountButton;

    @FindBy (id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy (id = "tp-account-description")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div/form/div[1]/div/div")
    public WebElement invalidFeedbackForDescription;


   //=======================================//

    @FindBy (id = "tp-account-balance")
    public WebElement balanceTextBox;

    @FindBy (xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/form/div[2]/div/div")
    public WebElement invalidFeedbackForBalance;

    @FindBy (id = "accountTypeLabel")
    public WebElement accountType;

    @FindBy (xpath = "//*[@id=\"tp-account-accountType\"]/option[1]")
    public WebElement accountTypeChecking;

    @FindBy (xpath= "//*[@id=\"tp-account-accountType\"]/option[2]")
    public WebElement accountTypeSaving;

    @FindBy (xpath= "//*[@id=\"tp-account-accountType\"]/option[3]")
    public WebElement accountTypeCreditCard;

    @FindBy (xpath= "//*[@id=\"tp-account-accountType\"]/option[4]")
    public WebElement accountTypeInvesting;


    @FindBy (id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy (xpath= "//*[@id=\"tp-account-accountStatusType\"]/option[1]")
    public WebElement accountStatusTypeActive;

    @FindBy (xpath= "//*[@id=\"tp-account-accountStatusType\"]/option[2]")
    public WebElement accountStatusTypeSuespended;

    @FindBy (xpath= "//*[@id=\"tp-account-accountStatusType\"]/option[3]")
    public WebElement accountStatusTypeClosed;

    @FindBy (id = "tp-account-employee")
    public WebElement employeeDropBox;

    @FindBy (xpath= "//*[@id=\"tp-account-employee\"]/option[1]")
    public WebElement employeeDropBoxOption1;

    @FindBy (xpath= "tp-account-createDate")
    public WebElement createDate;

    @FindBy (id= "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledBox;

    @FindBy (xpath= "//*[@id=\"save-entity\"]/span")
    public WebElement saveButton;






}
