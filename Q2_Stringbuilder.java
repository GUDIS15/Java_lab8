package LAB8;

public class Q2_Stringbuilder {
	public static void main(String[] args)
    {
  
        StringBuilder sb1 = new 
                      StringBuilder("Hello ");
        System.out.println("Input: " + sb1);
  
        // Appending the boolean value
        sb1.append(true);
        System.out.println("Output: " + sb1);
  
        System.out.println();
  
        StringBuilder sb2 = new StringBuilder("Happy Life ");
        System.out.println("Input: " + sb2);
  
        // Appending the boolean value
        sb2.append(false);
        System.out.println("Output: " + sb2);
    }

}
