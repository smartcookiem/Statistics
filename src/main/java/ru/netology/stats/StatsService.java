package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long summOfSales(long[] sales) {
        long resultSumm = Arrays.stream(sales).sum();
        return resultSumm;
    }

    public long averageSales(long[] sales) {
        long resultAverage = summOfSales(sales) / sales.length;
        return resultAverage;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowerAverage(long[] sales) {
        int lowMonths = 0;

        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                lowMonths++;
            }
        }
        return lowMonths;
    }

    public int higherAverage(long[] sales) {
        int highMonths = 0;

        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                highMonths++;
            }
        }
        return highMonths;
    }

}


