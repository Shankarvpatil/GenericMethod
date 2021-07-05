package com.tushar.max;
import java.util.Scanner;

public class MaxFinder {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Press 1 to find maximum of Integers\nPress 2 to find maximum of Float number\nPress 3 to find maximum of String");
        System.out.print("Enter option : ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a size of Integer array: ");
                int size = scanner.nextInt();
                Integer[] integersArray = new Integer[size];
                integersArray = printInteger(integersArray, size);
                Integer integerMax = findMax(integersArray);
                System.out.println("Maximum integer value is :" + integerMax);
                break;
            case 2:
                System.out.println("Enter a size of float array: ");
                size = scanner.nextInt();
                Float[] floatsArray = new Float[size];
                floatsArray = printFloat(floatsArray, size);
                Float floatMax = findMax(floatsArray);
                System.out.println("Maximum float number is :" + floatMax);
                break;
            case 3:
                System.out.println("Enter a size of String array: ");
                size = scanner.nextInt();
                String[] stringsArray = new String[size];
                stringsArray = printString(stringsArray, size);
                String stringMax = findMax(stringsArray);
                System.out.println("Maximum String is :" + stringMax);
                break;
            default:
                System.out.println("Invalid input.");
    public static String findMax(String str1, String str2, String str3) {
        String maxString = str1;
        if (str2.compareTo(maxString) > 0) {
            maxString = str2;
    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
    public static Integer findMax(Integer int1, Integer int2, Integer int3) {
        Integer max = int1;
        if (int2.compareTo(max) > 0) {
            max = int2;
public class MaxFinder {

    public static <T extends Comparable> T findMax(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
    }

    public static Integer[] printInteger(Integer[] integersArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            integersArray[i] = scanner.nextInt();
        }
        return integersArray;
    }

    public static Float[] printFloat(Float[] floatsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            floatsArray[i] = scanner.nextFloat();
        }
        return floatsArray;
    }

    public static String[] printString(String[] stringsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            stringsArray[i] = scanner.next();
        }
        return stringsArray;
    }

    // Generic type method
    // We have to extends Comparable otherwise it will give error while using compareTo() method
    public static <E extends Comparable> E findMax(E[] integers) {
        E max = integers[0];
        for (E i : integers) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }
    public static String findStringMax(String[] strings) {
        String max = strings[0];
        for (String i : strings) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        System.out.printf("Maximum of %s %s %s is %s \n", str1, str2, str3, maxString);
        return maxString;
        System.out.printf("Max values of %s %s %s is %s \n", num1, num2, num3, max);
        if (int3.compareTo(max) > 0) {
            max = int3;
        }
        System.out.printf("Max values of %s %s %s is %s \n", int1, int2, int3, max);
        return max;
    }
}
