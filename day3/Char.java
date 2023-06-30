import java.util.*;
public class Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().trim().charAt(0);
        System.out.println(""+c);
        String type;
        if(c>='a' && c<='z'){
            type = "lowercase alphabets";
        }
        else if(c>='A' && c<='Z'){
            type = "Uppercase alphabets";
        }
        else if(c>=0 && c<=9){
            type = "Numbers";
        }
        else{
            type = "special character";
        }
        System.out.println(""+type);
    }
    
}
