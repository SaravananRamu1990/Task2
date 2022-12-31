package leafGroundElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestLeafDropDown {
	@Test
	public void elementsDropdown() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		String Default_Window = driver.getWindowHandle();
		driver.manage().window().maximize();

		WebElement ElementButton = driver.findElement(By.id("menuform:j_idt40"));
		ElementButton.click();

		WebElement ElementDropdownButton = driver.findElement(By.id("menuform:m_dropdown"));
		ElementDropdownButton.click();

		Select se = new Select(driver.findElement(By.xpath("//*[@class='ui-selectonemenu']")));
		se.selectByIndex(3);
		Select se1 = new Select(driver.findElement(By.xpath("//*[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all ui-noselection-option ui-state-highlight']/li)")));
		se1.selectByVisibleText("Brazil");

}
}