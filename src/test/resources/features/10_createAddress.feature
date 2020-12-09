@createAddress
Feature: New Address created
    Background: Employee Environment'a  link'ten erisilebilir olmalidir
    Given Employee gmibank login sayfasina "https://gmibank.com/login" gider

  @EditAddress
  Scenario Outline: Employee adres bigilerini guncelller
    Given Employee UserName "<username>" girer
    And Employee password "<password>" girer
    And Employee signIn tiklar
    And Employee myOperations a tiklar
    And Employee My Oprations'dan Manage Customers a tiklar
    And Employee Create a new customer'a tiklar
    Then Employee SSN "<ssn>" search butonuna tiklayarak customerin adres bilgilerine "<adres>" sehir "<sehir>" ulke "<ulke>" eyalet "<eyalet>" bilgilerini ekler
    Examples:degerler
      |username   |password    |ssn        |adres                    |sehir        |ulke     |eyalet    |
      |employee_17|employee_17.|171-17-1717|Team1717 street 67800 DC |newCity      |26688    |NewState  |

