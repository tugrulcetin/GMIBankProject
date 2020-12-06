package gmibank.stepdefinitions;


import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;

public class GmiBankStepDefinitions {

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);

    }

}
//
// kendi branch imizi olsuturduktan sonra framework de degisiklik yaptiktan sonra ilk kez githuba a gondermek
//istedigimizde 3. adimdaki islemi bir kereye mahsus uygulanarak github da kendi adimiza branch olusturulmus olur.
//bundan sonraki islemlerde 3. adimda sadece git push (kendi branch imiz) demek yeterlidir.
// git add .
// git commit -m "first commit"
//git push --set-upstream origin (branch ismi verecegiz buraya kendi adimizi verebiliriz.)