package leafGroundElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Elements {
	@Test
	public void Elementstoautomate() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		;
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		driver.manage().window().maximize();

		WebElement ElementButton = driver.findElement(By.id("menuform:j_idt40"));
		ElementButton.click();
		WebElement checkbox = driver.findElement(By.id("menuform:m_input"));
		checkbox.click();
		WebElement typename = driver.findElement(By.id("j_idt88:name"));
		typename.sendKeys("saran");
		WebElement appendcountry = driver.findElement(By.id("j_idt88:j_idt91"));
		appendcountry.sendKeys(",INDIA");
		WebElement checkboxdisplayed = driver.findElement(By.id("j_idt88:j_idt93"));
		if (checkboxdisplayed.isEnabled()) {
			System.out.print("\nCheckBox is enabled.");
		} else {
			System.out.print("\nCheckBox is disabled.");
		}
		WebElement clearcheckbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearcheckbox.clear();
		WebElement retrievecheckbox = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retrievecheckbox.getText();
		System.out.println(text);
		WebElement emailbox = driver.findElement(By.id("j_idt88:j_idt99"));
		emailbox.sendKeys("ram@gmail.com");
		Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB).build().perform();
		WebElement typemyself = driver.findElement(By.id("j_idt88:j_idt101"));
		typemyself.sendKeys("hai i am saran");
//		WebElement checkeditor = driver
//				.findElement(By.xpath("//*[@id='j_idt88:j_idt103_editor']//*[@class='ql-editor ql-blank']"));
//		checkeditor.sendKeys("hello");
		WebElement checkmessageinbox = driver.findElement(By.name("j_idt106:thisform:age"));
		checkmessageinbox.click();
		Actions act1 = new Actions(driver);

		act.sendKeys(Keys.ENTER).build().perform();
		checkmessageinbox.getText();


	}
}