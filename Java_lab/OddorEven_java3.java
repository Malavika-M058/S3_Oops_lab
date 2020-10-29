import java.util.*;

 // Compiler version JDK 11.0.2

 class OddorEven
 {
   public static void main(String args[])
   { 
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the num:");
     int num;
     num = sc.nextInt();
     if(num%2==0)
      {
        System.out.println(num+"is even");
      }
      else if(num%2==1)
      {
        System.out.println(num+"is odd");
      }
      else 
        System.out.println(num+"is Zero");
   }
 }
