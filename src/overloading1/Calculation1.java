
package overloading1;

public class Calculation1 {
     void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        Calculation1 c = new Calculation1();
        c.sum(10, 10, 10);
        c.sum(20, 20);

    }
}
