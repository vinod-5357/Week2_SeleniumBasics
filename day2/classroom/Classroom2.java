package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Classroom2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");


		driver.manage().window().maximize();


		WebElement username= driver.findElement(By.xpath("(//input[@class= 'inputLogin'])[1]"));
		username.sendKeys("Demosalesmanager");

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");

		WebElement login= driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']"));
		login.click();


		WebElement Link1= driver.findElement(By.xpath("(//a)[2]"));
		Link1.click();

		WebElement link2= driver.findElement(By.xpath("//a[contains(text(), 'Leads')]"));
		link2.click();

		WebElement mergelead=driver.findElement(By.xpath("//a[contains(text(), 'Merge Leads')]"));
		mergelead.click();


		WebElement fromlead=driver.findElement(By.xpath("//img[@alt='Lookup']"));


		WebElement tolead=driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));

	}

}
