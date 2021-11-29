package John;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bilangan hexadecimal : ");

        try{
            int input = sc.nextInt(16);
            System.out.println(Integer.toHexString(input)+
                    " merupakan bilangan hexadecimal dari "+input);
        }catch(Exception e){
            System.out.println(e+": bukan bilangan hexadecimal");
        }
    }
}






