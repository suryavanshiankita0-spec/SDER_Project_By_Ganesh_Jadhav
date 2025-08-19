package MavenTestPRoject.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataPRovideExample {

    @DataProvider(name = "LoginData")
    public Object[][] LoginData() {
        return new Object[][]
                {
                        {"standard_user", "secret_sauce"},
                        {"locked_out_user", "secret_sauce"},
                        {"problem_user", "secret_sauce"}
                };
    }

    @Test(dataProvider = "LoginData")
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

//*📝 How to Remember (Super Simple)
//
//@DataProvider → makes the test data (like a list of inputs).
//
//Object[][] → think of it like a table:
//
//Each row = one test run.
//
//Each column = parameter (username, password).
//
//@Test(dataProvider="...") → runs test using that data.
