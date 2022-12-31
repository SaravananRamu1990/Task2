package leafgroundtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	@Test
	public void leaftable() {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.navigate().to("https://leafground.com/");
	String Default_Window = driver.getWindowHandle();
	driver.manage().window().maximize();

	WebElement TableDropDownButton = driver.findElement(By.xpath("//*[@class='pi pi-table layout-menuitem-icon']"));
	TableDropDownButton.click();

	WebElement tableintablemenu = driver.findElement(By.id("menuform:m_table"));
	tableintablemenu.click();

	WebElement searchbox = driver.findElement(By.id("form:j_idt89:globalFilter"));
	searchbox.sendKeys("Wickens Morrow");

}
}