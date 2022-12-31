package leafgroundmiscs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiscImageUpload {
	@Test 
	public void miscupload() throws Exception{
	System.setProperty("webdriver.chrome.driver",
			"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	WebElement miscbutton = driver.findElement(By.id("menuform:j_idt43"));
	miscbutton.click();
	WebElement Filebutton = driver.findElement(By.id("menuform:m_file"));
	Filebutton.click();
	WebElement chooseFilebutton = driver.findElement(By.id("j_idt97:j_idt98_label"));
	chooseFilebutton.click();
	String file = "C:\\Users\\91999\\Downloads\\sampleFILE.JPEG";
	StringSelection selection = new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
