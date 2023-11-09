package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Lib/chromedriver.exe");
		// Initialize ChromeDriver and open a new Chrome window
		WebDriver driver = new ChromeDriver();

		// Navigate to a URL
		driver.get("https://dev.sedarplus.ca/csa-master/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("catLogon"));
		login.click();

		driver.findElement(By.xpath("//*[contains(@id,'UserName') and contains(@type,'text')]")).sendKeys("1asuef003");

		// Enter your login password
		driver.findElement(By.xpath("//*[contains(@id,'Password') and contains(@type,'password')]"))
				.sendKeys("Sed@rplu$@11");

		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		driver.close();
		System.out.println("Test completed");

	}
}
