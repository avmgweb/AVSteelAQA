package steps;

import Base.BaseUtil;
import POM.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.AvRequest;
import org.openqa.selenium.By;
import org.testng.Assert;
import selector.selectors;

import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий on 03.08.2017.
 */
public class FormStep extends BaseUtil{

    private BaseUtil baseUtil;
    public String formId;
    public AvsteelMainPage avsteelMainPage;
    public LoginPage loginPage;
    public AdminPage adminPage;
    public AdminAvmgSettingsFormPage adminAvmgSettingsFormPage;
    public AdminAvmgResultsFormPage adminAvmgResultsFormPage;
    AvRequest avRequest;
    AvRequest avRequestRez;
    Map<String, By> selector;
    String formName;


    public FormStep(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
        this.avsteelMainPage = baseUtil.avsteelMainPage;

    }


    @And("^I enter the name  \"([^\"]*)\" and telephone \"([^\"]*)\" to the \"([^\"]*)\" form and click the Send request button$")
    public void iEnterTheNameAndTelephoneToTheFormAndClickTheSendRequestButton(String name, String telephone, String formName) throws Throwable {
        this.formName = formName;
        selector =  selectors.getSelectors(formName);
        avRequest = new AvRequest(name,telephone);
        formId = avsteelMainPage.sendFormAndGetId(formName, selector, avRequest);
    }


    @Then("^I should see the \"([^\"]*)\" message and close this$")
    public void iShouldSeeTheMessageAndCloseThis(String message) throws Throwable {
        List <Object> data = avsteelMainPage.getMessage();
        avsteelMainPage.closeMessage();
        Assert.assertTrue(data.get(0).toString().contains(message));
    }


    @And("^I take a screenshot with \"([^\"]*)\" name$")
    public void iTakeAScreenshotWithName(String name) throws Throwable {
        avsteelMainPage.takeScreenshot(name);
    }

    @And("^If an authorization message box appears, I close it$")
    public void ifAnAuthorizationMessageBoxAppearsICloseIt() throws Throwable {
        adminPage.closeAutorizationMessage();

    }

    @Given("^I navigate to the Admin login page from main page$")
    public void iNavigateToTheAdminLoginPageFromMainPage() throws Throwable {
        loginPage = avsteelMainPage.goToLoginPage();
    }

    @And("^I enter the login \"([^\"]*)\" and password \"([^\"]*)\" and press submit button$")
    public void iEnterTheLoginAndPasswordAndPressSubmitButton(String name, String password) throws Throwable {
        adminPage = loginPage.goToMainAdminPage(name, password);
    }

    @And("^I turn to the form settings page in the admin panel$")
    public void iTurnToTheFormSettingsPageInTheAdminPanel() throws Throwable {
        adminAvmgSettingsFormPage = adminPage.goToSettingsFormPage();
    }


    @And("^I navigate to the list of all application forms$")
    public void iNavigateToTheListOfAllApplicationForms() throws Throwable {
        adminAvmgResultsFormPage = adminAvmgSettingsFormPage.goToResultsFormPage(formId);
    }



    @Then("^I search for my application by name, go to into it and check the data by type \"([^\"]*)\"$")
    public void iSearchForMyApplicationByNameGoToIntoItAndCheckTheDataByType(String type) throws Throwable {
        adminAvmgResultsFormPage.sortingDown();
        avRequestRez = adminAvmgResultsFormPage.getRequest(avRequest.getName(), formName, selector);
        switch (type) {
            case ("common"):
                Assert.assertEquals(avRequest.getName(), avRequestRez.getName());
                Assert.assertEquals(avRequest.getTelephone(), avRequestRez.getTelephone());
                break;

            case ("goods"):
                Assert.assertEquals(avRequest.getName(), avRequestRez.getName());
                Assert.assertEquals(avRequest.getTelephone(), avRequestRez.getTelephone());
                break;

            case ("quickOrder"):
                Assert.assertEquals(avRequest.getName(), avRequestRez.getName());
                Assert.assertEquals(avRequest.getEmail(), avRequestRez.getEmail());
                Assert.assertEquals(avRequest.getMessage(), avRequestRez.getMessage());
                break;

            case ("partner"):
                Assert.assertEquals(avRequest.getOrganization(), avRequestRez.getOrganization());
                Assert.assertEquals(avRequest.getName(), avRequestRez.getName());
                Assert.assertEquals(avRequest.getEmail(), avRequestRez.getEmail());
                Assert.assertEquals(avRequest.getTelephone(), avRequestRez.getTelephone());
                break;
        }
    }

