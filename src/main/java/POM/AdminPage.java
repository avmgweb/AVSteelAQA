package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Дмитрий on 04.08.2017.
 */
public class AdminPage extends BasePage {
    public AdminPage(String browser) {
        super(browser);
    }

    public AdminPage(WebDriver driver) {
        super(driver);
    }


    public void closeAutorizationMessage() {
        if (isElementDisplayed(By.className("bx-core-adm-icon-close"))){
            type("click", By.className("bx-core-adm-icon-close"), "");
        }
    }

    public AdminAvmgSettingsFormPage goToSettingsFormPage() throws InterruptedException {
        goToPoints(40, 452);
        if (getDriver().findElement(By.className("adm-header-language")).getText().equals("UA")){
            type("click", By.className("adm-header-language"), "");
            type("click", By.xpath("//*[text()=\"(ru) Russian\"]"), "");
        }
        Thread.sleep(700);
        type("click", By.id("global_menu_services"), "");
        Thread.sleep(700);
        if (!(isElementDisplayed(By.xpath("//*[text()=\"Настройка форм\"]")))){
            type("click", By.xpath("//*[contains (text(), \"Веб-форм\") ]"), "");
        }
        type("click", By.xpath("//*[text()=\"Настройка форм\"]"), "");
        return new AdminAvmgSettingsFormPage(getDriver());
    }
}
