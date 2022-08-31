import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpertRegistrationPage {
    private WebDriver driver;
    public ExpertRegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    private By BUTTON_JOIN_EXPERT = By.xpath("//a[@href='/start_reg?type=2']");
    private By EXPERT_SUCCESS = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div/div/p[1]");


    public StartupRegistrationPage clickJoinExpert(){
        driver.findElement(BUTTON_JOIN_EXPERT).click();
        return new StartupRegistrationPage(driver);
    }
    public String textFromRole(){
        return driver.findElement(EXPERT_SUCCESS).getText();
    }


}
