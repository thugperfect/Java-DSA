public class Autopromotion {
    public static void main(String[] args) {
    // automatic type promotion in java

    //let us see with an example 

    // WKT, the max storge capacity of bytes is 256

    int a = 257;

    byte b = (byte)a;

    

    //output :
    //1

    // this is happened because byte can store upto 256 

    //assigning 257 to a 256 compatable container gives the modulo of both

    //which is the reminder of 257 and 256

    // this is called automatic type promotion


    byte q = 20;
    byte w = 50;
    byte e = 80;

    int ans = q*w/e;



    System.out.println(ans);

    // output

    //12

    //let us see the q*w term 

    //which is eveluvataed to 20*50 = 1000

    //which cannot be stored in  a byte

    //but the final answer is right because java automatically converts the data type for each evaluvation

    // in our case the byte is eveluvated as int...

    // ***** whenever we do byte eveluvation it automatically assigns value to a int *****

    //this is why it gives an error when

    // byte boo = 10;
    // boo= boo * 5;

        
    }

    
}
