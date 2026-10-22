package Additional;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        int[] dom = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        Scanner scanner = new Scanner(System.in);
        int month;

        while (true) {
            System.out.print("Введите номер месяца (1-12): ");

            if (scanner.hasNextInt()) {
                month = scanner.nextInt();

                if (month >= 1 && month <= 12) {
                    break;
                }

                System.out.println(
                        "Ошибка: введите целое число от 1 до 12."
                );
            } else {
                System.out.println(
                        "Ошибка: необходимо ввести целое число."
                );
                scanner.next();
            }
        }

        System.out.println(
                months[month - 1] + ": "
                        + dom[month - 1] + " дней"
        );

        scanner.close();
    }
}

