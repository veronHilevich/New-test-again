import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationInvestorTest {
    private WebDriver driver;
    private InvestorRegistrationPage investorRegistrationPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
        investorRegistrationPage = new InvestorRegistrationPage(driver);
    }
    @Test
    public void registerWithTwitter() {
        StartupRegistrationPage startupRegistrationPage = investorRegistrationPage.clickBecomeInvestor();
        startupRegistrationPage.clickRegisterTwitter();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterEmailTwitter("testtest007@list.ru");
        startupRegistrationPage.entrerPasswordTwiiter("prostopassword007");
        startupRegistrationPage.clickLogin();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals(investorRegistrationPage.textFromRole(), "It’s time to start a unicorns’ hunting!");
    }
    @Test
    public void registerWithLinkedin(){
        StartupRegistrationPage startupRegistrationPage = investorRegistrationPage.clickBecomeInvestor();
        startupRegistrationPage.clickRegisterWithLinkedin();
        startupRegistrationPage.enterEmailInLinkedin("testtest007@list.ru");
        startupRegistrationPage.enterPasswordLinkedin("prostopassword007");
        startupRegistrationPage.clickEnterLinkedin();
        Assert.assertEquals(investorRegistrationPage.textFromRole(), "It’s time to start a unicorns’ hunting!");
    }
    @Test
    public void registerWithFacebook() throws Exception{
        StartupRegistrationPage startupRegistrationPage = investorRegistrationPage.clickBecomeInvestor();
        Thread.currentThread().sleep(2000);
        startupRegistrationPage.clickRegisterFacebook();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.entereEmailFacebook("testtest007@list.ru");
        startupRegistrationPage.enterPasswordFacebook("prostopassword007");
        startupRegistrationPage.clickLogInFacebook();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals(investorRegistrationPage.textFromRole(), "It’s time to start a unicorns’ hunting!");
    }
    @Test
    public void registerWithGoogle() throws Exception{
        StartupRegistrationPage startupRegistrationPage = investorRegistrationPage.clickBecomeInvestor();
        String mainTab = startupRegistrationPage.returnToMainTab();
        Thread.currentThread().sleep(3000);
        startupRegistrationPage.clickRegisterGoogle();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterGoogleEmail("testertester00712@gmail.com");
        startupRegistrationPage.clickContinue();
        startupRegistrationPage.enterGooglePassword("prostopassword007");
        startupRegistrationPage.clickContinueAfterPassword();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals(investorRegistrationPage.textFromRole(), "It’s time to start a unicorns’ hunting!");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
