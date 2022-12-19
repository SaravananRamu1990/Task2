package interactionsdemoQA;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		WebElement downloadf=driver.findElement(By.id("downloadButton"));
		downloadf.click();
		File filelocation=new File("C:\\Users\\91999\\Downloads");
		File[] totalFiles=filelocation.listFiles();
		for(File file : totalFiles) {
			if(file.getName().equals("sampleFile.jpeg")) {
				System.out.println("File is downloaded");
			}
		}
	}

}
