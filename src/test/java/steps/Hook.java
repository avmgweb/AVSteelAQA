package steps;

import Base.BaseUtil;
import POM.AdminPage;
import POM.AvsteelMainPage;
import POM.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Driver;
import sun.rmi.runtime.Log;

/**
 * Created by Дмитрий on 03.08.2017.
 */
public class Hook extends BaseUtil{

    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
    }

    @Before
    public void InitializeTest(){
        baseUtil.setAvsteelMainPage(new AvsteelMainPage("chrome"));
        Driver.maximize();
    }

    @After
    public void tearDowntest(){
        Driver.tearDown();
        Driver.nullDriver();
    }

}
