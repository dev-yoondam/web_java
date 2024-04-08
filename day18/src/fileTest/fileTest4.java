package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileTest4 {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("text3.txt")));
			bw.write("테스트 중입니다"); // 줄바꿈: 1.\n 2. newLine
			bw.newLine();
			bw.write("오늘은 4월 3일입니다");
			// bw.flush();//버퍼 비움 (버퍼에 있는 데이터를 전송한다)
			bw.close();// 얘도 자동적으로 버퍼 비워줌 (전송과 비우기 동시에)
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("text3.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
