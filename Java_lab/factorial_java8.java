import java.util.*;

 // Compiler version JDK 11.0.2

 class factorial
 {
   public static void main(String args[])
   { 
    int n=5;
    long fact=1;
    for(int i=1;i<=n;++i)
    {
      fact*=i;
    }
    System.out.println(fact);
   }
 }
