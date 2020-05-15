package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {



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


		WebElement findleads= driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]"));
		findleads.click();


		WebElement firstname=driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		firstname.sendKeys("vinod");

		WebElement submitlead=driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]"));
		submitlead.click();

		Thread.sleep(1000);

		WebElement companyname=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a)[1]"));

		String oldcompanyname = companyname.getText();

		System.out.println("Existing company name :"+oldcompanyname);

		WebElement firstlead=driver.findElement(By.xpath("//a[@class='linktext' and text()='10122']"));
		firstlead.click();

		String title = driver.getTitle();

		System.out.println("Title of a page :"+ title);


		WebElement edit=driver.findElement(By.xpath("//a[contains(text(), 'Edit')]"));
		edit.click();

		WebElement erase= driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		erase.clear();


		Thread.sleep(2000);


		erase.sendKeys("Rezofy@test");

		WebElement update=driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();


		WebElement newname= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));

		String newcompanyname = newname.getText();

		System.out.println("New company name :"+newcompanyname);

		if(!(oldcompanyname==newcompanyname)) {

			System.out.println("Company name has been changed");
		}

		else {

			System.out.println("Company name has not been chnaged");
		}

		Thread.sleep(5000);

		driver.close();



	}

}
