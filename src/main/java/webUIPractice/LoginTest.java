package webUIPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
// https://poojamegh123-trials7161.orangehrmlive.com
//Username: Admin
//Password: Xw84DNaqU@
public class LoginTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();

        driver.get("https://poojamegh123-trials7161.orangehrmlive.com");

        WebElement logoElement = driver.findElement(By.xpath("//div[@class='orangehrm-logo']"));
        Assert.assertTrue(logoElement.isDisplayed(),"Login Page Not Displayed");

        WebElement userNameElement = driver.findElement(By.id("txtUsername"));
        userNameElement.sendKeys("Admin");

        WebElement passwordElement = driver.findElement(By.id("txtPassword"));
        passwordElement.sendKeys("Xw84DNaqU@");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement employeeMangHeaderElement = driver.findElement(By.xpath("//div[text()='Employee Management']"));
        wait.until(ExpectedConditions.visibilityOf(employeeMangHeaderElement));
        Assert.assertTrue(employeeMangHeaderElement.isDisplayed(),"Welcome page didn't loaded");
        driver.quit();

        System.out.println("Test Passed Successfully");
    }
}
