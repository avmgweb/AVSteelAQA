package steps;

import Base.BaseUtil;
import POM.AvsteelBlogPage;
import POM.AvsteelMainPage;
import cucumber.api.java.en.Given;

import java.util.List;

import static links.checkLinks.verifyLinkActive;

/**
 * Created by Дмитрий on 10.08.2017.
 */
public class LinkStep extends BaseUtil{

    private BaseUtil baseUtil;
    public AvsteelMainPage avsteelMainPage;
    public AvsteelBlogPage avsteelBlogPage;
    List<String> linkUrl;

    public LinkStep(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
        this.avsteelMainPage = baseUtil.avsteelMainPage;
    }

    @Given("^checkingLinks$")
    public void checkingLinks() throws Throwable {
        linkUrl = avsteelMainPage.getAllLinks();
        verifyLinkActive(linkUrl);
    }


}
