Feature: LinkFeature
  This feature deals with the links on the page

  @links
  Scenario: Check links to 404 errors
    Given I navigate to the "main" page
    Then checkingLinks