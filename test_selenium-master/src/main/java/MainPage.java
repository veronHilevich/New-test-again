import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    private By LOGIN_BUTTON = By.xpath("//div[@class=\"right-no-reg-user\"]");
    private By ACCOUNT_NAME = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div[3]/div/div/p");
    private By WHATS_NEW_ON_ROCKETDAO = By.xpath("//div[@class=\"new-mp-rocket\"]");
    private By BUTTON_CREATE_STARTUP = By.xpath("//a[@href='/start_reg?type=3']");
    private By BUTTON_BECOME_INVESTOR = By.xpath("//a[@href='/start_investor']");
    private By BUTTON_LOGOUT = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div[3]/div/span");
    private By BUTTON_JOIN_EXPERT = By.xpath("//a[@href='/start_reg?type=2']");

    public Login clickSignIn(){
        driver.findElement(LOGIN_BUTTON).click();
        return new Login(driver);
    }
    public String getAccountName(){
        return driver.findElement(ACCOUNT_NAME).getText();
    }
    public String getTextWhatsNewOnRocketDAO(){
        return driver.findElement(WHATS_NEW_ON_ROCKETDAO).getText();
    }
    public MainPage clickCreateStartup(){
        driver.findElement(BUTTON_CREATE_STARTUP).click();
        return new MainPage(driver);
    }
    public void clickLogout(){
        driver.findElement(BUTTON_LOGOUT).click();
    }
    public RegistrationExpert clickJoinExpert(){
        driver.findElement(BUTTON_JOIN_EXPERT).click();
        return new RegistrationExpert(driver);
    }

}
