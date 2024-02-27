package app.utils;

public class Utils {
  public final static void clearConsole() {
    try {
      String operatingSystem = System.getProperty("os.name"); // Check the current operating system

      if (operatingSystem.contains("Windows")) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
        Process startProcess = pb.inheritIO().start();
        startProcess.waitFor();
      } else {
        ProcessBuilder pb = new ProcessBuilder("clear");
        Process startProcess = pb.inheritIO().start();

        startProcess.waitFor();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static int[] concat(int[] a1, int[] a2) {
    int newArrLength = a1.length + a2.length;
    int[] newArr = new int[newArrLength];
    for (int i = 0; i < newArrLength; i++) {
      if (i < a1.length) {
        newArr[i] = a1[i];
      } else {
        newArr[i] = a2[i - a1.length];
      }
    }
    return newArr;
  }

  public static String toString(int[] arr) {
    String str = "[";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i];
      if (i < arr.length - 1) {
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public static final double PI = 3.14;
}