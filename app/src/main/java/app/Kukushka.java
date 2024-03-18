package app;

public class Kukushka extends Bird {

  @Override
  void Sing() {
    for (int i = 0; i <= ((int) Math.random()) % 10; i++) {
      System.out.println("ку-ку");
    }
  }
}
