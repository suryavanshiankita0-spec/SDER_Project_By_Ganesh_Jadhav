package MavenTestPRoject.BasicsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledTCExample
{
    @Test(groups = "Sanity")
    public void VerifyLoginPage()
    {
        System.out.println("This is Login page");
    }

    @Test(description = "It just depend on Sanity Group")
    public  void VerifyProfilePage()
    {
        Assert.assertTrue(false);
        System.out.println("This is ProfilePage");
    }

    @Test(dependsOnMethods =  "VerifyProfilePage")
    public  void VerifyLogout()
    {
        System.out.println("Page has Logout");
    }
}
