package lib;
import java.util.Scanner;

class NumberGame{
	private int chances;
	private int sum;
	
	public NumberGame(int chances) {
		this.chances = chances;
		this.sum=0;
	}
	public boolean ValidateChances() {
		return chances >=1 && chances <=5;
	}
	public boolean ValidateNumber() {
		return chances >=0 && chances <=10;
	}
	public void Addsum(int num) {
		sum+=num;
	}
	public boolean IsPrime() {
		if(sum<2) return false;
		for(int i=2;i<Math.sqrt(sum);i++) {
			if(sum%i==0) return false;
		}
		return true;
	}
	
}

public class GAMESUM {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int chances = sc.nextInt();
		NumberGame game = new NumberGame(chances);
		if(!game.ValidateChances()) {
			System.out.println("No valid chances");
		}
		System.out.println("Enter Number");
		for(int i=0;i<chances;i++) {
			int number= sc.nextInt();
			if(!game.ValidateNumber()) {
				System.out.println("No valid number");
				return;
			}
			game.Addsum(number);
			int number2= sc.nextInt();
			if(!game.ValidateNumber()) {
				System.out.println("No valid number");
				return;
			}
			game.Addsum(number2);
		}
		if(!game.IsPrime()) {
			System.out.println("No valid prime");
		}else{
			System.out.println("valid prime");
		}
		
		
		
	}
}
