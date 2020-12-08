$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/createNewCustomer.feature");
formatter.feature({
  "name": "Yeni Customer Olusturma",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@newcustomer"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC09_kullanici yeni customer olusturur",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "Employee UserName girer",
  "keyword": "And "
});
formatter.step({
  "name": "Employee password girer",
  "keyword": "And "
});
formatter.step({
  "name": "Employee signIn tiklar",
  "keyword": "And "
});
formatter.step({
  "name": "Employee myOperations a tiklar",
  "keyword": "And "
});
formatter.step({
  "name": "Employee My Oprations\u0027dan Manage Customers a tiklar",
  "keyword": "And "
});
formatter.step({
  "name": "Employee Create a new customer\u0027a tiklar",
  "keyword": "And "
});
formatter.step({
  "name": "Employee SSN textbox\u0027ina daha once kayit yapmis customer\u0027in SSN\u0027 ini girer",
  "keyword": "And "
});
formatter.step({
  "name": "Employee SSN search butonuna tiklayarak customerin adi \"\u003cfirstName\u003e\" soyadi \"\u003clastName\u003e\" email \"\u003cemail\u003e\" adres \"\u003cadres\u003e\" mobilenumber \"\u003cmobilenumber\u003e\" ssn \"\u003cssn\u003e\" kayit bilgilerini karsilastirir",
  "keyword": "Then "
});
formatter.examples({
  "name": "degerler",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "adres",
        "mobilenumber",
        "ssn"
      ]
    },
    {
      "cells": [
        "employee17",
        "memur",
        "employee_17@gmail.com",
        "Team1717 street 67800 DC",
        "444-171-1717",
        "171-17-1717"
      ]
    }
  ]
});
formatter.background({
  "name": "Employee Environment\u0027a  link\u0027ten erisilebilir olmalidir",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici gmibank login sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.kullanici_gmibank_login_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC09_kullanici yeni customer olusturur",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@newcustomer"
    },
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "Employee UserName girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_UserName_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee password girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_password_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee signIn tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_signIn_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee myOperations a tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_myOperations_a_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee My Oprations\u0027dan Manage Customers a tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_My_Oprations_dan_Manage_Customers_a_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee Create a new customer\u0027a tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_Create_a_new_customer_a_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee SSN textbox\u0027ina daha once kayit yapmis customer\u0027in SSN\u0027 ini girer",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employee_SSN_textbox_ina_daha_once_kayit_yapmis_customer_in_SSN_ini_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee SSN search butonuna tiklayarak customerin adi \"employee17\" soyadi \"memur\" email \"employee_17@gmail.com\" adres \"Team1717 street 67800 DC\" mobilenumber \"444-171-1717\" ssn \"171-17-1717\" kayit bilgilerini karsilastirir",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CreateNewCustomerStepDef.employeeSSNSearchButonunaTiklayarakCustomerinadisoyadiEmailAdresMobilenumberSsnKayitBilgileriniKarsilastirir(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});