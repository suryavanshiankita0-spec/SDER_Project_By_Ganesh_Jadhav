package MavenTestPRoject.BasicsOfTestNG;

import org.testng.annotations.Test;

public class InvocationMethod
{
    @Test()
    public void A()
    {
        System.out.println("This is Method A");
    }

    @Test(invocationCount = 3, invocationTimeOut = 2)
    public  void B()
    {
        System.out.println("This is Method B");
    }

    @Test(priority = 2,invocationCount = 3, invocationTimeOut = 1)
    public void R()
    {
        System.out.println("This is R Method");
    }

    @Test(priority = 3)
    public  void D()
    {
        System.out.println("This is D Method");
    }
}
