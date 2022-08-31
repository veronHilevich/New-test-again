import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvestorRegistrationPage {
    private WebDriver driver;
    public InvestorRegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    private By BUTTON_BECOME_INVESTOR = By.xpath("//a[@href='/start_investor']");
    private By INVESTOR_SUCCESS = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div/div/p[1]");

    public StartupRegistrationPage clickBecomeInvestor(){
        driver.findElement(BUTTON_BECOME_INVESTOR).click();
        return new StartupRegistrationPage(driver);
    }

    public String textFromRole(){
        return driver.findElement(INVESTOR_SUCCESS).getText();
    }
}
