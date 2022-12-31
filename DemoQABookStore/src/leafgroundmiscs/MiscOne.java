package leafgroundmiscs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiscOne {
	@Test
	public void messagetest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		String Default_Window = driver.getWindowHandle();
		driver.manage().window().maximize();

		WebElement miscbutton = driver.findElement(By.id("menuform:j_idt43"));
		miscbutton.click();
		WebElement messagebutton = driver.findElement(By.id("menuform:m_message"));
		messagebutton.click();
		WebElement messageinfo = driver.findElement(By.id("j_idt89:j_idt90"));
		messageinfo.click();
		WebElement firstname = driver.findElement(By.id("j_idt100:firstname"));
		firstname.sendKeys("sar");
		WebElement lastname = driver.findElement(By.id("j_idt100:lastname"));
		lastname.sendKeys("an");
		WebElement emailid = driver.findElement(By.id("j_idt100:email"));
		emailid.sendKeys("rams@gmail.com");
		WebElement submitbutton = driver.findElement(By.id("j_idt100:submitButton"));
		submitbutton.click();
		WebElement messageclosebutton = driver.findElement(By.xpath("//*[@class='ui-messages-close']"));
		messageclosebutton.click();

		WebElement warningbutton = driver.findElement(By.id("j_idt89:j_idt91"));
		warningbutton.click();
		WebElement warningclosebutton = driver.findElement(By.xpath("//*[@class='ui-messages-close']"));
		warningclosebutton.click();
		WebElement errorbutton = driver.findElement(By.id("j_idt89:j_idt92"));
		errorbutton.click();
		WebElement errorclosebutton = driver.findElement(By.xpath("//*[@class='ui-messages-close']"));
		errorclosebutton.click();
		WebElement grawlinfobutton = driver.findElement(By.xpath(""));
		grawlinfobutton.click();
       
	}
}	
