import java.util.*;
public class Main {

    public static void main(String[] args) {
        String s;
        int a,b,hasil;
        String tambah = "+";
        String kali = "*";
        String kurang = "-";
        String bagi = "/";
        String sisa = "%";
        String exit = "00";
        Scanner sc = new Scanner(System.in);

        for(;;) {
            s = sc.nextLine();
            s = s.trim();
            if (s.equals(exit)){
                System.exit(0);
            }
            else {
                String[] baru = s.split(" ");
                a = Integer.parseInt(baru[0]);
                if (a < 1 || a > 1000) {
                    System.out.println("penghitungan tidak dapat dilakukan");
                    System.exit(0);
                } else {
                    b = Integer.parseInt(baru[2]);
                    if (b < 1 || b > 1000){
                        System.out.println("penghitungan tidak dapat dilakukan");
                        System.exit(0);
                    }
                    else {
                        if (baru[1].equals(tambah)) {
                            hasil = a + b;
                            System.out.println(hasil);
                        } else if (baru[1].equals(kurang)) {
                            hasil = a - b;
                            System.out.println(hasil);
                        } else if (baru[1].equals(kali)) {
                            hasil = a * b;
                            System.out.println(hasil);
                        } else if (baru[1].equals(bagi)) {
                            if (a%b != 0){
                                System.out.println("Pembagian tidak dapat dilakukan");
                            }
                            else {
                                hasil = a / b;
                                System.out.println(hasil);
                            }
                        } else if (baru[1].equals(sisa)) {
                            hasil = a % b;
                            System.out.println(hasil);
                        }
                        else {
                            System.out.println("Operasi tidak ditemukan");
                        }
                    }
                }
            }
        }
    }
}