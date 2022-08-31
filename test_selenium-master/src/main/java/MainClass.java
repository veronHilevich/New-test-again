import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\testselenium\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rocketdao.io/");
        driver.findElement(By.xpath("//div[@class=\"right-no-reg-user\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[1]/input")).sendKeys("346@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div[1]/button/div/p")).click();
    }
}
