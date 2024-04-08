package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask2 {
   public static void main(String[] args) throws IOException {
      String[] animals = { "독수리", "참새", "닭", "비둘기" };

      try {
         BufferedWriter bw = new BufferedWriter(new FileWriter("animals.txt"));

         for (String data : animals) {
            bw.write(data);
            bw.newLine();
         }
         bw.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      // 1. 닭을 불사조로 수정하기
//      try {
//         BufferedReader br = new BufferedReader(new FileReader("animals.txt"));
//         
//         String line = null;
//         String tmp = "";
//         
//         while((line=br.readLine()) != null) {
//            tmp += line.equals("닭") ? "불사조\n" : line +"\n";
//         }
//         br.close();
//         System.out.println(tmp);
//      } catch (FileNotFoundException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      } catch (IOException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }

      // 2. 비둘기 삭제하기

      BufferedReader br = new BufferedReader(new FileReader("animals.txt"));

      String line = null;
      String tmp = "";

      while ((line = br.readLine()) != null) {
         if (line.equals("비둘기")) {
            continue;
         }
         tmp += line + "\n";
      }
      br.close();
      System.out.println(tmp);

      BufferedWriter bw = new BufferedWriter(new FileWriter("animals2.txt"));
      bw.write(tmp);
      bw.close();

   }
}
