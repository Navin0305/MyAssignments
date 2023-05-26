package week.day.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccnt=driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
		createAccnt.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@aria-label=\'First name\']"));
		firstName.sendKeys("Navin");
		WebElement lastName=driver.findElement(By.xpath("//input[@aria-label=\'Surname\']"));
		lastName.sendKeys("Sandy");
		WebElement mobile=driver.findElement(By.xpath("//input[(@name=\'reg_email__\')]"));
		mobile.sendKeys("8838071780");
		WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("1234567");
		
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dateInput=new Select(date);
		dateInput.selectByValue("3");
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthInput=new Select(month);
		monthInput.selectByVisibleText("Jan");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yearInput=new Select(year);
		yearInput.selectByVisibleText("2000");
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='u_2_5_N0']"));
		radioButton.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
