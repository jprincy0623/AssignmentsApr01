package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver=new ChromeDriver();
   
        driver.get("http://leaftaps.com/opentaps/control/login");
       
        driver.manage().window().maximize();
       
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     
        driver.findElement(By.id("password")).sendKeys("crmsfa");
       
        driver.findElement(By.className("decorativeSubmit")).click();
    
        driver.findElement(By.partialLinkText("CRM")).click();
      
        String title = driver.getTitle();
        
        System.out.println(title);
        
        System.out.println(driver.getCurrentUrl());
        
        driver.findElement(By.linkText("Leads")).click();
        
        driver.findElement(By.partialLinkText("Create Lead")).click();
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princy");
        
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("John");
           
        driver.findElement(By.name("submitButton")).click();
        
        String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        
        System.out.println(leadId);
        
      if(leadId.contains("Test")) {
		
       	System.out.println("Lead is created successfully");
       }
        
        else
        {
        	System.out.println("Lead is not created successfully");
        }
        
        		// driver.close();
        
	}	
}

	
