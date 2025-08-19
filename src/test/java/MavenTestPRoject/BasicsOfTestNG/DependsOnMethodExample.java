package MavenTestPRoject.BasicsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample
{
    @Test
    public void VerifyLoginPage()
    {
        System.out.println("This is Login page");
    }

    @Test(dependsOnMethods = "VerifyLoginPage")
    public  void VerifyProfilePage()
    {
        //Assert.assertTrue(false);
        System.out.println("This is ProfilePage");
    }

    @Test(dependsOnMethods =  "VerifyProfilePage")
    public  void VerifyLogout()
    {
        System.out.println("Page has Logout");
    }
}
