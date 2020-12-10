@SignIn
Feature: Kullanici sign in yapar
  Background: kullanici gmibank sitesine gider
    Given kullanici gmibank sayfasina "https://gmibank.com" gider
    And login linkine tiklar

    @signIn
    Scenario Outline: kullanici giris yapar
      Given kullanici sign in menusune tiklar
      And kullanici username "<username>" girer
      And kullanici password "<password>" girer
      And kullanici sign in buttonuna tiklar
      Then kullanici gelen ekranda kendi adini "<firstname>" soyadini "<lastname>" gorur
      Examples:
        | username       | password      | firstname    | lastname   |
        | customer_17    | customer_17.  | customer17   | musteri    |

    @signInCancel
    Scenario Outline: kullanici cikis yapar
      Given kullanici sign in menusune tiklar
      And kullanici username "<username>" girer
      And kullanici password "<password>" girer
      Then kullanici cancel button na tiklayarak cikar
      Examples:
        | username    | password         |
        | customer_17    | customer_17.  |
