@newcustomer
  Feature:  Yeni Customer Olusturma
  Background: Employee Login e gider
    Given Employee gmibank login sayfasina "https://gmibank.com/login" gider
  @create
  Scenario Outline: TC09_kullanici yeni customer olusturur
    And Employee UserName "<username>" girer
    And Employee password "<password>" girer
    And Employee signIn tiklar
    And Employee myOperations a tiklar
    And Employee My Oprations'dan Manage Customers a tiklar
    And Employee Create a new customer'a tiklar
    And Employee SSN textbox'ina daha once kayit yapmis customer'in SSN' ini "<ssn>" girer
    Then Employee SSN search butonuna tiklayarak customerin adi "<firstName>" soyadi "<lastName>" email "<email>" adres "<adres>" mobilenumber "<mobilenumber>" ssn "<verifyssn>" kayit bilgilerini karsilastirir
    Examples:degerler
      |ssn         |username   |password    |firstName |lastName| email                | adres                  | mobilenumber |verifyssn   |
      |171-17-1717 |employee_17|employee_17.|employee17|memur   |employee_17@gmail.com |Team1717 street 67800 DC|444-171-1717  |171-17-1717 |
      #|employee_17@gmail.com|Team1717 street 67800 DC| 444-171-1717  |171-17-1717|