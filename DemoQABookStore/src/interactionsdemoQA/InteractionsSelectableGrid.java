package interactionsdemoQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InteractionsSelectableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Window = driver.getWindowHandle();
		WebElement selectablegrid = driver.findElement(By.xpath("//*[@id='demo-tab-grid']"));
		selectablegrid.click();
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='demo-tabpane-grid']/li"));
		int listsize = selectable.size();
		System.out.println(listsize);
		
		//Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build()
			//	.perform();

	}
	
}
