package MavenTestPRoject.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParametrizationMultipleWindowExample {
    public static WebDriver driver;


    @Parameters({"BrowserName"})
    @BeforeMethod
    @Test
    public void PreRequisite(String BrowserName) throws InterruptedException {
        if (BrowserName.equalsIgnoreCase("crome")) {
            driver = new ChromeDriver();
            driver.navigate().to("https://www.saucedemo.com/");
        } else if (BrowserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.saucedemo.com/");
        } else if (BrowserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.navigate().to("https://www.saucedemo.com/");
        }
          driver.manage().window().maximize();
    }

        @AfterMethod
        @Parameters({"Username", "Password"})
        @Test
        public void VerifySoftAssert (String Username, String Password) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("user-name")).sendKeys(Username);
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys(Password);
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();

            driver.close();
        }
    }
