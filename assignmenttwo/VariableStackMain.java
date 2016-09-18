package assignmenttwo;

import java.util.Arrays;

public class VariableStackMain {
	
	public static void main(String[] args) {
		int count = 0;
		VariableStack vs = new VariableStack(3);
		vs.push(25);
		vs.push(88);
		vs.push(6);
		vs.push(68);
		vs.push(100);
		vs.push(150);
		while(count < vs.array.length){
			System.out.println(vs.pop());
			count++;
		}
	   }
	}

