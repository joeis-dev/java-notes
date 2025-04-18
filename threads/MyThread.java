// Way #1: Using Thread class.
// Consider that we cannot extends from another class and Thread class at the same time.
public class MyThread extends Thread {
  private String threadName;

  public MyThread(String name) {
    threadName = name;
  }

  public void run() {
    System.out.println("Init ... " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Thread: " + threadName + " -> " + i);
        // Let the thread sleep for a while
        Thread.sleep(50);

        // .join() should be used in the instance of the thread that is being joined
        // (Main thread i.e.)
        // this.join();
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + threadName + " interrupted.");
    }
    System.out.println("Thread " + threadName + " exiting.");
  }
}
