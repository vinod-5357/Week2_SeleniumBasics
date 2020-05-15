package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement username= driver.findElementByXPath("(//input[@class= 'inputLogin'])[1]");
		username.sendKeys("Demosalesmanager");

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");

		WebElement login= driver.findElement(By.xpath("//input[@class= 'decorativeSubmit']"));
		login.click();


		WebElement Link1= driver.findElement(By.xpath("(//a)[2]"));
		Link1.click();

		WebElement link2= driver.findElement(By.xpath("//a[contains(text(), 'Leads')]"));
		link2.click();


		WebElement findleads= driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]"));
		findleads.click();

		WebElement email=driver.findElementByXPath("//span[@class='x-tab-strip-text ' and text()='Email']");
		email.click();

		WebElement emailid=driver.findElementByXPath("//input[@name='emailAddress']");
		emailid.sendKeys("shilpakottargi18@gmail.com");

		WebElement findleademail=driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']");
		findleademail.click();

		Thread.sleep(1000);

		WebElement firstleadElement= driver.findElementByXPath("//a[@class='linktext' and text()='10138']");
		String leadid = firstleadElement.getText();

		System.out.println("First resulting lead id ;"+leadid);

		WebElement firstname= driver.findElementByXPath("(//a[@class='linktext' and text()='Shilpa'])[1]");
		String printfirstname = firstname.getText();
		System.out.println("First name :"+printfirstname);

		WebElement lastname=driver.findElementByXPath("(//a[@class='linktext' and text()='kottargi'])[1]");
		String printlastname = lastname.getText();
		System.out.println("Last name :"+printlastname);

		firstleadElement.click();

		Thread.sleep(1000);

		WebElement duplicatelead=driver.findElementByXPath("//a[text()='Duplicate Lead']");
		duplicatelead.click();

		String title = driver.getTitle();

		System.out.println("Title of portal changed to :"+title);


		WebElement createlead= driver.findElementByXPath("//input[@class='smallSubmit']");
		createlead.click();

		WebElement firstnamedup=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		String dupname = firstnamedup.getText();

		System.out.println("Duplicate name: "+dupname);

		if(printfirstname.equals(dupname)) {

			System.out.println("duplicated lead name is same as captured name");
		}

		else {

			System.out.println("duplicated lead name is not same as captured name");
		}








	}

}
