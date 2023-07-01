package day4;

import java.util.*;
class Switch {        //class names should not be methods name 
                      //i already got an error because of class name switch
                      // so i changed it...
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("*************Basic Calculator***********\n\n");
        while(true){        //does not terminate calc
        int first = s.nextInt();
        char op = s.next().trim().charAt(0);
        int last = s.nextInt();
        
        switch (op) {
            case '+':
                int add = first+last;
                System.out.println(first+" + "+last+" = "+add);
                break;                 // if break is not used in here case "-" will also execute after this
            case '-':
            int sub = first-last;
                System.out.println(first+" - "+last+" = "+sub);
                
                break;

            case '*':
            int mul = first*last;
                System.out.println(first+" * "+last+" = "+mul);
                
                break;
            case '/':
            int div = first/last;
                System.out.println(first+" / "+last+" = "+div);
                
                break;
            default:

            System.out.println("invalid operator...");
                break;
        }
    }}
    
}
