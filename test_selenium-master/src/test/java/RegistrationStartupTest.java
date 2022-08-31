import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationStartupTest {
    private WebDriver driver;
    private MainPage mainPage;
    private StartupRegistrationPage startupRegistrationPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
     //   mainPage = new MainPage(driver);
        startupRegistrationPage = new StartupRegistrationPage(driver);
    }
    @Test
    public void registerWithTwitter(){
        startupRegistrationPage.clickCreateStartup();
        startupRegistrationPage.clickRegisterTwitter();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterEmailTwitter("testtest007@list.ru");
        startupRegistrationPage.entrerPasswordTwiiter("prostopassword007");
        startupRegistrationPage.clickLogin();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals(startupRegistrationPage.textFromRole(), "Startup Name");
    }
    @Test
    public void registerWithLinkedin(){
        startupRegistrationPage.clickCreateStartup();
        startupRegistrationPage.clickRegisterWithLinkedin();
        startupRegistrationPage.enterEmailInLinkedin("testtest007@list.ru");
        startupRegistrationPage.enterPasswordLinkedin("prostopassword007");
        startupRegistrationPage.clickEnterLinkedin();
        Assert.assertEquals(startupRegistrationPage.getTextFromStartup(), "It’s time to take a fresh look at your startup!");
    }
    @Test
    public void registerWithFacebook() throws Exception{
        startupRegistrationPage.clickCreateStartup();
        Thread.currentThread().sleep(3000);
        startupRegistrationPage.clickRegisterFacebook();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.entereEmailFacebook("testtest007@list.ru");
        startupRegistrationPage.enterPasswordFacebook("prostopassword007");
        startupRegistrationPage.clickLogInFacebook();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals(startupRegistrationPage.textFromRole(), "Startup Name");
    }
    @Test
    public void registerWithGoogle() throws Exception{
        startupRegistrationPage.clickCreateStartup();
        String mainTab = startupRegistrationPage.returnToMainTab();
        Thread.currentThread().sleep(2000);
        startupRegistrationPage.clickRegisterGoogle();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterGoogleEmail("testertester00712@gmail.com");
        startupRegistrationPage.clickContinue();
        startupRegistrationPage.enterGooglePassword("prostopassword007");
        startupRegistrationPage.clickContinueAfterPassword();
        startupRegistrationPage.switchToTab(mainTab);
        Thread.currentThread().sleep(1000);
        Assert.assertEquals(startupRegistrationPage.getTextFromStartup(), "It’s time to take a fresh look at your startup!");
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
