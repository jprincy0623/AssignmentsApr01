package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcontacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver Contactcreation=new ChromeDriver();
	
      Contactcreation.get("http://leaftaps.com/opentaps/control/login");
		
      Contactcreation.manage().window().maximize();
		
      Contactcreation.findElement(By.id("username")).sendKeys("demosalesmanager");
		
      Contactcreation.findElement(By.id("password")).sendKeys("crmsfa");
		
      Contactcreation.findElement(By.className("decorativeSubmit")).click();
		
      Contactcreation.findElement(By.linkText("CRM/SFA")).click();

      Contactcreation.findElement(By.linkText("Contacts")).click();
        
      Contactcreation.findElement(By.linkText("Create Contact")).click();
        
      Contactcreation.findElement(By.id("firstNameField")).sendKeys("Silshiya");
        
      Contactcreation.findElement(By.id("lastNameField")).sendKeys("Austin");
        
      Contactcreation.findElement(By.name("submitButton")).click();
      
	  String text = Contactcreation.findElement(By.id("firstNameField")).getText();
 
	  System.out.println(text);
	  
	  String title2 = Contactcreation.getTitle();

	  System.out.println(title2);
	  
	}

}

