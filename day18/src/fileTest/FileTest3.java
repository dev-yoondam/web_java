package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest3 {
	public static void main(String[] args) {
		// 2바이트 단위로 데이터를 스트림으로 전송
		try {
			FileWriter fw = new FileWriter(new File("test2.txt"));
			fw.write("안녕하세요");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader fr = new FileReader(new File("test2.txt"));
			System.out.println((char) fr.read());
			System.out.println((char) fr.read());
			System.out.println((char) fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
