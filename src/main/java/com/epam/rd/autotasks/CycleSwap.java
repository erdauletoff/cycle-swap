package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int len = array.length;
        if (len > 0) {
            int temp1 = array[0];
            int temp2;

            for (int i = 0; i < len; i++) {
                temp2 = array[(i + 1) % len];
                array[(i + 1) % len] = temp1;
                temp1 = temp2;
            }
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int len = array.length;
        if (len > 0) {
            shift %= len;

            for (int i = 0; i < shift; i++) {
                cycleSwap(array);
            }
        }
    }
}
