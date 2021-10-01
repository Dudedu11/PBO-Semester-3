import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] John;
        John = new int[3];
        String[] JohnS;
        JohnS = new String[3];
        Scanner sc = new Scanner(System.in);

        JohnS[0] =sc.next();
        John[0] =sc.nextInt();
        JohnS[1] =sc.next();
        John[1] =sc.nextInt();
        JohnS[2] =sc.next();
        John[2] =sc.nextInt();
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {

            System.out.printf("%-15s%03d\n",JohnS[i],John[i]);
        }
        System.out.println("================================");

    }
}
