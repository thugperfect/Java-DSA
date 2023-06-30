import java.util.*;
public class Fib {
    // printing fib numbers...
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println(a+"\n"+b);
            while(count<=n){
                int temp = b;   //copying b that is 1
                b=b +a;         //producing next number by adding both numbers

                a = temp;       //storing copied b to a 
                count ++;
                System.out.println(" "+b);
            }
            
      
  
       
    }
    
}
