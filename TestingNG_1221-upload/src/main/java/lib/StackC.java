package lib;

public class StackC {
	public int size;
	public char[] stack;
	public int top;
	
	public StackC(int size) {
		this.size= size;
		stack= new char[size];
		top=-1;
	}
	
	public boolean IsEmpty() {
		return top==-1;
	}
	public boolean IsFull() {
		return top==size-1;
	}
	
	public void push(char ch) {
		stack[++top]=ch;
	}
	public void pop() {
		top--;
	}
	
	public char peek() {
		return stack[top];
	}
	
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(stack[top]);
		}
	}
}
