package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage {

    public MyAccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]")
    public WebElement MyAccounts;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/h2")
    public WebElement customerAccountsText;


}
