package Presem;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int square(int a) {
        return a * a;
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result1 = c.square(c.add(c.multiply(3 ,4), c.multiply(5 ,7)));

        int result2 = c.add(c.square(c.add(4, 7)), c.add(8, 3));

        System.out.println(result1);
        System.out.println(result2);
    }
}
