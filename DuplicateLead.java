package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DuplicateLead {

		public static void main(String[] args) {
			//call WDM 
			WebDriverManager.chromedriver().setup();
			//Launch the browser
			ChromeDriver driver = new ChromeDriver();
			//load the URL
			driver.get("http://leaftaps.com/opentaps");
			//Maxi the Browser
			driver.manage().window().maximize();
			//enter the User Name
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//click on Login
			driver.findElement(By.className("decorativeSubmit")).click();
			//check if we are in correct page
			WebElement Logout = driver.findElement(By.className("decorativeSubmit"));
			//find the first match
			//get attributes and print
			String attribute = Logout.getAttribute("value");
			System.out.println(attribute);
					if (attribute.equals("Logout")) {
						System.out.println("We have Logged in Succesfuly");
					}else
					{ 
						System.out.println("Login is unsuccesfull");
					}
			//Click CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();

			//Click Leads Link
			driver.findElement(By.linkText("Leads")).click();

			//Click Create Lead Link
			driver.findElement(By.linkText("Create Lead")).click();

			//Enter Company Name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");

			//Enter First Name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Boopathi");

			//Enter Last Name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
					
			//Enter FirstName(Local)
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Boopathi");
					
			//Enter Department Field
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
			
			//Enter Description Field
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi");
			
			//Enter your email
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kboopathiraja95@gmail.com");
			
			//Select State/Province
			WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select select = new Select(findElement);
			
		    select.selectByValue("NY");
		    
		    // Click on Create Button
		    driver.findElement(By.className("smallSubmit")).click();
		    
		    //Get the title
		    System.out.println("The Title is:" +driver.getTitle());
		    
		    if (driver.getTitle().contains("View Lead")) {
		    	System.out.println("The Lead is created");}
		    else {
		    	System.out.println("It is Not Created");}
		    
		    //Click on Duplicate button
		    driver.findElement(By.linkText("Duplicate Lead")).click();
		    
		    //Clear the CompanyName Field using .clear() And Enter new CompanyName
		    driver.findElement(By.id("createLeadForm_companyName")).clear();
		    
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		    
		    //Clear the FirstName Field using .clear() And Enter new FirstName
		    driver.findElement(By.id("createLeadForm_firstName")).clear();
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("K.Boopathi");
		    
		    //Click on Create Lead Button
		    driver.findElement(By.className("smallSubmit"));
		    
		    //Get the Title of Resulting Page
		    String title = driver.getTitle();
		    
		    System.out.println("The Title is "+title);
		    
		    }
		
		}

	


	


