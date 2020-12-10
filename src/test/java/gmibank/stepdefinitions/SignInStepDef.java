package gmibank.stepdefinitions;

import gmibank.pages.CreateNewCustomerPage;
import gmibank.pages.RegistrationPage;
import gmibank.pages.SignInPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SignInStepDef {

    SignInPage signInPage = new SignInPage();
    RegistrationPage registrationPage = new RegistrationPage();
    CreateNewCustomerPage createNewCustomerPage = new CreateNewCustomerPage();

    @Given("kullanici sign in menusune tiklar")
    public void kullaniciSignInMenusuneTiklar() {
    signInPage.SignInLink.click();

    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {
    createNewCustomerPage.password.sendKeys(password);
    Driver.wait(3);
    }
    @And("kullanici sign in buttonuna tiklar")
    public void kullaniciSignInButtonunaTiklar() {
    signInPage.signInButton.click();
    Driver.wait(2);
    }

    @Then("kullanici gelen ekranda kendi adini {string} soyadini {string} gorur")
    public void kullaniciGelenEkrandaKendiAdiniSoyadiniGorur(String firstname, String lastname) {

        String expectedName= (firstname+" "+lastname);
        String actualName=signInPage.firstLastName.getText();
        Assert.assertEquals(expectedName,actualName);
    Driver.wait(3);

    }


    @Then("kullanici cancel button na tiklayarak cikar")
    public void kullaniciCancelButtonNaTiklayarakCikar() {
    signInPage.cancelButton.click();
    }
}
