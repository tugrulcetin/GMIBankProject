Feature: An Employee can create a new Account
  @EmployeeNewAccount
  Scenario: Employee should create a description for the new account and it cannot be blank
    Given Employee "http://www.gmibank.com/login" banka adresine gider ve gecerli username ve password ile giris yapar
    And Employee "My Operations" butonunu bulur ve acilan menude "Manage Accounts" a tiklar
    And Employee "Create a new account" butonunu bulur ve tiklar
    And Employee "description" kutusunu bulur ve tiklar
    Then Employee "This field is required." yazisini bulur ve dogrular