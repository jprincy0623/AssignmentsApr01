package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver Dubleadcreation=new ChromeDriver();
		
Dubleadcreation.get("http://leaftaps.com/opentaps/control/login");
		
Dubleadcreation.manage().window().maximize();
		
Dubleadcreation.findElement(By.id("username")).sendKeys("demosalesmanager");
		
Dubleadcreation.findElement(By.id("password")).sendKeys("crmsfa");
		
Dubleadcreation.findElement(By.className("decorativeSubmit")).click();
		
Dubleadcreation.findElement(By.linkText("CRM/SFA")).click();

Dubleadcreation.findElement(By.linkText("Leads")).click();
        
Dubleadcreation.findElement(By.linkText("Create Lead")).click();
        
Dubleadcreation.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
Dubleadcreation.findElement(By.id("createLeadForm_firstName")).sendKeys("Princy");
        
Dubleadcreation.findElement(By.id("createLeadForm_lastName")).sendKeys("John");
		
Dubleadcreation.findElement(By.name("departmentName")).sendKeys("Testing");
		
Dubleadcreation.findElement(By.name("description")).sendKeys("Non-IT to IT Transformation-April 2023 Batch");
		
Dubleadcreation.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jprincy0623@gmail.com");
		
Dubleadcreation.findElement(By.name("submitButton")).click();  

String title = Dubleadcreation.getTitle();

System.out.println(title);

Dubleadcreation.findElement(By.linkText("Duplicate Lead")).click();

Dubleadcreation.findElement(By.id("createLeadForm_companyName")).clear();

Dubleadcreation.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");

Dubleadcreation.findElement(By.id("createLeadForm_firstName")).clear();

Dubleadcreation.findElement(By.id("createLeadForm_firstName")).sendKeys("Ausil");

Dubleadcreation.findElement(By.name("submitButton")).click();  

String title1 = Dubleadcreation.getTitle();

System.out.println(title1);

	}

}
