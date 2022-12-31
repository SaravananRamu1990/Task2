package day6_InteractionsdemoQA;

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
		
		
		Actions action = new Actions(driver);
		action.click(selectable.get(0));
		action.click(selectable.get(3));
		action.build().perform();
		
		WebElement Grid = driver.findElement(By.id("demo-tab-grid"));
		Grid.click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row1']/li"));
		action.click(list1.get(0)).build().perform();
	    
		List<WebElement> list2 = driver.findElements(By.xpath("//*[@class='grid-container mt-4']//*[@id='row2']/li"));
		action.click(list2.get(1)).build().perform();
	}

}
