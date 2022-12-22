public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    // Задача №1
    public static void task1() {
        System.out.println("Задача №1");

        int requiredAmount = 2_459_000; // Необходимая сумма накоплений
        int transferAmount = 15_000; // Сумма, которую будем откладывать каждый месяц
        int numberOfMonths = 1;
        int total = 0; // Сумма накоплений
        while (total < requiredAmount) {
            total = total + transferAmount;
            numberOfMonths = numberOfMonths + 1;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + total + " рублей");
        }
    }

    // Задача №2
    public static void task2() {
        System.out.println();
        System.out.println("Задача №2");

        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b >= 0; b--) {
            System.out.print(b + " ");
        }
    }

    // Задача №3
    public static void task3() {
        System.out.println();
        System.out.println("Задача №3");

        double y = 12_000_000_000L; // изначальная численность населения
        double birthRatePerYear = 17 * y / 1000; // рождаемость за год
        double mortalityPerYear = 8 * y / 1000; // смертностьза год

        double annualGrowth = birthRatePerYear - mortalityPerYear; // прирост населения за год
        int year = 1;
        while (year <= 10) {
            year = year + 1;
            y = y + annualGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }
    }


    // Задача №4
    public static void task4() {
        System.out.println();
        System.out.println("Задача №4");

        double total = 15_000;
        double percent = 0.07;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + (total * percent);
            System.out.println(i + " месяц - накоплений " + total + " рублей");
        }
    }

    // Задача №5
    public static void task5() {
        System.out.println();
        System.out.println("Задача №5");

        double total = 15_000;
        double percent = 0.07;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + (total * percent);
            if (i % 6 == 0) {
                System.out.println(i + " месяц - накоплений " + total + " рублей");
            }
        }
    }

    // Задача №6
    public static void task6() {
        System.out.println();
        System.out.println("Задача №6");

        double total = 15_000;
        double percent = 0.07;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + (total * percent);
            if (i % 6 == 0 && i <= 108) {
                // 9 (лет) * 12 (месяцев) = 108
                System.out.println(i + " месяц - накоплений " + total + " рублей");
            }
        }
    }

    // Задача №7
    public static void task7() {
        System.out.println();
        System.out.println("Задача №7");

        int firstFriday = 2; // 2-е число - первая пятница декабря
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    // Задача №8
    public static void task8() {
        System.out.println();
        System.out.println("Задача №8");

        int currentYear = 2022; // текущий год
        int pastYears = currentYear - 200; // предыдущие 200 лет
        int futureYears = currentYear + 100; // будущие 100 лет

        for (int i = pastYears; i < futureYears; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}