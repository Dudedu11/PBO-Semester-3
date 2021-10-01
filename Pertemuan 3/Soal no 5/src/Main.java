import java.util.Scanner;
// 40    20menit
public class Main {

    public static void main(String[] args) {
        String John;
        String exit = "00";
        long hasil;
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            John = sc.nextLine();
            John = John.trim();
            if (John.equals(exit)) {
                System.exit(0);
            } else {
                String[] baru = John.split(" ");
                John = baru[0] + baru[1] + baru[2] + baru[3];
                hasil = Long.parseLong(John);
                hasil = hasil - 999999;
                hasil = hasil % 5;
                if (hasil == 0) {
                    System.out.println("jalan");
                } else {
                    System.out.println("berhenti");
                }
            }
        }
    }
}
