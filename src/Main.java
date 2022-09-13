public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
        task9();
    }
    public static void task1() {
        int deposit = 29_000;
        int total = 0;
        int percentage = 12;
        int month = 0;

        while (total < 2_459_000) {
            total = (total + (total * percentage / 1200)) + deposit;
            month++;
            System.out.println("Месяц " + month + ". Сумма накоплений равна " + total);
        }
    }
    public static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;

        for (int i = 1; i <= 10; i++) {
            population = population + (population / 1000 * birthrate) - (population / 1000 * mortality);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
    }
    public static void task4() {
        int deposit = 15_000;
        int percentagePerMonth = 7;
        int total = 0;
        int month = 1;

        while (total < 12_000_000) {
            total = total + (total * percentagePerMonth / 100) + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
            month++;
        }
    }
    public static void task5() {
        int deposit = 15_000;
        int percentagePerMonth = 7;
        int total = 0;
        int month = 1;

        while (total < 12_000_000) {
            total = total + (total * percentagePerMonth / 100) + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
            }
            month++;
        }
    }
    public static void task6() {
        int deposit = 15_000;
        int percentagePerMonth = 7;
        int total = 0;
        int month = 1;

        for (; month <= 108; month++) {
            total = total + (total * percentagePerMonth / 100) + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
            }
        }
    }
    public static void task7() {
        int firstFridayDate = 7;
        int date = 1;

        while (date <= 31) {
            if (date == firstFridayDate || (date - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            }
            date++;
        }
    }
    public static void task8() {
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;

        for (int i = startYear; i <= finishYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void task9() {
        int number = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}