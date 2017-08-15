package POM;

import models.AvRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий on 04.08.2017.
 */
public class AdminAvmgResultsFormPage extends BasePage {
    public AdminAvmgResultsFormPage(String browser) {
        super(browser);
    }

    public AdminAvmgResultsFormPage(WebDriver driver) {
        super(driver);
    }

    public AdminAvmgResultsFormPage sortingDown() {
        if (getDriver().findElement(By.xpath("//tbody//td[contains(@title, \"Сортировка: ID\")]")).getAttribute("class").contains("sort-up"))
            getDriver().findElement(By.xpath("//tbody//td[contains(@title, \"Сортировка: ID\")]")).click();
        return this;
    }

    private void goToRequest(String name){
        Boolean flag = false;
        int i = 0;
        List<WebElement> requests = getDriver().findElements(By.xpath("//tr[@class=\"adm-list-table-row\"]"));
        for (WebElement request : requests) {
            List<WebElement> requestsFields = request.findElements(By.tagName("td"));
            System.out.println(requestsFields.size() + name);
            for (WebElement requestFields : requestsFields) {
                i++;
                if (requestFields.getText().equals(name)) {
                    System.out.println(requestFields.getText());
                    Actions action = new Actions(getDriver());
                    action.doubleClick(requestFields).build().perform();
                    flag = true;
                    break;
                }
                if (flag) break;
            }
            if (flag) break;
        }
    }


    public AvRequest getRequest(String name, String fieldName, Map<String, By> selector) {
        AvRequest avrequest = new AvRequest();
        goToRequest(name);
        try{
            switch (fieldName) {
                case "Project calculation" :
                    avrequest.setName(getValueOfElement(selector.get("name")));
                    avrequest.setTelephone(getValueOfElement(selector.get("telephone")));
                    break;

                case "Quick order form" :
                    avrequest.setName(getValueOfElement(selector.get("name")));
                    avrequest.setTelephone(getValueOfElement(selector.get("telephone")));
                    break;

                case "Callback request" :
                    avrequest.setName(getValueOfElement(selector.get("name")));
                    avrequest.setTelephone(getValueOfElement(selector.get("telephone")));
                    break;

                case "Order of corrugated board" :
                    avrequest.setName(getValueOfElement(selector.get("name")));
                    avrequest.setEmail(getValueOfElement(selector.get("mail")));
                    avrequest.setMessage(getValueOfElement(selector.get("message")));
                    break;

                case "Affiliate request" :
                    avrequest.setOrganization(getValueOfElement(selector.get("organization")));
                    avrequest.setName(getValueOfElement(selector.get("name")));
                    avrequest.setTelephone(getValueOfElement(selector.get("telephone")));
                    avrequest.setEmail(getValueOfElement(selector.get("mail")));
                    break;


                default:
                    System.out.println("Такого ключа нет");
                    break;
            }
        } catch (Exception e){
            System.out.println("ERROR" + e.getMessage());
        }
        finally {
            type("click", By.cssSelector("input[name=\"cancel\"]"), "");}
        return avrequest;
    }

    public boolean deleteRequest(String name) throws InterruptedException {
        Boolean flag = false;
        List<WebElement> requests = getDriver().findElements(By.xpath("//tr[@class=\"adm-list-table-row\"]"));
        for (WebElement request : requests) {
            List<WebElement> requestsFields = request.findElements(By.tagName("td"));
            for (WebElement requestFields : requestsFields){
                if (requestFields.getText().equals(name)){
                    request.findElement(By.cssSelector("td[class=\"adm-list-table-cell adm-list-table-popup-block\"]")).click();
                    type("click", By.xpath("//*[text()=\"Удалить\"]"), "");
                    try {
                        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
                        wait.until(ExpectedConditions.alertIsPresent());
                        Alert alert = getDriver().switchTo().alert();
                        alert.accept();
                    } catch (Exception e) {
                    }
                    flag = true;
                    break;
                }
                if (flag) break;
            }
            if (flag) break;
        }
        if (isElementDisplayed((By.xpath("//*[contains(@class, \"adm-list-table-empty\")]"))))
            return false;
        flag = false;
        getDriver().navigate().refresh();
        Thread.sleep(2000);
        requests = getDriver().findElements(By.xpath("//tr[@class=\"adm-list-table-row\"]"));
        for (WebElement request : requests) {
            List<WebElement> requestsFields = request.findElements(By.tagName("td"));
            for (WebElement requestFields : requestsFields){
                if (requestFields.getText().equals(name)){
                    flag = true;
                    break;
                }
                if (flag) break;
            }
            if (flag) break;
        }
        return flag;

    }
}
