import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);

        for(;;) {

            a = sc.nextInt();
            if (a == 00){
                System.exit(0);
            }
            else {
                if (a < 15 && a >= 0) {
                    int hasil = 500000 - (((15 - a) * 50000) * 15 / 100);
                    System.out.println(hasil);
                } else if (a >= 15 && a < 40) {
                    int hasil = 500000 + ((a * 50000) * 10 / 100);
                    System.out.println(hasil);
                } else if (a >= 40 && a < 80) {
                    int hasil = 500000 + ((a * 50000) * 25 / 100);
                    System.out.println(hasil);
                } else if (a >= 80) {
                    int hasil = 500000 + ((a * 50000) * 35 / 100);
                    System.out.println(hasil);
                }
            }
        }
    }
}
