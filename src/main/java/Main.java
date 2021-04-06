public class Main {
  public static void main(String[] args) throws Exception {
    new ProcessBuilder("echo", "hello")
        .inheritIO()
        .start()
        .waitFor();
  }
}
