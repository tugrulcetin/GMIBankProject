package gmibank.stepdefinitions;

import gmibank.pages.CreateNewCustomerPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateNewCustomerStepDef {
    CreateNewCustomerPage createNewCustomerPage = new CreateNewCustomerPage();
    @Given("Employee gmibank login sayfasina {string} gider")
    public void employee_gmibank_login_sayfasina_gider(String login_url) {
        Driver.getDriver().get(login_url);

    }
    @Given("Employee UserName {string} girer")
    public void employee_UserName_girer(String username) {
        createNewCustomerPage.username.sendKeys(username);
        Driver.wait(1);

    }

    @Given("Employee password {string} girer")
    public void employee_password_girer(String password) {
        createNewCustomerPage.password.sendKeys(password);
        Driver.wait(1);

    }

    @Given("Employee signIn tiklar")
    public void employee_signIn_tiklar() {
        createNewCustomerPage.signIn.click();
        Driver.wait(2);
    }
    @Given("Employee myOperations a tiklar")
    public void employee_myOperations_a_tiklar() {
        createNewCustomerPage.myOperations.click();
        Driver.wait(2);
    }
    @Given("Employee My Oprations'dan Manage Customers a tiklar")
    public void employee_My_Oprations_dan_Manage_Customers_a_tiklar() {
        createNewCustomerPage.manageCustomerButton.click();
        Driver.wait(3);
    }
    @Given("Employee Create a new customer'a tiklar")
    public void employee_Create_a_new_customer_a_tiklar() {
        createNewCustomerPage.createCustomerButton.click();
    }
    @Given("Employee SSN textbox'ina daha once kayit yapmis customer'in SSN' ini {string} girer")
    public void employee_SSN_textbox_ina_daha_once_kayit_yapmis_customer_in_SSN_ini_girer(String ssn) {
        createNewCustomerPage.ssnTextBox.sendKeys(ssn );
        createNewCustomerPage.searchButton.click();
        Driver.wait(2);
    }
    @Then("Employee SSN search butonuna tiklayarak customerin adi {string} soyadi {string} email {string} adres {string} mobilenumber {string} ssn {string} kayit bilgilerini karsilastirir")
    public void employeeSSNSearchButonunaTiklayarakCustomerinadisoyadiEmailAdresMobilenumberSsnKayitBilgileriniKarsilastirir(String firstName, String lastName,String email, String adres, String mobilenumber, String verifyssn) {

        String expectedfirstName = firstName.trim();
        Driver.wait(2);
        String actualFirst= createNewCustomerPage.firstNameTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedfirstName,actualFirst);

        String expectedLastName = lastName;
        Driver.wait(2);
        String actualLastNames= createNewCustomerPage.lastNameTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedLastName,actualLastNames);


        String expectedEmail = email.trim();
        Driver.wait(2);
        String actualEmail= createNewCustomerPage.emailTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedEmail,actualEmail);

        String expectedAdres = adres.trim();
        Driver.wait(2);
        String actualAdres= createNewCustomerPage.adresTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedAdres,actualAdres);

        String expectedMobileNumber = mobilenumber.trim();
        Driver.wait(2);
        String actualMobileNumber=createNewCustomerPage.mobileTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedMobileNumber,actualMobileNumber);

        String expectedSsn = verifyssn.trim();
        Driver.wait(2);
        String actualSsn=createNewCustomerPage.verifySsnTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedSsn,actualSsn);
    }

    @Then("Employee SSN {string} search butonuna tiklayarak customerin adres bilgilerine {string} sehir {string} ulke {string} eyalet {string} bilgilerini ekler")
    public void employee_SSN_search_butonuna_tiklayarak_customerin_adres_bilgilerine_sehir_ulke_eyalet_bilgilerini_ekler(String ssn, String adres, String city, String ulke, String eyalet) {
        createNewCustomerPage.ssnTextBox.sendKeys(ssn);
        createNewCustomerPage.searchButton.click();

        Driver.wait(2);
        createNewCustomerPage.adresTextBox.clear();
        Driver.wait(1);
        createNewCustomerPage.adresTextBox.sendKeys(adres);
        Driver.wait(3);
        Assert.assertFalse(createNewCustomerPage.adresTextBox.getAttribute("value").isEmpty());

        createNewCustomerPage.cityTextBox.sendKeys(city);
        Driver.wait(3);
        Assert.assertFalse(createNewCustomerPage.cityTextBox.getAttribute("value").isEmpty());

        Select select = new Select(createNewCustomerPage.countryDropdownTextBox);
        select.selectByValue(ulke);
        Driver.wait(2);
        Assert.assertTrue("USA isDisplayed",select.getFirstSelectedOption().isDisplayed());

        createNewCustomerPage.stateTextBox.sendKeys(eyalet);
        Driver.wait(1);
        Assert.assertFalse(createNewCustomerPage.stateTextBox.getAttribute("value").isEmpty());

    }



}


