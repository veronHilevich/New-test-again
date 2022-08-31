import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void goToLogin(){
        Login login = mainPage.clickSignIn();
        String actualresult = login.getTextLogin();
        Assert.assertEquals("Login",actualresult);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
