package MavenTestPRoject.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Parameters({"Username", "Password"})
    @Test
    public void VerifySoftAssert(String Username, String Password) throws InterruptedException {
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
