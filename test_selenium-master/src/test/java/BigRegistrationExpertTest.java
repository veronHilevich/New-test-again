import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BigRegistrationExpertTest {
    private WebDriver driver;
    private MainPage mainPage;
    private Login login;
    private RegistrationExpert registrationExpert;
    private BigRegistrationExpertTest bigRegistrationExpertTest;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rocketdao.io/");
        mainPage = new MainPage(driver);
        login = new Login();
        Login login = mainPage.clickSignIn();
        login.clickGoogle();
        String mainTab = login.returnToMainTab();
        login.switchToWindow();
        login.enterGoogleEmail("testertester00712@gmail.com");
        login.clickContinue();
        login.enterGooglePassword("prostopassword007");
        login.clickContinueAfterPassword();
        login.switchToTab(mainTab);
    }

    @Test
    public void abilityJoinExpert() {
        registrationExpert = new RegistrationExpert();
        RegistrationExpert registrationExpert = mainPage.clickJoinExpert();
    }

    @Test
    public void clickExpertRole() {
        registrationExpert = new RegistrationExpert();
        RegistrationExpert registrationExpert = mainPage.clickJoinExpert();
        String progress = registrationExpert.getAtribyte();
        int start = 7;
        int end = 9;
        char[] buf = new char[end - start];
        progress.getChars(start, end, buf, 0);
        String s = String.valueOf(buf);
        String progressWithoutSpace = s.replaceAll(" ", "");
        progressWithoutSpace = s.replaceAll("%","");
        int progressWithoutSpaseInt = Integer.parseInt(progressWithoutSpace);
        if (progressWithoutSpaseInt > 20) {
            while (!progress.equals("width: 20%;")) {
                registrationExpert.clickBack();
                progress = registrationExpert.getAtribyte();
            }
            if (registrationExpert.getNameChooseButton().equals("Choose")) {
                registrationExpert.clickRoleSupervizor();
            }
            String actualResult = registrationExpert.getTextFromExpertButton();
            Assert.assertEquals("Cancel", actualResult);
        }
        else
            while (!progress.equals("width: 20%;")) {
                registrationExpert.clickSaveAndContinue();
                progress = registrationExpert.getAtribyte();
            }
        Assert.assertEquals("Cancel", actuaResult());
    }
    public String actuaResult(){
        if (registrationExpert.getNameChooseButton().equals("Choose")) {
            registrationExpert.clickRoleSupervizor();
        }
        return registrationExpert.getTextFromExpertButton();
    }
    @Test
    public void residencyInCommunity(){
        registrationExpert = new RegistrationExpert();
        RegistrationExpert registrationExpert = mainPage.clickJoinExpert();
        String progress = registrationExpert.getAtribyte();
        int start = 7;
        int end = 9;
        char[] buf = new char[end - start];
        progress.getChars(start, end, buf, 0);
        String s = String.valueOf(buf);
        String progressWithoutSpace = s.replaceAll(" ", "");
        progressWithoutSpace = s.replaceAll("%","");
        int progressWithoutSpaseInt = Integer.parseInt(progressWithoutSpace);
        if (progressWithoutSpaseInt > 29) {
            while (!progress.equals("width: 29%;")) {
                registrationExpert.clickBack();
                progress = registrationExpert.getAtribyte();
            }
            registrationExpert.clickFieldResedency();
            registrationExpert.selectAlbania();
            String actualResult = registrationExpert.getTextFromFieldResedency();
            Assert.assertEquals("Albania", actualResult);
        }
        else
            while (!progress.equals("width: 29%;")) {
                registrationExpert.clickSaveAndContinue();
                progress = registrationExpert.getAtribyte();
            }
             registrationExpert.clickFieldResedency();
            registrationExpert.selectAlbania();
        String actualResult = registrationExpert.getTextFromFieldResedency();
        Assert.assertEquals("Albania", actualResult);
    }

    @After
    public void exit(){
    //    driver.quit();
    }

}



