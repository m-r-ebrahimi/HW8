package ir.maktab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String[] str = null;
        String[] str = {"ali", "reza"};
        try {
            demo(str);
        } catch (NullPointerException ne) {
            System.out.println("Catch null exception in main.");
            ne.printStackTrace();
        }
    }

    public static void demo(String... str) {
        try {
            if (str == null)
                throw new NullPointerException("null!");
            else
                System.out.println(Arrays.toString(str));
        } catch (NullPointerException ne) {
            System.out.println("Catch null exception in method.");
            ne.printStackTrace();
            throw ne;
        }
    }
}
