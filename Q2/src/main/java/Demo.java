package main.java;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        char[] ch = {'a', '2', 'b'};
        try {
            try {
                run1(ch);
            } catch (ExceptionA ea) {
                ea.printStackTrace();
            }
            System.out.println(ch[2]);
            DataInputStream X = new DataInputStream(System.in);
            System.out.print("Enter First No:");
            int num1 = Integer.parseInt(X.readLine());
            System.out.print("Enter Second No:");
            int num2 = Integer.parseInt(X.readLine());
            run2(num1, num2);
        } catch (ExceptionB eb) {
            eb.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("IO Error");
        }

    }

    public static void run1(char... ch) throws ExceptionA {
        Stack<Character> chars = new Stack<>();
        for (char character : ch) {
            chars.push(character);
        }

        while (chars != null) {
            char c = chars.pop();
            if (!Character.isDigit(c))
                throw new ExceptionA("Character i not digit.");
        }
    }

    public static void run2(int num1, int num2) throws ExceptionB {

        int divide;
        if (num2 == 0)
            throw new ExceptionB("Divide by zero!");
        else
            divide = num1 / num2;
        System.out.println(divide);
    }
}
