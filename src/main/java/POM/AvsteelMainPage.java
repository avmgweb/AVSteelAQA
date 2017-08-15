package POM;

import models.AvRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий on 03.08.2017.
 */
public class AvsteelMainPage extends BasePage {

    String url = "https://www.avsteel.com.ua/";

    public AvsteelMainPage(String browser) {
        super(browser);
        goToUrl(url);
    }

    public AvsteelMainPage(WebDriver driver) {
        super(driver);
    }

    public AvsteelMainPage goToBlock(String block) {
        switch (block){
            case ("National manufacturer") : goToUrl(url + "#upLinks"); break;
            case ("How we work") : goToUrl(url + "#how_we_work"); break;
            case ("Ral colors") : goToUrl(url + "#ral_colors_href"); break;
            case ("Metalochereitsa") : goToUrl(url + "#metalochereitsa"); break;
            case ("Profnastil") : goToUrl(url + "#profnastil"); break;
            default: break;
        }
        return this;
    }

    public String sendFormAndGetId(String formName, Map<String, By> selectors, AvRequest avRequest) throws InterruptedException {

        switch (formName){
            case ("Project calculation") :
                type("write", selectors.get("name"), avRequest.getName());
                type("write", selectors.get("telephone"), avRequest.getTelephone());
                type("click", selectors.get("submit"), "");
                return getDriver().findElement(selectors.get("idForm")).getAttribute("value");

            case ("Callback request") :
                type("write", selectors.get("name"), avRequest.getName());
                type("write", selectors.get("telephone"), avRequest.getTelephone());
                type("click", selectors.get("submit"), "");
                return getDriver().findElement(selectors.get("idForm")).getAttribute("value");

            case ("Affiliate request") :
                type("write", selectors.get("organization"), avRequest.getOrganization());
                type("write", selectors.get("name"), avRequest.getName());
                type("write", selectors.get("telephone"), avRequest.getTelephone());
                type("write", selectors.get("mail"), avRequest.getEmail());
                type("click", selectors.get("submit"), "");
                return getDriver().findElement(selectors.get("idForm")).getAttribute("value");

            case ("Order of corrugated board") :
                type("write", selectors.get("name"), avRequest.getName());
                type("write", selectors.get("mail"), avRequest.getEmail());
                type("write", selectors.get("message"), avRequest.getMessage());
                type("click", selectors.get("submit"), "");
                return getDriver().findElement(selectors.get("idForm")).getAttribute("value");

            case ("Quick order form") :
                type("write", selectors.get("name"), avRequest.getName());
                type("write", selectors.get("telephone"), avRequest.getTelephone());
                String idForm = getDriver().findElement(selectors.get("idForm")).getAttribute("value");
                type("click", selectors.get("submit"), "");
                return idForm;

            default:
                    return "";
        }
    }

    public List<Object> getMessage() {
        List<Object> data = new ArrayList<>();
        data.add(0, getDriver().findElements(By.id("popUp-text-fromForm")).get(1).getText());
        getDriver().findElements(By.id("popUp-text-fromForm")).get(1).click();
    return data;
    }

    public void closeMessage(){
        getDriver().findElement(By.xpath("//*[@class=\"av-alert-popup\"]/div")).click();
    }

    public LoginPage goToLoginPage() {
        goToUrl("https://www.avsteel.com.ua/bitrix");
        return new LoginPage(getDriver());
    }

    public AvsteelMainPage callCallbackRequestForm() {
        type("click", By.xpath("//*[@class=\"container\"]//*[@class=\"call-btn\"]/a"), "");
        return this;
    }

    public boolean isCallbackRequestFormDisplayed(){
        return isElementDisplayed(By.id("comp_3c873388fc350fac0f05e5ef2e3f928f"));
    }

    public AvsteelMainPage callPartnersForm() {
        type("click", By.id("partners-form-btn"), "");
        return this;
    }

    public boolean isPartnersFormDisplayed(){
        return isElementDisplayed(By.id("comp_d17ce487bae523748abb80fd2c221cbf"));
    }

    public AvsteelMainPage callMontereyForm() {
        type("click", By.xpath("//*[@id=\"hover-section-2\"]//*[@data-red-btn]"),"");
        return this;
    }

    public boolean isMontereyFormDisplayed(){
        return isElementDisplayed(By.id("alertpopup4"));
    }

    public List<Object> getMessageFromQuickOrderForm() {
        List<Object> data = new ArrayList<>();
        data.add(0, getDriver().findElements(By.id("popUp-text-fromForm")).get(0).getText());
        getDriver().findElements(By.id("popUp-text-fromForm")).get(0).click();
        return data;
    }

    public boolean checkQuickOrderForms(int i) throws InterruptedException {
        if ((i%3==0) && (i!=0)) {
            Actions action = new Actions(getDriver());
            action.moveToElement(getDriver().findElements(By.cssSelector("div[class=\"text-uppercase catalog-btn\"]")).get(i)).build().perform();
        }
        (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.elementToBeClickable(getDriver().findElements(By.cssSelector("div[class=\"text-uppercase catalog-btn\"]")).get(i)));
        Thread.sleep(2500);
        getDriver().findElements(By.cssSelector("div[class=\"text-uppercase catalog-btn\"]")).get(i).click();
        return isElementDisplayed(By.id("comp_9b85c61be70c299fecb0582e18d6f080"));
    }

    public AvsteelMainPage closeQuickOrderForm() {
        type("click", By.cssSelector("div[close-form4]"), "");
        return this;
    }

    public int getQuantityQuickOrderForms() {
        return  getDriver().findElements(By.cssSelector("div[class=\"text-uppercase catalog-btn\"]")).size();
    }

    public AvsteelBlogPage goToBlogPage() throws InterruptedException {
        getDriver().findElements(By.cssSelector("a[href*=\"blog\"]")).get(2).click();
        return new AvsteelBlogPage(getDriver());
    }

    public String getColor() {
    return getDriver().findElement(By.id("ral-image-tab-1")).getCssValue("color");
    }
}
