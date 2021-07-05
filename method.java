package com.Shankar.max;
public class MaxFinder {
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
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.printf("Max values of %s %s %s is %s \n", num1, num2, num3, max);
        if (int3.compareTo(max) > 0) {
            max = int3;
        }
        System.out.printf("Max values of %s %s %s is %s \n", int1, int2, int3, max);
        return max;
    }
}
