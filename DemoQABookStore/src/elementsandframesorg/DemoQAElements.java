package elementsandframesorg;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Window = driver.getWindowHandle();
		WebElement searchbar = driver.findElement(By.xpath("//*[@class='header-text']"));
		searchbar.click();
		WebElement textbook = driver.findElement(By.xpath("//*[@class='text']"));
		textbook.click();
		WebElement Fullname = driver.findElement(By.id("userName"));
		Fullname.sendKeys("Saran");
		WebElement Emailid = driver.findElement(By.id("userEmail"));
		Emailid.sendKeys("ramsarvan90@gmail.com");
		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("xyz,abc,yyyyy");
		WebElement permanentaddress = driver.findElement(By.id("permanentAddress"));
		permanentaddress.sendKeys("xyz,abc,yyyyy");
		WebElement Submitbutton = driver.findElement(By.id("submit"));
		// Submitbutton.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Submitbutton);
		WebElement elementsbutton = driver.findElement(By.xpath("//*[@class='header-wrapper']"));
		elementsbutton.click();
		WebElement checkboxbutton = driver.findElement(By.xpath("//*[@class='btn btn-light ']"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", checkboxbutton);
		WebElement Homebox = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']"));
		Homebox.click();
		WebElement elementsbutton2 = driver.findElement(By.xpath("//*[@class='header-wrapper']"));
		elementsbutton2.click();
		WebElement Radiobutton = driver.findElement(By.xpath("//*[@id='item-2']"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Radiobutton);
		WebElement Yesbutton = driver.findElement(By.xpath("//*[@class='custom-control-label']"));
		Yesbutton.click();
		WebElement WebTablesButton = driver.findElement(By.xpath("//*[@id='item-3']"));
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", WebTablesButton);

		WebElement Webtablessearchbox = driver.findElement(By.xpath("//*[@id='searchBox']"));
		Webtablessearchbox.sendKeys("Cierra");
		WebElement AddtoWebtables = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
		AddtoWebtables.click();
		WebElement rfFirstname = driver.findElement(By.id("firstName"));
		rfFirstname.sendKeys("Saran");
		WebElement rflastname = driver.findElement(By.id("lastName"));
		rflastname.sendKeys("Ramu");
		WebElement rfemail = driver.findElement(By.id("userEmail"));
		rfemail.sendKeys("ramsar@gmail.com");
		WebElement rfage = driver.findElement(By.id("age"));
		rfage.sendKeys("28");
		WebElement rfsalary = driver.findElement(By.id("salary"));
		rfsalary.sendKeys("28000");
		WebElement rfdepartment = driver.findElement(By.id("department"));
		rfdepartment.sendKeys("agricult");
		WebElement rfsubmitbutton = driver.findElement(By.id("submit"));
		rfsubmitbutton.click();
		WebElement Buttons = driver.findElement(By.xpath("//*[@id='item-4']"));
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Buttons);
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		Actions actions2=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		
		//WebElement  = driver.findElement(By.xpath("//*[@id='1mpyH']"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));;
		//WebElement simpleclick = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicClickMessage")));
		WebElement links= driver.findElement(By.xpath("//*[@id='item-5']"));
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", links);
		WebElement homelink = driver.findElement(By.id("simpleLink"));
		homelink.click();
		Set<String> window1 = driver.getWindowHandles();
		for (String newwindow : window1) {
			driver.switchTo().window(newwindow);
		}
		driver.close();
		driver.switchTo().window(Window);
		
		WebElement brokenlinks= driver.findElement(By.xpath("//*[@id='item-6']"));
		JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", brokenlinks);
		WebElement validlink = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/a[1]"));
		JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", validlink);

//		Set<String> window3 = driver.getWindowHandles();
//		for (String newwindow : window3) {
//			driver.switchTo().window(newwindow);
//		}
//		driver.close();
		WebElement uplnddwl= driver.findElement(By.xpath("//*[@id='item-7']"));
		JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", uplnddwl);
		
		
	
		
	
		
		
		
	
}
}