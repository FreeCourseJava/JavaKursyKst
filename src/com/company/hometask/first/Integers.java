package com.company.hometask.first;

public class Integers {
    public static void main(String[] args) {
        maxInteger();
        multiplayInteger(1);
    }

    /**
     * число 2147483647 в
     * дополнительном коде выглядит как 0111 1111 1111 1111 1111 1111 1111 1111 (31 единица),
     * а -2147483648 - 1000 0000 0000 0000 0000 0000 0000 0000 (единица и 31 ноль).
     */
    private static void maxInteger() {
        int someInt = 2147483647, result = 0;
        result = someInt + 1;
        System.out.println(result);
    }

    /**
     * если перевести 1111 1111 1111 1111 1111 1111 1111 1111 из двоичной в
     * дестячную систему, то получится 4294967295 , а это есть полный диапозон
     * примитива int , следовательно число слишком больешое и оно обрезается на
     * числе -727379968
     */
    private static void multiplayInteger(int multiplayCount) {

        int millionik = 1000000, resultInteger = 0;
        for (int i = 0; i < multiplayCount; i++) {
            resultInteger = millionik*millionik;
        }
        System.out.println(resultInteger);
    }
}
