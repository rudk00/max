package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static void main(String[] args) {
        int[] array = new int[] {-2, 0, 10, 5};
        System.out.println(max(array));
    }
    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
