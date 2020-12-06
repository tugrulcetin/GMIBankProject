package gmibank.stepdefinitions;


import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class GmiBankStepDefinitions {

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);

    }

}
