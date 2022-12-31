package leafGroundElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementsCheckBox {
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

		WebElement checkboxbutton = driver.findElement(By.id("menuform:m_checkbox"));
		checkboxbutton.click();
		WebElement basiccheckbox = driver.findElement(By.id("j_idt87:j_idt89"));
		basiccheckbox.click();
		WebElement basiccheckbox1 = driver.findElement(By.id("j_idt87:j_idt91"));
		basiccheckbox1.click();
		WebElement basiccheckbox2 = driver.findElement(By.xpath("//*[@for='j_idt87:basic:0']"));
		basiccheckbox2.click();
		WebElement option1 = driver.findElement(By.id("j_idt87:j_idt100"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
    	WebElement checkboxisdisabled = driver.findElement(By.id("j_idt87:j_idt100"));
    
		if (checkboxisdisabled.isEnabled()) {
			System.out.print("\nCheckBox enabled.");
		} else {
			System.out.print("\nCheckBox is disabled.");
		}
	    
	
      
		

	
}
}