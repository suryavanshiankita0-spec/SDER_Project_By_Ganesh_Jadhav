package MavenTestPRoject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
    }
}
