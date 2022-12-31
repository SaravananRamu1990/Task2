package day5_demoqaframesndwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

		driver.switchTo().frame("frame1");
		WebElement Text = driver.findElement(By.id("sampleHeading"));
		String text = Text.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		WebElement Text1 = driver.findElement(By.id("sampleHeading"));
		String text1 = Text1.getText();
		System.out.println(text1);
	}

}
