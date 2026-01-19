package librun;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestingNG_122day2.TestingNG_122day2.lib1;

import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lib1run {
    lib1 s1 = new lib1();
    WebDriver driver=new ChromeDriver();
    List<String> expectedHeaders = Arrays.asList("Company", "Contact", "Country");
    String Expected = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        
//    @Test(priority=1)    
//    public void testLogin() throws InterruptedException {
//   	s1.init(driver);
//       s1.launchCart();
//        String logStr = s1.lOGassert("aarchie.dhawan@example.com", "user123");
//        Thread.sleep(1000);
////        s1.logOUT();
////        s1.cont();
////        Assert.assertEquals(logStr, Expected);
////        s1.logOUT();
////        Thread.sleep(3000);
////        String logStr1 = s1.lOGassert("aarchie.dhawan@example.com", "user");
////        Thread.sleep(3000);
////        Assert.assertEquals(logStr1, Expected);
//        
////        driver.close();
//    }
//   @Test(priority=2)
//   public void logout() throws InterruptedException {
////	   s1.init(driver);
////	   s1.launchCart();
//	   s1.logOUT();
//	   Thread.sleep(1000);
//   }
//   @Test(priority=3)
//   public void reLogin() throws InterruptedException {
//	   String mess= s1.Relogin("","");
//	   Assert.assertEquals(mess, Expected);
//	   
//   }
   @Test(priority=1)
//   public void CountLink() throws InterruptedException {
//	   
//    	s1.init(driver);
//    	s1.launchCart1();
//	   int count= s1.count_links1();
//	   System.out.println("Total Links:"+count);
//   }
//   public void Count_name() throws InterruptedException {
//	   s1.init(driver);
//	   List<WebElement> count= s1.drop_amazon();
////	   Assert.assertEquals(count, expectedHeaders);
//	   
//	   
//   }
   
   public void alertmess() throws InterruptedException {
	   s1.init(driver);
	   String mess = s1.Alert();
	   System.out.println("Alert mess"+mess);
}
 
   
//   @Test(dataProvider="da")
//   public void testLogin(String mail, String pass,Boolean tu ) throws InterruptedException {
//	   s1.init(driver);
//	   s1.launchCart();
//	   String logStr = s1.lOGassert(mail, pass);
//	   System.out.print(logStr);
//	   if(logStr.equals("My Account")) {
//		   System.out.println("Login Passed");
//	   }else {
//		   System.out.println("Login Failed");
//	   }
////	   	Assert.assertEquals(logStr,tu);
//	   }	   
//   
//   @DataProvider
//// @DataProvider
// public Object[][] da() {
//   return new Object[][] {
//     new Object[] { "aarchie.dhawan@example.com", "user123",true }
//
//   };
// }

//    @Test
//    public void login_failed() throws InterruptedException {
//    	s1.init(driver);
////        s1.launchCart();
//        String logStr = s1.logINVALID("aarchie.dhawan@example.com", "user");
//        Thread.sleep(1000);
//        Assert.assertEquals(logStr, Expected);
//
//    	
//    }
}

