package a_7_2;


//nicht mein code, aus stackoverflow
public class Baeldung {
	public static void main(String[] args) {
		Integer firstNum = 10;
		Integer secondNum = 11;
		
		int s1 = addBinaryNumber(firstNum, secondNum);
		System.out.println(s1);
	}
	
	public static Integer addBinaryNumber(Integer firstNum, Integer secondNum) {
	    StringBuilder output = new StringBuilder();
	    int carry = 0;
	    int temp;
	    while (firstNum != 0 || secondNum != 0) {
	        temp = (firstNum % 10 + secondNum % 10 + carry) % 2;
	        output.append(temp);

	        carry = (firstNum % 10 + secondNum % 10 + carry) / 2;
	        firstNum = firstNum / 10;
	        secondNum = secondNum / 10;
	    }
	    if (carry != 0) {
	        output.append(carry);
	    }
	    return Integer.valueOf(output.reverse().toString());
	}
}
