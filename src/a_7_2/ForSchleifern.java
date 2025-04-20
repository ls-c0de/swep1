package a_7_2;

public class ForSchleifern {
	public static void main(String[] args) {
		int n = 10;
		int numBits;
		String paddingZero = "0";
		String binary;

		for(int i = 0; i <= n; i++)
		{
		    numBits = n / 2;
		    if(numBits < 2)
		    {
		        numBits = 2; // Binary should never display less than 2 bits of digits for clarity.
		    }

		    binary = Integer.toBinaryString(i);
		    if(binary.length() < numBits)
		    {
		        do  
		        {
		            binary = paddingZero + binary;
		        }
		        while(binary.length() < numBits);
		    }

		    System.out.print(binary + " "); // Appends the String representation of the binary digit to the paddingZeroes
		}
	}
}
