package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
public static void main(String[] args) {
	
	File f = new File("../text18.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		FileOutputStream fos = new FileOutputStream(f);
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
}
}
