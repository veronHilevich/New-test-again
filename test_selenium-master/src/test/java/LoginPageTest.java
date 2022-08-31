import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private Login login;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
        mainPage = new MainPage(driver);
        login = new Login();
    }

    @Test
    public void loginWithGoogle() throws Exception{
        Login login = mainPage.clickSignIn();
        login.clickGoogle();
        String mainTab = login.returnToMainTab();
        login.switchToWindow();
        login.enterGoogleEmail("testertester00712@gmail.com");
        login.clickContinue();
        login.enterGooglePassword("prostopassword007");
        login.clickContinueAfterPassword();
        login.switchToTab(mainTab);
        Thread.currentThread().sleep(2000);
        Assert.assertEquals(mainPage.getAccountName(), "Test Test");
    }

    @Test
    public void loginWithLinkedIn(){
        Login login = mainPage.clickSignIn();
        login.clickLinkedin();
        String mainTab = login.returnToMainTab();
        login.enterEmailInLinkedin("testtest007@list.ru");
        login.enterPasswordLinkedin("prostopassword007");
        login.clickEnterLinkedin();
        login.switchToTab(mainTab);
        Assert.assertEquals("Test Test", mainPage.getAccountName());

    }

    @Test
    public void loginWithTwitter(){
        Login login = mainPage.clickSignIn();
        login.clickTwitter();
        String mainTab = login.returnToMainTab();
        login.switchToWindow();
        login.enterEmailTwitter("testtest007@list.ru");
        login.enterPasswordTwitter("prostopassword007");
        login.clickEnterAfterPasswordTwitter();
        login.switchToTab(mainTab);
        Assert.assertEquals(mainPage.getAccountName(), "Вероника Гилевич");
    }
    @Test
    public void linkToTheMainPageAfterClickOnLogo(){
        Login login = mainPage.clickSignIn();
        login.clickLogoToMainPage();
        Assert.assertEquals(mainPage.getTextWhatsNewOnRocketDAO(), "What’s new on Rocket DAO");
    }
    @Test
    public void loginWithFacebook(){
        Login login = mainPage.clickSignIn();
        login.clickFacebook();
        String mainTab = login.returnToMainTab();
        login.switchToWindow();
        login.entereEmailFacebook("testtest007@list.ru");
        login.enterPasswordFacebook("prostopassword007");
        login.clickLogInFacebook();
        login.switchToTab(mainTab);
    }
    @Test
   public void loginWithEmail(){
        Login login=mainPage.clickSignIn();
        login.enterEmail("testertester007@mail.ru");
        login.enterJustPassword("Password007");
        login.clickJustLogin();
        Assert.assertEquals(mainPage.getTextWhatsNewOnRocketDAO(), "What’s new on Rocket DAO");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
