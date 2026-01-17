package librun;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import libraries.lib1;

public class lib1run {
    lib1 s1 = new lib1();
    WebDriver driver=new ChromeDriver();
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
   public void CountLink() {
	   
    	s1.init(driver);
	   int count= s1.count_links();
	   System.out.println("Total Links:"+count);
   }
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
