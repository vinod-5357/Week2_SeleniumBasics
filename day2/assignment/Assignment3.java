package week2.day2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

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

		WebElement phone=driver.findElementByXPath("//span[text()='Phone']");
		phone.click();

		WebElement phonenum=driver.findElementByXPath("//input[@name='phoneNumber']");
		phonenum.sendKeys("89");

		WebElement findlead=driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']");
		findlead.click();

		Thread.sleep(1000);

		WebElement firstlead= driver.findElementByXPath("//a[@class='linktext' and @href='/crmsfa/control/viewLead?partyId=10518']");
		String lead1 = firstlead.getText();

		System.out.println("First lead id :"+lead1);

		firstlead.click();

		Thread.sleep(1000);

		WebElement delete=driver.findElementByXPath("//a[@class='subMenuButtonDangerous']");
		delete.click();

		Thread.sleep(3000);

		WebElement findleads1= driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]"));
		findleads1.click();

		Thread.sleep(2000);


		WebElement leadid=driver.findElementByXPath("//input[@type='text' and @name='id']");
		leadid.sendKeys("10518");


		Thread.sleep(2000);

		WebElement findlead1=driver.findElementByXPath("//button[@class='x-btn-text' and text()='Find Leads']");
		findlead1.click();


		Thread.sleep(2000);

		WebElement result =driver.findElementByXPath("//div[text()='No records to display']");
		String verify = result.getText();

		System.out.println("Confirmation : "+verify);

		Thread.sleep(5000);

		driver.close();



	}

}
