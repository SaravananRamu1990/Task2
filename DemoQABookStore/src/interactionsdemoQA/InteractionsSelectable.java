package interactionsdemoQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionsSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Window = driver.getWindowHandle();
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='verticalListContainer']/li"));
		int listsize = selectable.size();
		System.out.println(listsize);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build()
				.perform();
		WebElement Grid = driver.findElement(By.id("demo-tab-grid"));
		Grid.click();
		List<WebElement> selectablegridhr1 = driver
				.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row1']/li"));
		action.click(selectablegridhr1.get(0)).click(selectablegridhr1.get(1)).click(selectablegridhr1.get(2)).build()
				.perform();
	}

}
