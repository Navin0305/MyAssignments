package week.day.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tamilmatrimony.com");
	
	WebElement profile=driver.findElement(By.xpath("//div[@class='desp-drpdwn paddt10 mob-prof']"));
	Select profileInput=new Select(profile);
	profileInput.selectByVisibleText("Myself");
	profileInput.selectByVisibleText("Male");
	
	WebElement name=driver.findElement(By.xpath("//input[@id='NAME']"));
	name.sendKeys("Navin");
	
	WebElement mobile=driver.findElement(By.id("MOBILENO"));
	mobile.sendKeys("8838071780");
	
	driver.findElement(By.xpath("//input[@type='button']")).click();
	
	WebElement dob=driver.findElement(By.xpath("//input[(@type='text')][1]"));
	dob.sendKeys(" 03 / 01 / 2000 ");
	
	WebElement religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
	Select religionInput=new Select(religion);
	religionInput.selectByVisibleText("Hindu");
	
	WebElement motherTongue=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select motherTongueInput=new Select(motherTongue);
	motherTongueInput.selectByVisibleText("Tamil");
	
	WebElement email=driver.findElement(By.xpath("//select[@id='EMAIL']"));
	email.sendKeys("hereverything35@gmail.com");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='PASSWORD']"));
	password.sendKeys("12345667");
	
	Thread.sleep(10000);
	driver.close();
	
	
	
	
	}
}
