package gmibank.stepdefinitions;

import gmibank.pages.CreateNewAccountPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateNewAccountStepDef {
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    @Given("Kullanici {string} banka adresine gider")
    public void kullaniciBankaAdresineGider(String gmiUrl) {
        Driver.getDriver().get(gmiUrl);
    }

    @And("Kullanici UserName {string} girer")
    public void kullaniciUserNameGirer(String username) {
        createNewAccountPage.username.sendKeys(username);
    }

    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {
        createNewAccountPage.password.sendKeys(password);
        createNewAccountPage.signIn.click();
    }

    @And("Kullanici My Operations butonunu bulur ve acilan menude Manage Accounts a tiklar")
    public void kullaniciMyOperationsButonunuBulurVeAcilanMenudeManageAccountsATiklar() {
        createNewAccountPage.myOperations.click();
        createNewAccountPage.manageAccountsButton.click();
    }

    @And("Kullanici Create a new account butonunu bulur ve tiklar")
    public void kullaniciCreateANewAccountButonunuBulurVeTiklar() {
        createNewAccountPage.createAccountButton.click();
    }

    @And("Kullanici description kutusunu bulur ve submit eder")
    public void kullaniciDescriptionKutusunuBulurVeSubmitEder() {
        createNewAccountPage.descriptionTextBox.submit();
    }

    @Then("Kullanici This field is required yazisini bulur ve dogrular")
    public void kullaniciThisFieldIsRequiredYazisiniBulurVeDogrular() {
        String expectedFeedBack = "This field is required.";
        Driver.wait(2);
        String actualFeedBack= createNewAccountPage.invalidFeedbackForDescription.getText();
        System.out.println(actualFeedBack);
        Assert.assertEquals(expectedFeedBack,actualFeedBack);
    }
}
