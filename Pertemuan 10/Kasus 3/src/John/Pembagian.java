package John;

import java.util.*;

public class Pembagian {
    public void pembagian() {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka");
        a = sc.nextInt();
        System.out.println("Dibagi oleh");
        b = sc.nextInt();
        try {
            int hasilBagi = a / b;
            System.out.println("Hasil pembagian dari " + a + "/" + b + " adalah " + hasilBagi);
        } catch (Exception e) {
            System.out.println("Bilangan nol tidak bisa menjadi pembagi");
        }
    }
}
