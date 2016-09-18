package assignmenttwo;

import java.util.Arrays;

public class FixedStackMain {

	public static void main(String[] args) {
		FixedStack fs = new FixedStack(3);
		fs.push(11);
		fs.push(1);
		fs.push(110);
		fs.push(161);
		System.out.println(fs.size());
		System.out.println(fs.pop());
		System.out.println(fs.size());
	}
	
	
	
}
