package com.list.java;

//import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lib.listmethod.listclass;

//import junit.framework.Assert;

public class NewTest12 {
	
	listclass obje = new listclass();
	boolean exp = true;
	Object expArr[]= {1,2,3,4,5};
	
	
  @Test
  public void f() {
	  
	  List<Integer> test1 = new ArrayList<>(Arrays.asList(1,2,3));
	  List<Integer> test2 = new ArrayList<>(Arrays.asList(1,2,3));
	  boolean res = obje.AddAllEle(test1, test2);
	  System.out.println(res);
	 
	  Assert.assertEquals(res,exp);
	  
  }
  
  @Test
  public void f2() {
	  List<Integer> l1 = Arrays.asList(1,2,3,4,5);
	  Object act[] = obje.convertToArr(l1);
	  System.out.println(Arrays.toString(act));
	  
	  Assert.assertEquals(act, expArr);
  }
}
