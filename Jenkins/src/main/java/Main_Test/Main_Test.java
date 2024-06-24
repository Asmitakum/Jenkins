package Main_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main_Test {
	public static void main(String[] args) throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\eclipse-workspace\\PracticeQA\\Driver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.geeksforgeeks.org/");
		driver.findElement(By.xpath("//a[@class=\"ui label courseListingPage_placementLabel__Yq8Ux courseListingPage_categoryLabelInner__J3dzO\"]"));
	}}
