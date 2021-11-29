package John;

public class Array {
    public void aray(){
        int array[]= {4,5,3,45,8,0};
		try {
			for(int i=0; i<=10; i++) {
				System.out.println("Nilai dari array ke "+ i + " adalah "+ array[i]);
			}
		}
		catch (Exception e) {
			System.out.println("Nilai dari index yang diinginkan tidak tersedia");
		}
    }
}
