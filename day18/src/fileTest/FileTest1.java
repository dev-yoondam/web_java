package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) {
		File f = new File("test.txt");
//		try { // 파일생성 
//			f.createNewFile();
//			System.out.println("파일이 생성되었습니다");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a');
			System.out.println("test.txt 파일에 문자 a를 추가했습니다");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
