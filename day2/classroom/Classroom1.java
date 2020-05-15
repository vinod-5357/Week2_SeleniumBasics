package week2.day2.classroom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Classroom1 {

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


		WebElement findleads=driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]"));
		findleads.click();


		WebElement findwithname=driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		findwithname.sendKeys("vinod");

		WebElement submitbuton=driver.findElement(By.xpath("(//button[@type='button' and @class='x-btn-text'])[7]"));
		submitbuton.click();

		WebElement leadId1= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadid=	leadId1.getText();

		System.out.println("First lead id :"+leadid);


	}

}
