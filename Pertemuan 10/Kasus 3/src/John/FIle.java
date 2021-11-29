package John;

import java.io.FileInputStream;

public class FIle {
    public void file(){
        FileInputStream file = null;
		try {
		file = new FileInputStream ("file.txt");
		}
		catch(Exception e) {
			System.out.println("File Tidak Tersedia");
		}
    }
}