    @Then("^I delete the application and check that it was successfully deleted$")
    public void iDeleteTheApplicationAndCheckThatItWasSuccessfullyDeleted() throws Throwable {
        Assert.assertFalse(adminAvmgResultsFormPage.deleteRequest(avRequest.getName()));
    }

    @Then("^I call the <Callback request> form and check the appear of the window$")
    public void iCallTheCallbackRequestFormAndCheckTheAppearOfTheWindow() throws Throwable {
        avsteelMainPage.callCallbackRequestForm();
        Assert.assertTrue(avsteelMainPage.isCallbackRequestFormDisplayed());
    }

    @And("^I enter the name  \"([^\"]*)\", email \"([^\"]*)\", and message \"([^\"]*)\" to the \"([^\"]*)\" form and click the Send request button$")
    public void iEnterTheNameEmailAndMessageToTheFormAndClickTheSendRequestButton(String name, String email, String message, String formName) throws Throwable {
        this.formName = formName;
        selector =  selectors.getSelectors(formName);
        avRequest = new AvRequest(name, email, message);
        formId = avsteelMainPage.sendFormAndGetId(formName, selector, avRequest);
    }

    @Then("^I call the <Partners Form> form and check the appear of the window$")
    public void iCallThePartnersFormFormAndCheckTheAppearOfTheWindow() throws Throwable {
        avsteelMainPage.callPartnersForm();
        Assert.assertTrue(avsteelMainPage.isPartnersFormDisplayed());
    }

    @And("^I enter the organization name \"([^\"]*)\", name  \"([^\"]*)\", telephone \"([^\"]*)\" and email \"([^\"]*)\" to the \"([^\"]*)\" form and click the Send request button$")
    public void iEnterTheOrganizationNameNameTelephoneAndEmailToTheFormAndClickTheSendRequestButton(String organization, String name, String telephone, String mail, String formName) throws Throwable {
        this.formName = formName;
        selector =  selectors.getSelectors(formName);
        avRequest = new AvRequest(organization, name, telephone, mail);
        formId = avsteelMainPage.sendFormAndGetId(formName, selector, avRequest);
    }

    @Then("^I call the <Monterey> form and check the appear of the window$")
    public void iCallTheMontereyFormAndCheckTheAppearOfTheWindow() throws Throwable {
        avsteelMainPage.callMontereyForm();
        Assert.assertTrue(avsteelMainPage.isMontereyFormDisplayed());
    }

    @Then("^I should see the \"([^\"]*)\" message in Quick order form and close this$")
    public void iShouldSeeTheMessageInQuickOrderFormAndCloseThis(String message) throws Throwable {
        List <Object> data = avsteelMainPage.getMessageFromQuickOrderForm();
        avsteelMainPage.closeMessage();
        Assert.assertTrue(data.get(0).toString().contains(message));
    }

    @Then("^I open all Profnastil quick order forms and check the appear of the window$")
    public void iOpenAllProfnastilQuickOrderFormsAndCheckTheAppearOfTheWindow() throws Throwable {
        for (int i=0; i<avsteelMainPage.getQuantityQuickOrderForms(); i++){
            Assert.assertTrue(avsteelMainPage.checkQuickOrderForms(i));
            avsteelMainPage.closeQuickOrderForm();
        }

    }

    @Given("^I navigate to the \"([^\"]*)\" block of the main page$")
    public void iNavigateToTheBlockOfTheMainPage(String block) throws Throwable {
        avsteelMainPage.goToBlock(block);
    }
}





