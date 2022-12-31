package leafgroundmiscs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiscDownload {
	@Test
	public void miscdownload() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		WebElement basicdownloadbutton = driver.findElement(By.id("j_idt93:j_idt95"));
		basicdownloadbutton.click();
		File filelocation = new File("C:\\Users\\91999\\Downloads");
		File[] totalFiles = filelocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("TestLeaf Logo.PNG")) {
				System.out.println("File is downloaded");
			}
		}
	}
}
