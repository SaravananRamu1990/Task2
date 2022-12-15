package orangehrmdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(
				By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		loginbutton.click();

		// WebElement adminbutton=driver.findElement(By.xpath("//*[@class='oxd-text
		// oxd-text--span oxd-main-menu-item--name']"));
		// adminbutton.click();
		// WebElement Username=driver.findElement(By.xpath("//*[@class=\'oxd-input
		// oxd-input--active\']"));
		// Username.sendKeys("saravanan");
		// WebElement welcomeMess =
		// driver.findElement(By.xpath("//div[@id='branding']/a[@id='welcome']"));
		// String requ=welcomeMess.getText();

		// sSystem.out.println(requ.substring(8));
		WebElement usermanagement=driver.findElement(By.xpath("//*[@class=\'oxd-topbar-body-nav-tab-item\']"));;
		usermanagement.click();
		driver.close();

	}

}
