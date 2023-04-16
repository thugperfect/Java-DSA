import java.util.*;
public class Casting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // casting 

        /* casting is noting but changing one data type to another 

           casting can be done only if,
            ** the data type is compatible eg: float and int

            ** Source data type should be lesser than the destination type
                    eg : int is lesser than float.. (but not the vice versa)
         *
         */

         System.out.print("Enter a int :");
         float f = s.nextInt();

         // but ... int f = s.nextFloat(); gives an error because float is greater than int 
         // simply LHS should be always greater than RHS for compatablity
         System.out.println("Tadaaa its a float ... " +f);

         // output :
         /*
             Enter a int :10
             Tada its a float ...10.0
          */
        // this is called as casting...

    }
    
}
