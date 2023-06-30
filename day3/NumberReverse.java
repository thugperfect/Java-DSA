import java.util.*;;
public class NumberReverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number to be reversed:");
        Long num = s.nextLong();
        Long rev = 0l;
        while(num >0){
            Long last = num%10;
            num=num/10;
            rev = rev*10+last;
        }
        System.out.println(rev);
    }
}
