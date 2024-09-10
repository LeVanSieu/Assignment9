/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading1;

/**
 *
 * @author ACER
 */
public class Calculation4 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        Calculation4 c = new Calculation4();
        c.sum(20, 20);
        c.sum(20, 20, 20);

    }
}
