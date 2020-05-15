package week2.leafground;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Buttons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Button.html");


		WebElement button=driver.findElementByXPath("//button[@id='position']");
		Point position=button.getLocation();

		int x= position.getX();
		int y=position.getY();

		System.out.println("Position of x-cooridnate : "+x+"    "+ "Position of y-coordinate :"+y);


		WebElement color= driver.findElementByXPath("//button[@id='color']");
		String buttoncolor=color.getCssValue("background-color");

		System.out.println("Colour of a button is :"+buttoncolor);




		WebElement size = driver.findElementByXPath("//button[@id='size']");
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();


		System.out.println("Height of a button : "+height+"    "+"Width of a button : "+width);
		
		Thread.sleep(1000);
		
		
		driver.findElementByXPath("//button[@id='home']").click();





	}

}
