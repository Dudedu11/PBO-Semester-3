import java.util.*;
public class Main {

    public static void main(String[] args) {
        String s;
        int i;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            System.out.println("no data");
        } else {
            String[] baru = s.split("['!,?._@ +]");
    //        System.out.println(baru[0]);
            System.out.println(baru.length);
            for (i=0; i<=baru.length-1;i++) {
                System.out.println(baru[i]);
            }
        }
    }
}