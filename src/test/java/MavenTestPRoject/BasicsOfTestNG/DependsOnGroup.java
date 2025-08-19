package MavenTestPRoject.BasicsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup
{
    @Test(groups = "Sanity")
    public void VerifyLoginPage()
    {
        System.out.println("This is Login page");
    }

    @Test(dependsOnGroups = "Sanity")
    public  void VerifyProfilePage()
    {
        Assert.assertTrue(false);
        System.out.println("This is ProfilePage");
    }

    @Test(dependsOnMethods =  "VerifyProfilePage" , dependsOnGroups = "Sanity")
    public  void VerifyLogout()
    {
        System.out.println("Page has Logout");
    }
}
