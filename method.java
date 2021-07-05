package com.Shankar.max;
public class MaxFinder {
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
        if (str3.compareTo(maxString) > 0) {
            maxString = str3;
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
