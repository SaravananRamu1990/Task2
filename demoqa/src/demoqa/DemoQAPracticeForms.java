package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAPracticeForms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstname.sendKeys("ssaravan");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("ram");
		WebElement mailid = driver.findElement(By.id("userEmail"));
		mailid.sendKeys("ramsarvan90@gmail.com");
		WebElement genderbutton = driver.findElement(By.xpath("//*[text()='Male']"));
		genderbutton.click();
		WebElement phonenumber = driver.findElement(By.id("userNumber"));
		phonenumber.sendKeys("9894141411");
		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("34,nn dhs mcroad,tnj");
		WebElement hobbies = driver.findElement(By.xpath("//label[text()='Sports']"));
		hobbies.click();
		WebElement hobbies2 = driver.findElement(By.xpath("//label[text()='Music']"));
		hobbies2.click();
		WebElement hobbies3 = driver.findElement(By.xpath("//label[text()='Reading']"));
		hobbies3.click();
		


	}

}
