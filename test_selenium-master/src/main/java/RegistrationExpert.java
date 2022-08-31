import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationExpert {
    private WebDriver driver;
    public RegistrationExpert(WebDriver driver){
        this.driver = driver;
    }

    private By BUTTON_BACK = By.xpath("//div[@class=\"block-button-left\"]");
    private By TEXT_EXPERT_ROLES = By.xpath("title-top-page-reg-expert text-h1 left-text shell-margin-bottom-20");
    private By BUTTON_SUPERVIZOR = By.xpath("//div[@class=\"block-cart-choose center\"]//div[@class=\"block-button-3-0 button-3-0-blue \"]");
    private By PROGRESS = By.xpath("//div[@class=\"active-line\"]");
    private By BUTTON_EXPERT = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/p");
    private By BUTTON_SAVE_AND_CONTINUE = By.xpath("//div[@class=\"block-button-right\"]");
    private By FIELD_RESEDENCY = By.xpath("(//img[@src=\"/static/media/arrows_top_bottom.7445d5ed.svg\"])[1]");
    private By TEXT_ALBANIA = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/p");
    private By TEXT_FROM_FIELD_AFTER_INPUT_RESEDENCY = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div[1]/div/div[1]/p");
    public RegistrationExpert() {

    }

    public RegistrationExpert clickBack(){
        driver.findElement(BUTTON_BACK).click();
        return new RegistrationExpert(driver);
    }
    public String getTextFromTitleTopPage(){
        return driver.findElement(TEXT_EXPERT_ROLES).getText();
    }
    public RegistrationExpert clickRoleSupervizor(){
        driver.findElement(BUTTON_SUPERVIZOR).click();
        return new RegistrationExpert(driver);
    }
    public String getAtribyte(){
        return driver.findElement(PROGRESS).getAttribute("style");
    }
    public String getNameChooseButton(){
        return driver.findElement(BUTTON_SUPERVIZOR).getText();
    }
    public String getTextFromExpertButton(){
        return driver.findElement(BUTTON_EXPERT).getText();
    }
    public RegistrationExpert clickSaveAndContinue(){
        driver.findElement(BUTTON_SAVE_AND_CONTINUE).click();
        return new RegistrationExpert(driver);
    }
    public RegistrationExpert clickFieldResedency(){
        driver.findElement(FIELD_RESEDENCY).click();
        return new RegistrationExpert(driver);
    }
    public RegistrationExpert selectAlbania(){
        driver.findElement(TEXT_ALBANIA).click();
        return new RegistrationExpert(driver);
    }
    public String getTextFromFieldResedency(){
        return driver.findElement(TEXT_FROM_FIELD_AFTER_INPUT_RESEDENCY).getText();
    }
}
