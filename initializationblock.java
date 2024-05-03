class BLOCK{
   static
    {
    System.out.println("in init block of BLOCK");
    }
    {
    System.out.println("in stsic block of BLOCK");
    }
}
 public class initializationblock
{
   {
    System.out.println("in static block");
    }
    static
    {
    System.out.println("in init block");
    }
    public static void main(String ...args)
    {
     initializationblock i = new initializationblock();
    BLOCK obj = new BLOCK();
    }
}
    