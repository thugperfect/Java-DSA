package day4;
import java.util.Scanner;
public class equal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();
        String str2 = "hello";

        if(str1 == "hello"){
            System.out.println("hello mf");   //this doesnt work because it is not the same 
                                                //object pointed by the stack at the heap
                                                // insted we use .equals() method
        }
        else{
            System.out.println("bye mf");
        }

        if(str1.equals("hello")){
            System.out.println("hello mf .equals()");//this does work because it doesnot  
                                                    //check for object in heap it 
                                                    // just matches the string
        }
        else{
            System.out.println("bye mf .equals()");
        }



    }
}
