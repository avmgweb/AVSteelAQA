package POM;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Дмитрий on 04.08.2017.
 */
public class LoginPage extends BasePage{
    @FindBy(css = "input[name=\"USER_LOGIN\"]")
    private WebElement login;

    @FindBy(css = "input[name=\"USER_PASSWORD\"]")
    private WebElement password;

    @FindBy (css = "input[name=\"Login\"]")
    private WebElement submit;

    public static String url = "https://corp.avmg.com.ua";

    public LoginPage(String browser) {
        super(browser);
        goToUrl(url);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public AdminPage goToMainAdminPage(String login, String password) throws InterruptedException {
        type("write", By.xpath("//*[(@name=\"USER_LOGIN\") and (@tabindex=\"1\")]"), login);
        type("write", By.xpath("//*[(@name=\"USER_PASSWORD\") and (@tabindex=\"2\")]"), password);
        type("click", By.xpath("//*[(@name=\"Login\") and (@tabindex=\"3\")]"),"");
        return new AdminPage(getDriver());
    }
}
