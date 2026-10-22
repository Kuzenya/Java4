package Additional;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getFebruaryDays(int year) {
        return isLeapYear(year) ? 29 : 28;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.print("Введите год: ");

            if (scanner.hasNextInt()) {
                year = scanner.nextInt();

                if (year > 0) {
                    break;
                }

                System.out.println(
                        "Ошибка: год должен быть положительным."
                );
            } else {
                System.out.println(
                        "Ошибка: необходимо ввести целое число."
                );
                scanner.next();
            }
        }

        System.out.println(
                "В феврале " + year + " года "
                        + getFebruaryDays(year) + " дней."
        );

        if (isLeapYear(year)) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год невисокосный.");
        }

        scanner.close();
    }
}
