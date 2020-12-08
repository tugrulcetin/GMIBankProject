$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/01_registration.feature");
formatter.feature({
  "name": "kullanici registration\u0027dan kayit yapar",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "kullanici login sayfasina gider",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer banka sayfasina \"http://www.gmibank.com/\"  gider",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.customer_banka_sayfasina_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login linkine tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.login_linkine_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "kullanici kayit olur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@registration"
    }
  ]
});
formatter.step({
  "name": "register linkine tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.register_linkine_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici ssn numarasini \"\u003cssn\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciSsnNumarasiniGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici firstname \"\u003cfirstname\u003e\" ve lastname \"\u003clastname\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciFirstnameVeLastnameGirer(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici address \"\u003caddress\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciAddressGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici mobile phone number \"\u003cmobile phone number\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciMobilePhoneNumberGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici username \"\u003cusername\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciUsernameGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici email \"\u003cemail\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciEmailGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici new password \"\u003cnew password\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciNewPasswordGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici new password confirmation \"\u003cnew password confirmation\u003e\" girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciNewPasswordConfirmationGirer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici register butonuna tiklar",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationStepDef.kullaniciRegisterButonunaTiklar()"
});
formatter.result({
  "status": "passed"
});
});