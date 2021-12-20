
public class A {
      static int x=10;
      int y;
      public static void main(String [] args)
      {
      A obj=new A();
      A obj1=new A();
      A.x=100;
      System.out.println(obj.x);
      }
}
