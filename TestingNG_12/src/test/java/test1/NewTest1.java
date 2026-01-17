package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
//@Test
public class NewTest1 {
//  @Test(dataProvider = "dp",groups= {"me"},priority=2)
////	@Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//	  System.out.println("Emp Id:" + n);
//	  System.out.println("Emp Name:" + s);
//	  
//  }
//  
//  @Test(dataProvider = "da",groups= {"hey1","me"},priority=1)
//
//  public void a(Integer n, String s) {
//	  System.out.println("Emp Id:" + n);
//	  System.out.println("Emp Name:" + s);
//  }
//
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//      new Object[] { 3, "c" },
//    };
//  }
//  
//  @DataProvider
//  public Object[][] da() {
//    return new Object[][] {
//      new Object[] { 4, "e" },
//      new Object[] { 5, "f" },
//      new Object[] { 6, "g" },
//    };
//  }


	@Test(dependsOnMethods= {"test2","atest3"})
	public void test11() {
		System.out.println("hey");
	}
//  @Test(dataProvider = "dp",groups= {"me"},priority=2)
	////	@Test(dataProvider = "dp")
	//  public void f(Integer n, String s) {
	//	  System.out.println("Emp Id:" + n);
	//	  System.out.println("Emp Name:" + s);
	//	  
	//  }
	//  
	//  @Test(dataProvider = "da",groups= {"hey1","me"},priority=1)
	//
	//  public void a(Integer n, String s) {
	//	  System.out.println("Emp Id:" + n);
	//	  System.out.println("Emp Name:" + s);
	//  }
	//
	//  @DataProvider
	//  public Object[][] dp() {
	//    return new Object[][] {
	//      new Object[] { 1, "a" },
	//      new Object[] { 2, "b" },
	//      new Object[] { 3, "c" },
	//    };
	//  }
	//  
	//  @DataProvider
	//  public Object[][] da() {
	//    return new Object[][] {
	//      new Object[] { 4, "e" },
	//      new Object[] { 5, "f" },
	//      new Object[] { 6, "g" },
	//    };
	//  }
	
	
		@Test(dependsOnMethods= {"test2","atest3"})
 public void test1() {
			System.out.println("hey");
		}
	//	@BeforeTest it will run the first 
	@Test
	public void test2() {
		System.out.println("hey1");
	}
	@Test
	public void atest3() {
		System.out.println("ahey1");
	}
}
