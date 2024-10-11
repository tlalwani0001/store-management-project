import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // instantiates  items with specific values
    Coffee c = new Coffee(5.00, "ice", "strawberry", 1);
      System.out.println(c);

    
    espresso e = new espresso(5.00, "ice", "strawberry", 1, 3, true);
            System.out.println(e);

    mocha m = new mocha(5.00, "ice", "strawberry", 1, true, "lemon");
            System.out.println(m);

//instantiates base items with base values
    Coffee cf = new Coffee();
      System.out.println(cf);
 espresso ef = new espresso();
            System.out.println(ef);
     mocha mf = new mocha();
            System.out.println(mf);
  }
}