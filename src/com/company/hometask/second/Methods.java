package com.company.hometask.second;

public class Methods {

    public static void main(String[] args) {
        System.out.println(maxInteger(-5,-4 ));
    }


    private static long timeStamp(int countOfDays) {
        long seconds = System.currentTimeMillis(), daysToMillisecond = countOfDays * 86400000L;
        return seconds + daysToMillisecond;
    }

    // 2. Доработать метод из ДЗ предыдущего урока,
    // увеличивающий баланс таким образом: если сложили
    // 2 больших положительных числа, но получилось
    // отрицательное - вернуть 0

    // 3. можно и даже лучше дорабоать во 2-ом задании текущего ДЗ.
    // Организовать проверку таким образом: если складываем положительные
    // числа, но получаем отрицательное, то вывести 0, если
    // получаем положительное, но вычитаем из него большее
    // (т.е. получаем отрицательное), то возвращаем отрицательное.
    // Так же учесть кейс, когда у нас первое число отрицательное
    // и второе положительное/отрицательное. Иначе говоря:
    // пытаемся придумать как проверить, что не произошло
    // дерьмо с int overflow.
    private static int maxInteger(int num, int maxValue) {
        int result = 0;
        result = maxValue + num;
        if (maxValue >= 0 && num >= 0 && result < 0) {
            return 0;
        } else if (maxValue < 0 && num < 0 && result > 0) {
            return 0;
        } else {
            return result;
        }
    }

}