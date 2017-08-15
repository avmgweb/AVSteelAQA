Feature: FormsFeature
  This feature deals with the sending forms of the application


  Scenario: Test the "Quick order form" forms with correct data
    Given I navigate to the "Profnastil" block of the main page
    Then I open all Profnastil quick order forms and check the appear of the window

  @smoke
  Scenario: Test the "Quick order form" form with correct data
    Given I navigate to the "Metalochereitsa" block of the main page
    Then  I call the <Monterey> form and check the appear of the window
    And I enter the name  "Dima" and telephone "0507159718" to the "Quick order form" form and click the Send request button
    And I take a screenshot with "screen5" name
    Then I should see the "Спасибо за заявку!" message in Quick order form and close this
    Given I navigate to the Admin login page from main page
    And I enter the login "awe5040" and password "Qwerty5040+" and press submit button
    And If an authorization message box appears, I close it
    And I turn to the form settings page in the admin panel
    And If an authorization message box appears, I close it
    And I navigate to the list of all application forms
    And If an authorization message box appears, I close it
    Then I search for my application by name, go to into it and check the data by type "common"
    Then I delete the application and check that it was successfully deleted

  @smoke
  Scenario: Test the "Project calculation" form with correct data
    Given I navigate to the "National manufacturer" block of the main page
    And I enter the name  "Dima" and telephone "0507159718" to the "Project calculation" form and click the Send request button
    And I take a screenshot with "screen1" name
    Then I should see the "Спасибо за заявку!" message and close this
    Given I navigate to the Admin login page from main page
    And I enter the login "awe5040" and password "Qwerty5040+" and press submit button
    And If an authorization message box appears, I close it
    And I turn to the form settings page in the admin panel
    And If an authorization message box appears, I close it
    And I navigate to the list of all application forms
    And If an authorization message box appears, I close it
    Then I search for my application by name, go to into it and check the data by type "common"
    Then I delete the application and check that it was successfully deleted

  @smoke
  Scenario: Test the "Callback request" form with correct data
    Given I navigate to the "National manufacturer" block of the main page
    Then  I call the <Callback request> form and check the appear of the window
    And I enter the name  "Dima" and telephone "0507159718" to the "Callback request" form and click the Send request button
    And I take a screenshot with "screen2" name
    Then I should see the "Спасибо за заявку!" message and close this
    Given I navigate to the Admin login page from main page
    And I enter the login "awe5040" and password "Qwerty5040+" and press submit button
    And If an authorization message box appears, I close it
    And I turn to the form settings page in the admin panel
    And If an authorization message box appears, I close it
    And I navigate to the list of all application forms
    And If an authorization message box appears, I close it
    Then I search for my application by name, go to into it and check the data by type "common"
    Then I delete the application and check that it was successfully deleted

  @smoke
  Scenario: Test the "Order of corrugated board" form with correct data
    Given I navigate to the "How we work" block of the main page
    And I enter the name  "Dima", email "awesome5040@gmail.com", and message "Hello. Whats up?" to the "Order of corrugated board" form and click the Send request button
    And I take a screenshot with "screen3" name
    Then I should see the "Спасибо за заявку!" message and close this
    Given I navigate to the Admin login page from main page
    And I enter the login "awe5040" and password "Qwerty5040+" and press submit button
    And If an authorization message box appears, I close it
    And I turn to the form settings page in the admin panel
    And If an authorization message box appears, I close it
    And I navigate to the list of all application forms
    And If an authorization message box appears, I close it
    Then I search for my application by name, go to into it and check the data by type "quickOrder"
    Then I delete the application and check that it was successfully deleted

  @smoke
  Scenario: Test the "Affiliate request" form with correct data
    Given I navigate to the "Ral Colors" block of the main page
    Then  I call the <Partners Form> form and check the appear of the window
    And I enter the organization name "AV Matell", name  "Dima", telephone "0507159718" and email "awesome5040@gmail.com" to the "Affiliate request" form and click the Send request button
    And I take a screenshot with "screen4" name
    Then I should see the "Спасибо за заявку!" message and close this
    Given I navigate to the Admin login page from main page
    And I enter the login "awe5040" and password "Qwerty5040+" and press submit button
    And If an authorization message box appears, I close it
    And I turn to the form settings page in the admin panel
    And If an authorization message box appears, I close it
    And I navigate to the list of all application forms
    And If an authorization message box appears, I close it
    Then I search for my application by name, go to into it and check the data by type "partner"
    Then I delete the application and check that it was successfully deleted


