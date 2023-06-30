import java.util.*;
public class Three{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter a number :");
        int a = s.nextInt();
        System.out.print("Enter 2nd number :");
        int b = s.nextInt();
        System.out.print("Enter 3rd number :");
        int c = s.nextInt();

        // if(a>b && a>c){
        //     System.out.println(" greatest number "+a);
        // }
        // else if(b>a && b>c){
        //     System.out.println(" greatest number "+b);
        // }
        // else if(c>a && c>b){
        //     System.out.println(" greatest number "+c);
        // }

/* another method */

        // if(a<b){
        //     if(b>c){
        //         System.out.println(" greatest number "+b);
        //     }
        //     else{
        //         System.out.println(" greatest number "+c);
        //     }
        // }
        // else{
        //     System.out.println(" greatest number "+a);
        // }

/* another method */

        int max = a;
        if(b>max){
            max =b;
        }
        if(c>max){
            max =c;
        }
        System.out.println("max :" +max);
    }
}