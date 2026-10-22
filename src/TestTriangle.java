import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первую сторону: ");
            double side1 = scanner.nextDouble();

            System.out.print("Введите вторую сторону: ");
            double side2 = scanner.nextDouble();

            System.out.print("Введите третью сторону: ");
            double side3 = scanner.nextDouble();

            Triangle triangle =
                    new Triangle(side1, side2, side3);

            System.out.print("Введите цвет треугольника: ");
            String color = scanner.next();

            System.out.print("Треугольник заполнен? (true/false): ");
            boolean filled = scanner.nextBoolean();

            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка завершена.");
        }
    }
}
