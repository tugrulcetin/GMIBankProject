package gmibank.stepdefinitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class RegistrationStepDef {

    RegistrationPage registrationPage = new RegistrationPage();


    @Given("customer banka sayfasina {string}  gider")
    public void customer_banka_sayfasina_gider(String gmi_Url) {
        Driver.getDriver().get(gmi_Url);
    }

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        registrationPage.loginLink.click();

    }


    @Then("register linkine tiklar")
    public void register_linkine_tiklar() {
        registrationPage.registrationLink.click();
    }


    @And("kullanici ssn numarasini {string} girer")
    public void kullaniciSsnNumarasiniGirer(String ssn) {
        registrationPage.snnTextBox.sendKeys(ssn);

    }

    @And("kullanici firstname {string} ve lastname {string} girer")
    public void kullaniciFirstnameVeLastnameGirer(String firstname, String lastname) {
        registrationPage.firstnameTextBox.sendKeys(firstname);
        registrationPage.lastnameTextBox.sendKeys(lastname);
    }

    @And("kullanici address {string} girer")
    public void kullaniciAddressGirer(String address) {
        registrationPage.addressTextBox.sendKeys(address);

    }

    @And("kullanici mobile phone number {string} girer")
    public void kullaniciMobilePhoneNumberGirer(String mobilePhoneNumber) {
        registrationPage.mobilephoneTextBox.sendKeys(mobilePhoneNumber);
    }

    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String username) {
        registrationPage.usernameTextBox.sendKeys(username);
    }

    @And("kullanici email {string} girer")
    public void kullaniciEmailGirer(String email) {
        registrationPage.emailTextBox.sendKeys(email);
    }

    @And("kullanici new password {string} girer")
    public void kullaniciNewPasswordGirer(String password) {
        registrationPage.firstPasswordTextBox.sendKeys(password);
    }

    @And("kullanici new password confirmation {string} girer")
    public void kullaniciNewPasswordConfirmationGirer(String verifiedPassword) {
        registrationPage.secondPasswordTextBox.sendKeys(verifiedPassword);
    }

    @Then("kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        registrationPage.registerSubmitTextBox.click();
    }


}
