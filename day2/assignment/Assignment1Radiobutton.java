package week2.day2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1Radiobutton {

	public static void main(String[] args){
		
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");

FirefoxDriver driver= new FirefoxDriver();

driver.get("http://leafground.com/pages/radio.html");




//first case


driver.findElementByXPath("//input[@id='yes']").click();  //yes radio button

System.out.println("..............................................................................");





// Second case


WebElement unchecked = driver.findElementByXPath("(//input[@type='radio' and @name='news'])[1]");

boolean firstbutton = unchecked.isSelected();

System.out.println("First button is selected :"+firstbutton);

WebElement checked = driver.findElementByXPath("(//input[@type='radio' and @name='news'])[2]");

boolean secondbutton = checked.isSelected();


System.out.println("Second button is selected :"+secondbutton);

System.out.println("..............................................................................");





//Third case



WebElement secondagegroup = driver.findElementByXPath("(//input[@type='radio' and @name='age'])[2]");

boolean selected = secondagegroup.isSelected();

if(selected) {
	
	System.out.println("Second age group is selected");
}

else {
	
	secondagegroup.click();
}


}
	
}