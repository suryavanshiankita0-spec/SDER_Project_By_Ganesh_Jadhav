package MavenTestPRoject.BasicsOfTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestNGExample
{
    @Test
    public void TestCases1()
    {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

    }

    @Test
    public void TestCases2()
    {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
    
    }
}

