package steps;

import Base.BaseUtil;
import POM.AvsteelBlogPage;
import POM.AvsteelMainPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.testng.Assert;

/**
 * Created by Дмитрий on 09.08.2017.
 */
public class SeoStep extends BaseUtil{

    private BaseUtil baseUtil;
    public AvsteelMainPage avsteelMainPage;
    public AvsteelBlogPage avsteelBlogPage;

    public SeoStep(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
        this.avsteelMainPage = baseUtil.avsteelMainPage;
    }


    @Given("^I navigate to the \"([^\"]*)\" page$")
    public void iNavigateToThePage(String arg0) throws Throwable {

    }

    @Then("^I check that  main page has a title \"([^\"]*)\"$")
    public void iCheckThatMainPageHasATitle(String title) throws Throwable {
        Assert.assertEquals(title, avsteelMainPage.getTitleOfPage());
    }

    @Then("^I check that  main page has a description \"([^\"]*)\"$")
    public void iCheckThatMainPageHasADescription(String description) throws Throwable {
        Assert.assertEquals(description, avsteelMainPage.getDescriptionOfPage());
    }

    @And("^I navigate to the \"([^\"]*)\" page from main page$")
    public void iNavigateToThePageFromMainPage(String page) throws Throwable {
        switch (page){
            case "blog"  :   avsteelBlogPage = avsteelMainPage.goToBlogPage(); break;
            default      :   break;
        }
    }

    @Then("^I check that  blog page has a title \"([^\"]*)\"$")
    public void iCheckThatBlogPageHasATitle(String title) throws Throwable {
        Assert.assertEquals(title, avsteelBlogPage.getTitleOfPage());

    }


    @Then("^I check that  blog page has a description \"([^\"]*)\"$")
    public void iCheckThatBlogPageHasADescription(String description) throws Throwable {
        Assert.assertEquals(description, avsteelBlogPage.getDescriptionOfPage());
    }

    @And("^I navigate to the \"([^\"]*)\" block of the main page seo$")
    public void iNavigateToTheBlockOfTheMainPageSeo(String block) throws Throwable {
        avsteelMainPage.goToBlock(block);
         //https://github.com/avmgweb/AVMetallAQA/blob/master/src/test/java/checkLinks.java
    }
}
