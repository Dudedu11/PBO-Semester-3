package John;

import java.util.Scanner;

public class Main {


    public static void main (String [] args) {

        Pembagian p = new Pembagian();
        Array a = new Array();
        Integer i = new Integer();
        FIle f = new FIle();
        Inisiasi in = new Inisiasi();

        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.println("PENGUJIAN HANDLING");
            System.out.println("1. Operasi pembagian ");
            System.out.println("2. Operasi yang melibatkan Array ");
            System.out.println("3. Pada operasi TextField yang hanya boleh Integer");
            System.out.println("4. Pada operasi file ");
            System.out.println("5. Jika menggunakan variable reference yang belum di inisiasi");
            System.out.print("Pilih opsi : ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    p.pembagian();
                    break;
                case 2:
                    a.aray();
                    break;
                case 3:
                    i.integer();
                    break;
                case 4:
                    f.file();
                    break;
                case 5:
                    in.inisiasi();
                    break;
            }

        }
    }
}
