import java.util.*;;
public class NumberCounter {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number :");
        Long a = s.nextLong();
        System.out.print("Enter number to be counted (0-9):");
        int b = s.nextInt();
        int count = 0;
        while(a>0){
            Long last = a%10;
            if(last == b){
             count++;

            }
            a = a/10;

        }
        System.out.println("number of times "+b+" counted are..." +count);

    }
}
