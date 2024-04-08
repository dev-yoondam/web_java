package threadTest;

public class ThreadName {
   public static void main(String[] args) {
      Thread mainTh = Thread.currentThread();
      System.out.println(mainTh);
      System.out.println(mainTh.getName() + " 실행");

      for (int i = 0; i < 3; i++) {
         Thread threadA = new Thread() {

            @Override
            public void run() {
               System.out.println(getName() + "실행");
               // getName() 메소드는 Thread의 인스턴스 메소드로 쓰레드 이름을 리턴
            }
         };
         threadA.start();
      }

      Thread testTh = new Thread() {

         @Override
         public void run() {
            System.out.println(getName() + "실행");
         }
      };
      testTh.setName("test-th");
      testTh.start();

   }
}
