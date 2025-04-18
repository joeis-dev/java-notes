public class MyApp {
  public static void main(String args[]) {
    for (int i = 0; i < 5; i++) {
      MyThread thread = new MyThread("Thread " + i);
      thread.start();

      try {
        // New threads will wait for the active thread to finish.
        thread.join();
      } catch (Exception e) {
        System.out.println("Thread " + thread.getName() + " interrupted.");
      }
    }
  }
}
