package Presem;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {

        EvenOddNumber checker = new EvenOddNumber();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=input.nextInt();

        boolean result = checker.findEvenOrOdd(number);

        if(result){
            System.out.println(number + " is and Even number");
        }
        else{
            System.out.println(number + " is not and Even number");
        }
    }
}

