package demoqabs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQABookStoreApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement newuserbutton = driver.findElement(By.id("newUser"));
		newuserbutton.click();
		
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Saran");
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("Ramu");
		
		WebElement username = driver.findElement(By.id("userName"));
		username.sendKeys("ramsarvan90");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");

		WebElement login = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		
		login.click();

		WebElement Username = driver.findElement(By.id("userName"));
		Username.sendKeys("ramsarvan90");
		
		WebElement Password = driver.findElement(By.id("id=password"));
		Password.sendKeys("password");
		
		WebElement LoginButton = driver.findElement(By.id("login"));
        LoginButton.click();

		WebElement BookSearch = driver.findElement(By.id("searchBox"));

		BookSearch.sendKeys("Git Pocket Guide");

		WebElement Searchicon = driver.findElement(By.id("basic-addon2"));

		Searchicon.click();

		WebElement DeleteAllBook = driver
				.findElement(By.xpath("//*[@class='text-right button di']//*[text()='Delete All Books']"));

		DeleteAllBook.click();

		WebElement Confirm = driver.findElement(By.id("closeSmallModal-ok"));

		Confirm.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		WebElement GoTo = driver.findElement(By.id("gotoStore"));

		GoTo.click();

		WebElement Logout = driver.findElement(By.id("submit"));

		Logout.click();

	}

}
