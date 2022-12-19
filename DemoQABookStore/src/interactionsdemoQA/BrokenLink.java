package interactionsdemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		WebElement Link = driver.findElement(By.linkText("Click Here for Valid Link"));
		Link.click();
		driver.navigate().back();
		WebElement BrokenLink = driver.findElement(By.linkText("Click Here for Broken Link"));
		BrokenLink.click();

		String Header = driver.getTitle();
		if (Header.contains("Internet")) {
			System.out.println("Broken Link");
		}
		driver.navigate().back();
	}

}
