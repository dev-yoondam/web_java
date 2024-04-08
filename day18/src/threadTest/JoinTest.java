package threadTest;

public class JoinTest {
   public static void main(String[] args) {
      Runnable r1 = () -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
               Thread.sleep(500);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
         System.out.println(Thread.currentThread().getName() + "쓰레드 종료");
      };

      Thread t1 = new Thread(r1, "t1");
      Thread t2 = new Thread(r1, "t2");
      t1.start();
      t2.start();

      try {
         t1.join(); // 메인쓰레드가 t1의 실행이 종료될 때까지 기다린다 
//         t1.join(1000); // 메인쓰레드가 1초동안 기다렸다가 실행된다 
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      // main 쓰레드 : t1이 종료될때까지 대기하는동안 다른 작업을 수행하지않음
      
      for (int i = 0; i < 5; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(500);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      System.out.println("main 쓰레드 종료");
   }
}
