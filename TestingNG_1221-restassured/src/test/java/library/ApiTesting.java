package library;

import org.testng.annotations.Test;
import junit.framework.Assert;

public class ApiTesting {
    
    lib1 s1 = new lib1();
//    String Sline = "HTTP/1.1 200 OK";
//    int Cbody = 200;
//    String body = "\"login\": \"AvinashTanwar01\"";
//    String Sline1 = "HTTP/1.1 201 OK";
//    int Cbody1 = 201;
//    String body1 = "\"login\": \"AvinashTanwar01\"";
    
//    @Test
//    public void code() {
//        int c = s1.getStatusC();
////        System.out.println(c);
//        Assert.assertEquals(c, Cbody);
//    }
    

//    @Test
//    public void line() {
//        String s = s1.getStatusL();
////        System.out.println(s);
//        Assert.assertEquals(s, Sline);    
//    }

//    @Test
//    public void body() {
//        String b = s1.getStatusB();
////        System.out.println(b);
//        Assert.assertTrue(b.contains(body));    
//    }
    
    @Test
    public void postD() {
//    	String body1=s1.post_dataSb3();
////    	Assert.assertEquals(body1, body1); 
//    	System.out.println(body1);
//    	String line1=s1.post_dataSL2();
////    	Assert.assertEquals(line1, Sline1); 
//    	System.out.println(line1);
//    	int code1=s1.post_DataSC1();
////    	Assert.assertEquals(code1, Cbody1); 
//    	System.out.println(code1);
    	String body1= s1.deleteRepoResponseBody();
    	System.out.println(body1);
    	int code1= s1.deleteRepoStatusCode();
    	System.out.println(body1);
    	String line1= s1.deleteRepoStatusLine();
    	System.out.println(body1);
    }
}
