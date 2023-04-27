import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NopCommerceReg extends Util {

    // Declare a WebElement

    WebDriver driver;

    // Annotation
    @Test(priority = 1)
    // Create a method
    void openbrowser() {
        System.out.println("Open a browser");
        // Set up a path for WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Driver\\Updated Drivers\\msedgedriver.exe");
        // create an instance for a WebDriver
        driver = new EdgeDriver();
        // Navigate to WebPage
        driver.get("https://demo.nopcommerce.com/");
        //Maximize the window
        driver.manage().window().maximize();

    }

    @Test(priority = 2)
        void reg() {
            // locate to register via custom xpath
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
            // locate on Personal details
            driver.findElement(By.className("male")).click();
            // Locate to firstname
            driver.findElement(By.id("FirstName")).sendKeys("Nishant");
            // Locate to lastname
            driver.findElement(By.id("LastName")).sendKeys("Dhanani");
            // DOB Generic method
            WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
            WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
            WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
            SelectValueFromDropdown(Day, "13");
            SelectValueFromDropdown(Month, "June");
            SelectValueFromDropdown(Year, "1992");
            // locate to email
            driver.findElement(By.id("Email")).sendKeys("nishant.dhanai@gmail.com");
            // locate to company name
            driver.findElement(By.id("Company")).sendKeys("Unify");
            // locate to passowrd
            driver.findElement(By.name("Password")).sendKeys("Ndnd2250");
            // locate to confirmpassword
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Ndnd2250");
            driver.findElement(By.xpath("//button[ text ( ) = 'Register']")).click();

         }
        @Test(priority = 3)
         void logout() {

             // Get TiTle
            System.out.println("Title page : " + driver.getTitle());

             // Valiadte Homepage
             String ExpectedHomepageTitle = "nopCommerce demo store. Register";
             if (ExpectedHomepageTitle.equals(driver.getTitle())) {
                 System.out.println("The HomePage Title is correct");
             } else {
                 System.out.println(" it is incorrect Homepage");
             }
             driver.close();

         }

    }

















