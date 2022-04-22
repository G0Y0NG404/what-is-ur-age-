import java.util.Scanner;
 public class MarcoCute {

    
    public static void main(String[] args) {
        System.out.println("ENTER YOUR AGE : "); 
        Scanner t = new Scanner (System.in);
      int n = t.nextInt();
     
      
     if (n < 18 )
     {
         System.out.println(" YOU ARE MINOR OR NOT IN A LEGAL AGE :> ");
     }
    else if (n >= 65 )
    {
        System.out.println("YOU ARE A SENIOR CITIZEN ");
    }
    
   else
    {
        System.out.println("YOU ARE IN A LEGAL AGE :> ");
    }
  
    }
}
