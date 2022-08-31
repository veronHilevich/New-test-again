import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }
    private By LOGIN_GOOGLE = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/button/div/p");
    private By LOGIN_TWITTER = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/button/div/p");
    private By LOGIN_LINKEDIN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/p");
    private By LOGIN_FACEBOOK = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/p");
    private By LOGIN_BUTTON_IN_LOGIN_PAGE = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[3]/p");
    private By FIELD_EMAIL = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[1]/input");
    private By FIELD_PASSWORD = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[2]/input");
    private By LOGO_TO_MAIN_PAGE = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/a/img");
    private By TEXT_LOGIN = By.xpath("//*[@id=\"root\"]/div/div/div[1]/p");
    private By EMAIL_GOOGLE = By.xpath("//*[@id=\"identifierId\"]");
    private By BUTTON_CONTINUE = By.xpath("//*[@id=\"identifierNext\"]/span/span");
    private By PASSWORD_GOOGLE = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private By BUTTON_CONTINUE_AFTER_PASSWORD = By.xpath("//*[@id=\"passwordNext\"]/span/span");
    private By FIELD_EMAIL_LINKEDIN = By.xpath("//*[@id=\"app__container\"]/main/div/form/div[1]/label");
    private By FIELD_EMAIL_LINKEDIN_TEXT = By.xpath("//*[@id=\"username\"]");
    private By FIELD_PASSWORD_LINKEDIN = By.xpath("//*[@id=\"password\"]");
    private By BUTTON_ENTER_LINKEDIN = By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
    private By FIELD_EMAIL_TWITTER = By.xpath("//*[@id=\"username_or_email\"]");
    private By FIELD_PASSWORD_TWITTER = By.xpath("//*[@id=\"password\"]");
    private By BUTTON_ENTER_TWITTER = By.xpath("//*[@id=\"allow\"]");
    private By FIELD_EMAIL_TWITTER_STEP_2 = By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input");
    private By FIELD_PASSWORD_TWITTER_STEP_2 = By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[2]/input");
    private By Button_ENTER_TWITTER_STEP_TWO = By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button");
    private By FIELD_EMAIL_FACEBOOK = By.xpath("//*[@id=\"email\"]");
    private By FIELD_PASSWORD_FACEBOOK = By.xpath("//*[@id=\"pass\"]");
    private By BUTTON_LOGIN_FACEBOOK =By.xpath("//*[@id=\"u_0_0\"]");
    private By FIELD_JUST_EMAIL = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[1]/input");
    private By FIELD_JUST_PASSWORD = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/input");
    private By BUTTON_LOGIN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[3]/p");

    public Login() {

    }

    public void clickLogin(){
        driver.findElement(LOGIN_BUTTON_IN_LOGIN_PAGE).click();
    }
    public void enterLogin(String email){
        driver.findElement(FIELD_EMAIL).sendKeys(email);
    }
    public void enterPassword(String Password){
        driver.findElement(FIELD_PASSWORD).sendKeys(Password);
    }
    public void clickGoogle(){
        driver.findElement(LOGIN_GOOGLE).click();
    }
    public void clickTwitter(){
        driver.findElement(LOGIN_TWITTER).click();
    }
    public void clickLinkedin(){
        driver.findElement(LOGIN_LINKEDIN).click();
    }
    public MainPage clickLogoToMainPage(){
        driver.findElement(LOGO_TO_MAIN_PAGE).click();
        return new MainPage(driver);
    }
    public String getTextLogin(){
        return driver.findElement(TEXT_LOGIN).getText();
    }
    public void switchToWindow(){
        for(String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }
    public void switchToTab(String tab1) {
            driver.switchTo().window(tab1);
    }
    public String returnToMainTab(){
        String mainTab = driver.getWindowHandle();
        return mainTab;
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
    public void enterEmailTwitter(String email){
        driver.findElement(FIELD_EMAIL_TWITTER).sendKeys(email);
    }
    public void enterPasswordTwitter(String password){
        driver.findElement(FIELD_PASSWORD_TWITTER).sendKeys(password);
    }
    public void clickEnterAfterPasswordTwitter(){
        driver.findElement(BUTTON_ENTER_TWITTER).click();
    }
    public void enterEmailTwitterStepTwo(String email){
        driver.findElement(FIELD_EMAIL_TWITTER_STEP_2).sendKeys(email);
    }
    public void enterPasswordTwitterStepTwo(String password){
        driver.findElement(FIELD_PASSWORD_TWITTER_STEP_2).sendKeys(password);
    }
    public void clickEnterTwitterStepTwo(){
        driver.findElement(Button_ENTER_TWITTER_STEP_TWO).click();
    }
    public void clickFacebook(){
        driver.findElement(LOGIN_FACEBOOK).click();

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
    public void enterEmail(String email){
        driver.findElement(FIELD_JUST_EMAIL).sendKeys(email);
    }
    public void enterJustPassword(String password){
        driver.findElement(FIELD_JUST_PASSWORD).sendKeys(password);
    }
    public void clickJustLogin(){
        driver.findElement(BUTTON_LOGIN).click();
    }
}
