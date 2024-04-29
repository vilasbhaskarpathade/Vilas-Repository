public class OldException{

  public static void main(String[] args) {

    try {
        int div = 1/0;
    }

    catch (ArithmeticException ex) {
        ex.printStackTrace();
        System.out.println("ERROR");
        
    }
  }
}