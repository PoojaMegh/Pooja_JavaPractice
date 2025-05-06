package javaProgramPractice.demo;

import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class TestDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		String username = "Pooja";
		String password = "1234321";
		WebDriver driver = new ChromeDriver();
		driver.get("login url");

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submitBtn")).click();

		try {
			WebElement dashboard = new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(By.id("homeIcon")));
        } catch (TimeoutException e){
			System.out.println("Home icon not displayed");
		} finally {
			driver.quit();
		}
	}
}
