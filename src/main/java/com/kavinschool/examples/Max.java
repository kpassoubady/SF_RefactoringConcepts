package com.kavinschool.examples;

public class Max {
    public static int max3(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            return num1;
        else if (num2 >= num1 && num2 >= num3)
            return num2;
        else
           return num3;
    }

    public static int max3Simple(int num1, int num2, int num3) {
        return Math.max(Math.max(num1,num2),num3);
    }

    public static boolean isBig(int num1, int num2) {
        if(num1 > num2) {
            return true;
        } else if (num1 == num2) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean isBigSimple(int num1, int num2) {
        return num1 > num2;
    }


}
