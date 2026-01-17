package com.lib.listmethod;



import java.util.List;

public class listclass {

	public boolean AddAllEle(List<Integer> test1, List<Integer> test2){ 
		boolean l3=test1.addAll(test2); 
		return l3;
		}
	
	public Object[] convertToArr(List<Integer> data) {
		Object[] arr = data.toArray();
		return arr;
	}
}
