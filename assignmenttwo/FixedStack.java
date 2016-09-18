package assignmenttwo;

public class FixedStack implements Stack{

	public static int capacity;
	public int array[];
	public int top =-1;
	
	
	public FixedStack(int N){
		this.capacity = N;
		array = new int[capacity];
	}
	public int size() {
        return top + 1;
 }
	public void push(int I) {
		// TODO Auto-generated method stub
		top += 1;
		if(top < capacity){
			array[top] = I;
		}
		else{
			System.out.println("Stack Overflow");
			top--;
		}
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			System.out.println("Stack is empty");
		}
		return array[top--];
	}
	
}
