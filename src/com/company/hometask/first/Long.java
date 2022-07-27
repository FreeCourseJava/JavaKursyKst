package com.company.hometask.first;

import java.net.ServerSocket;

public class Long {
    public static void main(String[] args) {
        maxLong();
    }

    /**
     * Ситуация такая же как у и int но с тем отличием что
     * long 64 битный
     * То есть когда мы добавляем еденицу число из одного 0
     * и 63 едениц меняется на одну 1 и 63 0 , следовательно
     * если первая 1 то java машина считает что это отрицательное
     * число
     */
    private static void maxLong() {
        long interestingLong = 9223372036854775807L, result;
        result = interestingLong + 1L;
        System.out.println(result);
    }

    private static void multiplayLong(int multiplayCount) {
        long someLong = 1000000000, result = 0;

        for (int i = 0; i < multiplayCount - 1; i++) {
            someLong = someLong * someLong;
        }

        System.out.println(someLong);
    }
}
