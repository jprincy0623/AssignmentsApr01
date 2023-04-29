package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver Leadcreation=new ChromeDriver();
		
		Leadcreation.get("http://leaftaps.com/opentaps/control/login");
		
		Leadcreation.manage().window().maximize();
		
		Leadcreation.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		Leadcreation.findElement(By.id("password")).sendKeys("crmsfa");
		
		Leadcreation.findElement(By.className("decorativeSubmit")).click();
		
		Leadcreation.findElement(By.linkText("CRM/SFA")).click();
		
		Leadcreation.findElement(By.linkText("Leads")).click();
        
		Leadcreation.findElement(By.linkText("Create Lead")).click();
        
		Leadcreation.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
		Leadcreation.findElement(By.id("createLeadForm_firstName")).sendKeys("Princy");
        
		Leadcreation.findElement(By.id("createLeadForm_lastName")).sendKeys("John");
		
		Leadcreation.findElement(By.name("departmentName")).sendKeys("Testing");
		
		Leadcreation.findElement(By.name("description")).sendKeys("Non-IT to IT Transformation-April 2023 Batch");
		
		Leadcreation.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jprincy0623@gmail.com");
		
		Leadcreation.findElement(By.name("submitButton")).click();  
		
	}

}
