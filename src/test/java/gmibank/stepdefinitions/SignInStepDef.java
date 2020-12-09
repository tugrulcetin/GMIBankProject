package gmibank.stepdefinitions;

import gmibank.pages.SignInPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class SignInStepDef {

    SignInPage SignInPage = new SignInPage();

    @Given("customer banka sayfasina {string}  gider")
    public void customer_banka_sayfasina_gider(String gmi_Url) {
        Driver.getDriver().get(gmi_Url);
    }

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        SignInPage.loginLink.click();

    }



}
