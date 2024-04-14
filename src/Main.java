public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация " + i);
        }
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Обратная интерация " + i);
        }
        System.out.println("\nTask 3");
        for (int i = 0; 17 > i ; i = i + 2) {
            System.out.println("Четные числа " + i);
        }
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Обратная интерация " + i);}
        System.out.println("\nTask 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i + " ");
        }
        System.out.println("\nTask 8 & 9");
        int money = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            total = total + total/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("\nTask 10");
        int summary = 1;
        for (int i = 1; i <= 10; i++) {
            summary = i * 2;
            System.out.println("2 * " + i + " = " + summary );
        }
        }
        }


