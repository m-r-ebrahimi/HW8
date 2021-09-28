package ir.maktab;

import java.io.DataInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        char[] ch = {'1', '2', '3'};
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
        } catch (ExceptionB | NullPointerException eb) {
            eb.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("IO Error");
        }
    }

    public static void run1(char... ch) throws ExceptionA {
        int i = ch.length;
        while (i > 0) {
            if (!Character.isDigit(ch[--i]))
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
