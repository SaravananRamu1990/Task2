package leafGroundElements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class ElementsButton {

	@Test
	public void elementsButton() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/");
		String Default_Window = driver.getWindowHandle();
		driver.manage().window().maximize();

		WebElement ElementButton = driver.findElement(By.id("menuform:j_idt40"));
		ElementButton.click();

		WebElement ButtoninElement = driver.findElement(By.id("menuform:m_button"));
		ButtoninElement.click();

//		WebElement clickbutton = driver.findElement(By.id("j_idt88:j_idt90"));
//		clickbutton.click();
//		System.out.println("Page title is : " + driver.getTitle());
//		Set<String> Window1 = driver.getWindowHandles();
//		for (String newwindow : Window1) {
//			driver.switchTo().window(newwindow);
//		}
//		driver.close();
//		driver.switchTo().window(Default_Window);
		WebElement checkbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		checkbutton.isDisplayed();
		if (checkbutton.isEnabled()) {
			System.out.print("\nCheckButton enabled.");
		} else {
			System.out.print("\nCheckButton is disabled.");
		}

		WebElement SubmitButtoninElement = driver.findElement(By.id("j_idt88:j_idt94"));

		Point point = SubmitButtoninElement.getLocation();
		System.out.println("Element's Position from left side is: " + point.getX() + " pixels.");
		System.out.println("Element's Position from top is: " + point.getY() + " pixels.");
		WebElement SubmitButton = driver.findElement(By.id("j_idt88:j_idt96"));

		String SubmitButtoncolour = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");

		System.out.println("Button color: " + SubmitButtoncolour);
		WebElement hwSubmitButton = driver.findElement(By.id("j_idt88:j_idt98"));
		//hwSubmitButton.getSize();
		//System.out.println("Button size: " + hwSubmitButton);
		 //Get width of element.
        int Width = hwSubmitButton.getSize().getWidth();
        System.out.println("Button width Is "+Width+" pixels");
        
        //Get height of element.
        int Height = hwSubmitButton.getSize().getHeight();        
        System.out.println("Button height Is "+Height+" pixels");
        WebElement ButtonColourChange = driver.findElement(By.id("j_idt88:j_idt100"));
        String s = ButtonColourChange.getCssValue("color");
        // convert rgba to hex
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);
//        List<WebElement> buttons = driver.findElements(By.xpath("//*[@id='j_idt88']/div/div[2]/div[4])"));
//        System.out.println(buttons.size());
        }
     }
        
	


