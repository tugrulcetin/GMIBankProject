@newcustomer
  Feature:  Yeni Customer Olusturma
  Background: Employee Environment'a  link'ten erisilebilir olmalidir
    Given kullanici gmibank login sayfasina gider
  @create
  Scenario Outline: TC09_kullanici yeni customer olusturur
    And Employee UserName girer
    And Employee password girer
    And Employee signIn tiklar
    And Employee myOperations a tiklar
    And Employee My Oprations'dan Manage Customers a tiklar
    And Employee Create a new customer'a tiklar
    And Employee SSN textbox'ina daha once kayit yapmis customer'in SSN' ini girer
    Then Employee SSN search butonuna tiklayarak customerin adi "<firstName>" soyadi "<lastName>" email "<email>" adres "<adres>" mobilenumber "<mobilenumber>" ssn "<ssn>" kayit bilgilerini karsilastirir
    Examples:degerler
      |firstName|lastName| email               | adres                  | mobilenumber |ssn         |
      |employee17|memur |employee_17@gmail.com |Team1717 street 67800 DC|444-171-1717  |171-17-1717 |
      #|employee_17@gmail.com|Team1717 street 67800 DC| 444-171-1717  |171-17-1717|