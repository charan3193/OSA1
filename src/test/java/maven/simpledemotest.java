package maven;


import org.testng.annotations.Test;

public class simpledemotest  {

@Test(groups="Smokesuite")
public void TestScript01()
{
	System.out.println("TestScript_1");

}
@Test
public void TestScript02()
{
	System.out.println("TestScript_2");
}

}
