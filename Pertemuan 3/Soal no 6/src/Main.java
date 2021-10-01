import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String a,b;
        a=input.next();
        b=input.next();

        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
