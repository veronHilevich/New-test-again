import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationExpertTest {
    private WebDriver driver;
    private ExpertRegistrationPage expertRegistrationPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
        expertRegistrationPage = new ExpertRegistrationPage(driver);
    }
    @Test
    public void registerWithTwitter() {
        StartupRegistrationPage startupRegistrationPage = expertRegistrationPage.clickJoinExpert();
        startupRegistrationPage.clickRegisterTwitter();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterEmailTwitter("testtest007@list.ru");
        startupRegistrationPage.entrerPasswordTwiiter("prostopassword007");
        startupRegistrationPage.clickLogin();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals("There are a few steps to be taken before joining Rocket DAO - an international venture community and a blockchain platform where startups get expert support and connect with investors.",expertRegistrationPage.textFromRole());
    }
    @Test
    public void registerWithLinkedin(){
        StartupRegistrationPage startupRegistrationPage = expertRegistrationPage.clickJoinExpert();
        startupRegistrationPage.clickRegisterWithLinkedin();
        startupRegistrationPage.enterEmailInLinkedin("testtest007@list.ru");
        startupRegistrationPage.enterPasswordLinkedin("prostopassword007");
        startupRegistrationPage.clickEnterLinkedin();
        Assert.assertEquals("There are a few steps to be taken before joining Rocket DAO - an international venture community and a blockchain platform where startups get expert support and connect with investors.",expertRegistrationPage.textFromRole());
    }
    @Test
    public void registerWithFacebook() throws Exception{
        StartupRegistrationPage startupRegistrationPage = expertRegistrationPage.clickJoinExpert();
        Thread.currentThread().sleep(2000);
        startupRegistrationPage.clickRegisterFacebook();
        String mainTab = startupRegistrationPage.returnToMainTab();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.entereEmailFacebook("testtest007@list.ru");
        startupRegistrationPage.enterPasswordFacebook("prostopassword007");
        startupRegistrationPage.clickLogInFacebook();
        startupRegistrationPage.switchToTab(mainTab);
        Assert.assertEquals("There are a few steps to be taken before joining Rocket DAO - an international venture community and a blockchain platform where startups get expert support and connect with investors.",expertRegistrationPage.textFromRole());
    }
    @Test
    public void registerWithGoogle() throws Exception{
        StartupRegistrationPage startupRegistrationPage = expertRegistrationPage.clickJoinExpert();
        String mainTab = startupRegistrationPage.returnToMainTab();
        Thread.currentThread().sleep(3000);
        startupRegistrationPage.clickRegisterGoogle();
        startupRegistrationPage.switchToWindow();
        startupRegistrationPage.enterGoogleEmail("testertester00712@gmail.com");
        startupRegistrationPage.clickContinue();
        startupRegistrationPage.enterGooglePassword("prostopassword007");
        startupRegistrationPage.clickContinueAfterPassword();
        startupRegistrationPage.switchToTab(mainTab);
        Thread.currentThread().sleep(1000);
        Assert.assertEquals("There are a few steps to be taken before joining Rocket DAO - an international venture community and a blockchain platform where startups get expert support and connect with investors.",expertRegistrationPage.textFromRole());
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
