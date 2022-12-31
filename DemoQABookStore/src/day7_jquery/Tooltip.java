package day7_jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement age = driver.findElement(By.id("age"));
		String Age = age.getAttribute("title");
		System.out.println(Age);

	}

}
