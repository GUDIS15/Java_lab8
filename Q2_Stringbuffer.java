package LAB8;

public class Q2_Stringbuffer {
	 public static void main(String[] args) {  
         StringBuffer sb1 = new StringBuffer("Wave2 ");  
         System.out.println("buffer value: "+sb1);  
      // appending boolean argument  
         sb1.append(true);  
         // print the StringBuffer after appending  
         System.out.println("after append: " + sb1);  
 
         StringBuffer sb2 = new StringBuffer("Wave2 ");  
         System.out.println("new buffer value: " + sb2);  
           
         // appending boolean argument      
         sb2.append(false);  
           
         // print the string buffer after appending  
         System.out.println("after append = " + sb2);  
   }  

}
