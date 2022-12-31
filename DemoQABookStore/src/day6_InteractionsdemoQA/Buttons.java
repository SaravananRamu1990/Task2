package day6_InteractionsdemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement Doubleclick = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		action.doubleClick(Doubleclick).build().perform();
		WebElement Rightclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(Rightclick).build().perform();
		WebElement click = driver.findElement(By.xpath("//*[text()='Click Me']"));
		action.click(click).build().perform();
	}

}
