package MavenTestPRoject.BasicsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroupTestNGxmlfile
{
    @Test
    public void VerifyLoginPage()
    {
        System.out.println("This is Login page");
    }

    @Test
    public  void VerifyProfilePage()
    {
        //Assert.assertTrue(false);
        System.out.println("This is ProfilePage");
    }

    @Test
    public  void VerifyLogout()
    {
        
    }
}
