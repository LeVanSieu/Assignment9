/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading1;

/**
 *
 * @author ACER
 */
public class Calculation2 {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        Calculation2 c = new Calculation2();
        c.sum(10.5, 10.5);
        c.sum(20, 20);

    }
}
