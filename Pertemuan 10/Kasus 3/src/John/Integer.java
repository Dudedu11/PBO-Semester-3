package John;


import java.util.Scanner;

public class Integer {

	public void integer(){
        Scanner keyboard = new Scanner (System.in);
		try {
			System.out.println("Masukkan pada textfield : ");
			int bilInteger = keyboard.nextInt();
			System.out.println("Output : "+ bilInteger);
		}
		catch(Exception e) {
			System.out.println("Format Salah!! Masukkan bilangan Integer");
		}
    }
}
