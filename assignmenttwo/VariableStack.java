package assignmenttwo;

public class VariableStack implements Stack {

	public int capacity;
	public int array[];
	public int top =-1;
	public int growth = 1;
	
	
	public VariableStack(int N){
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
			System.out.println("New stack length is "+ (array.length + growth));
			int temp[] = new int[array.length + growth];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
			array[top] = I;
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
