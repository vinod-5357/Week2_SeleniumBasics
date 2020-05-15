package week2.day2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
		//Case1
		
		driver.findElementByXPath("//div[text()='Java']/input").click();
		
		//end
		
		
		//case2
		
		WebElement Secondcase = driver.findElementByXPath("//div[text()='Selenium']/input");

		boolean selected = Secondcase.isSelected();
		
		System.out.println("Whether checbox selected :"+selected);
		
		//end
		

		
		
		//case3
		
		WebElement box1 = driver.findElementByXPath("//div[text()='Not Selected']/input");
		
		boolean check1 = box1.isSelected();
		
		WebElement box2 = driver.findElementByXPath("//div[text()='I am Selected']/input");
		
		if(check1==true) {
			
		box1.click();
			
		}
		
		else {
			
			box2.click();
		}
		
		
box2.click();
		
		//end
		
		
		
		//case4
		
		
		driver.findElementByXPath("//div[text()='Option 1']/input").click();
		driver.findElementByXPath("//div[text()='Option 2']/input").click();
		driver.findElementByXPath("//div[text()='Option 3']/input").click();
		driver.findElementByXPath("//div[text()='Option 4']/input").click();
		driver.findElementByXPath("//div[text()='Option 5']/input").click();
		
		
		//end
	}

}
