package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		String window = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("//*[text()='Click Me']"));
		boolean visible = button.isDisplayed();
		System.out.println("buttonisvisible");
		boolean present = button.isSelected();
		System.out.println("buttonispresent");
		button.click();
		boolean enable = button.isEnabled();
		System.out.println(enable);

	}

}
