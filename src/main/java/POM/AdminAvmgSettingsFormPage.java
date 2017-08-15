package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Дмитрий on 04.08.2017.
 */
public class AdminAvmgSettingsFormPage extends BasePage{

    public AdminAvmgSettingsFormPage(String browser) {
        super(browser);
    }

    public AdminAvmgSettingsFormPage(WebDriver driver) {
        super(driver);
    }

    public AdminAvmgResultsFormPage goToResultsFormPage(String id) throws InterruptedException {
        String xpath = "//a[contains(@href,'form_result_list.php?lang=ru&WEB_FORM_ID=" + id + "')]";
        if (!getDriver().findElement(By.cssSelector("input[name=\"find_id\"]")).isDisplayed()) {
            type("click", By.className("adm-filter-add-button"), "");
            type("click", By.xpath("//*[@class = \"bx-core-popup-menu-item-text\" and contains(text(), 'ID формы') ]"), "");
        }
        type("write", By.cssSelector("input[name=\"find_id\"]"), id);
        type("click", By.cssSelector("input[name=\"set_filter\"]"), "");
        Thread.sleep(1500);
        type("click", By.xpath(xpath), "");
        return new AdminAvmgResultsFormPage(getDriver());
    }
}
