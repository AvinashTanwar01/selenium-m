package lib;

import java.util.HashSet;

public class House {
	HashSet<String >studset= new HashSet<>();
	public HashSet<String> getstudset(){
		return studset;
	}
	
	public void setstudset(HashSet<String> studset) {
		this.studset= studset;
	}
	
	public void addName(String details) {
		if(!details.isEmpty() && details.contains(":")) {
			String[] parts= details.split(":",2);
			String name= parts[1].trim();
			studset.add(name);
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public HashSet<String> formTeam(){
		HashSet<String> res= new HashSet<>();
		for(String name: studset) {
			String house="";
			char ch = name.toUpperCase().charAt(0);
			if(ch >= 'A' && ch<='H') {
				house="RED";
			}else if(ch >= 'I' && ch<='P') {
				house="Blue";
			}
			res.add(name+":"+house);
		}
		return res;
	}

}
