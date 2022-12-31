package day5_demoqaframesndwindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
	}

}
