package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      ArrayList<String> al1 = new ArrayList<>();
      List<ArrayList> al2 = new ArrayList<>();
//      List<Integer, String> al3 = new ArrayList<Integer, String>();
      List<HashMap> al3 = new ArrayList<>();
      System.out.println(al1);
      System.out.println(al2);
      System.out.println(al3);

      // 1. HashMap의 객체 생성(int, int)
      HashMap<Integer, Integer> map1 = new HashMap<>();
      // 2. HashMap 객체에 값 추가
      map1.put(10, 100);
      System.out.println(map1);
      // 3. ArrayList 객체에 map1 객체 추가
      al3.add(map1);
      System.out.println(al3);

   }
}
