package gmibank.stepdefinitions;

import gmibank.pages.CreateNewCustomerPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CreateNewCustomerStepDef {
    CreateNewCustomerPage createNewCustomerPage = new CreateNewCustomerPage();

    @Given("kullanici gmibank login sayfasina gider")
    public void kullanici_gmibank_login_sayfasina_gider() {

        Driver.getDriver().get("https://gmibank.com/login");
    }
      @Given("Employee UserName girer")
    public void employee_UserName_girer() {
        createNewCustomerPage.username.sendKeys("employee_17");
        Driver.wait(1);
    }
    @Given("Employee password girer")
    public void employee_password_girer() {
        createNewCustomerPage.password.sendKeys("employee_17.");
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
    @Given("Employee SSN textbox'ina daha once kayit yapmis customer'in SSN' ini girer")
    public void employee_SSN_textbox_ina_daha_once_kayit_yapmis_customer_in_SSN_ini_girer() {
        createNewCustomerPage.searchSsn.sendKeys("171-17-1717" );
        createNewCustomerPage.searchButton.click();
        Driver.wait(2);
    }
    @Then("Employee SSN search butonuna tiklayarak customerin adi {string} soyadi {string} email {string} adres {string} mobilenumber {string} ssn {string} kayit bilgilerini karsilastirir")
    public void employeeSSNSearchButonunaTiklayarakCustomerinadisoyadiEmailAdresMobilenumberSsnKayitBilgileriniKarsilastirir(String firstName, String lastName,String email, String adres, String mobilenumber, String ssn) {

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

        String expectedSsn = ssn.trim();
        Driver.wait(2);
        String actualSsn=createNewCustomerPage.ssnTextBox.getAttribute("value").trim();
        Assert.assertEquals(expectedSsn,actualSsn);
    }
}


