package day4;
import java.util.Scanner;
public class SwitchNewSyntax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("********Basic Calculator***********\n\n");
        while(true){
        int first = s.nextInt();
        char op = s.next().trim().charAt(0);
        int last = s.nextInt();

        
       //switch better syntax

        
        switch (op) {
            case '+' -> System.out.println(first+" + "+last+" = "+(first+last));
            case '-' -> System.out.println(first+" - "+last+" = "+(first-last));
            case '*' ->System.out.println(first+" * "+last+" = "+(first*last));
            case '/' -> System.out.println(first+" / "+last+" = "+(first/last));
             
            default -> System.out.println("invalid operator...");
        
        }
    }}
    }
   


