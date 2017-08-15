package POM;

import driver.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Дмитрий on 03.08.2017.
 */
public class BasePage {
    private WebDriver driver;
    public  static String pageUrl;

    public BasePage(String browser)
    {
        driver = Driver.getInstance(browser);
        PageFactory.initElements(driver, this);
    }

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public String getUrl(){
        return getDriver().getCurrentUrl();
    }

    public WebDriver  getDriver()
    {
        return this.driver;
    }

    public boolean isElementDisplayed(By by){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> list = driver.findElements(by);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (list.size() == 0) {
            return false;
        } else {
            return list.get(0).isDisplayed();
        }
    }

    public void type (String condition, By locator, String text){
        switch (condition){
            case "click" : (new WebDriverWait(getDriver(), 10))
                    .until(ExpectedConditions.elementToBeClickable(locator));
                getDriver().findElement(locator).click();
                break;
            case "write" : (new WebDriverWait(getDriver(), 10))
                    .until(ExpectedConditions.visibilityOf(getDriver().findElement(locator)));
                getDriver().findElement(locator).clear();
                getDriver().findElement(locator).sendKeys(text);
                break;
            case "clear" : (new WebDriverWait(getDriver(), 10))
                    .until(ExpectedConditions.visibilityOf(getDriver().findElement(locator)));
                getDriver().findElement(locator).clear();
                break;
            case "wait" : (new WebDriverWait(getDriver(), 10))
                    .until(ExpectedConditions.visibilityOf(getDriver().findElement(locator)));
                break;
            default:        System.out.println("ERROR");
                break;
        }

    }

    public String getTextOfElement(By locator){
        (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(getDriver().findElement(locator)));
        return getDriver().findElement(locator).getText();
    }


    public String getValueOfElement(By locator){
        (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(getDriver().findElement(locator)));
        return getDriver().findElement(locator).getAttribute("value");
    }

    public void goToTop(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(250, 0)");
    }

    public void goToPoints(int x, int y){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        String s = "scroll(" + String.valueOf(x) +"," + String.valueOf(y)+")";
        jse.executeScript(s);
    }

    public void setAttribute(WebDriver driver, WebElement element, String attributeName, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, attributeName, value);
    }

    public void takeScreenshot(String name) throws IOException {
        String path = "src/main/java/screenshots/" + name +".jpg";
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(path));
    }

    public String getTitleOfPage() {
        return getDriver().getTitle();
    }

    public String getDescriptionOfPage() {
        return getDriver().findElement(By.xpath("//meta[@name='description']")).getAttribute("content");
    }

    public List<String> getAllLinks() {
        List<String> hrefs = new ArrayList<String>();
        List<WebElement> links = getDriver().findElements(By.tagName("a"));
        for (WebElement link : links) {
            hrefs.add(link.getAttribute("href"));
        }
        return hrefs;
    }
}
