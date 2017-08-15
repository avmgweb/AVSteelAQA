$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Form.feature");
formatter.feature({
  "line": 1,
  "name": "FormsFeature",
  "description": "This feature deals with the sending forms of the application",
  "id": "formsfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9942542923,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Test the \"Quick order form\" form with correct data",
  "description": "",
  "id": "formsfeature;test-the-\"quick-order-form\"-form-with-correct-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I navigate to the \"Metalochereitsa\" block of the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I call the \u003cMonterey\u003e form and check the appear of the window",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the name  \"Dima\" and telephone \"0507159718\" to the \"Quick order form\" form and click the Send request button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I take a screenshot with \"screen5\" name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see the \"Спасибо за заявку!\" message in Quick order form and close this",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I navigate to the Admin login page from main page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I enter the login \"awe5040\" and password \"Qwerty5040+\" and press submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I turn to the form settings page in the admin panel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I navigate to the list of all application forms",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I search for my application by name, go to into it and check the data by type \"common\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I delete the application and check that it was successfully deleted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Metalochereitsa",
      "offset": 19
    }
  ],
  "location": "FormStep.iNavigateToTheBlockOfTheMainPage(String)"
});
formatter.result({
  "duration": 383840464,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iCallTheMontereyFormAndCheckTheAppearOfTheWindow()"
});
formatter.result({
  "duration": 3360241945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dima",
      "offset": 19
    },
    {
      "val": "0507159718",
      "offset": 40
    },
    {
      "val": "Quick order form",
      "offset": 60
    }
  ],
  "location": "FormStep.iEnterTheNameAndTelephoneToTheFormAndClickTheSendRequestButton(String,String,String)"
});
formatter.result({
  "duration": 2302364388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "screen5",
      "offset": 26
    }
  ],
  "location": "FormStep.iTakeAScreenshotWithName(String)"
});
formatter.result({
  "duration": 715787428,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Спасибо за заявку!",
      "offset": 18
    }
  ],
  "location": "FormStep.iShouldSeeTheMessageInQuickOrderFormAndCloseThis(String)"
});
formatter.result({
  "duration": 477018791,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheAdminLoginPageFromMainPage()"
});
formatter.result({
  "duration": 454555237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "awe5040",
      "offset": 19
    },
    {
      "val": "Qwerty5040+",
      "offset": 42
    }
  ],
  "location": "FormStep.iEnterTheLoginAndPasswordAndPressSubmitButton(String,String)"
});
formatter.result({
  "duration": 1448934713,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 1863675808,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iTurnToTheFormSettingsPageInTheAdminPanel()"
});
formatter.result({
  "duration": 3395900950,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3091603349,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheListOfAllApplicationForms()"
});
formatter.result({
  "duration": 3427974622,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3091619903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "common",
      "offset": 79
    }
  ],
  "location": "FormStep.iSearchForMyApplicationByNameGoToIntoItAndCheckTheDataByType(String)"
});
formatter.result({
  "duration": 3592307074,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iDeleteTheApplicationAndCheckThatItWasSuccessfullyDeleted()"
});
formatter.result({
  "duration": 14911197311,
  "status": "passed"
});
formatter.after({
  "duration": 1223382717,
  "status": "passed"
});
formatter.before({
  "duration": 8874797996,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Test the \"Project calculation\" form with correct data",
  "description": "",
  "id": "formsfeature;test-the-\"project-calculation\"-form-with-correct-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I navigate to the \"National manufacturer\" block of the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I enter the name  \"Dima\" and telephone \"0507159718\" to the \"Project calculation\" form and click the Send request button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I take a screenshot with \"screen1\" name",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should see the \"Спасибо за заявку!\" message and close this",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I navigate to the Admin login page from main page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I enter the login \"awe5040\" and password \"Qwerty5040+\" and press submit button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I turn to the form settings page in the admin panel",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I navigate to the list of all application forms",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I search for my application by name, go to into it and check the data by type \"common\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I delete the application and check that it was successfully deleted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "National manufacturer",
      "offset": 19
    }
  ],
  "location": "FormStep.iNavigateToTheBlockOfTheMainPage(String)"
});
formatter.result({
  "duration": 128176485,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dima",
      "offset": 19
    },
    {
      "val": "0507159718",
      "offset": 40
    },
    {
      "val": "Project calculation",
      "offset": 60
    }
  ],
  "location": "FormStep.iEnterTheNameAndTelephoneToTheFormAndClickTheSendRequestButton(String,String,String)"
});
formatter.result({
  "duration": 1539401111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "screen1",
      "offset": 26
    }
  ],
  "location": "FormStep.iTakeAScreenshotWithName(String)"
});
formatter.result({
  "duration": 1401263227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Спасибо за заявку!",
      "offset": 18
    }
  ],
  "location": "FormStep.iShouldSeeTheMessageAndCloseThis(String)"
});
formatter.result({
  "duration": 379576732,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheAdminLoginPageFromMainPage()"
});
formatter.result({
  "duration": 316360075,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "awe5040",
      "offset": 19
    },
    {
      "val": "Qwerty5040+",
      "offset": 42
    }
  ],
  "location": "FormStep.iEnterTheLoginAndPasswordAndPressSubmitButton(String,String)"
});
formatter.result({
  "duration": 1312620785,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 1772721058,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iTurnToTheFormSettingsPageInTheAdminPanel()"
});
formatter.result({
  "duration": 3312277448,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3029730571,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheListOfAllApplicationForms()"
});
formatter.result({
  "duration": 3447248820,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3057004482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "common",
      "offset": 79
    }
  ],
  "location": "FormStep.iSearchForMyApplicationByNameGoToIntoItAndCheckTheDataByType(String)"
});
formatter.result({
  "duration": 3529615188,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iDeleteTheApplicationAndCheckThatItWasSuccessfullyDeleted()"
});
formatter.result({
  "duration": 13721634415,
  "status": "passed"
});
formatter.after({
  "duration": 1241058431,
  "status": "passed"
});
formatter.before({
  "duration": 8998775311,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Test the \"Callback request\" form with correct data",
  "description": "",
  "id": "formsfeature;test-the-\"callback-request\"-form-with-correct-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "I navigate to the \"National manufacturer\" block of the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "I call the \u003cCallback request\u003e form and check the appear of the window",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I enter the name  \"Dima\" and telephone \"0507159718\" to the \"Callback request\" form and click the Send request button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I take a screenshot with \"screen2\" name",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I should see the \"Спасибо за заявку!\" message and close this",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "I navigate to the Admin login page from main page",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "I enter the login \"awe5040\" and password \"Qwerty5040+\" and press submit button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I turn to the form settings page in the admin panel",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I navigate to the list of all application forms",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "If an authorization message box appears, I close it",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I search for my application by name, go to into it and check the data by type \"common\"",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "I delete the application and check that it was successfully deleted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "National manufacturer",
      "offset": 19
    }
  ],
  "location": "FormStep.iNavigateToTheBlockOfTheMainPage(String)"
});
formatter.result({
  "duration": 95831655,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iCallTheCallbackRequestFormAndCheckTheAppearOfTheWindow()"
});
formatter.result({
  "duration": 546594626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dima",
      "offset": 19
    },
    {
      "val": "0507159718",
      "offset": 40
    },
    {
      "val": "Callback request",
      "offset": 60
    }
  ],
  "location": "FormStep.iEnterTheNameAndTelephoneToTheFormAndClickTheSendRequestButton(String,String,String)"
});
formatter.result({
  "duration": 1216483868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "screen2",
      "offset": 26
    }
  ],
  "location": "FormStep.iTakeAScreenshotWithName(String)"
});
formatter.result({
  "duration": 1207081675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Спасибо за заявку!",
      "offset": 18
    }
  ],
  "location": "FormStep.iShouldSeeTheMessageAndCloseThis(String)"
});
formatter.result({
  "duration": 328585443,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheAdminLoginPageFromMainPage()"
});
formatter.result({
  "duration": 312329760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "awe5040",
      "offset": 19
    },
    {
      "val": "Qwerty5040+",
      "offset": 42
    }
  ],
  "location": "FormStep.iEnterTheLoginAndPasswordAndPressSubmitButton(String,String)"
});
formatter.result({
  "duration": 1274407446,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3051879926,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iTurnToTheFormSettingsPageInTheAdminPanel()"
});
formatter.result({
  "duration": 3166960617,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 380150174,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iNavigateToTheListOfAllApplicationForms()"
});
formatter.result({
  "duration": 3369390857,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.ifAnAuthorizationMessageBoxAppearsICloseIt()"
});
formatter.result({
  "duration": 3121038261,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "common",
      "offset": 79
    }
  ],
  "location": "FormStep.iSearchForMyApplicationByNameGoToIntoItAndCheckTheDataByType(String)"
});
formatter.result({
  "duration": 3030112646,
  "status": "passed"
});
formatter.match({
  "location": "FormStep.iDeleteTheApplicationAndCheckThatItWasSuccessfullyDeleted()"
});
formatter.result({
  "duration": 13486669631,
  "status": "passed"
});
formatter.after({
  "duration": 1106983309,
  "status": "passed"
});
