class OuterClass {
  int outs = 10;

  class InnerClass {
    int ins = 5;
  }
}

public class InnerOuter {
  public static void main(String[] args) 
  {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();

    System.out.println(myInner.ins + myOuter.outs);
  }
}