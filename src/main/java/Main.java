import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма продаж за год " + service.summOfSales(sales));
        System.out.println("Средняя сумма продаж в месяц " + service.averageSales(sales));
        System.out.println("Номер месяца с максимальными продажами " + service.maxSales(sales));
        System.out.println("Номер месяца с минимальными продажами " + service.minSales(sales));
        System.out.println("Количество месяцев с продажами ниже среднего " + service.lowerAverage(sales));
        System.out.println("Количество месяцев с продажами выше среднего " + service.higherAverage(sales));



    }
}
