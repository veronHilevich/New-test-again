import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartupRegistrationPage {
    private WebDriver driver;
    public StartupRegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    private By BUTTON_REGISTER_TWITTER = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[2]/button/div/p");
    private By BUTTON_CREATE_STARTUP = By.xpath("//a[@href='/start_reg?type=3']");
    private By FIELD_EMAIL = By.xpath("//*[@id=\"username_or_email\"]");
    private By FIELD_PASSWORD = By.xpath("//*[@id=\"password\"]");
    private By BUTTON_ENTER = By.xpath("//*[@id=\"allow\"]");
    private By STARTUP_SUCCESS = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/p");
    private By BUTTON_REGISTER_LINKEDIN = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[4]/p");
    private By FIELD_EMAIL_LINKEDIN = By.xpath("//*[@id=\"app__container\"]/main/div/form/div[1]/label");
    private By FIELD_EMAIL_LINKEDIN_TEXT = By.xpath("//*[@id=\"username\"]");
    private By FIELD_PASSWORD_LINKEDIN = By.xpath("//*[@id=\"password\"]");
    private By BUTTON_ENTER_LINKEDIN = By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
    private By TEXT_STARTUP = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div/div[1]/div[1]/div/div/p[1]");
    private By BUTTON_REGISTER_FACEBOOK = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[3]/p");
    private By FIELD_EMAIL_FACEBOOK = By.xpath("//*[@id=\"email\"]");
    private By FIELD_PASSWORD_FACEBOOK = By.xpath("//*[@id=\"pass\"]");
    private By BUTTON_LOGIN_FACEBOOK =By.xpath("//*[@id=\"u_0_0\"]");
    private By BUTTON_REGISTER_GOOGLE = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[1]/button/div/p");
    private By EMAIL_GOOGLE = By.xpath("//*[@id=\"identifierId\"]");
    private By BUTTON_CONTINUE = By.xpath("//*[@id=\"identifierNext\"]/span/span");
    private By PASSWORD_GOOGLE = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private By BUTTON_CONTINUE_AFTER_PASSWORD = By.xpath("//*[@id=\"passwordNext\"]/span/span");

    public StartupRegistrationPage() {

    }

    public void clickRegisterTwitter(){
         driver.findElement(BUTTON_REGISTER_TWITTER).click();
     }
    public String returnToMainTab(){
        String mainTab = driver.getWindowHandle();
        return mainTab;
    }
    public void switchToWindow(){
        for(String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }
    public StartupRegistrationPage clickCreateStartup(){
        driver.findElement(BUTTON_CREATE_STARTUP).click();
        return new StartupRegistrationPage(driver);
    }
    public void enterEmailTwitter(String email){
        driver.findElement(FIELD_EMAIL).sendKeys(email);
    }
    public void entrerPasswordTwiiter(String password){
        driver.findElement(FIELD_PASSWORD).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(BUTTON_ENTER).click();
    }
    public void switchToTab(String tab1) {
        driver.switchTo().window(tab1);
    }
    public String textFromRole(){
        return driver.findElement(STARTUP_SUCCESS).getText();
    }
    public void clickRegisterWithLinkedin(){
        driver.findElement(BUTTON_REGISTER_LINKEDIN).click();
    }
    public void enterEmailInLinkedin(String email){
        driver.findElement(FIELD_EMAIL_LINKEDIN).click();
        driver.findElement(FIELD_EMAIL_LINKEDIN_TEXT).sendKeys(email);
    }
    public void enterPasswordLinkedin(String password){
        driver.findElement(FIELD_PASSWORD_LINKEDIN).sendKeys(password);
    }
    public void clickEnterLinkedin(){
        driver.findElement(BUTTON_ENTER_LINKEDIN).click();
    }
    public String getTextFromStartup(){
        return driver.findElement(TEXT_STARTUP).getText();
    }
    public void clickRegisterFacebook(){
        driver.findElement(BUTTON_REGISTER_FACEBOOK).click();
    }
    public void entereEmailFacebook(String email){
        driver.findElement(FIELD_EMAIL_FACEBOOK).sendKeys(email);
    }
    public void enterPasswordFacebook(String password){
        driver.findElement(FIELD_PASSWORD_FACEBOOK).sendKeys(password);
    }
    public void clickLogInFacebook(){
        driver.findElement(BUTTON_LOGIN_FACEBOOK).click();
    }
    public void clickRegisterGoogle(){
        driver.findElement(BUTTON_REGISTER_GOOGLE).click();
    }
    public void enterGoogleEmail(String email){
        driver.findElement(EMAIL_GOOGLE).sendKeys(email);
    }
    public void clickContinue(){
        driver.findElement(BUTTON_CONTINUE).click();
    }
    public void enterGooglePassword(String password){
        driver.findElement(PASSWORD_GOOGLE).sendKeys(password);
    }
    public void clickContinueAfterPassword(){
        driver.findElement(BUTTON_CONTINUE_AFTER_PASSWORD).click();
    }
}
